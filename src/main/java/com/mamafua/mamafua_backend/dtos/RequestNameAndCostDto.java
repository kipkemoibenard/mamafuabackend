package com.mamafua.mamafua_backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestNameAndCostDto {
    private String svcName;
    private String svcCost;
}
