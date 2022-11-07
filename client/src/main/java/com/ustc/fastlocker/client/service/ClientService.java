package com.ustc.fastlocker.client.service;

import com.ustc.fastlocker.client.dto.ClientsDTO;
import com.ustc.fastlocker.client.entity.Client;
import com.ustc.fastlocker.client.entity.Server;

//@Service
public interface ClientService {

    ClientsDTO listAllClient(Integer pageIndex,Integer pageSize);

    Client findClientById(int id);

    void update(Client client);

    void add(Client client);

    void deleteClientById(int id);

    void changeStatus(int id, String status);

    void saveStatus(int id, String status, int currsize);

    Server getServer();
}
