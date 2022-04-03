/*
 * Auto-generated file. Created by MyBatis Generator
 */
package ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper

import ningenme.net.zeus.infrastructure.generated.ningenmemysql.dto.HealthNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.HealthNingenmeMysqlBaseDtoDynamicSqlSupport.healthNingenmeMysqlBaseDto
import ningenme.net.zeus.infrastructure.generated.ningenmemysql.mapper.HealthNingenmeMysqlBaseDtoDynamicSqlSupport.id
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
interface HealthNingenmeMysqlBaseDtoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<HealthNingenmeMysqlBaseDto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="HealthNingenmeMysqlBaseDtoResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<HealthNingenmeMysqlBaseDto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("HealthNingenmeMysqlBaseDtoResult")
    fun selectOne(selectStatement: SelectStatementProvider): HealthNingenmeMysqlBaseDto?
}

fun HealthNingenmeMysqlBaseDtoMapper.count(completer: CountCompleter) =
    countFrom(this::count, healthNingenmeMysqlBaseDto, completer)

fun HealthNingenmeMysqlBaseDtoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, healthNingenmeMysqlBaseDto, completer)

fun HealthNingenmeMysqlBaseDtoMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where { id isEqualTo id_ }
    }

fun HealthNingenmeMysqlBaseDtoMapper.insert(row: HealthNingenmeMysqlBaseDto) =
    insert(this::insert, row, healthNingenmeMysqlBaseDto) {
        map(id) toProperty "id"
    }

fun HealthNingenmeMysqlBaseDtoMapper.insertMultiple(records: Collection<HealthNingenmeMysqlBaseDto>) =
    insertMultiple(this::insertMultiple, records, healthNingenmeMysqlBaseDto) {
        map(id) toProperty "id"
    }

fun HealthNingenmeMysqlBaseDtoMapper.insertMultiple(vararg records: HealthNingenmeMysqlBaseDto) =
    insertMultiple(records.toList())

fun HealthNingenmeMysqlBaseDtoMapper.insertSelective(row: HealthNingenmeMysqlBaseDto) =
    insert(this::insert, row, healthNingenmeMysqlBaseDto) {
        map(id).toPropertyWhenPresent("id", row::id)
    }

private val columnList = listOf(id)

fun HealthNingenmeMysqlBaseDtoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, healthNingenmeMysqlBaseDto, completer)

fun HealthNingenmeMysqlBaseDtoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, healthNingenmeMysqlBaseDto, completer)

fun HealthNingenmeMysqlBaseDtoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, healthNingenmeMysqlBaseDto, completer)

fun HealthNingenmeMysqlBaseDtoMapper.update(completer: UpdateCompleter) =
    update(this::update, healthNingenmeMysqlBaseDto, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: HealthNingenmeMysqlBaseDto) =
    apply {
        set(id) equalToOrNull row::id
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: HealthNingenmeMysqlBaseDto) =
    apply {
        set(id) equalToWhenPresent row::id
    }