package ningenme.net.zeus.infrastructure.repository.ningenmemysql

import ningenme.net.zeus.domain.repository.ningenmemysql.HealthNingenmeMysqlRepository
import ningenme.net.zeus.infrastructure.repository.ningenmemysql.mapper.HealthNingenmeMysqlMapper
import org.springframework.stereotype.Repository

@Repository
open class HealthNingenmeMysqlRepositoryImpl(
    private val healthNingenmeMysqlMapper: HealthNingenmeMysqlMapper
) : HealthNingenmeMysqlRepository {

    override fun get(): Int {
        return healthNingenmeMysqlMapper.select()
    }

}
