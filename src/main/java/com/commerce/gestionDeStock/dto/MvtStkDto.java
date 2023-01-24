package com.commerce.gestionDeStock.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
 
public class MvtStkDto{
    

     private Instant dateMvt;

     private BigDecimal quantite;

 
    private ArticleDto article;

 
    private TypeMvtStk typeMvt;
}
