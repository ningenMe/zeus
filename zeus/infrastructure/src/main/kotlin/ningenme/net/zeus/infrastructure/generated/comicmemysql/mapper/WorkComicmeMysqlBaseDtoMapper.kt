/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.comicmemysql.dto.WorkComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkComicmeMysqlBaseDtoDynamicSqlSupport.createdTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkComicmeMysqlBaseDtoDynamicSqlSupport.deletedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkComicmeMysqlBaseDtoDynamicSqlSupport.publisherName
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkComicmeMysqlBaseDtoDynamicSqlSupport.updatedTime
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkComicmeMysqlBaseDtoDynamicSqlSupport.workComicmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkComicmeMysqlBaseDtoDynamicSqlSupport.workId
import ningenme.net.zeus.infrastructure.generated.comicmemysql.mapper.WorkComicmeMysqlBaseDtoDynamicSqlSupport.workName
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
interface WorkComicmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<WorkComicmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="WorkComicmeMysqlBaseDtoResult", value = [
        Result(column="work_id", property="workId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="work_name", property="workName", jdbcType=JdbcType.VARCHAR),
        Result(column="publisher_name", property="publisherName", jdbcType=JdbcType.VARCHAR),
        Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="deleted_time", property="deletedTime", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<WorkComicmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("WorkComicmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): WorkComicmeMysqlBaseDto?
}

fun WorkComicmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, workComicmeMysqlBaseDto, completer)

fun WorkComicmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, workComicmeMysqlBaseDto, completer)

fun WorkComicmeMysqlBaseDtoMapper.deleteByPrimaryKey(workId_: Int) =
    delete {
        where { workId isEqualTo workId_ }
    }

fun WorkComicmeMysqlBaseDtoMapper.insert(row: WorkComicmeMysqlBaseDto) =
    insert(this::insert, row, workComicmeMysqlBaseDto) {
        map(workId) toProperty "workId"
        map(workName) toProperty "workName"
        map(publisherName) toProperty "publisherName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun WorkComicmeMysqlBaseDtoMapper.insertMultiple(records: Collection<WorkComicmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, workComicmeMysqlBaseDto) {
        map(workId) toProperty "workId"
        map(workName) toProperty "workName"
        map(publisherName) toProperty "publisherName"
        map(createdTime) toProperty "createdTime"
        map(updatedTime) toProperty "updatedTime"
        map(deletedTime) toProperty "deletedTime"
    }

fun WorkComicmeMysqlBaseDtoMapper.insertMultiple(vararg records: WorkComicmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun WorkComicmeMysqlBaseDtoMapper.insertSelective(row: WorkComicmeMysqlBaseDto) =
    insert(this::insert, row, workComicmeMysqlBaseDto) {
        map(workId).toPropertyWhenPresent("workId", row::workId)
        map(workName).toPropertyWhenPresent("workName", row::workName)
        map(publisherName).toPropertyWhenPresent("publisherName", row::publisherName)
        map(createdTime).toPropertyWhenPresent("createdTime", row::createdTime)
        map(updatedTime).toPropertyWhenPresent("updatedTime", row::updatedTime)
        map(deletedTime).toPropertyWhenPresent("deletedTime", row::deletedTime)
    }

private val columnList = listOf(workId, workName, publisherName, createdTime, updatedTime, deletedTime)

fun WorkComicmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, workComicmeMysqlBaseDto, completer)

fun WorkComicmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, workComicmeMysqlBaseDto, completer)

fun WorkComicmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, workComicmeMysqlBaseDto, completer)

fun WorkComicmeMysqlBaseDtoMapper.selectByPrimaryKey(workId_: Int) =
    selectOne {
        where { workId isEqualTo workId_ }
    }

fun WorkComicmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, workComicmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: WorkComicmeMysqlBaseDto) =
    apply {
        set(workId) equalToOrNull row::workId
        set(workName) equalToOrNull row::workName
        set(publisherName) equalToOrNull row::publisherName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: WorkComicmeMysqlBaseDto) =
    apply {
        set(workId) equalToWhenPresent row::workId
        set(workName) equalToWhenPresent row::workName
        set(publisherName) equalToWhenPresent row::publisherName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
    }

fun WorkComicmeMysqlBaseDtoMapper.updateByPrimaryKey(row: WorkComicmeMysqlBaseDto) =
    update {
        set(workName) equalToOrNull row::workName
        set(publisherName) equalToOrNull row::publisherName
        set(createdTime) equalToOrNull row::createdTime
        set(updatedTime) equalToOrNull row::updatedTime
        set(deletedTime) equalToOrNull row::deletedTime
        where { workId isEqualTo row.workId!! }
    }

fun WorkComicmeMysqlBaseDtoMapper.updateByPrimaryKeySelective(row: WorkComicmeMysqlBaseDto) =
    update {
        set(workName) equalToWhenPresent row::workName
        set(publisherName) equalToWhenPresent row::publisherName
        set(createdTime) equalToWhenPresent row::createdTime
        set(updatedTime) equalToWhenPresent row::updatedTime
        set(deletedTime) equalToWhenPresent row::deletedTime
        where { workId isEqualTo row.workId!! }
    }