package ningenme.net.zeus.domain.repository.ningenmemysql

import ningenme.net.zeus.domain.entity.AccessCount

interface AccessCountNingenmeMysqlRepository {
    fun post(accessCountList: List<AccessCount>)
}
