/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.ProblemBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.ProblemBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.ProblemBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.ProblemBaseDtoDynamicSqlSupport.estimation
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.ProblemBaseDtoDynamicSqlSupport.problemBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.ProblemBaseDtoDynamicSqlSupport.problemId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.ProblemBaseDtoDynamicSqlSupport.problemName
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.ProblemBaseDtoDynamicSqlSupport.updatedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.ProblemBaseDtoDynamicSqlSupport.url
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
interface ProblemBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ProblemBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="ProblemBaseDtoResult", value = [
        Result(column="problem_id", property="problemId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        Result(column="problem_name", property="problemName", jdbcType=JdbcType.VARCHAR),
        Result(column="estimation", property="estimation", jdbcType=JdbcType.INTEGER),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<ProblemBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("ProblemBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): ProblemBaseDto?
}

fun ProblemBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, problemBaseDto, completer)

fun ProblemBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, problemBaseDto, completer)

fun ProblemBaseDtoMapper.deleteByPrimaryKey(problemId_: Int) =
    delete {
        where { problemId isEqualTo problemId_ }
    }

fun ProblemBaseDtoMapper.insert(row: ProblemBaseDto) =
    insert(this::insert, row, problemBaseDto) {
        map(problemId) toProperty "problemId"
        map(url) toProperty "url"
        map(problemName) toProperty "problemName"
        map(estimation) toProperty "estimation"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun ProblemBaseDtoMapper.insertMultiple(records: Collection<ProblemBaseDto>) =
    insertMultiple(this::insertMultiple, records, problemBaseDto) {
        map(problemId) toProperty "problemId"
        map(url) toProperty "url"
        map(problemName) toProperty "problemName"
        map(estimation) toProperty "estimation"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun ProblemBaseDtoMapper.insertMultiple(vararg records: ProblemBaseDto) =
    insertMultiple(records.toList())

fun ProblemBaseDtoMapper.insertSelective(row: ProblemBaseDto) =
    insert(this::insert, row, problemBaseDto) {
        map(problemId).toPropertyWhenPresent("problemId", row::problemId)
        map(url).toPropertyWhenPresent("url", row::url)
        map(problemName).toPropertyWhenPresent("problemName", row::problemName)
        map(estimation).toPropertyWhenPresent("estimation", row::estimation)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(problemId, url, problemName, estimation, deletedTime, createdTime, updatedTime)

fun ProblemBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, problemBaseDto, completer)

fun ProblemBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, problemBaseDto, completer)

fun ProblemBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, problemBaseDto, completer)

fun ProblemBaseDtoMapper.selectByPrimaryKey(problemId_: Int) =
    selectOne {
        where { problemId isEqualTo problemId_ }
    }

fun ProblemBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, problemBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: ProblemBaseDto) =
    apply {
        set(problemId) equalToOrNull row::problemId
        set(url) equalToOrNull row::url
        set(problemName) equalToOrNull row::problemName
        set(estimation) equalToOrNull row::estimation
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: ProblemBaseDto) =
    apply {
        set(problemId) equalToWhenPresent row::problemId
        set(url) equalToWhenPresent row::url
        set(problemName) equalToWhenPresent row::problemName
        set(estimation) equalToWhenPresent row::estimation
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun ProblemBaseDtoMapper.updateByPrimaryKey(row: ProblemBaseDto) =
    update {
        set(url) equalToOrNull row::url
        set(problemName) equalToOrNull row::problemName
        set(estimation) equalToOrNull row::estimation
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { problemId isEqualTo row.problemId!! }
    }

fun ProblemBaseDtoMapper.updateByPrimaryKeySelective(row: ProblemBaseDto) =
    update {
        set(url) equalToWhenPresent row::url
        set(problemName) equalToWhenPresent row::problemName
        set(estimation) equalToWhenPresent row::estimation
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { problemId isEqualTo row.problemId!! }
    }