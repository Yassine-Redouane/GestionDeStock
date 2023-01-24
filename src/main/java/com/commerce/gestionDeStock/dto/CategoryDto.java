package com.commerce.gestionDeStock.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.commerce.gestionDeStock.model.Category;

@JsonIgnore
 private List<ArticleDto> articles;
 public CategoryDto fromEntity(Category category) {
   if (category == null) {
     return null;
     // TODO throw an exception
   }
   return CategpryDto.builder()
       .id(category.getId())
       .code (category.getCode())
       .designation(category.getDesignation())
       .build()
 }
