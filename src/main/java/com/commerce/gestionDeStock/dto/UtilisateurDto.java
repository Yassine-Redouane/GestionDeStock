package com.commerce.gestionDeStock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
 
public class UtilisateursDto {
     private String nom;
    
     private String prenom;

     private AdresseDto adresse;
    
     private String email;

     private String motDePasse;
    
     private Instant dateDeNaissance;
    
     private String photo;

 
    private EntrepriseDto entreprise;
 
    private List<RolesDto> roles;
}
