package com.commerce.gestionDeStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Embeddable

public class Adresse{

    @Column
    private String adresse1;
    
    @Column
    private String adresse2;
    
    @Column
    private String ville;
    
    @Column
    private String codePostale;
    
    @Column
    private String pays;


 }