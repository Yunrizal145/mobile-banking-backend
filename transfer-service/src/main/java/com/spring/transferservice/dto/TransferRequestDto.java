package com.spring.transferservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransferRequestDto implements Serializable {
    private static final long serialVersionUID = -8127751068748983536L;

    private String bankName;
    private BigDecimal transactionAmount;
    private String userAccountNumber;
}
