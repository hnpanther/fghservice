package com.dyligent.fghservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "partner_company")
public class PartnerCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "compnay_name")
    private String compnayName;
    @Column(name = "web_link")
    private String webLink;
    @Column(name = "description")
    private String description;
    @Column(name = "logo_img")
    private String logoImg;
}
