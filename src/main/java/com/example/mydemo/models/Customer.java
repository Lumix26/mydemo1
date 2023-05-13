package com.example.mydemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clienti")
public class Customer {
    

    
    /**
     * Many Customer To One registry (variabile di istanza)
     * @see @JoinColumn nel caso OneToMany indica la chiave esterna della relazione
     */
    @ManyToOne()
    @JoinColumn(name = "registry_id")
    private Registry registry;
}
