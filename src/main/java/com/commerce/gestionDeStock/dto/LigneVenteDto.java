package com.commerce.gestionDeStock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder

public class LigneVenteDto{

 
    private VentesDto vente;


     private BigDecimal quantite;

     private BigDecimal prixUnitaire;


}