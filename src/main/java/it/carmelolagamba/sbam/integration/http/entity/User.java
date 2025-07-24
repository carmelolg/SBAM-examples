package it.carmelolagamba.sbam.integration.http.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
class Geo {
    private String lat;
    private String lng;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
class Company {
    private String name;
    private String catchPhrase;
    private String bs;
}
