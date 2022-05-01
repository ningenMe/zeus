/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object ProblemComproMysqlBaseDtoDynamicSqlSupport {
    val problemComproMysqlBaseDto = ProblemComproMysqlBaseDto()

    val problemId = problemComproMysqlBaseDto.problemId

    val url = problemComproMysqlBaseDto.url

    val problemName = problemComproMysqlBaseDto.problemName

    val estimation = problemComproMysqlBaseDto.estimation

    val deletedTime = problemComproMysqlBaseDto.deletedTime

    val createdTime = problemComproMysqlBaseDto.createdTime

    val updatedTime = problemComproMysqlBaseDto.updatedTime

    class ProblemComproMysqlBaseDto : AliasableSqlTable<ProblemComproMysqlBaseDto>("problem", ::ProblemComproMysqlBaseDto) {
        val problemId = column<Int>(name = "problem_id", jdbcType = JDBCType.INTEGER)

        val url = column<String>(name = "url", jdbcType = JDBCType.VARCHAR)

        val problemName = column<String>(name = "problem_name", jdbcType = JDBCType.VARCHAR)

        val estimation = column<Int>(name = "estimation", jdbcType = JDBCType.INTEGER)

        val deletedTime = column<LocalDateTime>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<LocalDateTime>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}