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
    private String svcName;

    @Column(name = "Cost")
    private String svcCost;

    @Column(name = "Total Cost")
    private String totalCost;

    @Column(name = "Status")
    private String requestStatus;

    @Column(name = "Request Person")
    private String reqPerson;

    @Column(name = "Service Provider")
    private String reqSvcProvider;

    @Column(name = "County")
    private String county;

    @Column(name = "Area")
    private String area;

    @Column(name = "Plot")
    private String plot;

    @Column(name = "House No")
    private String house;

    @Column(name = "Phone No")
    private String phone;

//    @ManyToOne
//    @JoinColumn(name = "Client_Id")
//    private Client client;
//
////    @Column(insertable = false, updatable = false)

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "requested_services_id", referencedColumnName = "Id")
//    private List<RequestedServices> requestedServices = new ArrayList<RequestedServices>();
//
//    // Method to add a requested service to the list
//    public void addRequestedService(RequestedServices requestedService) {
//        this.requestedServices.add(requestedService);
//    }

}
