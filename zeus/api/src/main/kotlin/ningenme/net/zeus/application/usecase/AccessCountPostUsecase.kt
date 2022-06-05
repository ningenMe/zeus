package ningenme.net.zeus.application.usecase

import ningenme.net.zeus.application.generated.view.AccessCountPostResponseView
import ningenme.net.zeus.domain.service.AccessCountService
import org.springframework.stereotype.Component

@Component
class AccessCountPostUsecase(
    private val accessCountService: AccessCountService
) {
    fun getView(): AccessCountPostResponseView {
        accessCountService.postAccessCount()
        return AccessCountPostResponseView(message = "ok")
    }
}
