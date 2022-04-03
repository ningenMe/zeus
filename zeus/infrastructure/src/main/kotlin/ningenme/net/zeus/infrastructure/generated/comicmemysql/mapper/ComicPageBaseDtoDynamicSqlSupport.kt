/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object ComicPageBaseDtoDynamicSqlSupport {
    val comicPageBaseDto = ComicPageBaseDto()

    val url = comicPageBaseDto.url

    val name = comicPageBaseDto.name

    val processedTime = comicPageBaseDto.processedTime

    val createdTime = comicPageBaseDto.createdTime

    val updatedTime = comicPageBaseDto.updatedTime

    val deletedTime = comicPageBaseDto.deletedTime

    class ComicPageBaseDto : AliasableSqlTable<ComicPageBaseDto>("comic_page", ::ComicPageBaseDto) {
        val url = column<String>(name = "url", jdbcType = JDBCType.VARCHAR)

        val name = column<String>(name = "name", jdbcType = JDBCType.VARCHAR)

        val processedTime = column<Date>(name = "processed_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}