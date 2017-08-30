package cn.xco2o.cloud.wx.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 *
 */
@SpringBootApplication
@EnableWebMvc
public class WxApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(WxApp.class, args);
    }
}
