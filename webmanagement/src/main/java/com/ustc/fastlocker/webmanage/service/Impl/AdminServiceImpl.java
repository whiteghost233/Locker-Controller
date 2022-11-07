package com.ustc.fastlocker.webmanage.service.Impl;

import com.ustc.fastlocker.webmanage.dao.AdminRepository;
import com.ustc.fastlocker.webmanage.dto.AdminDTO;
import com.ustc.fastlocker.webmanage.entity.Admin;
import com.ustc.fastlocker.webmanage.global.ErrorCode;
import com.ustc.fastlocker.webmanage.service.AdminService;
import com.ustc.fastlocker.webmanage.exception.ManageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository;
    @Override
    public AdminDTO login(String name, String password) {
        Admin admin=adminRepository.findByName(name);
        if(null==admin)
            throw new ManageException(ErrorCode.NO_SUCH_ADMIN,"name={}",name);
        if(!password.equals(admin.getPassword()))
        throw new ManageException(ErrorCode.PASSWORD_WRONG,"name={} password={}",name,password);
        AdminDTO adminDTO=new AdminDTO();
        adminDTO.setName(admin.getName());
        adminDTO.setIp(admin.getIp());
        adminDTO.setTime(admin.getTime());
        return adminDTO;
    }
}
