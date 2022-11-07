package com.ustc.fastlocker.webmanage.web.controller;

import com.ustc.fastlocker.webmanage.dto.ServerIndexDTO;
import com.ustc.fastlocker.webmanage.dto.ServerLoadDTO;
import com.ustc.fastlocker.webmanage.dto.ServerLoadDTO2;
import com.ustc.fastlocker.webmanage.dto.ServerLoadQueryDTO;
import com.ustc.fastlocker.webmanage.service.ServerService;
import com.ustc.fastlocker.webmanage.util.Result;
import com.ustc.fastlocker.webmanage.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/server")
@CrossOrigin
public class ServerController {
    @Autowired
    ServerService serverService;
    @RequestMapping("/maxload")
    public Result maxLoad(){
        ServerLoadDTO serverLoadDTO=serverService.getMaxLoad();
        return Results.success(serverLoadDTO);
    }
    @RequestMapping(value = "/index")
    public Result listIndex(){
        List<ServerIndexDTO> serverIndexDTOList=serverService.listIndex();
        return Results.success(serverIndexDTOList);
    }
    @RequestMapping(value = "/weekload",method = RequestMethod.POST)
    public Result listWeekLoad(@RequestBody ServerLoadQueryDTO server)
    {
        List<ServerLoadDTO2> serverLoadDTOList=serverService.listWeekLoad(server);
        return Results.success(serverLoadDTOList);
    }
}
