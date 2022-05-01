/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object HealthNingenmeMysqlBaseDtoDynamicSqlSupport {
    val healthNingenmeMysqlBaseDto = HealthNingenmeMysqlBaseDto()

    val id = healthNingenmeMysqlBaseDto.id

    class HealthNingenmeMysqlBaseDto : AliasableSqlTable<HealthNingenmeMysqlBaseDto>("health", ::HealthNingenmeMysqlBaseDto) {
        val id = column<Int>(name = "id", jdbcType = JDBCType.INTEGER)
    }
}