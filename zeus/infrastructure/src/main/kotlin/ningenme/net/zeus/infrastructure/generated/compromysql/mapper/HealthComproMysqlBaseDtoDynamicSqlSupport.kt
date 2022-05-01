/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object HealthComproMysqlBaseDtoDynamicSqlSupport {
    val healthComproMysqlBaseDto = HealthComproMysqlBaseDto()

    val id = healthComproMysqlBaseDto.id

    class HealthComproMysqlBaseDto : AliasableSqlTable<HealthComproMysqlBaseDto>("health", ::HealthComproMysqlBaseDto) {
        val id = column<Int>(name = "id", jdbcType = JDBCType.INTEGER)
    }
}