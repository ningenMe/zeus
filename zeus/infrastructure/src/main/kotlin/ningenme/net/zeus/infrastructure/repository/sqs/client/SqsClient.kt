package ningenme.net.zeus.infrastructure.repository.sqs.client

import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.sqs.AmazonSQS
import com.amazonaws.services.sqs.AmazonSQSClientBuilder
import com.amazonaws.services.sqs.model.ReceiveMessageRequest
import com.fasterxml.jackson.databind.ObjectMapper
import ningenme.net.zeus.common.config.SqsQueueConfig
import ningenme.net.zeus.common.config.SqsUserConfig
import ningenme.net.zeus.infrastructure.repository.sqs.dto.AccessCountSqsDto
import org.springframework.stereotype.Component

@Component
class SqsClient(
    private val sqsUserConfig: SqsUserConfig,
    private val sqsQueueConfig: SqsQueueConfig,
    private val objectMapper: ObjectMapper
) {
    private val amazonSQS: AmazonSQS = AmazonSQSClientBuilder
        .standard()
        .withCredentials(
            AWSStaticCredentialsProvider(
                BasicAWSCredentials(
                    sqsUserConfig.accessKeyId, sqsUserConfig.secretAccessKey
                )
            )
        )
        .build()

    fun publishAccessCount(accessCountSqsDto: AccessCountSqsDto) {
        amazonSQS.sendMessage(
            sqsQueueConfig.accessCountUrl,
            objectMapper.writeValueAsString(accessCountSqsDto)
        )
    }

    fun consumeAccessCountList(): List<AccessCountSqsDto> {
        val receiveMessageRequest = amazonSQS.receiveMessage(
            ReceiveMessageRequest()
                .withQueueUrl(sqsQueueConfig.accessCountUrl)
                .withWaitTimeSeconds(10)
                .withMaxNumberOfMessages(300)
        )

        return receiveMessageRequest.messages
            .map {
                objectMapper.readValue(it.body, AccessCountSqsDto::class.java)
            }
    }

}
