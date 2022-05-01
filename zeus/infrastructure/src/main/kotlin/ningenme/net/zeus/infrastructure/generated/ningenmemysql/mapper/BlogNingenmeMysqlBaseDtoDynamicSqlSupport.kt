/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object BlogNingenmeMysqlBaseDtoDynamicSqlSupport {
    val blogNingenmeMysqlBaseDto = BlogNingenmeMysqlBaseDto()

    val url = blogNingenmeMysqlBaseDto.url

    val date = blogNingenmeMysqlBaseDto.date

    val type = blogNingenmeMysqlBaseDto.type

    val title = blogNingenmeMysqlBaseDto.title

    val liked = blogNingenmeMysqlBaseDto.liked

    val deletedTime = blogNingenmeMysqlBaseDto.deletedTime

    val createdTime = blogNingenmeMysqlBaseDto.createdTime

    val updatedTime = blogNingenmeMysqlBaseDto.updatedTime

    class BlogNingenmeMysqlBaseDto : AliasableSqlTable<BlogNingenmeMysqlBaseDto>("blog", ::BlogNingenmeMysqlBaseDto) {
        val url = column<String>(name = "url", jdbcType = JDBCType.VARCHAR)

        val date = column<String>(name = "date", jdbcType = JDBCType.VARCHAR)

        val type = column<String>(name = "type", jdbcType = JDBCType.VARCHAR)

        val title = column<String>(name = "title", jdbcType = JDBCType.VARCHAR)

        val liked = column<Int>(name = "liked", jdbcType = JDBCType.INTEGER)

        val deletedTime = column<LocalDateTime>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<LocalDateTime>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}