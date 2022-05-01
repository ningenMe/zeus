/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object ComicPageComicmeMysqlBaseDtoDynamicSqlSupport {
    val comicPageComicmeMysqlBaseDto = ComicPageComicmeMysqlBaseDto()

    val url = comicPageComicmeMysqlBaseDto.url

    val name = comicPageComicmeMysqlBaseDto.name

    val processedTime = comicPageComicmeMysqlBaseDto.processedTime

    val createdTime = comicPageComicmeMysqlBaseDto.createdTime

    val updatedTime = comicPageComicmeMysqlBaseDto.updatedTime

    val deletedTime = comicPageComicmeMysqlBaseDto.deletedTime

    class ComicPageComicmeMysqlBaseDto : AliasableSqlTable<ComicPageComicmeMysqlBaseDto>("comic_page", ::ComicPageComicmeMysqlBaseDto) {
        val url = column<String>(name = "url", jdbcType = JDBCType.VARCHAR)

        val name = column<String>(name = "name", jdbcType = JDBCType.VARCHAR)

        val processedTime = column<Date>(name = "processed_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}