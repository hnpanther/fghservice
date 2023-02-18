package com.dyligent.fghservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "certificate")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certificate_id")
    private int certificateId;

    @Column(name = "description")
    private String description;

    @Column(name = "description_eng")
    private String descriptionEng;

    @Column(name = "main_img")
    private String mainImg;

    @Column(name = "enabled")
    private int enabled;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "certificate")
    private List<PhotoAlbum> photoAlbumList;
}
