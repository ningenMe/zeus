package ningenme.net.zeus.application.usecase

import ningenme.net.zeus.application.generated.view.ApplicationMetaLatestGetResponseView
import ningenme.net.zeus.domain.service.ApplicationMetaService
import ningenme.net.zeus.domain.value.ApplicationMetaId
import org.springframework.stereotype.Service

@Service
class ApplicationMetaLatestGetUsecase(
    private val applicationMetaService: ApplicationMetaService
) {

    fun getView(applicationMetaId: String): ApplicationMetaLatestGetResponseView {
        val applicationMetaList = applicationMetaService.getList(ApplicationMetaId.of(applicationMetaId));
        return ApplicationMetaLatestGetResponseView(
            applicationMetaList.getApplicationMetaId().value,
            applicationMetaList.getUpdatedTime().toString()
        )
    }
}
