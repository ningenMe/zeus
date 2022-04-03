/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object PublisherBaseDtoDynamicSqlSupport {
    val publisherBaseDto = PublisherBaseDto()

    val publisherId = publisherBaseDto.publisherId

    val publisherName = publisherBaseDto.publisherName

    val createdTime = publisherBaseDto.createdTime

    val updatedTime = publisherBaseDto.updatedTime

    val deletedTime = publisherBaseDto.deletedTime

    class PublisherBaseDto : AliasableSqlTable<PublisherBaseDto>("publisher", ::PublisherBaseDto) {
        val publisherId = column<Int>(name = "publisher_id", jdbcType = JDBCType.INTEGER)

        val publisherName = column<String>(name = "publisher_name", jdbcType = JDBCType.VARCHAR)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}