package com.ustc.fastlocker.webmanage.service;

import com.ustc.fastlocker.webmanage.util.Message;

import java.io.IOException;

public interface NotifyService {
    void messageTest(String message,int clientId) throws IOException;
    void handleMessage(Message message, int clientId) throws IOException;
}
