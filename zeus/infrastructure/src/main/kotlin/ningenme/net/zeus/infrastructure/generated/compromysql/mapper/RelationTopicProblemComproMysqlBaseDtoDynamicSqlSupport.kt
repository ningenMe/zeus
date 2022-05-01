/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object RelationTopicProblemComproMysqlBaseDtoDynamicSqlSupport {
    val relationTopicProblemComproMysqlBaseDto = RelationTopicProblemComproMysqlBaseDto()

    val topicId = relationTopicProblemComproMysqlBaseDto.topicId

    val problemId = relationTopicProblemComproMysqlBaseDto.problemId

    class RelationTopicProblemComproMysqlBaseDto : AliasableSqlTable<RelationTopicProblemComproMysqlBaseDto>("relation_topic_problem", ::RelationTopicProblemComproMysqlBaseDto) {
        val topicId = column<Int>(name = "topic_id", jdbcType = JDBCType.INTEGER)

        val problemId = column<Int>(name = "problem_id", jdbcType = JDBCType.INTEGER)
    }
}