package ningenme.net.zeus.domain.service

import ningenme.net.zeus.domain.entity.ApplicationMetaList
import ningenme.net.zeus.domain.repository.ningenmemysql.ApplicationMetaNingenmeMysqlRepository
import ningenme.net.zeus.domain.value.ApplicationMetaId
import org.springframework.stereotype.Service

@Service
class ApplicationMetaService(
    private val applicationMetaNingenmeMysqlRepository: ApplicationMetaNingenmeMysqlRepository
) {
    fun getList(applicationMetaId: ApplicationMetaId): ApplicationMetaList {
        return ApplicationMetaList(applicationMetaNingenmeMysqlRepository.get(applicationMetaId))
    }

}
