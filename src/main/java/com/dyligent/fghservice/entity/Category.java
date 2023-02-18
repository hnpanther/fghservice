package com.dyligent.fghservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_name", unique = true, nullable = false)
    private String categoryName;

    @Column(name = "category_name_eng", unique = true)
    private String categoryNameEng;

    @Column(name = "base_image")
    private String baseImage;

    @Column(name = "status")
    private int status;
}
