package ningenme.net.zeus.domain.service

import ningenme.net.zeus.domain.repository.comicmemysql.HealthComicmeMysqlRepository
import ningenme.net.zeus.domain.repository.compromysql.HealthComproMysqlRepository
import ningenme.net.zeus.domain.repository.ningenmemysql.HealthNingenmeMysqlRepository
import org.springframework.stereotype.Service

@Service
class HealthService(
    private val healthNingenmeMysqlRepository: HealthNingenmeMysqlRepository,
    private val healthComicmeMysqlRepository: HealthComicmeMysqlRepository,
    private val healthComproMysqlRepository: HealthComproMysqlRepository
) {
    fun isNingenmeMysqlConnected(): Boolean {
        return try {
            healthNingenmeMysqlRepository.get()
            true
        } catch (ex: Exception) {
            false
        }
    }

    fun isComicmeMysqlConnected(): Boolean {
        return try {
            healthComicmeMysqlRepository.get()
            true
        } catch (ex: Exception) {
            false
        }
    }

    fun isComproMysqlConnected(): Boolean {
        return try {
            healthComproMysqlRepository.get()
            true
        } catch (ex: Exception) {
            false
        }
    }
}
