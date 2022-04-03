package ningenme.net.zeus.application.generated.view

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param isNingenmeMysqlConnected 
 * @param isComicmeMysqlConnected 
 * @param isComproMysqlConnected 
 */
data class HealthGetResponseView(

    @field:JsonProperty("isNingenmeMysqlConnected") val isNingenmeMysqlConnected: kotlin.Boolean? = null,

    @field:JsonProperty("isComicmeMysqlConnected") val isComicmeMysqlConnected: kotlin.Boolean? = null,

    @field:JsonProperty("isComproMysqlConnected") val isComproMysqlConnected: kotlin.Boolean? = null
) {

}

