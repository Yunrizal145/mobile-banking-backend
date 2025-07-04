package com.spring.myaccountmanagementservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetMutasiByAccountNumberResponse implements Serializable {
    private static final long serialVersionUID = -2930593239810076525L;

    private List<MutationDto> mutationDtoList;
}
