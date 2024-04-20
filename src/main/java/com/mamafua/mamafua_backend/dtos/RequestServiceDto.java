package com.mamafua.mamafua_backend.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestServiceDto {

    private List<RequestNameAndCostDto> requests;
    private String totalCost;
    private String reqPerson;
    private String requestStatus;
}
