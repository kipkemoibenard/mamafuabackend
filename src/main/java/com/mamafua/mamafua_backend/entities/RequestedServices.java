package com.mamafua.mamafua_backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="requested_services")
public class RequestedServices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    int reqId;

    @Column(name = "Name")
    private String reqName;

    @Column(name = "Cost")
    private String reqCost;

    @Column(name = "Total Cost")
    private String totalCost;

    @Column(name = "Status")
    private String requestStatus;

    @Column(name = "Request Person")
    private String reqPerson;

    @ManyToOne
    @JoinColumn(name = "Client_Id")
    private Client client;

//    @Column(insertable = false, updatable = false)

}
