package com.ustc.fastlocker.server.service;

import com.ustc.fastlocker.server.dto.ClientDTO;
import com.ustc.fastlocker.server.entity.Client;

import java.util.ArrayList;


public interface ClientService {
    void clientOnline(Client client);

    void clientOffline(Client client);

    void clientUpdate(Client cLient, Client newclient);

    void clientLoadChange(Client client, int type);

    void clientHeartBeat(Client client);

    ArrayList<ClientDTO> listClients();

}
