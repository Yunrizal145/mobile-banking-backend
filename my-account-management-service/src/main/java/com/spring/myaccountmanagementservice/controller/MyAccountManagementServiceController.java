package com.spring.myaccountmanagementservice.controller;

import com.spring.myaccountmanagementservice.dto.GetMutasiByAccountNumberRequest;
import com.spring.myaccountmanagementservice.dto.GetMutasiByAccountNumberResponse;
import com.spring.myaccountmanagementservice.dto.GetSaldoByAccountNumberRequest;
import com.spring.myaccountmanagementservice.dto.GetSaldoByAccountNumberResponse;
import com.spring.myaccountmanagementservice.service.MyAccountManagementService;
import com.spring.myaccountmanagementservice.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAccountManagementServiceController {

    @Autowired
    private MyAccountManagementService myAccountManagementService;

    @Autowired
    private UserManagementService userManagementService;

    @GetMapping("/get-another-service")
    public String getValueFromAnotherService(){
        return userManagementService.getValueFromAnotherService();
    }

    @PostMapping("/getsaldo")
    public GetSaldoByAccountNumberResponse getSaldo(@RequestBody GetSaldoByAccountNumberRequest request){
        return myAccountManagementService.getSaldo(request);
    }

    @PostMapping("/getlistmutasi")
    public GetMutasiByAccountNumberResponse getListMutasi(@RequestBody GetMutasiByAccountNumberRequest request){
        return myAccountManagementService.getListMutasi(request);
    }

}
