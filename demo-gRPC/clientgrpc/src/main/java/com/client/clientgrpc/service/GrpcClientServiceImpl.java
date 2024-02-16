package com.client.clientgrpc.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.examples.lib.HelloReply;
import net.devh.boot.grpc.examples.lib.HelloRequest;
import net.devh.boot.grpc.examples.lib.MyServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientServiceImpl implements GrpcClientService {
//
//    @GrpcClient("myService")
//    private MyServiceGrpc.MyServiceBlockingStub myServiceBlockingStub;

    @Override
    public String callGrpcServer(String name) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        MyServiceGrpc.MyServiceBlockingStub myServiceBlockingStub = MyServiceGrpc.newBlockingStub(channel);

        HelloRequest helloRequest = HelloRequest.newBuilder()
                .setName(name)
                .build();
        return myServiceBlockingStub.sayHello(helloRequest).getMessage();
    }
}
