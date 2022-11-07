package com.ustc.fastlocker.webmanage.dao;

import com.ustc.fastlocker.webmanage.entity.ClientOnline;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientOnlineRepository extends JpaRepository<ClientOnline,Integer> {
   Page<ClientOnline> findAll(Pageable pageable);
}
