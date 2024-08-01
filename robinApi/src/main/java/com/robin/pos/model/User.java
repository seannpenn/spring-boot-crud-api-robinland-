package com.robin.pos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String password;

    private String firstName;

    private String middleName;

    private String lastName;

    @Column(columnDefinition = "TINYINT(1)")
    @JsonProperty("isActive")
    private boolean isActive;

    @Column(length = 120)
    private String address1;

    @Column(length = 120)
    private String address2;

    @Column(length = 120)
    private String address3;

    @Column(length = 13)
    private String phone;

    @Column(length = 13)
    private String mobile;

    @Column(length = 16)
    private String fax;

    @Column(length = 64)
    private String email;

    @Column(length = 16)
    private String tin;

}
