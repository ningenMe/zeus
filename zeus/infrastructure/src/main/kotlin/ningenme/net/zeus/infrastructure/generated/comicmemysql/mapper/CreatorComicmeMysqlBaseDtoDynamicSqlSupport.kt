/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object CreatorComicmeMysqlBaseDtoDynamicSqlSupport {
    val creatorComicmeMysqlBaseDto = CreatorComicmeMysqlBaseDto()

    val creatorId = creatorComicmeMysqlBaseDto.creatorId

    val creatorName = creatorComicmeMysqlBaseDto.creatorName

    val createdTime = creatorComicmeMysqlBaseDto.createdTime

    val updatedTime = creatorComicmeMysqlBaseDto.updatedTime

    val deletedTime = creatorComicmeMysqlBaseDto.deletedTime

    class CreatorComicmeMysqlBaseDto : AliasableSqlTable<CreatorComicmeMysqlBaseDto>("creator", ::CreatorComicmeMysqlBaseDto) {
        val creatorId = column<Int>(name = "creator_id", jdbcType = JDBCType.INTEGER)

        val creatorName = column<String>(name = "creator_name", jdbcType = JDBCType.VARCHAR)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<LocalDateTime>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<LocalDateTime>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}