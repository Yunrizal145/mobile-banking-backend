package com.spring.loginservice.controller;

import com.spring.loginservice.service.OtpService;
import com.spring.usermanagementservice.dto.OtpRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OtpServiceController {

    @Autowired
    private OtpService otpService;

    @PostMapping("/otp-send")
    public void sendOtp(@Validated @RequestBody OtpRequest otpRequest){
        return otpService.(otpRequest);
    }
}
