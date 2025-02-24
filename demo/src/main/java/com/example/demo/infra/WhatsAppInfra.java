package com.example.demo.infra;

import com.example.demo.model.OrderStatus;

public interface WhatsAppInfra {
    void sendMessage(String phone, String message) throws RuntimeException;
    void startSession() throws RuntimeException;
    boolean isSessionActive();
    OrderStatus checkStatus(String messageId);
}
