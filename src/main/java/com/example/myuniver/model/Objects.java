package com.example.myuniver.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class Objects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String object;

    private Long id_teacher;

    @JsonBackReference
    @ManyToMany(mappedBy = "objects")
    private List<Teachers> teachers;

    @JsonBackReference
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Estimate> estimate;

    public Objects(String object, Long id_teacher) {
        this.object = object;
        this.id_teacher = id_teacher;
    }
}
