package com.client.clientgrpc.controller;

import com.client.clientgrpc.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cache")
@RequiredArgsConstructor
public class CacheController {
    private final CacheService cacheService;

    @GetMapping
    public String getTime() throws InterruptedException {
        return cacheService.getData("Data");
//        return "fdfdf";
    }

    @PutMapping
    public String setTime() throws InterruptedException {
        return cacheService.setData("Data");
    }

    @DeleteMapping
    public String deleteTime() throws InterruptedException {
        cacheService.deleteData("Data");
        return "Deleted";
    }
}
