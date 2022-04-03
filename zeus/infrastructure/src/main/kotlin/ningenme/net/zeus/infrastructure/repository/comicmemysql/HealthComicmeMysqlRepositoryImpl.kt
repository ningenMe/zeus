package ningenme.net.zeus.infrastructure.repository.comicmemysql

import ningenme.net.zeus.domain.repository.comicmemysql.HealthComicmeMysqlRepository
import ningenme.net.zeus.infrastructure.repository.comicmemysql.mapper.HealthComicmeMysqlMapper
import org.springframework.stereotype.Repository

@Repository
open class HealthComicmeMysqlRepositoryImpl(
    private val healthComicmeMysqlMapper: HealthComicmeMysqlMapper
) : HealthComicmeMysqlRepository {

    override fun get(): Int {
        return healthComicmeMysqlMapper.select()
    }
}
