/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object AccessCountNingenmeMysqlBaseDtoDynamicSqlSupport {
    val accessCountNingenmeMysqlBaseDto = AccessCountNingenmeMysqlBaseDto()

    val accessCountId = accessCountNingenmeMysqlBaseDto.accessCountId

    val accessTime = accessCountNingenmeMysqlBaseDto.accessTime

    val createdTime = accessCountNingenmeMysqlBaseDto.createdTime

    val updatedTime = accessCountNingenmeMysqlBaseDto.updatedTime

    class AccessCountNingenmeMysqlBaseDto : AliasableSqlTable<AccessCountNingenmeMysqlBaseDto>("access_count", ::AccessCountNingenmeMysqlBaseDto) {
        val accessCountId = column<String>(name = "access_count_id", jdbcType = JDBCType.VARCHAR)

        val accessTime = column<LocalDateTime>(name = "access_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<LocalDateTime>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}