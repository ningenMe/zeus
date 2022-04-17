package ningenme.net.zeus.domain.entity

import ningenme.net.zeus.domain.value.ApplicationMetaId
import java.time.LocalDateTime

data class ApplicationMetaList(
    private val applicationMetaList: List<ApplicationMeta>
) {
    init {
        require(applicationMetaList.isNotEmpty())
        val applicationMetaIdList = applicationMetaList.map { it.applicationMetaId }
        val applicationMetaId = applicationMetaIdList.first()
        check(applicationMetaIdList.all { it == applicationMetaId })
    }

    fun getApplicationMetaId(): ApplicationMetaId {
        return applicationMetaList.map { it.applicationMetaId }.first()
    }

    fun getUpdatedTime(): LocalDateTime {
        return applicationMetaList.maxByOrNull { it.createdTime }!!.createdTime
    }
}
