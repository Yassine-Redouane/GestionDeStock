package com.commerce.gestionDeStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table (name = "article")
public class Article extends AbstractEntity {
    @Column
    private String codeArticle ;

    @Column
    private String designation;

    @Column
    private BigDecimal prixUnitaire;
    @Column
    private BigDecimal tauxTva;
    @Column
    private BigDecimal prixUnitairettc;

    @Column
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;



}
