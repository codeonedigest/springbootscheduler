package codeonedigest.scheduler.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class DemoScheduler {

    @Scheduled(cron = "${schedulerdemo.cron}")
    public void scheduleJob() {
        System.out.println("Running Scheduled Job ... ");

        // Perform operation on DB or Call API etc.
    }
}
