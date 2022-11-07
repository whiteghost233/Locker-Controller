package com.ustc.fastlocker.register.util;

import com.ustc.fastlocker.register.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;


public class ServiceUtil {

  //  @Autowired
    //@Qualifier("serverService")
    private static ServerService serverService;
   // @Qualifier("serverService")
    @Autowired
    public static void setServerService(ServerService serverService)
    {
        ServiceUtil.serverService=serverService;
    }
    public static ServerService getServerService(){
        return serverService;
    }
}
