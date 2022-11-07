package com.ustc.fastlocker.webmanage.service;

import com.ustc.fastlocker.webmanage.dto.ServerIndexDTO;
import com.ustc.fastlocker.webmanage.dto.ServerLoadDTO;
import com.ustc.fastlocker.webmanage.dto.ServerLoadDTO2;
import com.ustc.fastlocker.webmanage.dto.ServerLoadQueryDTO;
import com.ustc.fastlocker.webmanage.entity.Server;

import java.util.List;

public interface ServerService {
    ServerLoadDTO getMaxLoad();
    List<Server> listServer();
    List<ServerLoadDTO2> listWeekLoad(ServerLoadQueryDTO server);
    List<ServerIndexDTO> listIndex();
}
