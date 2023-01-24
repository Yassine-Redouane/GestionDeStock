package com.commerce.gestionDeStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity{
    
    
    @Column
    private String nom;
    
    @Column
    private String description;

    @Embedded
    private Adresse adresse;
    
    @Column
    private String codeFiscal;
    
    @Column
    private String photo;
    
    @Column
    private String email;

    @Column
    private String numTel;

    @Column
    private String siteWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateur;
}
