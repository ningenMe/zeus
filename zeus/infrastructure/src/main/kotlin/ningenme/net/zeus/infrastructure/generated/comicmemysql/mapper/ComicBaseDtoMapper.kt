/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.ComicBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.comicBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.comicId
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.comicName
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.isbn13
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.publishedDate
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.updatedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.url
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicBaseDtoDynamicSqlSupport.workId
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
interface ComicBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ComicBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="ComicBaseDtoResult", value = [
        Result(column="comic_id", property="comicId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="isbn13", property="isbn13", jdbcType=JdbcType.VARCHAR),
        Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER),
        Result(column="comic_name", property="comicName", jdbcType=JdbcType.VARCHAR),
        Result(column="published_date", property="publishedDate", jdbcType=JdbcType.DATE),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<ComicBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("ComicBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): ComicBaseDto?
}

fun ComicBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, comicBaseDto, completer)

fun ComicBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, comicBaseDto, completer)

fun ComicBaseDtoMapper.deleteByPrimaryKey(comicId_: Int) =
    delete {
        where { comicId isEqualTo comicId_ }
    }

fun ComicBaseDtoMapper.insert(row: ComicBaseDto) =
    insert(this::insert, row, comicBaseDto) {
        map(comicId) toProperty "comicId"
        map(isbn13) toProperty "isbn13"
        map(url) toProperty "url"
        map(workId) toProperty "workId"
        map(comicName) toProperty "comicName"
        map(publishedDate) toProperty "publishedDate"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ComicBaseDtoMapper.insertMultiple(records: Collection<ComicBaseDto>) =
    insertMultiple(this::insertMultiple, records, comicBaseDto) {
        map(comicId) toProperty "comicId"
        map(isbn13) toProperty "isbn13"
        map(url) toProperty "url"
        map(workId) toProperty "workId"
        map(comicName) toProperty "comicName"
        map(publishedDate) toProperty "publishedDate"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun ComicBaseDtoMapper.insertMultiple(vararg records: ComicBaseDto) =
    insertMultiple(records.toList())

fun ComicBaseDtoMapper.insertSelective(row: ComicBaseDto) =
    insert(this::insert, row, comicBaseDto) {
        map(comicId).toPropertyWhenPresent("comicId", row::comicId)
        map(isbn13).toPropertyWhenPresent("isbn13", row::isbn13)
        map(url).toPropertyWhenPresent("url", row::url)
        map(workId).toPropertyWhenPresent("workId", row::workId)
        map(comicName).toPropertyWhenPresent("comicName", row::comicName)
        map(publishedDate).toPropertyWhenPresent("publishedDate", row::publishedDate)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(comicId, isbn13, url, workId, comicName, publishedDate, createdTime, updatedTime, deletedTime)

fun ComicBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, comicBaseDto, completer)

fun ComicBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, comicBaseDto, completer)

fun ComicBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, comicBaseDto, completer)

fun ComicBaseDtoMapper.selectByPrimaryKey(comicId_: Int) =
    selectOne {
        where { comicId isEqualTo comicId_ }
    }

fun ComicBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, comicBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: ComicBaseDto) =
    apply {
        set(comicId) equalToOrNull row::comicId
        set(isbn13) equalToOrNull row::isbn13
        set(url) equalToOrNull row::url
        set(workId) equalToOrNull row::workId
        set(comicName) equalToOrNull row::comicName
        set(publishedDate) equalToOrNull row::publishedDate
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: ComicBaseDto) =
    apply {
        set(comicId) equalToWhenPresent row::comicId
        set(isbn13) equalToWhenPresent row::isbn13
        set(url) equalToWhenPresent row::url
        set(workId) equalToWhenPresent row::workId
        set(comicName) equalToWhenPresent row::comicName
        set(publishedDate) equalToWhenPresent row::publishedDate
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun ComicBaseDtoMapper.updateByPrimaryKey(row: ComicBaseDto) =
    update {
        set(isbn13) equalToOrNull row::isbn13
        set(url) equalToOrNull row::url
        set(workId) equalToOrNull row::workId
        set(comicName) equalToOrNull row::comicName
        set(publishedDate) equalToOrNull row::publishedDate
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { comicId isEqualTo row.comicId!! }
    }

fun ComicBaseDtoMapper.updateByPrimaryKeySelective(row: ComicBaseDto) =
    update {
        set(isbn13) equalToWhenPresent row::isbn13
        set(url) equalToWhenPresent row::url
        set(workId) equalToWhenPresent row::workId
        set(comicName) equalToWhenPresent row::comicName
        set(publishedDate) equalToWhenPresent row::publishedDate
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { comicId isEqualTo row.comicId!! }
    }