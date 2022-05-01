/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object WorkBaseDtoDynamicSqlSupport {
    val workBaseDto = WorkBaseDto()

    val workId = workBaseDto.workId

    val workName = workBaseDto.workName

    val publisherName = workBaseDto.publisherName

    val createdTime = workBaseDto.createdTime

    val updatedTime = workBaseDto.updatedTime

    val deletedTime = workBaseDto.deletedTime

    class WorkBaseDto : AliasableSqlTable<WorkBaseDto>("work", ::WorkBaseDto) {
        val workId = column<Int>(name = "work_id", jdbcType = JDBCType.INTEGER)

        val workName = column<String>(name = "work_name", jdbcType = JDBCType.VARCHAR)

        val publisherName = column<String>(name = "publisher_name", jdbcType = JDBCType.VARCHAR)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}