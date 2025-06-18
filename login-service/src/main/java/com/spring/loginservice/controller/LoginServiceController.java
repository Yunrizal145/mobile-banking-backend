package com.spring.loginservice.controller;

import com.spring.loginservice.dto.LoginMobileRequest;
import com.spring.loginservice.dto.LoginMobileResponse;
import com.spring.loginservice.dto.LoginPortalRequest;
import com.spring.loginservice.dto.LoginPortalResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginServiceController {

    @PostMapping("/portal/login")
    public LoginPortalResponse loginPortal(@RequestBody LoginPortalRequest loginPortalRequest){
        return null;
    }

    @PostMapping("/mobile/login")
    public LoginMobileResponse loginMobile(@RequestBody LoginMobileRequest loginMobileRequest){
        return null;
    }
}
