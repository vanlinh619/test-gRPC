package com.client.clientgrpc.config;

import com.client.clientgrpc.service.GrpcClientService;
import com.client.clientgrpc.service.GrpcClientServiceImpl;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import net.devh.boot.grpc.examples.lib.MyServiceGrpc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@GrpcClientBean(
//        clazz = MyServiceGrpc.MyServiceBlockingStub.class,
//        beanName = "myService",
//        client = @GrpcClient("test")
//)
public class GrpcConfiguration {

//    @GrpcClient("myService")
//    MyServiceGrpc.MyServiceBlockingStub helloWorldClient;

//    @Bean
//    public GrpcClientService grpcClientService() {
//        return new GrpcClientServiceImpl(helloWorldClient);
//    }
}
