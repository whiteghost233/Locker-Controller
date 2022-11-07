package com.ustc.fastlocker.register.web.controller;

import com.ustc.fastlocker.register.dto.ApiDTO;
import com.ustc.fastlocker.register.util.Result;
import com.ustc.fastlocker.register.util.Results;
import com.ustc.fastlocker.register.util.WebNotifier;
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
