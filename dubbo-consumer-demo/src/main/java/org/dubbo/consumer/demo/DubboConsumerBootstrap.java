package org.dubbo.consumer.demo;

import org.apache.dubbo.config.annotation.Reference;
import org.dubbo.common.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;



/**
 * Hello world!
 *
 */
public class DubboConsumerBootstrap 
{
	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Reference(version = "1.0.0", url = "dubbo://localhost:12345")
    private DemoService demoService;

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            logger.info(demoService.sayHello("mercyblitz"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerBootstrap.class).close();
    }
}
