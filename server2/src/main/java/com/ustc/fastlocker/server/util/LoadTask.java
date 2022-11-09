package com.ustc.fastlocker.server.util;

import com.ustc.fastlocker.server.web.websocket.WebSocketServer;
import com.ustc.fastlocker.server.global.Global;
import com.ustc.fastlocker.server.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class LoadTask {
    @Autowired
    ClientService clientService;

    //@Scheduled(cron = "0 0 0,2,4,6,8,10,12,14,16,18,20,22 * * ? ")
    @Scheduled(fixedDelay = 1000000)
    public void noteLoad() {
        Map<Integer, WebSocketServer> clientMap = WebSocketServer.getClientMap();
        clientMap.forEach((k, v) -> {
            clientService.clientLoadChange(
                    v.getClient(),
                    Global.TYPE_CLIENT_LOAD_DAILY);
        });
    }
}
