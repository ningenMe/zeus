/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.TopicComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicComproMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicComproMysqlBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicComproMysqlBaseDtoDynamicSqlSupport.genreId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicComproMysqlBaseDtoDynamicSqlSupport.topicComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicComproMysqlBaseDtoDynamicSqlSupport.topicId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicComproMysqlBaseDtoDynamicSqlSupport.topicName
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicComproMysqlBaseDtoDynamicSqlSupport.topicOrder
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicComproMysqlBaseDtoDynamicSqlSupport.updatedTime
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter
import org.mybatis.dynamic.sql.util.kotlin.CountCompleter
import org.mybatis.dynamic.sql.util.kotlin.DeleteCompleter
import org.mybatis.dynamic.sql.util.kotlin.KotlinUpdateBuilder
import org.mybatis.dynamic.sql.util.kotlin.SelectCompleter
import org.mybatis.dynamic.sql.util.kotlin.UpdateCompleter
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.countFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.deleteFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.insert
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.insertMultiple
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectDistinct
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectList
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectOne
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.update
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper

@Mapper
interface TopicComproMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<TopicComproMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="TopicComproMysqlBaseDtoResult", value = [
        Result(column="topic_id", property="topicId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="genre_id", property="genreId", jdbcType=JdbcType.INTEGER),
        Result(column="topic_name", property="topicName", jdbcType=JdbcType.VARCHAR),
        Result(column="topic_order", property="topicOrder", jdbcType=JdbcType.INTEGER),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<TopicComproMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("TopicComproMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): TopicComproMysqlBaseDto?
}

fun TopicComproMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, topicComproMysqlBaseDto, completer)

fun TopicComproMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, topicComproMysqlBaseDto, completer)

fun TopicComproMysqlBaseDtoMapper.deleteByPrimaryKey(topicId_: Int) =
    delete {
        where { topicId isEqualTo topicId_ }
    }

fun TopicComproMysqlBaseDtoMapper.insert(row: TopicComproMysqlBaseDto) =
    insert(this::insert, row, topicComproMysqlBaseDto) {
        map(topicId) toProperty "topicId"
        map(genreId) toProperty "genreId"
        map(topicName) toProperty "topicName"
        map(topicOrder) toProperty "topicOrder"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun TopicComproMysqlBaseDtoMapper.insertMultiple(records: Collection<TopicComproMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, topicComproMysqlBaseDto) {
        map(topicId) toProperty "topicId"
        map(genreId) toProperty "genreId"
        map(topicName) toProperty "topicName"
        map(topicOrder) toProperty "topicOrder"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun TopicComproMysqlBaseDtoMapper.insertMultiple(vararg records: TopicComproMysqlBaseDto) =
    insertMultiple(records.toList())

fun TopicComproMysqlBaseDtoMapper.insertSelective(row: TopicComproMysqlBaseDto) =
    insert(this::insert, row, topicComproMysqlBaseDto) {
        map(topicId).toPropertyWhenPresent("topicId", row::topicId)
        map(genreId).toPropertyWhenPresent("genreId", row::genreId)
        map(topicName).toPropertyWhenPresent("topicName", row::topicName)
        map(topicOrder).toPropertyWhenPresent("topicOrder", row::topicOrder)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(topicId, genreId, topicName, topicOrder, createdTime, updatedTime, deletedTime)

fun TopicComproMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, topicComproMysqlBaseDto, completer)

fun TopicComproMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, topicComproMysqlBaseDto, completer)

fun TopicComproMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, topicComproMysqlBaseDto, completer)

fun TopicComproMysqlBaseDtoMapper.selectByPrimaryKey(topicId_: Int) =
    selectOne {
        where { topicId isEqualTo topicId_ }
    }

fun TopicComproMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, topicComproMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: TopicComproMysqlBaseDto) =
    apply {
        set(topicId) equalToOrNull row::topicId
        set(genreId) equalToOrNull row::genreId
        set(topicName) equalToOrNull row::topicName
        set(topicOrder) equalToOrNull row::topicOrder
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: TopicComproMysqlBaseDto) =
    apply {
        set(topicId) equalToWhenPresent row::topicId
        set(genreId) equalToWhenPresent row::genreId
        set(topicName) equalToWhenPresent row::topicName
        set(topicOrder) equalToWhenPresent row::topicOrder
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun TopicComproMysqlBaseDtoMapper.updateByPrimaryKey(row: TopicComproMysqlBaseDto) =
    update {
        set(genreId) equalToOrNull row::genreId
        set(topicName) equalToOrNull row::topicName
        set(topicOrder) equalToOrNull row::topicOrder
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { topicId isEqualTo row.topicId!! }
    }

fun TopicComproMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: TopicComproMysqlBaseDto) =
    update {
        set(genreId) equalToWhenPresent row::genreId
        set(topicName) equalToWhenPresent row::topicName
        set(topicOrder) equalToWhenPresent row::topicOrder
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { topicId isEqualTo row.topicId!! }
    }