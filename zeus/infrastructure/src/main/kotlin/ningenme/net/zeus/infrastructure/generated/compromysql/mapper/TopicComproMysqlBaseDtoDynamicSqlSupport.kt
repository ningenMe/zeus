/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object TopicComproMysqlBaseDtoDynamicSqlSupport {
    val topicComproMysqlBaseDto = TopicComproMysqlBaseDto()

    val topicId = topicComproMysqlBaseDto.topicId

    val genreId = topicComproMysqlBaseDto.genreId

    val topicName = topicComproMysqlBaseDto.topicName

    val topicOrder = topicComproMysqlBaseDto.topicOrder

    val createdTime = topicComproMysqlBaseDto.createdTime

    val updatedTime = topicComproMysqlBaseDto.updatedTime

    val deletedTime = topicComproMysqlBaseDto.deletedTime

    class TopicComproMysqlBaseDto : AliasableSqlTable<TopicComproMysqlBaseDto>("topic", ::TopicComproMysqlBaseDto) {
        val topicId = column<Int>(name = "topic_id", jdbcType = JDBCType.INTEGER)

        val genreId = column<Int>(name = "genre_id", jdbcType = JDBCType.INTEGER)

        val topicName = column<String>(name = "topic_name", jdbcType = JDBCType.VARCHAR)

        val topicOrder = column<Int>(name = "topic_order", jdbcType = JDBCType.INTEGER)

        val createdTime = column<Date>(name = "created_time", jdbcType = JDBCType.TIMESTAMP)

        val updatedTime = column<Date>(name = "updated_time", jdbcType = JDBCType.TIMESTAMP)

        val deletedTime = column<Date>(name = "deleted_time", jdbcType = JDBCType.TIMESTAMP)
    }
}