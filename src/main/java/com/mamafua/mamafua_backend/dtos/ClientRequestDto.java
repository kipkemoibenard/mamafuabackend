package com.mamafua.mamafua_backend.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientRequestDto {
    private List<RequestServiceDto> requests;
    private String reqPerson;
    private String reqId;
}
