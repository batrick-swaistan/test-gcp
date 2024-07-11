package com.example.testgcp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void set(String key, String value) {
        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
        ops.set(key, value, 30, TimeUnit.MINUTES); // Store key-value pair for 30 minutes
    }

    public String get(String key) {
        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
        return (String) ops.get(key); // Retrieve value for given key
    }
}
