/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.WorkBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkBaseDtoDynamicSqlSupport.publisherName
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkBaseDtoDynamicSqlSupport.updatedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkBaseDtoDynamicSqlSupport.workBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkBaseDtoDynamicSqlSupport.workId
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkBaseDtoDynamicSqlSupport.workName
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
interface WorkBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<WorkBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="WorkBaseDtoResult", value = [
        Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="work_name", property="workName", jdbcType=JdbcType.VARCHAR),
        Result(column="publisher_name", property="publisherName", jdbcType=JdbcType.VARCHAR),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<WorkBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("WorkBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): WorkBaseDto?
}

fun WorkBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, workBaseDto, completer)

fun WorkBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, workBaseDto, completer)

fun WorkBaseDtoMapper.deleteByPrimaryKey(workId_: Int) =
    delete {
        where { workId isEqualTo workId_ }
    }

fun WorkBaseDtoMapper.insert(row: WorkBaseDto) =
    insert(this::insert, row, workBaseDto) {
        map(workId) toProperty "workId"
        map(workName) toProperty "workName"
        map(publisherName) toProperty "publisherName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun WorkBaseDtoMapper.insertMultiple(records: Collection<WorkBaseDto>) =
    insertMultiple(this::insertMultiple, records, workBaseDto) {
        map(workId) toProperty "workId"
        map(workName) toProperty "workName"
        map(publisherName) toProperty "publisherName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun WorkBaseDtoMapper.insertMultiple(vararg records: WorkBaseDto) =
    insertMultiple(records.toList())

fun WorkBaseDtoMapper.insertSelective(row: WorkBaseDto) =
    insert(this::insert, row, workBaseDto) {
        map(workId).toPropertyWhenPresent("workId", row::workId)
        map(workName).toPropertyWhenPresent("workName", row::workName)
        map(publisherName).toPropertyWhenPresent("publisherName", row::publisherName)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(workId, workName, publisherName, createdTime, updatedTime, deletedTime)

fun WorkBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, workBaseDto, completer)

fun WorkBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, workBaseDto, completer)

fun WorkBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, workBaseDto, completer)

fun WorkBaseDtoMapper.selectByPrimaryKey(workId_: Int) =
    selectOne {
        where { workId isEqualTo workId_ }
    }

fun WorkBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, workBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: WorkBaseDto) =
    apply {
        set(workId) equalToOrNull row::workId
        set(workName) equalToOrNull row::workName
        set(publisherName) equalToOrNull row::publisherName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: WorkBaseDto) =
    apply {
        set(workId) equalToWhenPresent row::workId
        set(workName) equalToWhenPresent row::workName
        set(publisherName) equalToWhenPresent row::publisherName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun WorkBaseDtoMapper.updateByPrimaryKey(row: WorkBaseDto) =
    update {
        set(workName) equalToOrNull row::workName
        set(publisherName) equalToOrNull row::publisherName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { workId isEqualTo row.workId!! }
    }

fun WorkBaseDtoMapper.updateByPrimaryKeySelective(row: WorkBaseDto) =
    update {
        set(workName) equalToWhenPresent row::workName
        set(publisherName) equalToWhenPresent row::publisherName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { workId isEqualTo row.workId!! }
    }