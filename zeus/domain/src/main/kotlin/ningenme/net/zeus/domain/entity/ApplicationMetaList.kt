package ningenme.net.zeus.domain.entity

import ningenme.net.zeus.domain.value.ApplicationMetaId
import java.time.LocalDateTime

data class ApplicationMetaList(
    val applicationMetaId: ApplicationMetaId,
    val updatedTime: LocalDateTime
) {
    constructor(applicationMetaList: List<ApplicationMeta>) : this(
        applicationMetaList.map { it.applicationMetaId }.first(),
        applicationMetaList.maxByOrNull { it.createdTime }!!.createdTime
    )
}
