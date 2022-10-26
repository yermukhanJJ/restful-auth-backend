package com.example.myuniver.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Setter
@Getter
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surname;

    private String name;

    private String fatherland;

    private String username;

    private String form;

    private int course;

    private String telephone;

    private Date bd;

    private Long group_id;

    public Students(String surname, String name, String fatherland, String username, String form, int course, String telephone, Date bd, Long group_id) {
        this.surname = surname;
        this.name = name;
        this.fatherland = fatherland;
        this.username = username;
        this.form = form;
        this.course = course;
        this.telephone = telephone;
        this.bd = bd;
        this.group_id = group_id;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "students",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Estimate> estimateList;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "group_id",insertable = false,updatable = false,referencedColumnName = "id")
    private Groups group;
}
