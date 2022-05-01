/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.NingenmeNetUserNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NingenmeNetUserNingenmeMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NingenmeNetUserNingenmeMysqlBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NingenmeNetUserNingenmeMysqlBaseDtoDynamicSqlSupport.ningenmeNetUserId
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NingenmeNetUserNingenmeMysqlBaseDtoDynamicSqlSupport.ningenmeNetUserNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NingenmeNetUserNingenmeMysqlBaseDtoDynamicSqlSupport.password
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.NingenmeNetUserNingenmeMysqlBaseDtoDynamicSqlSupport.updatedTime
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
interface NingenmeNetUserNingenmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<NingenmeNetUserNingenmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="NingenmeNetUserNingenmeMysqlBaseDtoResult", value = [
        Result(column="ningenme_net_user_id", property="ningenmeNetUserId", jdbcType=JdbcType.VARCHAR, id=true),
        Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<NingenmeNetUserNingenmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("NingenmeNetUserNingenmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): NingenmeNetUserNingenmeMysqlBaseDto?
}

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, ningenmeNetUserNingenmeMysqlBaseDto, completer)

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, ningenmeNetUserNingenmeMysqlBaseDto, completer)

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.deleteByPrimaryKey(ningenmeNetUserId_: String) =
    delete {
        where { ningenmeNetUserId isEqualTo ningenmeNetUserId_ }
    }

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.insert(row: NingenmeNetUserNingenmeMysqlBaseDto) =
    insert(this::insert, row, ningenmeNetUserNingenmeMysqlBaseDto) {
        map(ningenmeNetUserId) toProperty "ningenmeNetUserId"
        map(password) toProperty "password"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.insertMultiple(records: Collection<NingenmeNetUserNingenmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, ningenmeNetUserNingenmeMysqlBaseDto) {
        map(ningenmeNetUserId) toProperty "ningenmeNetUserId"
        map(password) toProperty "password"
        map(deletedTime) toProperty "deletedTime"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
    }

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.insertMultiple(vararg records: NingenmeNetUserNingenmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.insertSelective(row: NingenmeNetUserNingenmeMysqlBaseDto) =
    insert(this::insert, row, ningenmeNetUserNingenmeMysqlBaseDto) {
        map(ningenmeNetUserId).toPropertyWhenPresent("ningenmeNetUserId", row::ningenmeNetUserId)
        map(password).toPropertyWhenPresent("password", row::password)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
    }

private val columnList = listOf(ningenmeNetUserId, password, deletedTime, createdTime, updatedTime)

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, ningenmeNetUserNingenmeMysqlBaseDto, completer)

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, ningenmeNetUserNingenmeMysqlBaseDto, completer)

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, ningenmeNetUserNingenmeMysqlBaseDto, completer)

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.selectByPrimaryKey(ningenmeNetUserId_: String) =
    selectOne {
        where { ningenmeNetUserId isEqualTo ningenmeNetUserId_ }
    }

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, ningenmeNetUserNingenmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: NingenmeNetUserNingenmeMysqlBaseDto) =
    apply {
        set(ningenmeNetUserId) equalToOrNull row::ningenmeNetUserId
        set(password) equalToOrNull row::password
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: NingenmeNetUserNingenmeMysqlBaseDto) =
    apply {
        set(ningenmeNetUserId) equalToWhenPresent row::ningenmeNetUserId
        set(password) equalToWhenPresent row::password
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
    }

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.updateByPrimaryKey(row: NingenmeNetUserNingenmeMysqlBaseDto) =
    update {
        set(password) equalToOrNull row::password
        set(deletedTime) equalToOrNull row::deletedTime
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        where { ningenmeNetUserId isEqualTo row.ningenmeNetUserId!! }
    }

fun NingenmeNetUserNingenmeMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: NingenmeNetUserNingenmeMysqlBaseDto) =
    update {
        set(password) equalToWhenPresent row::password
        set(deletedTime) equalToWhenPresent row::deletedTime
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        where { ningenmeNetUserId isEqualTo row.ningenmeNetUserId!! }
    }