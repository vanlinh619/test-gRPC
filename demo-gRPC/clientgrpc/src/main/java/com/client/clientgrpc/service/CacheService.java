package com.client.clientgrpc.service;

public interface CacheService {
    String getData(String key) throws InterruptedException;

    String setData(String key) throws InterruptedException;

    void deleteData(String key) throws InterruptedException;
}
