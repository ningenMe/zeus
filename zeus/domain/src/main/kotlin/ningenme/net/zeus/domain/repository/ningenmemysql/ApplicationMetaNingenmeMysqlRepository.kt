package ningenme.net.zeus.domain.repository.ningenmemysql

import ningenme.net.zeus.domain.value.ApplicationMeta
import ningenme.net.zeus.domain.value.ApplicationMetaId

interface ApplicationMetaNingenmeMysqlRepository {
    fun get(applicationMetaId: ApplicationMetaId): List<ApplicationMeta>
}
