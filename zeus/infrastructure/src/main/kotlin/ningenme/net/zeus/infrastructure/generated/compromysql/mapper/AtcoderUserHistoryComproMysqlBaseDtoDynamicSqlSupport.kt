/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object AtcoderUserHistoryComproMysqlBaseDtoDynamicSqlSupport {
    val atcoderUserHistoryComproMysqlBaseDto = AtcoderUserHistoryComproMysqlBaseDto()

    val atcoderId = atcoderUserHistoryComproMysqlBaseDto.atcoderId

    val contestId = atcoderUserHistoryComproMysqlBaseDto.contestId

    val isRated = atcoderUserHistoryComproMysqlBaseDto.isRated

    val place = atcoderUserHistoryComproMysqlBaseDto.place

    val oldRating = atcoderUserHistoryComproMysqlBaseDto.oldRating

    val newRating = atcoderUserHistoryComproMysqlBaseDto.newRating

    val performance = atcoderUserHistoryComproMysqlBaseDto.performance

    val deletedTime = atcoderUserHistoryComproMysqlBaseDto.deletedTime

    val createdTime = atcoderUserHistoryComproMysqlBaseDto.createdTime

    val updatedTime = atcoderUserHistoryComproMysqlBaseDto.updatedTime

    class AtcoderUserHistoryComproMysqlBaseDto : AliasableSqlTable<AtcoderUserHistoryComproMysqlBaseDto>("atcoder_user_history", ::AtcoderUserHistoryComproMysqlBaseDto) {
        val atcoderId = column<String>(name = "atcoder_id", jdbcType = JDBCType.VARCHAR)

        val contestId = column<String>(name = "contest_id", jdbcType = JDBCType.VARCHAR)

        val isRated = column<Boolean>(name = "is_rated", jdbcType = JDBCType.BIT)

        val place = column<Int>(name = "place", jdbcType = JDBCType.INTEGER)

        val oldRating = column<Int>(name = "old_rating", jdbcType = JDBCType.INTEGER)

        val newRating = column<Int>(name = "new_rating", jdbcType = JDBCType.INTEGER)

        val performance = column<Int>(name = "performance", jdbcType = JDBCType.INTEGER)

        val deletedTime = column<LocalDateTime>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<LocalDateTime>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}