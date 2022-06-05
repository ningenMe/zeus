package ningenme.net.zeus.infrastructure.repository.sqs.client

import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.sqs.AmazonSQS
import com.amazonaws.services.sqs.AmazonSQSClientBuilder
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

    fun sendAccessCount(accessCountSqsDto: AccessCountSqsDto) {
        amazonSQS.sendMessage(
            sqsQueueConfig.accessCountUrl,
            objectMapper.writeValueAsString(accessCountSqsDto)
        )
    }

}
