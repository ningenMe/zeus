/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.RelationTopicProblemBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.RelationTopicProblemBaseDtoDynamicSqlSupport.problemId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.RelationTopicProblemBaseDtoDynamicSqlSupport.relationTopicProblemBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.RelationTopicProblemBaseDtoDynamicSqlSupport.topicId
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
interface RelationTopicProblemBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RelationTopicProblemBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="RelationTopicProblemBaseDtoResult", value = [
        Result(column="topic_id", property="topicId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="problem_id", property="problemId", jdbcType=JdbcType.INTEGER, id=true)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<RelationTopicProblemBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("RelationTopicProblemBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): RelationTopicProblemBaseDto?
}

fun RelationTopicProblemBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, relationTopicProblemBaseDto, completer)

fun RelationTopicProblemBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, relationTopicProblemBaseDto, completer)

fun RelationTopicProblemBaseDtoMapper.deleteByPrimaryKey(topicId_: Int, problemId_: Int) =
    delete {
        where { topicId isEqualTo topicId_ }
        and { problemId isEqualTo problemId_ }
    }

fun RelationTopicProblemBaseDtoMapper.insert(row: RelationTopicProblemBaseDto) =
    insert(this::insert, row, relationTopicProblemBaseDto) {
        map(topicId) toProperty "topicId"
        map(problemId) toProperty "problemId"
    }

fun RelationTopicProblemBaseDtoMapper.insertMultiple(records: Collection<RelationTopicProblemBaseDto>) =
    insertMultiple(this::insertMultiple, records, relationTopicProblemBaseDto) {
        map(topicId) toProperty "topicId"
        map(problemId) toProperty "problemId"
    }

fun RelationTopicProblemBaseDtoMapper.insertMultiple(vararg records: RelationTopicProblemBaseDto) =
    insertMultiple(records.toList())

fun RelationTopicProblemBaseDtoMapper.insertSelective(row: RelationTopicProblemBaseDto) =
    insert(this::insert, row, relationTopicProblemBaseDto) {
        map(topicId).toPropertyWhenPresent("topicId", row::topicId)
        map(problemId).toPropertyWhenPresent("problemId", row::problemId)
    }

private val columnList = listOf(topicId, problemId)

fun RelationTopicProblemBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, relationTopicProblemBaseDto, completer)

fun RelationTopicProblemBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, relationTopicProblemBaseDto, completer)

fun RelationTopicProblemBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, relationTopicProblemBaseDto, completer)

fun RelationTopicProblemBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, relationTopicProblemBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: RelationTopicProblemBaseDto) =
    apply {
        set(topicId) equalToOrNull row::topicId
        set(problemId) equalToOrNull row::problemId
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: RelationTopicProblemBaseDto) =
    apply {
        set(topicId) equalToWhenPresent row::topicId
        set(problemId) equalToWhenPresent row::problemId
    }