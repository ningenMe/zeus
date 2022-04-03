/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.ComicComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.comicComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.comicId
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.comicName
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.isbn13
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.publishedDate
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.updatedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.url
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.ComicComicmeMysqlBaseDtoDynamicSqlSupport.workId
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
interface ComicComicmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ComicComicmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="ComicComicmeMysqlBaseDtoResult", value = [
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
    fun selectMany(selectStatement: SelectStatementProvider): List<ComicComicmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("ComicComicmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): ComicComicmeMysqlBaseDto?
}

fun ComicComicmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, comicComicmeMysqlBaseDto, completer)

fun ComicComicmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, comicComicmeMysqlBaseDto, completer)

fun ComicComicmeMysqlBaseDtoMapper.deleteByPrimaryKey(comicId_: Int) =
    delete {
        where { comicId isEqualTo comicId_ }
    }

fun ComicComicmeMysqlBaseDtoMapper.insert(row: ComicComicmeMysqlBaseDto) =
    insert(this::insert, row, comicComicmeMysqlBaseDto) {
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

fun ComicComicmeMysqlBaseDtoMapper.insertMultiple(records: Collection<ComicComicmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, comicComicmeMysqlBaseDto) {
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

fun ComicComicmeMysqlBaseDtoMapper.insertMultiple(vararg records: ComicComicmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun ComicComicmeMysqlBaseDtoMapper.insertSelective(row: ComicComicmeMysqlBaseDto) =
    insert(this::insert, row, comicComicmeMysqlBaseDto) {
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

fun ComicComicmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, comicComicmeMysqlBaseDto, completer)

fun ComicComicmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, comicComicmeMysqlBaseDto, completer)

fun ComicComicmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, comicComicmeMysqlBaseDto, completer)

fun ComicComicmeMysqlBaseDtoMapper.selectByPrimaryKey(comicId_: Int) =
    selectOne {
        where { comicId isEqualTo comicId_ }
    }

fun ComicComicmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, comicComicmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: ComicComicmeMysqlBaseDto) =
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

fun KotlinUpdateBuilder.updateSelectiveColumns(row: ComicComicmeMysqlBaseDto) =
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

fun ComicComicmeMysqlBaseDtoMapper.updateByPrimaryKey(row: ComicComicmeMysqlBaseDto) =
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

fun ComicComicmeMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: ComicComicmeMysqlBaseDto) =
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