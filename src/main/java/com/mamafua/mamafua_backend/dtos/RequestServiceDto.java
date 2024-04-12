package com.mamafua.mamafua_backend.dtos;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestServiceDto {
    private String reqName;

    private String reqCost;

    private String totalCost;

    private String requestStatus;
}
