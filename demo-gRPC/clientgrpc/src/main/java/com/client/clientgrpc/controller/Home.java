package com.client.clientgrpc.controller;

import com.client.clientgrpc.service.GrpcClientService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class Home {
    private final GrpcClientService grpcClientService;

    @GetMapping
    public String hello(@RequestParam String name) {
        return grpcClientService.callGrpcServer(name);
    }
}
