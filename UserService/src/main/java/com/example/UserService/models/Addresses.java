package com.example.UserService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Addresses extends  BaseEntity{
    private String firstName;
    private String lastName;
    private String line1;
    private String line2;
    private String pincode;
    private String city;
    private String state;
    private String country;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
