package ningenme.net.zeus.application.controller

import ningenme.net.zeus.application.generated.controller.ApplicationMetaApi
import ningenme.net.zeus.application.generated.view.ApplicationMetaLatestGetResponseView
import ningenme.net.zeus.application.usecase.ApplicationMetaLatestGetUsecase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ApplicationMetaController(
    private val applicationMetaLatestGetUsecase: ApplicationMetaLatestGetUsecase
) : ApplicationMetaApi {

    @Override
    override fun applicationMetaLatestGet(
        @PathVariable("applicationMetaId") applicationMetaId: String
    ): ResponseEntity<ApplicationMetaLatestGetResponseView> {
        return ResponseEntity.ok(applicationMetaLatestGetUsecase.getView(applicationMetaId))
    }
}
