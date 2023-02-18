package com.dyligent.fghservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;

    @Column(name = "product_name", unique = true, nullable = false)
    private String productName;

    @Column(name = "product_name_eng", unique = true)
    private String productNameEng;

    @Column(name = "main_img")
    private String mainImg;

    @Column(name = "optional_img")
    private String optionalImg;

    @Column(name = "content", columnDefinition = "text")
    private String content;

    @Column(name = "content_eng", columnDefinition = "text")
    private String contentEng;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User author;

    @OneToMany(mappedBy = "product")
    private List<PhotoAlbum> photoAlbumList;
}
