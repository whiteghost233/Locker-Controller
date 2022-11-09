package com.ustc.fastlocker.server.web.websocket;

import com.ustc.fastlocker.server.entity.Server;
import com.ustc.fastlocker.server.util.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import java.net.UnknownHostException;

/**
 * 开启websocket支持
 */
@Configuration
@Component
@Slf4j
public class WebSocketConfig implements ApplicationContextAware {

    @Value("${server.port}")
    int port;
    @Value("${fastlockerserver.id}")
    int serverId;
    @Value("${fastlockerserver.name}")
    String serverName;
    @Value("${fastlockerserver.api}")
    String api;
    @Value("${fastlockerserver.maxsize}")
    int maxSize;
    private static volatile ApplicationContext ctx;

    @Bean("server")
    public Server getServer() throws UnknownHostException {
        String ip = IpUtil.INTERNET_IP + ":" + port;

        return new Server(serverId, ip, serverName, api, 0, maxSize);
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Bean("schedule")
    public ThreadPoolTaskScheduler getScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        return new ThreadPoolTaskScheduler();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        WebSocketConfig.ctx = applicationContext;
    }


    public static <T> T getBean(String name, Class<T> clazz) {
        return ctx.getBean(name, clazz);
    }

}
