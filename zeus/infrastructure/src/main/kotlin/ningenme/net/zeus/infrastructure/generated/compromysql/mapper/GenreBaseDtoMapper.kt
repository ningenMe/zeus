/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.GenreBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreBaseDtoDynamicSqlSupport.genreBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreBaseDtoDynamicSqlSupport.genreId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreBaseDtoDynamicSqlSupport.genreName
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreBaseDtoDynamicSqlSupport.genreOrder
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreBaseDtoDynamicSqlSupport.path
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.GenreBaseDtoDynamicSqlSupport.updatedTime
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
interface GenreBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<GenreBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="GenreBaseDtoResult", value = [
        Result(column="genre_id", property="genreId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="genre_name", property="genreName", jdbcType=JdbcType.VARCHAR),
        Result(column="path", property="path", jdbcType=JdbcType.CHAR),
        Result(column="genre_order", property="genreOrder", jdbcType=JdbcType.INTEGER),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<GenreBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("GenreBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): GenreBaseDto?
}

fun GenreBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, genreBaseDto, completer)

fun GenreBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, genreBaseDto, completer)

fun GenreBaseDtoMapper.deleteByPrimaryKey(genreId_: Int) =
    delete {
        where { genreId isEqualTo genreId_ }
    }

fun GenreBaseDtoMapper.insert(row: GenreBaseDto) =
    insert(this::insert, row, genreBaseDto) {
        map(genreId) toProperty "genreId"
        map(genreName) toProperty "genreName"
        map(path) toProperty "path"
        map(genreOrder) toProperty "genreOrder"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun GenreBaseDtoMapper.insertMultiple(records: Collection<GenreBaseDto>) =
    insertMultiple(this::insertMultiple, records, genreBaseDto) {
        map(genreId) toProperty "genreId"
        map(genreName) toProperty "genreName"
        map(path) toProperty "path"
        map(genreOrder) toProperty "genreOrder"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun GenreBaseDtoMapper.insertMultiple(vararg records: GenreBaseDto) =
    insertMultiple(records.toList())

fun GenreBaseDtoMapper.insertSelective(row: GenreBaseDto) =
    insert(this::insert, row, genreBaseDto) {
        map(genreId).toPropertyWhenPresent("genreId", row::genreId)
        map(genreName).toPropertyWhenPresent("genreName", row::genreName)
        map(path).toPropertyWhenPresent("path", row::path)
        map(genreOrder).toPropertyWhenPresent("genreOrder", row::genreOrder)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(genreId, genreName, path, genreOrder, createdTime, updatedTime, deletedTime)

fun GenreBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, genreBaseDto, completer)

fun GenreBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, genreBaseDto, completer)

fun GenreBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, genreBaseDto, completer)

fun GenreBaseDtoMapper.selectByPrimaryKey(genreId_: Int) =
    selectOne {
        where { genreId isEqualTo genreId_ }
    }

fun GenreBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, genreBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: GenreBaseDto) =
    apply {
        set(genreId) equalToOrNull row::genreId
        set(genreName) equalToOrNull row::genreName
        set(path) equalToOrNull row::path
        set(genreOrder) equalToOrNull row::genreOrder
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: GenreBaseDto) =
    apply {
        set(genreId) equalToWhenPresent row::genreId
        set(genreName) equalToWhenPresent row::genreName
        set(path) equalToWhenPresent row::path
        set(genreOrder) equalToWhenPresent row::genreOrder
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun GenreBaseDtoMapper.updateByPrimaryKey(row: GenreBaseDto) =
    update {
        set(genreName) equalToOrNull row::genreName
        set(path) equalToOrNull row::path
        set(genreOrder) equalToOrNull row::genreOrder
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { genreId isEqualTo row.genreId!! }
    }

fun GenreBaseDtoMapper.updateByPrimaryKeySelective(row: GenreBaseDto) =
    update {
        set(genreName) equalToWhenPresent row::genreName
        set(path) equalToWhenPresent row::path
        set(genreOrder) equalToWhenPresent row::genreOrder
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { genreId isEqualTo row.genreId!! }
    }