package it.carmelolagamba.sbam.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserOutputModel {
    private int id;
    private String name;
    private String username;
    private String email;
    private AddressOutputModel address;
    private String phone;
    private String website;
    private CompanyOutputModel company;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
class AddressOutputModel {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoOutputModel geo;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
class GeoOutputModel {
    private String lat;
    private String lng;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
class CompanyOutputModel {
    private String name;
    private String catchPhrase;
    private String bs;
}
