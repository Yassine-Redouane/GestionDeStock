package com.commerce.gestionDeStock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder

public class ClientDto{

    private String nom;
    
    private String prenom;

    private AdresseDto adresse;
    
    private String photo;
    
    private String mail;
    
    private String numTel;

    private List<CommandeClientDto> commandeClient;


}