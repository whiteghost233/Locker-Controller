package com.ustc.fastlocker.server.dao;

import com.ustc.fastlocker.server.entity.ClientOnline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientOnlineRepository extends JpaRepository<ClientOnline, Integer> {

}
