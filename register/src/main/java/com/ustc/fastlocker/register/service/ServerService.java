package com.ustc.fastlocker.register.service;

import com.ustc.fastlocker.register.entity.Server;

import java.io.IOException;
import java.util.ArrayList;


//@Service
public interface ServerService {
    void serverOnline();
    ArrayList<Server> listServer();

    /**
     *
     * @return 剩余负载最大的server
     */
    Server getBalancedServer();
    void offlineServer(int serverId) throws IOException;
    void serverLoadChange(Server server,int type);
}
