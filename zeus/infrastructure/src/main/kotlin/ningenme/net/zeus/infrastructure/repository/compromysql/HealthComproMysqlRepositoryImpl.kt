package ningenme.net.zeus.infrastructure.repository.compromysql

import ningenme.net.zeus.domain.repository.compromysql.HealthComproMysqlRepository
import ningenme.net.zeus.infrastructure.repository.compromysql.mapper.HealthComproMysqlMapper
import org.springframework.stereotype.Repository

@Repository
open class HealthComproMysqlRepositoryImpl(
    private val healthComproMysqlMapper: HealthComproMysqlMapper
) : HealthComproMysqlRepository {

    override fun get(): Int {
        return healthComproMysqlMapper.select()
    }
}
