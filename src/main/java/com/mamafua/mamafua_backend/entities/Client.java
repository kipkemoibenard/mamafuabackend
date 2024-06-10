package com.mamafua.mamafua_backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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

    @Column(name="Client_Id")
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
    @Column(name="Phone no")
    String phone;
    @Column(name="Email")
    String email;
    @Column(name="Password")
    String password;

//    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<RequestedServices>reqServices = new ArrayList<>();
}
