/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object NetUserNingenmeMysqlBaseDtoDynamicSqlSupport {
    val netUserNingenmeMysqlBaseDto = NetUserNingenmeMysqlBaseDto()

    val netUserId = netUserNingenmeMysqlBaseDto.netUserId

    val password = netUserNingenmeMysqlBaseDto.password

    val deletedTime = netUserNingenmeMysqlBaseDto.deletedTime

    val createdTime = netUserNingenmeMysqlBaseDto.createdTime

    val updatedTime = netUserNingenmeMysqlBaseDto.updatedTime

    class NetUserNingenmeMysqlBaseDto : AliasableSqlTable<NetUserNingenmeMysqlBaseDto>("net_user", ::NetUserNingenmeMysqlBaseDto) {
        val netUserId = column<String>(name = "net_user_id", jdbcType = JDBCType.VARCHAR)

        val password = column<String>(name = "password", jdbcType = JDBCType.VARCHAR)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)
    }
}