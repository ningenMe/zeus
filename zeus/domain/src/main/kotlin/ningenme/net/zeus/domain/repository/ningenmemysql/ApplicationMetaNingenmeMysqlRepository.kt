package ningenme.net.zeus.domain.repository.ningenmemysql

import ningenme.net.zeus.domain.entity.ApplicationMeta

interface ApplicationMetaNingenmeMysqlRepository {
    fun get(): List<ApplicationMeta>
}
