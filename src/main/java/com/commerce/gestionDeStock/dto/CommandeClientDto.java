package com.commerce.gestionDeStock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
 
public class CommandeClientDto{
    
 
    private String code ;

 
    private Instant dateCommande;

 
    private ClientDto client;

 
    private List<LigneCommandeClientDto> ligneCommandeClients;
}
