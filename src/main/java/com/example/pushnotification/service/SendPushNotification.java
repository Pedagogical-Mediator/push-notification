package com.example.pushnotification.service;

import com.example.pushnotification.domain.PushNotificationRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class SendPushNotification {

    private final PushNotificationService pushNotificationService;

    private final ObjectMapper objectMapper;

    public SendPushNotification(ObjectMapper objectMapper, PushNotificationService pushNotificationService) {
        this.objectMapper = objectMapper;
        this.pushNotificationService = pushNotificationService;
    }

    public Boolean execute(PushNotificationRequest request) throws JsonProcessingException {
        pushNotificationService.sendPushNotification(request);
        return Boolean.TRUE;
    }

}
