package com.ustc.fastlocker.webmanage.dao;

import com.ustc.fastlocker.webmanage.entity.ServerLoad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServerLoadRepository extends JpaRepository<ServerLoad,Integer> {
    List<ServerLoad> findAllByTimeLikeAndTypeAndServerId(String time, int type, int serverId);
    List<ServerLoad> findAllByTimeLikeAndServerId(String time,int serverId);

}
