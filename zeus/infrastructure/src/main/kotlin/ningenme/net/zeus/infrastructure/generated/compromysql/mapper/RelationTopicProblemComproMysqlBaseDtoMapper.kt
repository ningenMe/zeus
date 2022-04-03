/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.RelationTopicProblemComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.RelationTopicProblemComproMysqlBaseDtoDynamicSqlSupport.problemId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.RelationTopicProblemComproMysqlBaseDtoDynamicSqlSupport.relationTopicProblemComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.RelationTopicProblemComproMysqlBaseDtoDynamicSqlSupport.topicId
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
interface RelationTopicProblemComproMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RelationTopicProblemComproMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="RelationTopicProblemComproMysqlBaseDtoResult", value = [
        Result(column="topic_id", property="topicId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="problem_id", property="problemId", jdbcType=JdbcType.INTEGER, id=true)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<RelationTopicProblemComproMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("RelationTopicProblemComproMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): RelationTopicProblemComproMysqlBaseDto?
}

fun RelationTopicProblemComproMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, relationTopicProblemComproMysqlBaseDto, completer)

fun RelationTopicProblemComproMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, relationTopicProblemComproMysqlBaseDto, completer)

fun RelationTopicProblemComproMysqlBaseDtoMapper.deleteByPrimaryKey(topicId_: Int, problemId_: Int) =
    delete {
        where { topicId isEqualTo topicId_ }
        and { problemId isEqualTo problemId_ }
    }

fun RelationTopicProblemComproMysqlBaseDtoMapper.insert(row: RelationTopicProblemComproMysqlBaseDto) =
    insert(this::insert, row, relationTopicProblemComproMysqlBaseDto) {
        map(topicId) toProperty "topicId"
        map(problemId) toProperty "problemId"
    }

fun RelationTopicProblemComproMysqlBaseDtoMapper.insertMultiple(records: Collection<RelationTopicProblemComproMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, relationTopicProblemComproMysqlBaseDto) {
        map(topicId) toProperty "topicId"
        map(problemId) toProperty "problemId"
    }

fun RelationTopicProblemComproMysqlBaseDtoMapper.insertMultiple(vararg records: RelationTopicProblemComproMysqlBaseDto) =
    insertMultiple(records.toList())

fun RelationTopicProblemComproMysqlBaseDtoMapper.insertSelective(row: RelationTopicProblemComproMysqlBaseDto) =
    insert(this::insert, row, relationTopicProblemComproMysqlBaseDto) {
        map(topicId).toPropertyWhenPresent("topicId", row::topicId)
        map(problemId).toPropertyWhenPresent("problemId", row::problemId)
    }

private val columnList = listOf(topicId, problemId)

fun RelationTopicProblemComproMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, relationTopicProblemComproMysqlBaseDto, completer)

fun RelationTopicProblemComproMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, relationTopicProblemComproMysqlBaseDto, completer)

fun RelationTopicProblemComproMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, relationTopicProblemComproMysqlBaseDto, completer)

fun RelationTopicProblemComproMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, relationTopicProblemComproMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: RelationTopicProblemComproMysqlBaseDto) =
    apply {
        set(topicId) equalToOrNull row::topicId
        set(problemId) equalToOrNull row::problemId
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: RelationTopicProblemComproMysqlBaseDto) =
    apply {
        set(topicId) equalToWhenPresent row::topicId
        set(problemId) equalToWhenPresent row::problemId
    }