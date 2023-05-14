package com.example.mydemo.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Privilege {
    
    @Id
    @SequenceGenerator(name = "prv_seq_id", allocationSize = 1)
    @GeneratedValue(generator = "prv_seq_id", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "privilegio")
    private String name;

    @ManyToMany(mappedBy = "privileges")
    private List<Role> roles;
}
