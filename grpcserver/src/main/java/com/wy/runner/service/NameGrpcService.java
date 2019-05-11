package com.wy.runner.service;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.examples.nameserver.Ip;
import io.grpc.examples.nameserver.Name;
import io.grpc.examples.nameserver.NameServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @author yiwang
 * Created on 2019-05-11
 */
public class NameGrpcService extends NameServiceGrpc.NameServiceImplBase {
    private Logger logger = Logger.getLogger(NameGrpcService.class.getName());

    private Map<String,String> map = new HashMap<String, String>();

    public NameGrpcService() {
        map.put("wy","127.0.0.1");
        map.put("allen","127.0.0.2");
    }

    @Override
    public void getIpByName(Name request, StreamObserver<Ip> responseObserver) {
        logger.log(Level.INFO,"request:" + request.getName());
        Ip ip = Ip.newBuilder().setIp(getName(request.getName())).build();
        //返回结果
        responseObserver.onNext(ip);
        //用于告诉客户端调用已结束
        responseObserver.onCompleted();
    }

    public String getName(String name) {
        String ip = map.get(name);
        if (ip == null){
            return "0.0.0.0";
        }
        return ip;
    }
}
