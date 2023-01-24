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
@EqualsAndHashCode(callSuper = true)
@Entity
@Table (name = "category")
public class Category extends AbstractEntity {
    @Column
    private String code;

    @Column
    private String designation;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
