/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.AtcoderUserHistoryBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.atcoderId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.atcoderUserHistoryBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.contestId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.isRated
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.newRating
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.oldRating
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.performance
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.place
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserHistoryBaseDtoDynamicSqlSupport.updatedTime
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
interface AtcoderUserHistoryBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<AtcoderUserHistoryBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="AtcoderUserHistoryBaseDtoResult", value = [
        Result(column="atcoder_id", property="atcoderId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="contest_id", property="contestId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="is_rated", property="isRated", jdbcType=JdbcType.BIT),
        Result(column="place", property="place", jdbcType=JdbcType.INTEGER),
        Result(column="old_rating", property="oldRating", jdbcType=JdbcType.INTEGER),
        Result(column="new_rating", property="newRating", jdbcType=JdbcType.INTEGER),
        Result(column="performance", property="performance", jdbcType=JdbcType.INTEGER),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<AtcoderUserHistoryBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("AtcoderUserHistoryBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): AtcoderUserHistoryBaseDto?
}

fun AtcoderUserHistoryBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, atcoderUserHistoryBaseDto, completer)

fun AtcoderUserHistoryBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, atcoderUserHistoryBaseDto, completer)

fun AtcoderUserHistoryBaseDtoMapper.deleteByPrimaryKey(atcoderId_: String, contestId_: String) =
    delete {
        where { atcoderId isEqualTo atcoderId_ }
        and { contestId isEqualTo contestId_ }
    }

fun AtcoderUserHistoryBaseDtoMapper.insert(row: AtcoderUserHistoryBaseDto) =
    insert(this::insert, row, atcoderUserHistoryBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(contestId) toProperty "contestId"
        map(isRated) toProperty "isRated"
        map(place) toProperty "place"
        map(oldRating) toProperty "oldRating"
        map(newRating) toProperty "newRating"
        map(performance) toProperty "performance"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserHistoryBaseDtoMapper.insertMultiple(records: Collection<AtcoderUserHistoryBaseDto>) =
    insertMultiple(this::insertMultiple, records, atcoderUserHistoryBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(contestId) toProperty "contestId"
        map(isRated) toProperty "isRated"
        map(place) toProperty "place"
        map(oldRating) toProperty "oldRating"
        map(newRating) toProperty "newRating"
        map(performance) toProperty "performance"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserHistoryBaseDtoMapper.insertMultiple(vararg records: AtcoderUserHistoryBaseDto) =
    insertMultiple(records.toList())

fun AtcoderUserHistoryBaseDtoMapper.insertSelective(row: AtcoderUserHistoryBaseDto) =
    insert(this::insert, row, atcoderUserHistoryBaseDto) {
        map(atcoderId).toPropertyWhenPresent("atcoderId", row::atcoderId)
        map(contestId).toPropertyWhenPresent("contestId", row::contestId)
        map(isRated).toPropertyWhenPresent("isRated", row::isRated)
        map(place).toPropertyWhenPresent("place", row::place)
        map(oldRating).toPropertyWhenPresent("oldRating", row::oldRating)
        map(newRating).toPropertyWhenPresent("newRating", row::newRating)
        map(performance).toPropertyWhenPresent("performance", row::performance)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(atcoderId, contestId, isRated, place, oldRating, newRating, performance, deletedTime, createdTime, updatedTime)

fun AtcoderUserHistoryBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, atcoderUserHistoryBaseDto, completer)

fun AtcoderUserHistoryBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, atcoderUserHistoryBaseDto, completer)

fun AtcoderUserHistoryBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, atcoderUserHistoryBaseDto, completer)

fun AtcoderUserHistoryBaseDtoMapper.selectByPrimaryKey(atcoderId_: String, contestId_: String) =
    selectOne {
        where { atcoderId isEqualTo atcoderId_ }
        and { contestId isEqualTo contestId_ }
    }

fun AtcoderUserHistoryBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, atcoderUserHistoryBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: AtcoderUserHistoryBaseDto) =
    apply {
        set(atcoderId) equalToOrNull row::atcoderId
        set(contestId) equalToOrNull row::contestId
        set(isRated) equalToOrNull row::isRated
        set(place) equalToOrNull row::place
        set(oldRating) equalToOrNull row::oldRating
        set(newRating) equalToOrNull row::newRating
        set(performance) equalToOrNull row::performance
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: AtcoderUserHistoryBaseDto) =
    apply {
        set(atcoderId) equalToWhenPresent row::atcoderId
        set(contestId) equalToWhenPresent row::contestId
        set(isRated) equalToWhenPresent row::isRated
        set(place) equalToWhenPresent row::place
        set(oldRating) equalToWhenPresent row::oldRating
        set(newRating) equalToWhenPresent row::newRating
        set(performance) equalToWhenPresent row::performance
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun AtcoderUserHistoryBaseDtoMapper.updateByPrimaryKey(row: AtcoderUserHistoryBaseDto) =
    update {
        set(isRated) equalToOrNull row::isRated
        set(place) equalToOrNull row::place
        set(oldRating) equalToOrNull row::oldRating
        set(newRating) equalToOrNull row::newRating
        set(performance) equalToOrNull row::performance
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
        and {contestId isEqualTo row.contestId!! }
    }

fun AtcoderUserHistoryBaseDtoMapper.updateByPrimaryKeySelective(row: AtcoderUserHistoryBaseDto) =
    update {
        set(isRated) equalToWhenPresent row::isRated
        set(place) equalToWhenPresent row::place
        set(oldRating) equalToWhenPresent row::oldRating
        set(newRating) equalToWhenPresent row::newRating
        set(performance) equalToWhenPresent row::performance
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
        and {contestId isEqualTo row.contestId!! }
    }