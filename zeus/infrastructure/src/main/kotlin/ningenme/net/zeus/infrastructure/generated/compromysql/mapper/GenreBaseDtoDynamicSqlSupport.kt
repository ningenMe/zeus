/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object GenreBaseDtoDynamicSqlSupport {
    val genreBaseDto = GenreBaseDto()

    val genreId = genreBaseDto.genreId

    val genreName = genreBaseDto.genreName

    val path = genreBaseDto.path

    val genreOrder = genreBaseDto.genreOrder

    val createdTime = genreBaseDto.createdTime

    val updatedTime = genreBaseDto.updatedTime

    val deletedTime = genreBaseDto.deletedTime

    class GenreBaseDto : AliasableSqlTable<GenreBaseDto>("genre", ::GenreBaseDto) {
        val genreId = column<Int>(name = "genre_id", jdbcType = JDBCType.INTEGER)

        val genreName = column<String>(name = "genre_name", jdbcType = JDBCType.VARCHAR)

        val path = column<String>(name = "path", jdbcType = JDBCType.CHAR)

        val genreOrder = column<Int>(name = "genre_order", jdbcType = JDBCType.INTEGER)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}