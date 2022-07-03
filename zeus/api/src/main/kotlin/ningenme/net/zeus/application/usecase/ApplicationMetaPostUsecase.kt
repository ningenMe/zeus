package ningenme.net.zeus.application.usecase

import ningenme.net.zeus.application.generated.view.ApplicationMetaLatestGetResponseView
import ningenme.net.zeus.application.generated.view.ApplicationMetaPostResponseView
import ningenme.net.zeus.domain.service.ApplicationMetaService
import ningenme.net.zeus.domain.value.ApplicationMeta
import ningenme.net.zeus.domain.value.ApplicationMetaId
import org.springframework.stereotype.Service

@Service
class ApplicationMetaPostUsecase(
    private val applicationMetaService: ApplicationMetaService
) {

    fun getView(applicationMetaId: String): ApplicationMetaPostResponseView {
        applicationMetaService.post(
            ApplicationMeta(
                applicationMetaIdString = applicationMetaId
            )
        );
        return ApplicationMetaPostResponseView(
            message = "ok"
        )
    }
}
