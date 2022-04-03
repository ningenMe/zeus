/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object AtcoderUserContestBaseDtoDynamicSqlSupport {
    val atcoderUserContestBaseDto = AtcoderUserContestBaseDto()

    val atcoderId = atcoderUserContestBaseDto.atcoderId

    val contestNameEn = atcoderUserContestBaseDto.contestNameEn

    val isRated = atcoderUserContestBaseDto.isRated

    val place = atcoderUserContestBaseDto.place

    val oldRating = atcoderUserContestBaseDto.oldRating

    val newRating = atcoderUserContestBaseDto.newRating

    val performance = atcoderUserContestBaseDto.performance

    val contestType = atcoderUserContestBaseDto.contestType

    val contestScreenName = atcoderUserContestBaseDto.contestScreenName

    val contestName = atcoderUserContestBaseDto.contestName

    val endTime = atcoderUserContestBaseDto.endTime

    val deletedTime = atcoderUserContestBaseDto.deletedTime

    val createdTime = atcoderUserContestBaseDto.createdTime

    val updatedTime = atcoderUserContestBaseDto.updatedTime

    class AtcoderUserContestBaseDto : AliasableSqlTable<AtcoderUserContestBaseDto>("atcoder_user_contest", ::AtcoderUserContestBaseDto) {
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

        val endTime = column<Date>(name = "end_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}