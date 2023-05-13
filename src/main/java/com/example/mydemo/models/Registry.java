package com.example.mydemo.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Anagrafica")
public class Registry {
    
    /**
     * Chiave primaria della tabella anagrafica, è una chiave che sfrutta la generazione automatica dei valori
     * mediante il @see @GeneratedValue e sfrutta il generatore sequenziale @see @SequenceGenerator.
     * -N.B i valori sono generati automaticamente dal DB (opzione GenerationType.SEQUENCE)
     */
    @Id
    @SequenceGenerator(name = "reg_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reg_seq_id")
    private Long id;
    
    @Column(name = "Nome")
    private String customerName;

    @Column(name = "Cognome")
    private String customerSurname;

    @Column(name = "Email")
    private String customerEmail;

    @Column(name = "Data_di_nascita")
    private Date customerDOB;

    @Column(name = "Eta")
    private int customerAge;

    @Column(name = "Citta")
    private String customerCountry;

    /**
     * One Registry To Many customers (variabile di istanza)
     */
    @OneToMany(mappedBy = "registry")
    private List<Customer> customers;
}
