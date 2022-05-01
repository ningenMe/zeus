package ningenme.net.zeus.application.controller

import ningenme.net.zeus.application.generated.controller.HealthApi
import ningenme.net.zeus.application.generated.view.HealthGetResponseView
import ningenme.net.zeus.application.usecase.HealthGetUsecase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController(private val healthGetUsecase: HealthGetUsecase) : HealthApi {

    @Override
    override fun healthGet(): ResponseEntity<HealthGetResponseView> {
        return ResponseEntity.ok(healthGetUsecase.getView());
    }
}
