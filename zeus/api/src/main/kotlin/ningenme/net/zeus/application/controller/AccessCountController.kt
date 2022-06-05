package ningenme.net.zeus.application.controller

import ningenme.net.zeus.application.generated.controller.AccessCountApi
import ningenme.net.zeus.application.generated.view.AccessCountPostResponseView
import ningenme.net.zeus.application.usecase.AccessCountPostUsecase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class AccessCountController(
    private val accessCountPostUsecase: AccessCountPostUsecase
) : AccessCountApi {

    @Override
    override fun accessCountPost(): ResponseEntity<AccessCountPostResponseView> {
        return ResponseEntity.ok(accessCountPostUsecase.getView())
    }

}
