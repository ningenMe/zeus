/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object AtcoderUserComproMysqlBaseDtoDynamicSqlSupport {
    val atcoderUserComproMysqlBaseDto = AtcoderUserComproMysqlBaseDto()

    val atcoderId = atcoderUserComproMysqlBaseDto.atcoderId

    val topcoderId = atcoderUserComproMysqlBaseDto.topcoderId

    val codeforcesId = atcoderUserComproMysqlBaseDto.codeforcesId

    val yukicoderId = atcoderUserComproMysqlBaseDto.yukicoderId

    val rank = atcoderUserComproMysqlBaseDto.rank

    val country = atcoderUserComproMysqlBaseDto.country

    val affiliation = atcoderUserComproMysqlBaseDto.affiliation

    val currentRate = atcoderUserComproMysqlBaseDto.currentRate

    val highestRate = atcoderUserComproMysqlBaseDto.highestRate

    val currentPerformance = atcoderUserComproMysqlBaseDto.currentPerformance

    val highestPerformance = atcoderUserComproMysqlBaseDto.highestPerformance

    val firstParticipateTime = atcoderUserComproMysqlBaseDto.firstParticipateTime

    val lastParticipateTime = atcoderUserComproMysqlBaseDto.lastParticipateTime

    val deletedTime = atcoderUserComproMysqlBaseDto.deletedTime

    val createdTime = atcoderUserComproMysqlBaseDto.createdTime

    val updatedTime = atcoderUserComproMysqlBaseDto.updatedTime

    class AtcoderUserComproMysqlBaseDto : AliasableSqlTable<AtcoderUserComproMysqlBaseDto>("atcoder_user", ::AtcoderUserComproMysqlBaseDto) {
        val atcoderId = column<String>(name = "atcoder_id", jdbcType = JDBCType.VARCHAR)

        val topcoderId = column<String>(name = "topcoder_id", jdbcType = JDBCType.VARCHAR)

        val codeforcesId = column<String>(name = "codeforces_id", jdbcType = JDBCType.VARCHAR)

        val yukicoderId = column<String>(name = "yukicoder_id", jdbcType = JDBCType.VARCHAR)

        val rank = column<Int>(name = "rank", jdbcType = JDBCType.INTEGER)

        val country = column<String>(name = "country", jdbcType = JDBCType.VARCHAR)

        val affiliation = column<String>(name = "affiliation", jdbcType = JDBCType.VARCHAR)

        val currentRate = column<Int>(name = "current_rate", jdbcType = JDBCType.INTEGER)

        val highestRate = column<Int>(name = "highest_rate", jdbcType = JDBCType.INTEGER)

        val currentPerformance = column<Int>(name = "current_performance", jdbcType = JDBCType.INTEGER)

        val highestPerformance = column<Int>(name = "highest_performance", jdbcType = JDBCType.INTEGER)

        val firstParticipateTime = column<Date>(name = "first_participate_time", jdbcType = JDBCType.TIMESTAMP)

        val lastParticipateTime = column<Date>(name = "last_participate_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}