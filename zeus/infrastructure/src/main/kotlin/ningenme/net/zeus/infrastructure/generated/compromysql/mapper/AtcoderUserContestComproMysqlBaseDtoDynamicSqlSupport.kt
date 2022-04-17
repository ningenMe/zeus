/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object AtcoderUserContestComproMysqlBaseDtoDynamicSqlSupport {
    val atcoderUserContestComproMysqlBaseDto = AtcoderUserContestComproMysqlBaseDto()

    val atcoderId = atcoderUserContestComproMysqlBaseDto.atcoderId

    val contestNameEn = atcoderUserContestComproMysqlBaseDto.contestNameEn

    val isRated = atcoderUserContestComproMysqlBaseDto.isRated

    val place = atcoderUserContestComproMysqlBaseDto.place

    val oldRating = atcoderUserContestComproMysqlBaseDto.oldRating

    val newRating = atcoderUserContestComproMysqlBaseDto.newRating

    val performance = atcoderUserContestComproMysqlBaseDto.performance

    val contestType = atcoderUserContestComproMysqlBaseDto.contestType

    val contestScreenName = atcoderUserContestComproMysqlBaseDto.contestScreenName

    val contestName = atcoderUserContestComproMysqlBaseDto.contestName

    val endTime = atcoderUserContestComproMysqlBaseDto.endTime

    val deletedTime = atcoderUserContestComproMysqlBaseDto.deletedTime

    val createdTime = atcoderUserContestComproMysqlBaseDto.createdTime

    val updatedTime = atcoderUserContestComproMysqlBaseDto.updatedTime

    class AtcoderUserContestComproMysqlBaseDto : AliasableSqlTable<AtcoderUserContestComproMysqlBaseDto>("atcoder_user_contest", ::AtcoderUserContestComproMysqlBaseDto) {
        val atcoderId = column<String>(name = "atcoder_id", jdbcType = JDBCType.VARCHAR)

        val contestNameEn = column<String>(name = "contest_name_en", jdbcType = JDBCType.VARCHAR)

        val isRated = column<Boolean>(name = "is_rated", jdbcType = JDBCType.BIT)

        val place = column<Int>(name = "place", jdbcType = JDBCType.INTEGER)

        val oldRating = column<Int>(name = "old_rating", jdbcType = JDBCType.INTEGER)

        val newRating = column<Int>(name = "new_rating", jdbcType = JDBCType.INTEGER)

        val performance = column<Int>(name = "performance", jdbcType = JDBCType.INTEGER)

        val contestType = column<String>(name = "contest_type", jdbcType = JDBCType.VARCHAR)

        val contestScreenName = column<String>(name = "contest_screen_name", jdbcType = JDBCType.VARCHAR)

        val contestName = column<String>(name = "contest_name", jdbcType = JDBCType.VARCHAR)

        val endTime = column<LocalDateTime>(name = "end_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<LocalDateTime>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<LocalDateTime>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}