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
@Table(name="mamafua")
public class MamaFua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="Id")
    int mamafuaId;
    @Column(name="Name")
    String mamafuaName;
    @Column(name="County")
    String county;
    @Column(name="Email")
    String email;
    @Column(name="Password")
    String password;
}
