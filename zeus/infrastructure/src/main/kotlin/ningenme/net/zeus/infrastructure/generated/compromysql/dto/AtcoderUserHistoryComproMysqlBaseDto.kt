/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.dto

import java.time.LocalDateTime

data class AtcoderUserHistoryComproMysqlBaseDto(
    var atcoderId: String? = null,
    var contestId: String? = null,
    var isRated: Boolean? = null,
    var place: Int? = null,
    var oldRating: Int? = null,
    var newRating: Int? = null,
    var performance: Int? = null,
    var deletedTime: LocalDateTime? = null,
    var createdTime: LocalDateTime? = null,
    var updatedTime: LocalDateTime? = null
)