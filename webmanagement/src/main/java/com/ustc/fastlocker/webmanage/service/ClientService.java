package com.ustc.fastlocker.webmanage.service;

import com.ustc.fastlocker.webmanage.dto.*;

import java.util.List;

public interface ClientService {
   // List<ClientDTO> listClient(int serverId);
    List<ClientOnlineDTO> onlineHistory();
    Integer totalLoad();
    ClientTotalDTO totalAvailable();
    Integer totalClient();
    ClientListDTO listClient(Integer serverId, int pageIndex, int pageSize);
    List<ClientIndexDTO> listClientIndex();
    List<ClientLoadDTO> listWeekLoad(ClientLoadQueryDTO client);
    List<ClientLoadDTO> listDayLoad(ClientLoadQueryDTO client);
    void offline(int serverId,int clientId);
}
