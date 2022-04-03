/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object ApplicationMetaBaseDtoDynamicSqlSupport {
    val applicationMetaBaseDto = ApplicationMetaBaseDto()

    val applicationMetaId = applicationMetaBaseDto.applicationMetaId

    val createdTime = applicationMetaBaseDto.createdTime

    val deletedTime = applicationMetaBaseDto.deletedTime

    class ApplicationMetaBaseDto : AliasableSqlTable<ApplicationMetaBaseDto>("application_meta", ::ApplicationMetaBaseDto) {
        val applicationMetaId = column<String>(name = "application_meta_id", jdbcType = JDBCType.VARCHAR)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}