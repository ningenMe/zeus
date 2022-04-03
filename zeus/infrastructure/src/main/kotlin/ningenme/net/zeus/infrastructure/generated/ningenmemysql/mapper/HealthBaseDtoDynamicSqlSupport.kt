/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object HealthBaseDtoDynamicSqlSupport {
    val healthBaseDto = HealthBaseDto()

    val id = healthBaseDto.id

    class HealthBaseDto : AliasableSqlTable<HealthBaseDto>("health", ::HealthBaseDto) {
        val id = column<Int>(name = "id", jdbcType = JDBCType.INTEGER)
    }
}