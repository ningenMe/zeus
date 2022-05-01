/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.ComicPageBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageBaseDtoDynamicSqlSupport.comicPageBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageBaseDtoDynamicSqlSupport.name
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageBaseDtoDynamicSqlSupport.processedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageBaseDtoDynamicSqlSupport.updatedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageBaseDtoDynamicSqlSupport.url
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
interface ComicPageBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ComicPageBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="ComicPageBaseDtoResult", value = [
        Result(column="url", property="url", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        Result(column="processed_time", property="processedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<ComicPageBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("ComicPageBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): ComicPageBaseDto?
}

fun ComicPageBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, comicPageBaseDto, completer)

fun ComicPageBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, comicPageBaseDto, completer)

fun ComicPageBaseDtoMapper.deleteByPrimaryKey(url_: String) =
    delete {
        where { url isEqualTo url_ }
    }

fun ComicPageBaseDtoMapper.insert(row: ComicPageBaseDto) =
    insert(this::insert, row, comicPageBaseDto) {
        map(url) toProperty "url"
        map(name) toProperty "name"
        map(processedTime) toProperty "processedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ComicPageBaseDtoMapper.insertMultiple(records: Collection<ComicPageBaseDto>) =
    insertMultiple(this::insertMultiple, records, comicPageBaseDto) {
        map(url) toProperty "url"
        map(name) toProperty "name"
        map(processedTime) toProperty "processedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ComicPageBaseDtoMapper.insertMultiple(vararg records: ComicPageBaseDto) =
    insertMultiple(records.toList())

fun ComicPageBaseDtoMapper.insertSelective(row: ComicPageBaseDto) =
    insert(this::insert, row, comicPageBaseDto) {
        map(url).toPropertyWhenPresent("url", row::url)
        map(name).toPropertyWhenPresent("name", row::name)
        map(processedTime).toPropertyWhenPresent("processedTime", row::processedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(url, name, processedTime, createdTime, updatedTime, deletedTime)

fun ComicPageBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, comicPageBaseDto, completer)

fun ComicPageBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, comicPageBaseDto, completer)

fun ComicPageBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, comicPageBaseDto, completer)

fun ComicPageBaseDtoMapper.selectByPrimaryKey(url_: String) =
    selectOne {
        where { url isEqualTo url_ }
    }

fun ComicPageBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, comicPageBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: ComicPageBaseDto) =
    apply {
        set(url) equalToOrNull row::url
        set(name) equalToOrNull row::name
        set(processedTime) equalToOrNull row::processedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: ComicPageBaseDto) =
    apply {
        set(url) equalToWhenPresent row::url
        set(name) equalToWhenPresent row::name
        set(processedTime) equalToWhenPresent row::processedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun ComicPageBaseDtoMapper.updateByPrimaryKey(row: ComicPageBaseDto) =
    update {
        set(name) equalToOrNull row::name
        set(processedTime) equalToOrNull row::processedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { url isEqualTo row.url!! }
    }

fun ComicPageBaseDtoMapper.updateByPrimaryKeySelective(row: ComicPageBaseDto) =
    update {
        set(name) equalToWhenPresent row::name
        set(processedTime) equalToWhenPresent row::processedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { url isEqualTo row.url!! }
    }