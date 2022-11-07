package com.ustc.fastlocker.webmanage.dao;

import com.ustc.fastlocker.webmanage.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,String> {
    Admin findByNameAndPassword(String name,String password);
    Admin findByName(String name);
}
