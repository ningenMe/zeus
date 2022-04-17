package ningenme.net.zeus.domain.entity

import ningenme.net.zeus.domain.value.ApplicationMetaId
import java.time.LocalDateTime

data class ApplicationMeta(
    private val applicationMetaId: ApplicationMetaId,
    private val localDateTime: LocalDateTime
)
