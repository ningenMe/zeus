/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object PublisherComicmeMysqlBaseDtoDynamicSqlSupport {
    val publisherComicmeMysqlBaseDto = PublisherComicmeMysqlBaseDto()

    val publisherId = publisherComicmeMysqlBaseDto.publisherId

    val publisherName = publisherComicmeMysqlBaseDto.publisherName

    val createdTime = publisherComicmeMysqlBaseDto.createdTime

    val updatedTime = publisherComicmeMysqlBaseDto.updatedTime

    val deletedTime = publisherComicmeMysqlBaseDto.deletedTime

    class PublisherComicmeMysqlBaseDto : AliasableSqlTable<PublisherComicmeMysqlBaseDto>("publisher", ::PublisherComicmeMysqlBaseDto) {
        val publisherId = column<Int>(name = "publisher_id", jdbcType = JDBCType.INTEGER)

        val publisherName = column<String>(name = "publisher_name", jdbcType = JDBCType.VARCHAR)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<LocalDateTime>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<LocalDateTime>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}