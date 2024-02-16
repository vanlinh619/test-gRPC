package com.client.clientgrpc.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheServiceImpl implements CacheService {

    @Cacheable(value = "string", key = "#key")
    @Override
    public String getData(String key) throws InterruptedException {
        Thread.sleep(5000);
        return System.currentTimeMillis() + "";
    }

    @CachePut(value = "string", key = "#key")
    @Override
    public String setData(String key) throws InterruptedException {
        Thread.sleep(5000);
        return System.currentTimeMillis() + "";
    }

    @CacheEvict(value = "string", key = "#key")
    @Override
    public void deleteData(String key) throws InterruptedException {
        Thread.sleep(5000);
    }
}
