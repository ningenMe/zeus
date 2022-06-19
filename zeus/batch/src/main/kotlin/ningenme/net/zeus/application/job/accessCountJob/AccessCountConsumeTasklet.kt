package ningenme.net.zeus.application.job.accessCountJob

import mu.KotlinLogging
import org.springframework.batch.core.StepContribution
import org.springframework.batch.core.configuration.annotation.StepScope
import org.springframework.batch.core.scope.context.ChunkContext
import org.springframework.batch.core.step.tasklet.Tasklet
import org.springframework.batch.repeat.RepeatStatus
import org.springframework.stereotype.Component

@Component
@StepScope
open class AccessCountConsumeTasklet : Tasklet {

    private val logger = KotlinLogging.logger {}

    override fun execute(contribution: StepContribution, chunkContext: ChunkContext): RepeatStatus {
        logger.info { "hello world" }
        return RepeatStatus.FINISHED
    }
}
