package com.example.star_wars_springboot.config;

import com.example.star_wars_springboot.jobs.StarShipJob;
import org.quartz.JobDetail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

@Configuration
public class QuartzSubmitJobs {
    private static final String CRON_EVERY_FIVE_MINUTES = "0 0/5 * ? * * *";

    @Bean(name = "StarShipPopulate")
    public JobDetailFactoryBean jobMemberStats() {
        return QuartzConfig.createJobDetail(StarShipJob.class, "StarShip Job");
    }

    @Bean(name = "StarShipPopulateTrigger")
    public CronTriggerFactoryBean triggerMemberStats(@Qualifier("StarShipPopulate") JobDetail jobDetail) {
        return QuartzConfig.createCronTrigger(jobDetail, CRON_EVERY_FIVE_MINUTES, "Populate and see StarShip existence");
    }
}
