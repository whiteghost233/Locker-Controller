package com.ustc.fastlocker.client.web.controller;

import com.ustc.fastlocker.client.entity.Server;
import com.ustc.fastlocker.client.service.ClientService;
import com.ustc.fastlocker.client.util.Result;
import com.ustc.fastlocker.client.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 暂时充当register 返回server信息
 */
@RestController
@CrossOrigin
public class ServerController {
    @Autowired
    ClientService clientService;

    @RequestMapping("/server")
    public Result getServer() {
        //Server server=new Server(1,"127.0.0.1:8082","华东服务器","/park");
        Server server = clientService.getServer();
        return Results.success(server);
    }
}
