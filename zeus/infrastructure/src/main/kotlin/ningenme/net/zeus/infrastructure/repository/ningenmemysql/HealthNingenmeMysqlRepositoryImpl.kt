package ningenme.net.zeus.infrastructure.repository.ningenmemysql

import ningenme.net.zeus.domain.repository.comicmemysql.HealthNingenmeMysqlRepository
import ningenme.net.zeus.infrastructure.repository.ningenmemysql.mapper.HealthNingenmeMysqlMapper
import org.springframework.stereotype.Repository

@Repository
class HealthNingenmeMysqlRepositoryImpl(
    private val healthNingenmeMysqlMapper: HealthNingenmeMysqlMapper
) : HealthNingenmeMysqlRepository {

    override fun get(): Int {
        return healthNingenmeMysqlMapper.select()
    }

}
