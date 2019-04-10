package org.dubbo.provider.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

/**
 * https://github.com/alibaba/nacos
 * https://blog.csdn.net/u014677702/article/details/85888590
 * @author ThinkPad
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class DubboProviderDemo 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(DubboProviderDemo.class,args);
    }
}
