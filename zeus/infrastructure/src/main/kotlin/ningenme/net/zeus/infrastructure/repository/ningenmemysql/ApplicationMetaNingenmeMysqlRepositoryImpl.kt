package ningenme.net.zeus.infrastructure.repository.ningenmemysql

import mu.KotlinLogging
import ningenme.net.zeus.domain.entity.ApplicationMeta
import ningenme.net.zeus.domain.repository.ningenmemysql.ApplicationMetaNingenmeMysqlRepository
import ningenme.net.zeus.domain.value.ApplicationMetaId
import ningenme.net.zeus.infrastructure.repository.ningenmemysql.mapper.ApplicationMetaNingenmeMysqlMapper
import org.springframework.stereotype.Repository

@Repository
class ApplicationMetaNingenmeMysqlRepositoryImpl(
    private val applicationMetaNingenmeMysqlMapper: ApplicationMetaNingenmeMysqlMapper
) : ApplicationMetaNingenmeMysqlRepository {

    private val logger = KotlinLogging.logger {}

    override fun get(applicationMetaId: ApplicationMetaId): List<ApplicationMeta> {
        return applicationMetaNingenmeMysqlMapper
            .selectByApplicationMetaId(applicationMetaId.value)
            .map {
                try {
                    ApplicationMeta(
                        it.applicationMetaId,
                        it.createdTime
                    )
                } catch (ex: Exception) {
                    logger.warn(ex.message, ex)
                    null
                }
            }
            .mapNotNull { it }
    }

}
