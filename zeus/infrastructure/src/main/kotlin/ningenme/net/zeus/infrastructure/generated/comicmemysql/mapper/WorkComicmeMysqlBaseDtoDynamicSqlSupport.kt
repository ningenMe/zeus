/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object WorkComicmeMysqlBaseDtoDynamicSqlSupport {
    val workComicmeMysqlBaseDto = WorkComicmeMysqlBaseDto()

    val workId = workComicmeMysqlBaseDto.workId

    val workName = workComicmeMysqlBaseDto.workName

    val publisherName = workComicmeMysqlBaseDto.publisherName

    val createdTime = workComicmeMysqlBaseDto.createdTime

    val updatedTime = workComicmeMysqlBaseDto.updatedTime

    val deletedTime = workComicmeMysqlBaseDto.deletedTime

    class WorkComicmeMysqlBaseDto : AliasableSqlTable<WorkComicmeMysqlBaseDto>("work", ::WorkComicmeMysqlBaseDto) {
        val workId = column<Int>(name = "work_id", jdbcType = JDBCType.INTEGER)

        val workName = column<String>(name = "work_name", jdbcType = JDBCType.VARCHAR)

        val publisherName = column<String>(name = "publisher_name", jdbcType = JDBCType.VARCHAR)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<LocalDateTime>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<LocalDateTime>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}