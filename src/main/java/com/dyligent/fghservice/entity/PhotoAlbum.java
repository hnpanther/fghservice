package com.dyligent.fghservice.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "photo_album")
public class PhotoAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_album_id")
    private int photoAlbumId;


    @Column(name = "photo_album_name", nullable = false, unique = true)
    private String photoAlbumName;

    @Column(name = "image_link")
    private String imageLink;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
