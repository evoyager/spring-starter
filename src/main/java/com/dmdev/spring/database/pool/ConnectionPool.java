package com.dmdev.spring.database.pool;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

public class ConnectionPool implements InitializingBean {
    private final String username;
    private final Integer pollSize;
    private final List<Object> args;
    private Map<String, Object> properties;

    public ConnectionPool(String username, Integer pollSize, List<Object> args, Map<String, Object> properties) {
        this.username = username;
        this.pollSize = pollSize;
        this.args = args;
        this.properties = properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @PostConstruct
    private void init() {
        System.out.println("Init connection pool");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties set");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Clean connection pool");
    }
}
