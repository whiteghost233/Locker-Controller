package com.ustc.fastlocker.webmanage.web.controller;

import com.ustc.fastlocker.webmanage.dto.AdminDTO;
import com.ustc.fastlocker.webmanage.service.AdminService;
import com.ustc.fastlocker.webmanage.util.Result;
import com.ustc.fastlocker.webmanage.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;
    @RequestMapping("/login")
    public Result login(@RequestParam("name")String name,@RequestParam("password")String password)
    {
        AdminDTO admin =adminService.login(name,password);
        return Results.success(admin);
    }

}
