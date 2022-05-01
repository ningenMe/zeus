/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object HealthComicmeMysqlBaseDtoDynamicSqlSupport {
    val healthComicmeMysqlBaseDto = HealthComicmeMysqlBaseDto()

    val id = healthComicmeMysqlBaseDto.id

    class HealthComicmeMysqlBaseDto : AliasableSqlTable<HealthComicmeMysqlBaseDto>("health", ::HealthComicmeMysqlBaseDto) {
        val id = column<Int>(name = "id", jdbcType = JDBCType.INTEGER)
    }
}