package ningenme.net.zeus.application.job.pageJob

import ningenme.net.zeus.common.value.JobName
import ningenme.net.zeus.common.value.StepName
import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.batch.core.launch.support.RunIdIncrementer
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@EnableBatchProcessing
@Configuration
open class PageJobConfig(
    private val jobBuilderFactory: JobBuilderFactory,
    private val stepBuilderFactory: StepBuilderFactory,
    private val comicPageTasklet: ComicPageTasklet
) {

    @Bean(StepName.COMIC_PAGE_STEP)
    open fun comicPageStep(): Step {
        return stepBuilderFactory
            .get(StepName.COMIC_PAGE_STEP)
            .tasklet(comicPageTasklet)
            .build()
    }

    @Bean(JobName.PAGE_JOB)
    open fun pageJob(
        @Qualifier(StepName.COMIC_PAGE_STEP) comicPageStep: Step
    ): Job {
        return jobBuilderFactory.get(JobName.PAGE_JOB)
            .incrementer(RunIdIncrementer())
            .start(comicPageStep)
            .build()
    }

}
