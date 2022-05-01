/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.NetUserBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NetUserBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NetUserBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NetUserBaseDtoDynamicSqlSupport.netUserBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NetUserBaseDtoDynamicSqlSupport.netUserId
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NetUserBaseDtoDynamicSqlSupport.password
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NetUserBaseDtoDynamicSqlSupport.updatedTime
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
interface NetUserBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<NetUserBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="NetUserBaseDtoResult", value = [
        Result(column="net_user_id", property="netUserId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<NetUserBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("NetUserBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): NetUserBaseDto?
}

fun NetUserBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, netUserBaseDto, completer)

fun NetUserBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, netUserBaseDto, completer)

fun NetUserBaseDtoMapper.deleteByPrimaryKey(netUserId_: String) =
    delete {
        where { netUserId isEqualTo netUserId_ }
    }

fun NetUserBaseDtoMapper.insert(row: NetUserBaseDto) =
    insert(this::insert, row, netUserBaseDto) {
        map(netUserId) toProperty "netUserId"
        map(password) toProperty "password"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun NetUserBaseDtoMapper.insertMultiple(records: Collection<NetUserBaseDto>) =
    insertMultiple(this::insertMultiple, records, netUserBaseDto) {
        map(netUserId) toProperty "netUserId"
        map(password) toProperty "password"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun NetUserBaseDtoMapper.insertMultiple(vararg records: NetUserBaseDto) =
    insertMultiple(records.toList())

fun NetUserBaseDtoMapper.insertSelective(row: NetUserBaseDto) =
    insert(this::insert, row, netUserBaseDto) {
        map(netUserId).toPropertyWhenPresent("netUserId", row::netUserId)
        map(password).toPropertyWhenPresent("password", row::password)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(netUserId, password, deletedTime, createdTime, updatedTime)

fun NetUserBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, netUserBaseDto, completer)

fun NetUserBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, netUserBaseDto, completer)

fun NetUserBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, netUserBaseDto, completer)

fun NetUserBaseDtoMapper.selectByPrimaryKey(netUserId_: String) =
    selectOne {
        where { netUserId isEqualTo netUserId_ }
    }

fun NetUserBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, netUserBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: NetUserBaseDto) =
    apply {
        set(netUserId) equalToOrNull row::netUserId
        set(password) equalToOrNull row::password
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: NetUserBaseDto) =
    apply {
        set(netUserId) equalToWhenPresent row::netUserId
        set(password) equalToWhenPresent row::password
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun NetUserBaseDtoMapper.updateByPrimaryKey(row: NetUserBaseDto) =
    update {
        set(password) equalToOrNull row::password
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { netUserId isEqualTo row.netUserId!! }
    }

fun NetUserBaseDtoMapper.updateByPrimaryKeySelective(row: NetUserBaseDto) =
    update {
        set(password) equalToWhenPresent row::password
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { netUserId isEqualTo row.netUserId!! }
    }