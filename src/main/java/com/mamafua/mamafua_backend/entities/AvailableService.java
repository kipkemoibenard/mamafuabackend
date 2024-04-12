package com.mamafua.mamafua_backend.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="available_services")
public class AvailableService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="Id")
    int svcId;
    @Column(name="Name")
    String svcName;
    @Column(name="Cost")
    String svcCost;
}
