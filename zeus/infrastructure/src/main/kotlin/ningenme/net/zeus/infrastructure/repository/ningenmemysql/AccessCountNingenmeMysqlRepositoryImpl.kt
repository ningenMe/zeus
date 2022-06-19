package ningenme.net.zeus.infrastructure.repository.ningenmemysql

import ningenme.net.zeus.domain.entity.AccessCount
import ningenme.net.zeus.domain.repository.ningenmemysql.AccessCountNingenmeMysqlRepository
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.AccessCountNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.repository.ningenmemysql.mapper.AccessCountNingenmeMysqlMapper
import org.springframework.stereotype.Repository

@Repository
open class AccessCountNingenmeMysqlRepositoryImpl(
    private val accessCountNingenmeMysqlMapper: AccessCountNingenmeMysqlMapper
) : AccessCountNingenmeMysqlRepository {

    override fun post(accessCountList: List<AccessCount>) {
        accessCountNingenmeMysqlMapper.insertAccessCountList(
            accessCountList.map {
                AccessCountNingenmeMysqlBaseDto(it.accessCountId, it.accessTime)
            }
        )
    }
}
