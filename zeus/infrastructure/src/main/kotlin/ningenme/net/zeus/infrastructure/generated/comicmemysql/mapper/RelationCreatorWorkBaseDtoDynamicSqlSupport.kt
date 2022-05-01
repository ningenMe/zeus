/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object RelationCreatorWorkBaseDtoDynamicSqlSupport {
    val relationCreatorWorkBaseDto = RelationCreatorWorkBaseDto()

    val creatorId = relationCreatorWorkBaseDto.creatorId

    val workId = relationCreatorWorkBaseDto.workId

    class RelationCreatorWorkBaseDto : AliasableSqlTable<RelationCreatorWorkBaseDto>("relation_creator_work", ::RelationCreatorWorkBaseDto) {
        val creatorId = column<Int>(name = "creator_id", jdbcType = JDBCType.INTEGER)

        val workId = column<Int>(name = "work_id", jdbcType = JDBCType.INTEGER)
    }
}