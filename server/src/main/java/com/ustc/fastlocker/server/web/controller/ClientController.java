package com.ustc.fastlocker.server.web.controller;

import com.ustc.fastlocker.server.dto.ClientDTO;
import com.ustc.fastlocker.server.util.Message;
import com.ustc.fastlocker.server.util.Result;
import com.ustc.fastlocker.server.util.Results;
import com.ustc.fastlocker.server.web.websocket.WebSocketServer;
import com.ustc.fastlocker.server.global.Global;
import com.ustc.fastlocker.server.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @RequestMapping("/offline/{clientId}")
    public Result handleClientOffline(@PathVariable("clientId") int clientId) throws IOException {
        Message clientOffline = new Message(Global.TYPE_CLIENT_OFFLINE, null);
        WebSocketServer.close(clientId);
        return Results.success(null);
    }

    @RequestMapping("/list")
    public Result listClient() {
        ArrayList<ClientDTO> clinets = clientService.listClients();
        return Results.success(clinets);
    }
}
