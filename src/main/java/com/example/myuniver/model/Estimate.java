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
@Setter
@Getter
public class Estimate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id_student;

    private Long id_object;

    private float estimate;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    private Students students;

    @JsonBackReference
    @ManyToMany(mappedBy = "estimate")
    private List<Objects> objects;

    public Estimate(Long id_student, Long id_object, float estimate) {
        this.id_student = id_student;
        this.id_object = id_object;
        this.estimate = estimate;
    }
}
