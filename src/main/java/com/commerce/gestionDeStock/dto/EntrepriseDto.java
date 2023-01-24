package com.commerce.gestionDeStock.dto; 

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
 
public class EntrepriseDto {
    
    
 
    private String nom;
    
 
    private String description;

 
    private AdresseDto adresse;
    
 
    private String codeFiscal;
    
 
    private String photo;
    
 
    private String email;

 
    private String numTel;
 
    private String siteWeb;

   
    private List<Utilisateurdto> utilisateur;
}
