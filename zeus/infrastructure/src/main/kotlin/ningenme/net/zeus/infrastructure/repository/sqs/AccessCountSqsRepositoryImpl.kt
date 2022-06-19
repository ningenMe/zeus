package ningenme.net.zeus.infrastructure.repository.sqs

import ningenme.net.zeus.domain.entity.AccessCount
import ningenme.net.zeus.domain.repository.sqs.AccessCountSqsRepository
import ningenme.net.zeus.infrastructure.repository.sqs.client.SqsClient
import ningenme.net.zeus.infrastructure.repository.sqs.dto.AccessCountSqsDto
import org.springframework.stereotype.Repository

@Repository
open class AccessCountSqsRepositoryImpl(
    private val sqsClient: SqsClient,
) : AccessCountSqsRepository {

    override fun post(accessCount: AccessCount) {
        sqsClient.publishAccessCount(
            AccessCountSqsDto(
                accessCount.accessCountId,
                accessCount.accessTime.toString()
            )
        )
    }

    override fun get(): List<AccessCount> {
        return sqsClient.consumeAccessCountList()
            .map {
                AccessCount(
                    accessCountId = it.accessCountId,
                    accessTimeString = it.accessTime
                )
            }
    }


}
