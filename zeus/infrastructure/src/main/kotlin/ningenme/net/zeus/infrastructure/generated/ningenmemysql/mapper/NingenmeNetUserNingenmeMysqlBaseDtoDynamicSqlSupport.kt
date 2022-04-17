/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object NingenmeNetUserNingenmeMysqlBaseDtoDynamicSqlSupport {
    val ningenmeNetUserNingenmeMysqlBaseDto = NingenmeNetUserNingenmeMysqlBaseDto()

    val ningenmeNetUserId = ningenmeNetUserNingenmeMysqlBaseDto.ningenmeNetUserId

    val password = ningenmeNetUserNingenmeMysqlBaseDto.password

    val deletedTime = ningenmeNetUserNingenmeMysqlBaseDto.deletedTime

    val createdTime = ningenmeNetUserNingenmeMysqlBaseDto.createdTime

    val updatedTime = ningenmeNetUserNingenmeMysqlBaseDto.updatedTime

    class NingenmeNetUserNingenmeMysqlBaseDto : AliasableSqlTable<NingenmeNetUserNingenmeMysqlBaseDto>("ningenme_net_user", ::NingenmeNetUserNingenmeMysqlBaseDto) {
        val ningenmeNetUserId = column<String>(name = "ningenme_net_user_id", jdbcType = JDBCType.VARCHAR)

        val password = column<String>(name = "password", jdbcType = JDBCType.VARCHAR)

        val deletedTime = column<LocalDateTime>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<LocalDateTime>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}