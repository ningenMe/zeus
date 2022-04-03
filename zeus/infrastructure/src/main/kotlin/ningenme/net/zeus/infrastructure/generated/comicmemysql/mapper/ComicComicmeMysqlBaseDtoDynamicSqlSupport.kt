/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object ComicComicmeMysqlBaseDtoDynamicSqlSupport {
    val comicComicmeMysqlBaseDto = ComicComicmeMysqlBaseDto()

    val comicId = comicComicmeMysqlBaseDto.comicId

    val isbn13 = comicComicmeMysqlBaseDto.isbn13

    val url = comicComicmeMysqlBaseDto.url

    val workId = comicComicmeMysqlBaseDto.workId

    val comicName = comicComicmeMysqlBaseDto.comicName

    val publishedDate = comicComicmeMysqlBaseDto.publishedDate

    val createdTime = comicComicmeMysqlBaseDto.createdTime

    val updatedTime = comicComicmeMysqlBaseDto.updatedTime

    val deletedTime = comicComicmeMysqlBaseDto.deletedTime

    class ComicComicmeMysqlBaseDto : AliasableSqlTable<ComicComicmeMysqlBaseDto>("comic", ::ComicComicmeMysqlBaseDto) {
        val comicId = column<Int>(name = "comic_id", jdbcType = JDBCType.INTEGER)

        val isbn13 = column<String>(name = "isbn13", jdbcType = JDBCType.VARCHAR)

        val url = column<String>(name = "url", jdbcType = JDBCType.VARCHAR)

        val workId = column<Int>(name = "work_id", jdbcType = JDBCType.INTEGER)

        val comicName = column<String>(name = "comic_name", jdbcType = JDBCType.VARCHAR)

        val publishedDate = column<Date>(name = "published_date", jdbcType = JDBCType.DATE)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}