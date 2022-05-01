/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object CreatorBaseDtoDynamicSqlSupport {
    val creatorBaseDto = CreatorBaseDto()

    val creatorId = creatorBaseDto.creatorId

    val creatorName = creatorBaseDto.creatorName

    val createdTime = creatorBaseDto.createdTime

    val updatedTime = creatorBaseDto.updatedTime

    val deletedTime = creatorBaseDto.deletedTime

    class CreatorBaseDto : AliasableSqlTable<CreatorBaseDto>("creator", ::CreatorBaseDto) {
        val creatorId = column<Int>(name = "creator_id", jdbcType = JDBCType.INTEGER)

        val creatorName = column<String>(name = "creator_name", jdbcType = JDBCType.VARCHAR)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}