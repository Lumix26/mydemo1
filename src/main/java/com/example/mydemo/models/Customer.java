package com.example.mydemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clienti")
public class Customer {
    
    @Id
    @SequenceGenerator(name = "cst_seq_id", allocationSize = 1)
    @GeneratedValue(generator = "cst_seq_id", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String psw;
    
    
    /**
     * Many Customer To One registry (variabile di istanza)
     * @see @JoinColumn nel caso OneToMany indica la chiave esterna della relazione
     */
    @ManyToOne()
    @JoinColumn(name = "registry_id")
    private Registry registry;
}
