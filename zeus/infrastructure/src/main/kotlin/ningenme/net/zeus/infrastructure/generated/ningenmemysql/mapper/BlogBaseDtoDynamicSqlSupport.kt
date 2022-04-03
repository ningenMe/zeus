/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object BlogBaseDtoDynamicSqlSupport {
    val blogBaseDto = BlogBaseDto()

    val url = blogBaseDto.url

    val date = blogBaseDto.date

    val type = blogBaseDto.type

    val title = blogBaseDto.title

    val liked = blogBaseDto.liked

    val deletedTime = blogBaseDto.deletedTime

    val createdTime = blogBaseDto.createdTime

    val updatedTime = blogBaseDto.updatedTime

    class BlogBaseDto : AliasableSqlTable<BlogBaseDto>("blog", ::BlogBaseDto) {
        val url = column<String>(name = "url", jdbcType = JDBCType.VARCHAR)

        val date = column<String>(name = "date", jdbcType = JDBCType.VARCHAR)

        val type = column<String>(name = "type", jdbcType = JDBCType.VARCHAR)

        val title = column<String>(name = "title", jdbcType = JDBCType.VARCHAR)

        val liked = column<Int>(name = "liked", jdbcType = JDBCType.INTEGER)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}