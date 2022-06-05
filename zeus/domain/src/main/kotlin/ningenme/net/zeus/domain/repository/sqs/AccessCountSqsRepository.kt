package ningenme.net.zeus.domain.repository.sqs

import ningenme.net.zeus.domain.entity.AccessCount

interface AccessCountSqsRepository {
    fun post(accessCount: AccessCount)
}
