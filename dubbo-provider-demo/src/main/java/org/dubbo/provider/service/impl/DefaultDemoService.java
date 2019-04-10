package org.dubbo.provider.service.impl;

import org.dubbo.common.service.DemoService;
import org.springframework.beans.factory.annotation.Value;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 
 * @author ThinkPad
 *
 */
//@Service(version = "1.0.0")
@Service(group = "test-nacos2", retries = 0, timeout = 10000)
public class DefaultDemoService implements DemoService {

	/**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

}
