package ningenme.net.zeus.domain.entity

import ningenme.net.zeus.domain.value.ApplicationMetaId
import java.time.LocalDateTime

data class ApplicationMeta(
    val applicationMetaId: ApplicationMetaId,
    val createdTime: LocalDateTime
) {
    constructor(applicationMetaIdString: String?, createdTime: LocalDateTime?)
        : this(ApplicationMetaId.of(applicationMetaIdString!!), createdTime!!);
}
