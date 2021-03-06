/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package ningenme.net.zeus.application.generated.controller

import ningenme.net.zeus.application.generated.view.AccessCountPostResponseView
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@Validated
@RequestMapping("\${api.base-path:}")
interface AccessCountApi {


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/v1/access-counts"],
            produces = ["application/json"]
    )
    fun accessCountPost(): ResponseEntity<AccessCountPostResponseView> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
