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
@Table(name = "utilisateurs")
public class Utilisateurs extends AbstractEntity{
    @Column
    private String nom;
    
    @Column
    private String prenom;

    @Embedded
    private Adresse adresse;
    
    @Column
    private String email;

    @Column
    private String motDePasse;
    
    @Column
    private Instant dateDeNaissance;
    
    @Column
    private String photo;


    @ManyToOne
    @JoinColumn(name = "identrprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;
}
