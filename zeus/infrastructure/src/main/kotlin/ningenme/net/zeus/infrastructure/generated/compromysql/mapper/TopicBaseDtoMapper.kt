/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.TopicBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicBaseDtoDynamicSqlSupport.genreId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicBaseDtoDynamicSqlSupport.topicBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicBaseDtoDynamicSqlSupport.topicId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicBaseDtoDynamicSqlSupport.topicName
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicBaseDtoDynamicSqlSupport.topicOrder
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.TopicBaseDtoDynamicSqlSupport.updatedTime
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
interface TopicBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<TopicBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="TopicBaseDtoResult", value = [
        Result(column="topic_id", property="topicId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="genre_id", property="genreId", jdbcType=JdbcType.INTEGER),
        Result(column="topic_name", property="topicName", jdbcType=JdbcType.VARCHAR),
        Result(column="topic_order", property="topicOrder", jdbcType=JdbcType.INTEGER),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<TopicBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("TopicBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): TopicBaseDto?
}

fun TopicBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, topicBaseDto, completer)

fun TopicBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, topicBaseDto, completer)

fun TopicBaseDtoMapper.deleteByPrimaryKey(topicId_: Int) =
    delete {
        where { topicId isEqualTo topicId_ }
    }

fun TopicBaseDtoMapper.insert(row: TopicBaseDto) =
    insert(this::insert, row, topicBaseDto) {
        map(topicId) toProperty "topicId"
        map(genreId) toProperty "genreId"
        map(topicName) toProperty "topicName"
        map(topicOrder) toProperty "topicOrder"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun TopicBaseDtoMapper.insertMultiple(records: Collection<TopicBaseDto>) =
    insertMultiple(this::insertMultiple, records, topicBaseDto) {
        map(topicId) toProperty "topicId"
        map(genreId) toProperty "genreId"
        map(topicName) toProperty "topicName"
        map(topicOrder) toProperty "topicOrder"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun TopicBaseDtoMapper.insertMultiple(vararg records: TopicBaseDto) =
    insertMultiple(records.toList())

fun TopicBaseDtoMapper.insertSelective(row: TopicBaseDto) =
    insert(this::insert, row, topicBaseDto) {
        map(topicId).toPropertyWhenPresent("topicId", row::topicId)
        map(genreId).toPropertyWhenPresent("genreId", row::genreId)
        map(topicName).toPropertyWhenPresent("topicName", row::topicName)
        map(topicOrder).toPropertyWhenPresent("topicOrder", row::topicOrder)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(topicId, genreId, topicName, topicOrder, createdTime, updatedTime, deletedTime)

fun TopicBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, topicBaseDto, completer)

fun TopicBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, topicBaseDto, completer)

fun TopicBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, topicBaseDto, completer)

fun TopicBaseDtoMapper.selectByPrimaryKey(topicId_: Int) =
    selectOne {
        where { topicId isEqualTo topicId_ }
    }

fun TopicBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, topicBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: TopicBaseDto) =
    apply {
        set(topicId) equalToOrNull row::topicId
        set(genreId) equalToOrNull row::genreId
        set(topicName) equalToOrNull row::topicName
        set(topicOrder) equalToOrNull row::topicOrder
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: TopicBaseDto) =
    apply {
        set(topicId) equalToWhenPresent row::topicId
        set(genreId) equalToWhenPresent row::genreId
        set(topicName) equalToWhenPresent row::topicName
        set(topicOrder) equalToWhenPresent row::topicOrder
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun TopicBaseDtoMapper.updateByPrimaryKey(row: TopicBaseDto) =
    update {
        set(genreId) equalToOrNull row::genreId
        set(topicName) equalToOrNull row::topicName
        set(topicOrder) equalToOrNull row::topicOrder
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { topicId isEqualTo row.topicId!! }
    }

fun TopicBaseDtoMapper.updateByPrimaryKeySelective(row: TopicBaseDto) =
    update {
        set(genreId) equalToWhenPresent row::genreId
        set(topicName) equalToWhenPresent row::topicName
        set(topicOrder) equalToWhenPresent row::topicOrder
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { topicId isEqualTo row.topicId!! }
    }