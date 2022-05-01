/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.compromysql.mapper

import ningenme.net.zeus.infrastructure.generated.compromysql.dto.AtcoderUserContestBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.atcoderId
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.atcoderUserContestBaseDto
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.contestName
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.contestNameEn
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.contestScreenName
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.contestType
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.endTime
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.isRated
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.newRating
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.oldRating
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.performance
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.place
import ningenme.net.zeus.infrastructure.generated.compromysql.mapper.AtcoderUserContestBaseDtoDynamicSqlSupport.updatedTime
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
interface AtcoderUserContestBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<AtcoderUserContestBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="AtcoderUserContestBaseDtoResult", value = [
        Result(column="atcoder_id", property="atcoderId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="contest_name_en", property="contestNameEn", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="is_rated", property="isRated", jdbcType=JdbcType.BIT),
        Result(column="place", property="place", jdbcType=JdbcType.INTEGER),
        Result(column="old_rating", property="oldRating", jdbcType=JdbcType.INTEGER),
        Result(column="new_rating", property="newRating", jdbcType=JdbcType.INTEGER),
        Result(column="performance", property="performance", jdbcType=JdbcType.INTEGER),
        Result(column="contest_type", property="contestType", jdbcType=JdbcType.VARCHAR),
        Result(column="contest_screen_name", property="contestScreenName", jdbcType=JdbcType.VARCHAR),
        Result(column="contest_name", property="contestName", jdbcType=JdbcType.VARCHAR),
        Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<AtcoderUserContestBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("AtcoderUserContestBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): AtcoderUserContestBaseDto?
}

fun AtcoderUserContestBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, atcoderUserContestBaseDto, completer)

fun AtcoderUserContestBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, atcoderUserContestBaseDto, completer)

fun AtcoderUserContestBaseDtoMapper.deleteByPrimaryKey(atcoderId_: String, contestNameEn_: String) =
    delete {
        where { atcoderId isEqualTo atcoderId_ }
        and { contestNameEn isEqualTo contestNameEn_ }
    }

