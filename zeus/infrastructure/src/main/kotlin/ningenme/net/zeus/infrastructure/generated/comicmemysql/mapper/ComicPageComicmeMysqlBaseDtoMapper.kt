/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.ComicPageComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageComicmeMysqlBaseDtoDynamicSqlSupport.comicPageComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageComicmeMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageComicmeMysqlBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageComicmeMysqlBaseDtoDynamicSqlSupport.name
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageComicmeMysqlBaseDtoDynamicSqlSupport.processedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageComicmeMysqlBaseDtoDynamicSqlSupport.updatedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicPageComicmeMysqlBaseDtoDynamicSqlSupport.url
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
interface ComicPageComicmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ComicPageComicmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="ComicPageComicmeMysqlBaseDtoResult", value = [
        Result(column="url", property="url", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        Result(column="processed_time", property="processedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<ComicPageComicmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("ComicPageComicmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): ComicPageComicmeMysqlBaseDto?
}

fun ComicPageComicmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, comicPageComicmeMysqlBaseDto, completer)

fun ComicPageComicmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, comicPageComicmeMysqlBaseDto, completer)

fun ComicPageComicmeMysqlBaseDtoMapper.deleteByPrimaryKey(url_: String) =
    delete {
        where { url isEqualTo url_ }
    }

fun ComicPageComicmeMysqlBaseDtoMapper.insert(row: ComicPageComicmeMysqlBaseDto) =
    insert(this::insert, row, comicPageComicmeMysqlBaseDto) {
        map(url) toProperty "url"
        map(name) toProperty "name"
        map(processedTime) toProperty "processedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ComicPageComicmeMysqlBaseDtoMapper.insertMultiple(records: Collection<ComicPageComicmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, comicPageComicmeMysqlBaseDto) {
        map(url) toProperty "url"
        map(name) toProperty "name"
        map(processedTime) toProperty "processedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ComicPageComicmeMysqlBaseDtoMapper.insertMultiple(vararg records: ComicPageComicmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun ComicPageComicmeMysqlBaseDtoMapper.insertSelective(row: ComicPageComicmeMysqlBaseDto) =
    insert(this::insert, row, comicPageComicmeMysqlBaseDto) {
        map(url).toPropertyWhenPresent("url", row::url)
        map(name).toPropertyWhenPresent("name", row::name)
        map(processedTime).toPropertyWhenPresent("processedTime", row::processedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(url, name, processedTime, createdTime, updatedTime, deletedTime)

fun ComicPageComicmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, comicPageComicmeMysqlBaseDto, completer)

fun ComicPageComicmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, comicPageComicmeMysqlBaseDto, completer)

fun ComicPageComicmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, comicPageComicmeMysqlBaseDto, completer)

fun ComicPageComicmeMysqlBaseDtoMapper.selectByPrimaryKey(url_: String) =
    selectOne {
        where { url isEqualTo url_ }
    }

fun ComicPageComicmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, comicPageComicmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: ComicPageComicmeMysqlBaseDto) =
    apply {
        set(url) equalToOrNull row::url
        set(name) equalToOrNull row::name
        set(processedTime) equalToOrNull row::processedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: ComicPageComicmeMysqlBaseDto) =
    apply {
        set(url) equalToWhenPresent row::url
        set(name) equalToWhenPresent row::name
        set(processedTime) equalToWhenPresent row::processedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun ComicPageComicmeMysqlBaseDtoMapper.updateByPrimaryKey(row: ComicPageComicmeMysqlBaseDto) =
    update {
        set(name) equalToOrNull row::name
        set(processedTime) equalToOrNull row::processedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { url isEqualTo row.url!! }
    }

fun ComicPageComicmeMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: ComicPageComicmeMysqlBaseDto) =
    update {
        set(name) equalToWhenPresent row::name
        set(processedTime) equalToWhenPresent row::processedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { url isEqualTo row.url!! }
    }