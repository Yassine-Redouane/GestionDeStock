package com.commerce.gestionDeStock.dto;

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
 

public class AdresseDto{
 
    private String adresse1;
 
    private String adresse2;
 
    private String ville;
 
    private String codePostale;
 
    private String pays;


 }