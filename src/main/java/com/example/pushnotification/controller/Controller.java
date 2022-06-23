package com.example.pushnotification.controller;

import com.example.pushnotification.domain.PushNotificationRequest;
import com.example.pushnotification.service.SendPushNotification;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/push-notification")
public class Controller {

    private final SendPushNotification sendPushNotification;

    public Controller(SendPushNotification sendPushNotification) {
        this.sendPushNotification = sendPushNotification;
    }

    @PostMapping("/send")
    public ResponseEntity<Boolean> send(PushNotificationRequest request) throws JsonProcessingException {
        return ResponseEntity.ok(this.sendPushNotification.execute(request));
    }

}