fun AtcoderUserContestBaseDtoMapper.insert(row: AtcoderUserContestBaseDto) =
    insert(this::insert, row, atcoderUserContestBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(contestNameEn) toProperty "contestNameEn"
        map(isRated) toProperty "isRated"
        map(place) toProperty "place"
        map(oldRating) toProperty "oldRating"
        map(newRating) toProperty "newRating"
        map(performance) toProperty "performance"
        map(contestType) toProperty "contestType"
        map(contestScreenName) toProperty "contestScreenName"
        map(contestName) toProperty "contestName"
        map(endTime) toProperty "endTime"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserContestBaseDtoMapper.insertMultiple(records: Collection<AtcoderUserContestBaseDto>) =
    insertMultiple(this::insertMultiple, records, atcoderUserContestBaseDto) {
        map(atcoderId) toProperty "atcoderId"
        map(contestNameEn) toProperty "contestNameEn"
        map(isRated) toProperty "isRated"
        map(place) toProperty "place"
        map(oldRating) toProperty "oldRating"
        map(newRating) toProperty "newRating"
        map(performance) toProperty "performance"
        map(contestType) toProperty "contestType"
        map(contestScreenName) toProperty "contestScreenName"
        map(contestName) toProperty "contestName"
        map(endTime) toProperty "endTime"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun AtcoderUserContestBaseDtoMapper.insertMultiple(vararg records: AtcoderUserContestBaseDto) =
    insertMultiple(records.toList())

fun AtcoderUserContestBaseDtoMapper.insertSelective(row: AtcoderUserContestBaseDto) =
    insert(this::insert, row, atcoderUserContestBaseDto) {
        map(atcoderId).toPropertyWhenPresent("atcoderId", row::atcoderId)
        map(contestNameEn).toPropertyWhenPresent("contestNameEn", row::contestNameEn)
        map(isRated).toPropertyWhenPresent("isRated", row::isRated)
        map(place).toPropertyWhenPresent("place", row::place)
        map(oldRating).toPropertyWhenPresent("oldRating", row::oldRating)
        map(newRating).toPropertyWhenPresent("newRating", row::newRating)
        map(performance).toPropertyWhenPresent("performance", row::performance)
        map(contestType).toPropertyWhenPresent("contestType", row::contestType)
        map(contestScreenName).toPropertyWhenPresent("contestScreenName", row::contestScreenName)
        map(contestName).toPropertyWhenPresent("contestName", row::contestName)
        map(endTime).toPropertyWhenPresent("endTime", row::endTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(atcoderId, contestNameEn, isRated, place, oldRating, newRating, performance, contestType, contestScreenName, contestName, endTime, deletedTime, createdTime, updatedTime)

fun AtcoderUserContestBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, atcoderUserContestBaseDto, completer)

fun AtcoderUserContestBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, atcoderUserContestBaseDto, completer)

fun AtcoderUserContestBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, atcoderUserContestBaseDto, completer)

fun AtcoderUserContestBaseDtoMapper.selectByPrimaryKey(atcoderId_: String, contestNameEn_: String) =
    selectOne {
        where { atcoderId isEqualTo atcoderId_ }
        and { contestNameEn isEqualTo contestNameEn_ }
    }

fun AtcoderUserContestBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, atcoderUserContestBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: AtcoderUserContestBaseDto) =
    apply {
        set(atcoderId) equalToOrNull row::atcoderId
        set(contestNameEn) equalToOrNull row::contestNameEn
        set(isRated) equalToOrNull row::isRated
        set(place) equalToOrNull row::place
        set(oldRating) equalToOrNull row::oldRating
        set(newRating) equalToOrNull row::newRating
        set(performance) equalToOrNull row::performance
        set(contestType) equalToOrNull row::contestType
        set(contestScreenName) equalToOrNull row::contestScreenName
        set(contestName) equalToOrNull row::contestName
        set(endTime) equalToOrNull row::endTime
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: AtcoderUserContestBaseDto) =
    apply {
        set(atcoderId) equalToWhenPresent row::atcoderId
        set(contestNameEn) equalToWhenPresent row::contestNameEn
        set(isRated) equalToWhenPresent row::isRated
        set(place) equalToWhenPresent row::place
        set(oldRating) equalToWhenPresent row::oldRating
        set(newRating) equalToWhenPresent row::newRating
        set(performance) equalToWhenPresent row::performance
        set(contestType) equalToWhenPresent row::contestType
        set(contestScreenName) equalToWhenPresent row::contestScreenName
        set(contestName) equalToWhenPresent row::contestName
        set(endTime) equalToWhenPresent row::endTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun AtcoderUserContestBaseDtoMapper.updateByPrimaryKey(row: AtcoderUserContestBaseDto) =
    update {
        set(isRated) equalToOrNull row::isRated
        set(place) equalToOrNull row::place
        set(oldRating) equalToOrNull row::oldRating
        set(newRating) equalToOrNull row::newRating
        set(performance) equalToOrNull row::performance
        set(contestType) equalToOrNull row::contestType
        set(contestScreenName) equalToOrNull row::contestScreenName
        set(contestName) equalToOrNull row::contestName
        set(endTime) equalToOrNull row::endTime
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
        and {contestNameEn isEqualTo row.contestNameEn!! }
    }

fun AtcoderUserContestBaseDtoMapper.updateByPrimaryKeySelective(row: AtcoderUserContestBaseDto) =
    update {
        set(isRated) equalToWhenPresent row::isRated
        set(place) equalToWhenPresent row::place
        set(oldRating) equalToWhenPresent row::oldRating
        set(newRating) equalToWhenPresent row::newRating
        set(performance) equalToWhenPresent row::performance
        set(contestType) equalToWhenPresent row::contestType
        set(contestScreenName) equalToWhenPresent row::contestScreenName
        set(contestName) equalToWhenPresent row::contestName
        set(endTime) equalToWhenPresent row::endTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { atcoderId isEqualTo row.atcoderId!! }
        and {contestNameEn isEqualTo row.contestNameEn!! }
    }