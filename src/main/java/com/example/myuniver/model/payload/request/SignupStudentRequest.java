package com.example.myuniver.model.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class SignupStudentRequest {

    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Set<String> role;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    @NotBlank
    private String surname;

    @NotBlank
    private String name;

    private String fatherland;

    @NotBlank
    private String form;

    @NotBlank
    private int course;

    @NotBlank
    private String telephone;

    private Date bd;

    @NotBlank
    private String group_name;

}
