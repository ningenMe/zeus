/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object RelationTopicProblemBaseDtoDynamicSqlSupport {
    val relationTopicProblemBaseDto = RelationTopicProblemBaseDto()

    val topicId = relationTopicProblemBaseDto.topicId

    val problemId = relationTopicProblemBaseDto.problemId

    class RelationTopicProblemBaseDto : AliasableSqlTable<RelationTopicProblemBaseDto>("relation_topic_problem", ::RelationTopicProblemBaseDto) {
        val topicId = column<Int>(name = "topic_id", jdbcType = JDBCType.INTEGER)

        val problemId = column<Int>(name = "problem_id", jdbcType = JDBCType.INTEGER)
    }
}