package it.carmelolagamba.sbam.adapters.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class UserResource {
    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
}

