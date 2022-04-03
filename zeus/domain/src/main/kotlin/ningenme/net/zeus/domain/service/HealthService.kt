package ningenme.net.zeus.domain.service

import ningenme.net.zeus.domain.repository.comicmemysql.HealthNingenmeMysqlRepository
import org.springframework.stereotype.Service

@Service
class HealthService(
    private val healthNingenmeMysqlRepository: HealthNingenmeMysqlRepository
) {
    fun isNingenmeMysqlConnected(): Boolean {
        return try {
            healthNingenmeMysqlRepository.get()
            true
        } catch (ex: Exception) {
            false
        }
    }
}
