package com.mamafua.mamafua_backend.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@Data should be used in place of all below except table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="Id")
    int clntId;
    @Column(name="Name")
    String clntName;
    @Column(name="County")
    String county;
    @Column(name="Residential Area")
    String clntResidenceArea;
    @Column(name="Residential Plot")
    String clntResidentialPlot;
    @Column(name="House Number")
    String clntHouseNo;
    @Column(name="Email")
    String email;
    @Column(name="Password")
    String password;
}