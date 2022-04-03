/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object RelationCreatorWorkComicmeMysqlBaseDtoDynamicSqlSupport {
    val relationCreatorWorkComicmeMysqlBaseDto = RelationCreatorWorkComicmeMysqlBaseDto()

    val creatorId = relationCreatorWorkComicmeMysqlBaseDto.creatorId

    val workId = relationCreatorWorkComicmeMysqlBaseDto.workId

    class RelationCreatorWorkComicmeMysqlBaseDto : AliasableSqlTable<RelationCreatorWorkComicmeMysqlBaseDto>("relation_creator_work", ::RelationCreatorWorkComicmeMysqlBaseDto) {
        val creatorId = column<Int>(name = "creator_id", jdbcType = JDBCType.INTEGER)

        val workId = column<Int>(name = "work_id", jdbcType = JDBCType.INTEGER)
    }
}