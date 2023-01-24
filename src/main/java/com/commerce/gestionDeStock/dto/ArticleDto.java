package com.commerce.gestionDeStock.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto{
    private String codeArticle ;

    private String designation;

    private BigDecimal prixUnitaire;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitairettc;

    private String photo;

    private CategoryDto category;



}
