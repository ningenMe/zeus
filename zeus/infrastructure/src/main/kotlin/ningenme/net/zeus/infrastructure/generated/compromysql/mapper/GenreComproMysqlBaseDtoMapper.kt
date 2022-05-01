/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.GenreComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreComproMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreComproMysqlBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreComproMysqlBaseDtoDynamicSqlSupport.genreComproMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreComproMysqlBaseDtoDynamicSqlSupport.genreId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreComproMysqlBaseDtoDynamicSqlSupport.genreName
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreComproMysqlBaseDtoDynamicSqlSupport.genreOrder
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreComproMysqlBaseDtoDynamicSqlSupport.path
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreComproMysqlBaseDtoDynamicSqlSupport.updatedTime
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
interface GenreComproMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<GenreComproMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="GenreComproMysqlBaseDtoResult", value = [
        Result(column="genre_id", property="genreId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="genre_name", property="genreName", jdbcType=JdbcType.VARCHAR),
        Result(column="path", property="path", jdbcType=JdbcType.CHAR),
        Result(column="genre_order", property="genreOrder", jdbcType=JdbcType.INTEGER),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<GenreComproMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("GenreComproMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): GenreComproMysqlBaseDto?
}

fun GenreComproMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, genreComproMysqlBaseDto, completer)

fun GenreComproMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, genreComproMysqlBaseDto, completer)

fun GenreComproMysqlBaseDtoMapper.deleteByPrimaryKey(genreId_: Int) =
    delete {
        where { genreId isEqualTo genreId_ }
    }

fun GenreComproMysqlBaseDtoMapper.insert(row: GenreComproMysqlBaseDto) =
    insert(this::insert, row, genreComproMysqlBaseDto) {
        map(genreId) toProperty "genreId"
        map(genreName) toProperty "genreName"
        map(path) toProperty "path"
        map(genreOrder) toProperty "genreOrder"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun GenreComproMysqlBaseDtoMapper.insertMultiple(records: Collection<GenreComproMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, genreComproMysqlBaseDto) {
        map(genreId) toProperty "genreId"
        map(genreName) toProperty "genreName"
        map(path) toProperty "path"
        map(genreOrder) toProperty "genreOrder"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun GenreComproMysqlBaseDtoMapper.insertMultiple(vararg records: GenreComproMysqlBaseDto) =
    insertMultiple(records.toList())

fun GenreComproMysqlBaseDtoMapper.insertSelective(row: GenreComproMysqlBaseDto) =
    insert(this::insert, row, genreComproMysqlBaseDto) {
        map(genreId).toPropertyWhenPresent("genreId", row::genreId)
        map(genreName).toPropertyWhenPresent("genreName", row::genreName)
        map(path).toPropertyWhenPresent("path", row::path)
        map(genreOrder).toPropertyWhenPresent("genreOrder", row::genreOrder)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(genreId, genreName, path, genreOrder, createdTime, updatedTime, deletedTime)

fun GenreComproMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, genreComproMysqlBaseDto, completer)

fun GenreComproMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, genreComproMysqlBaseDto, completer)

fun GenreComproMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, genreComproMysqlBaseDto, completer)

fun GenreComproMysqlBaseDtoMapper.selectByPrimaryKey(genreId_: Int) =
    selectOne {
        where { genreId isEqualTo genreId_ }
    }

fun GenreComproMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, genreComproMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: GenreComproMysqlBaseDto) =
    apply {
        set(genreId) equalToOrNull row::genreId
        set(genreName) equalToOrNull row::genreName
        set(path) equalToOrNull row::path
        set(genreOrder) equalToOrNull row::genreOrder
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: GenreComproMysqlBaseDto) =
    apply {
        set(genreId) equalToWhenPresent row::genreId
        set(genreName) equalToWhenPresent row::genreName
        set(path) equalToWhenPresent row::path
        set(genreOrder) equalToWhenPresent row::genreOrder
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun GenreComproMysqlBaseDtoMapper.updateByPrimaryKey(row: GenreComproMysqlBaseDto) =
    update {
        set(genreName) equalToOrNull row::genreName
        set(path) equalToOrNull row::path
        set(genreOrder) equalToOrNull row::genreOrder
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { genreId isEqualTo row.genreId!! }
    }

fun GenreComproMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: GenreComproMysqlBaseDto) =
    update {
        set(genreName) equalToWhenPresent row::genreName
        set(path) equalToWhenPresent row::path
        set(genreOrder) equalToWhenPresent row::genreOrder
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { genreId isEqualTo row.genreId!! }
    }