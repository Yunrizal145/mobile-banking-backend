package com.spring.transferservice.service;

import com.spring.transferservice.dto.TransferRequestDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class TransferService {

    public ResponseEntity<String> transfer(TransferRequestDto dto){
        try {
            // Validasi saldo user (pseudo logic)
//            if (!checkUserBalance(dto.getUserAccountNumber(), dto.getTransactionAmount())) {
//                return ResponseEntity.badRequest().body("Saldo tidak cukup.");
//            }

            String orderId = UUID.randomUUID().toString();

            // Siapkan request ke Midtrans
            Map<String, Object> requestBody = new HashMap<>();
            requestBody.put("payment_type", "bank_transfer");

            Map<String, Object> transactionDetails = new HashMap<>();
            transactionDetails.put("order_id", orderId);
            transactionDetails.put("gross_amount", dto.getTransactionAmount());

            Map<String, Object> bankTransfer = new HashMap<>();
            bankTransfer.put("bank", dto.getBankName());

            requestBody.put("transaction_details", transactionDetails);
            requestBody.put("bank_transfer", bankTransfer);

            // Header Authorization
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
//            String encoded = Base64.getEncoder().encodeToString((serverKey + ":").getBytes());
//            headers.set("Authorization", "Basic " + encoded);

            HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<>(requestBody, headers);
            RestTemplate restTemplate = new RestTemplate();
//            ResponseEntity<Map> response = restTemplate.postForEntity(midtransUrl, httpEntity, Map.class);

//            Map resBody = response.getBody();
//            String vaNumber = ((Map) ((List) resBody.get("va_numbers")).get(0)).get("va_number").toString();

            // Simpan transaksi ke database
//            Transaction trx = new Transaction();
//            trx.setOrderId(orderId);
//            trx.setUserAccountNumber(dto.getUserAccountNumber());
//            trx.setAmount(dto.getAmount());
//            trx.setBank(dto.getBank());
//            trx.setVaNumber(vaNumber);
//            trx.setStatus("PENDING");
//            trx.setCreatedAt(LocalDateTime.now());
//            transactionRepository.save(trx);

//            return ResponseEntity.ok(resBody);
            return null;
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Terjadi kesalahan: " + e.getMessage());
        }
    }

}
