package com.ustc.fastlocker.webmanage.service;

import com.ustc.fastlocker.webmanage.dto.AdminDTO;

public interface AdminService {
    AdminDTO login(String name, String password);
}
