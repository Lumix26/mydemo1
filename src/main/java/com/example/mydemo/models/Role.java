package com.example.mydemo.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Role {

    @Id
    @SequenceGenerator(name = "rol_seq_id", allocationSize = 1)
    @GeneratedValue(generator = "rol_seq_id", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "ruolo")
    private String role;
    
    @ManyToMany(mappedBy = "roles")
    private List<Customer> customers;

    @ManyToMany
    @JoinTable(
        name = "privilegi_ruolo",
        joinColumns = @JoinColumn(
            name = "role_id", referencedColumnName = "id"
        ),
        inverseJoinColumns = @JoinColumn(
            name = "privilege_id", referencedColumnName = "id"
        )
    )
    private List<Privilege> privileges;
}
