package com.ustc.fastlocker.register.util;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class WebNotifier {
    private static HashMap<String,Integer> webNotifyApi=new HashMap<>();
    public static void setWebNotifyApi(String api)
    {

        webNotifyApi.put(api,null);
    }
    public static HashMap<String,Integer> getWebNotifyApis(){
        return webNotifyApi;
    }
    public static void notifyWeb(Message message)
    {
        if((webNotifyApi !=null)&&(!webNotifyApi.isEmpty()))
        {
            webNotifyApi.forEach((k,v)->{
                HttpUtil.httpPost(k, JSON.parseObject(message.toString()));
            });

        }

    }
}
