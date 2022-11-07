package com.ustc.fastlocker.webmanage.dao;

import com.ustc.fastlocker.webmanage.entity.ClientLoad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientLoadRepository extends JpaRepository<ClientLoad,Integer> {
    List<ClientLoad> findAllByTimeLikeAndType(String time,int type);
    List<ClientLoad> findAllByTimeLikeAndTypeAndClientId(String time,int type,int clientId);
    List<ClientLoad> findAllByTimeLikeAndClientId(String time,int clientId);
}
