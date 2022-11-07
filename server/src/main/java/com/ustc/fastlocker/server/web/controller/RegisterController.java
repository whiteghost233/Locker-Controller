package com.ustc.fastlocker.server.web.controller;

import com.ustc.fastlocker.server.util.Result;
import com.ustc.fastlocker.server.util.Results;
import com.ustc.fastlocker.server.entity.Server;
import com.ustc.fastlocker.server.exception.ServerException;
import com.ustc.fastlocker.server.global.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
@Slf4j
public class RegisterController {
    @Autowired
    WebSocketClient client;
    @Value("${websocket.maxtimeout}")
    int maxTimeout;
    @Autowired
    Server server;

    // private
    @GetMapping("/online")
    public Result regist() {
        try {
            client.connect();
            client.setConnectionLostTimeout(maxTimeout / 1000);// 以秒为单位
            log.info("start connect");
            // Server server=new Server(serverId,ip,serverName,api, Global.SIZE_EMPTY,maxSize);
//            Message serverInfo=new Message();
//            serverInfo.setType(Global.TYPE_REGISTER_SERVERINFO);
//            serverInfo.setData(server);
            /**
             * 忙等是个大忌
             */
            //  while(!client.getReadyState().equals(WebSocket.READYSTATE.OPEN));
            //  client.send(serverInfo.toString());
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new ServerException(ErrorCode.REGISTER_FAIL, e.getMessage());
        }
        return Results.success(null);
    }

    @GetMapping("/offline")
    public Result offline() {
        if (client.getReadyState() != WebSocket.READYSTATE.OPEN)
            return Results.fail(ErrorCode.SERVER_NOT_ONLINE, null);
        client.close();
        return Results.success(null);
    }
}
