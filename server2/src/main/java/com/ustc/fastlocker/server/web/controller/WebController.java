package com.ustc.fastlocker.server.web.controller;

import com.ustc.fastlocker.server.dto.ApiDTO;
import com.ustc.fastlocker.server.util.Result;
import com.ustc.fastlocker.server.util.Results;
import com.ustc.fastlocker.server.util.WebNotifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class WebController {
    @RequestMapping("/webapi")
    public Result setWebApi(@RequestBody ApiDTO api)
    {
        WebNotifier.setWebNotifyApi(api.getWebapi());
        return Results.success(null);
    }
}
