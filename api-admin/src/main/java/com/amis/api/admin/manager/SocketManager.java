package com.amis.api.admin.manager;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.security.Principal;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint(value = "/websocket")
@Component
public class SocketManager {

    private static int onlineCount = 0;

    private static ConcurrentHashMap<String, WebSocketSession> manager = new ConcurrentHashMap<String, WebSocketSession>();

    public static void add(String key, WebSocketSession webSocketSession) {
        System.out.println("新添加webSocket连接 = {"+key+"}");
        manager.put(key, webSocketSession);
    }

    public static void remove(String key) {
        System.out.println("移除webSocket连接 = {"+key+"}");
        manager.remove(key);
    }

    public static WebSocketSession get(String key) {
        System.out.println("获取webSocket连接 = {"+key+"}");
        return manager.get(key);
    }
}
