package com.example.mydemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Basket {
    
    @Id
    @SequenceGenerator(name = "bsk_seq_id", allocationSize = 1)
    @GeneratedValue(generator = "bsk_seq_id" , strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(mappedBy = "basket")
    private Customer customer;
}
