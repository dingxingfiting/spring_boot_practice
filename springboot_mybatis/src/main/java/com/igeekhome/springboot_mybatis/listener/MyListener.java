package com.igeekhome.springboot_mybatis.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("servletContext销毁...");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("servletContext初始化...");
    }
}
