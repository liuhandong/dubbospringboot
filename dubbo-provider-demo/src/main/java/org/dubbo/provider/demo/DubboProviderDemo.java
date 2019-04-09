package org.dubbo.provider.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
public class DubboProviderDemo 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(DubboProviderDemo.class,args);
    }
}
