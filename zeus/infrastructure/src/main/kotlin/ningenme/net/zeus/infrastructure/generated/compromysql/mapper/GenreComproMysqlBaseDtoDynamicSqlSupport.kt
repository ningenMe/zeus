/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object GenreComproMysqlBaseDtoDynamicSqlSupport {
    val genreComproMysqlBaseDto = GenreComproMysqlBaseDto()

    val genreId = genreComproMysqlBaseDto.genreId

    val genreName = genreComproMysqlBaseDto.genreName

    val path = genreComproMysqlBaseDto.path

    val genreOrder = genreComproMysqlBaseDto.genreOrder

    val createdTime = genreComproMysqlBaseDto.createdTime

    val updatedTime = genreComproMysqlBaseDto.updatedTime

    val deletedTime = genreComproMysqlBaseDto.deletedTime

    class GenreComproMysqlBaseDto : AliasableSqlTable<GenreComproMysqlBaseDto>("genre", ::GenreComproMysqlBaseDto) {
        val genreId = column<Int>(name = "genre_id", jdbcType = JDBCType.INTEGER)

        val genreName = column<String>(name = "genre_name", jdbcType = JDBCType.VARCHAR)

        val path = column<String>(name = "path", jdbcType = JDBCType.CHAR)

        val genreOrder = column<Int>(name = "genre_order", jdbcType = JDBCType.INTEGER)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}