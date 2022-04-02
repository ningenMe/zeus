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
 * @param ningenmeMysql 
 * @param comicmeMysql 
 * @param comproMysql 
 */
data class HealthGetResponseView(

    @field:JsonProperty("ningenmeMysql") val ningenmeMysql: kotlin.Boolean? = null,

    @field:JsonProperty("comicmeMysql") val comicmeMysql: kotlin.Boolean? = null,

    @field:JsonProperty("comproMysql") val comproMysql: kotlin.Boolean? = null
) {

}

