/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object ApplicationMetaNingenmeMysqlBaseDtoDynamicSqlSupport {
    val applicationMetaNingenmeMysqlBaseDto = ApplicationMetaNingenmeMysqlBaseDto()

    val applicationMetaId = applicationMetaNingenmeMysqlBaseDto.applicationMetaId

    val createdTime = applicationMetaNingenmeMysqlBaseDto.createdTime

    val deletedTime = applicationMetaNingenmeMysqlBaseDto.deletedTime

    class ApplicationMetaNingenmeMysqlBaseDto : AliasableSqlTable<ApplicationMetaNingenmeMysqlBaseDto>("application_meta", ::ApplicationMetaNingenmeMysqlBaseDto) {
        val applicationMetaId = column<String>(name = "application_meta_id", jdbcType = JDBCType.VARCHAR)

        val createdTime = column<LocalDateTime>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<LocalDateTime>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}