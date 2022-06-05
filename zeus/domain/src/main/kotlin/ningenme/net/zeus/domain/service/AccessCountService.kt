package ningenme.net.zeus.domain.service

import ningenme.net.zeus.domain.entity.AccessCount
import ningenme.net.zeus.domain.repository.sqs.AccessCountSqsRepository
import org.springframework.stereotype.Service

@Service
class AccessCountService(
    private val accessCountSqsRepository: AccessCountSqsRepository
) {

    fun postAccessCount() {
        val accessCount = AccessCount()
        accessCountSqsRepository.post(accessCount)
    }
}
