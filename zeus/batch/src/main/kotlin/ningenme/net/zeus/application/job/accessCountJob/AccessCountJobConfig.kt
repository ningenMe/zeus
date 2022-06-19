package ningenme.net.zeus.application.job.accessCountJob

import ningenme.net.zeus.domain.value.JobName
import ningenme.net.zeus.domain.value.StepName
import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableBatchProcessing
open class AccessCountJobConfig(
    private val jobBuilderFactory: JobBuilderFactory,
    private val stepBuilderFactory: StepBuilderFactory,
    private val accessCountConsumeTasklet: AccessCountConsumeTasklet
) {

    @Bean(StepName.ACCESS_COUNT_CONSUME_STEP)
    open fun accessCountConsumeStep(): Step {
        return stepBuilderFactory
            .get(StepName.ACCESS_COUNT_CONSUME_STEP)
            .tasklet(accessCountConsumeTasklet)
            .build()
    }

    @Bean(JobName.ACCESS_COUNT_JOB)
    open fun accessCountJob(
        @Qualifier(StepName.ACCESS_COUNT_CONSUME_STEP) accessCountConsumeStep: Step
    ): Job {
        return jobBuilderFactory
            .get(JobName.ACCESS_COUNT_JOB)
            .start(accessCountConsumeStep)
            .build()
    }
}
