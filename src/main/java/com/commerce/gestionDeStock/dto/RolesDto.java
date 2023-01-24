package com.commerce.gestionDeStock.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
 
public class RolesDto{
    private String roleName;
 
    private Utilisateur utilisateur;
}