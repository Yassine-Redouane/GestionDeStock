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
@Table(name = "client")
public class Client extends AbstractEntity {
    @Column
    private String nom;
    
    @Column
    private String prenom;

    @Embedded
    private Adresse adresse;
    
    @Column
    private String photo;
    
    @Column
    private String mail;
    
    @Column
    private String numTel;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClient;


}
