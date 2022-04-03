/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object AtcoderUserHistoryBaseDtoDynamicSqlSupport {
    val atcoderUserHistoryBaseDto = AtcoderUserHistoryBaseDto()

    val atcoderId = atcoderUserHistoryBaseDto.atcoderId

    val contestId = atcoderUserHistoryBaseDto.contestId

    val isRated = atcoderUserHistoryBaseDto.isRated

    val place = atcoderUserHistoryBaseDto.place

    val oldRating = atcoderUserHistoryBaseDto.oldRating

    val newRating = atcoderUserHistoryBaseDto.newRating

    val performance = atcoderUserHistoryBaseDto.performance

    val deletedTime = atcoderUserHistoryBaseDto.deletedTime

    val createdTime = atcoderUserHistoryBaseDto.createdTime

    val updatedTime = atcoderUserHistoryBaseDto.updatedTime

    class AtcoderUserHistoryBaseDto : AliasableSqlTable<AtcoderUserHistoryBaseDto>("atcoder_user_history", ::AtcoderUserHistoryBaseDto) {
        val atcoderId = column<String>(name = "atcoder_id", jdbcType = JDBCType.VARCHAR)

        val contestId = column<String>(name = "contest_id", jdbcType = JDBCType.VARCHAR)

        val isRated = column<Boolean>(name = "is_rated", jdbcType = JDBCType.BIT)

        val place = column<Int>(name = "place", jdbcType = JDBCType.INTEGER)

        val oldRating = column<Int>(name = "old_rating", jdbcType = JDBCType.INTEGER)

        val newRating = column<Int>(name = "new_rating", jdbcType = JDBCType.INTEGER)

        val performance = column<Int>(name = "performance", jdbcType = JDBCType.INTEGER)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}