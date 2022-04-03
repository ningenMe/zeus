/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object ProblemBaseDtoDynamicSqlSupport {
    val problemBaseDto = ProblemBaseDto()

    val problemId = problemBaseDto.problemId

    val url = problemBaseDto.url

    val problemName = problemBaseDto.problemName

    val estimation = problemBaseDto.estimation

    val deletedTime = problemBaseDto.deletedTime

    val createdTime = problemBaseDto.createdTime

    val updatedTime = problemBaseDto.updatedTime

    class ProblemBaseDto : AliasableSqlTable<ProblemBaseDto>("problem", ::ProblemBaseDto) {
        val problemId = column<Int>(name = "problem_id", jdbcType = JDBCType.INTEGER)

        val url = column<String>(name = "url", jdbcType = JDBCType.VARCHAR)

        val problemName = column<String>(name = "problem_name", jdbcType = JDBCType.VARCHAR)

        val estimation = column<Int>(name = "estimation", jdbcType = JDBCType.INTEGER)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}