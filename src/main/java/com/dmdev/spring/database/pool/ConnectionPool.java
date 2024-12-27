package com.dmdev.spring.database.pool;

import java.util.List;
import java.util.Map;

public class ConnectionPool {
    private final String username;
    private final Integer pollSize;
    private final List<Object> args;
    private final Map<String, Object> properties;

    public ConnectionPool(String username, Integer pollSize, List<Object> args, Map<String, Object> properties) {
        this.username = username;
        this.pollSize = pollSize;
        this.args = args;
        this.properties = properties;
    }
}
