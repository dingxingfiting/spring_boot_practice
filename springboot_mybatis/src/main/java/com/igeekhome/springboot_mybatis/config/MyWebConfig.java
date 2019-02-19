package com.igeekhome.springboot_mybatis.config;


import com.igeekhome.springboot_mybatis.filter.MyFilter;
import com.igeekhome.springboot_mybatis.listener.MyListener;
import com.igeekhome.springboot_mybatis.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * 三大组件的注册
 */
@Configuration
public class MyWebConfig {
    /**
     * 注册Servlet
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean<>(new MyServlet(),"/myServlet");
    }

    /*
    * 注册过滤器
    * */
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        //设置拦截路径
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet","/my"));
        return filterRegistrationBean;
    }

    /**
     * 监听器注册
     */
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        return new ServletListenerRegistrationBean(new MyListener());
    }

}
