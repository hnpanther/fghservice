package com.dyligent.fghservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "company_information")
public class CompanyInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email1")
    private String email1;
    @Column(name = "email2")
    private String email2;
    @Column(name = "phone1")
    private String phone1;
    @Column(name = "phone2")
    private String phone2;
    @Column(name = "fax_number")
    private String faxNumber;
    @Column(name = "address", length = 1000)
    private String address;
    @Column(name = "footer1", length = 1000)
    private String footer1;
    @Column(name = "footer2", length = 1000)
    private String footer2;
    @Column(name = "message_ceo", length = 1000)
    private String messageCEO;
    @Column(name = "daily_message", length = 1000)
    private String dailyMessage;
    @Column(name = "logo_img")
    private String logoImg;
    @Column(name = "icon1_img")
    private String icon1Img;
    @Column(name = "icon2_img")
    private String icon2Img;
    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "number_of_product")
    private int numberOfProduct;

    @Column(name = "number_of_customers")
    private int numberOfCustomers;

    @Column(name = "number_of_final+customers")
    private int numberOfFinalCustomers;
}
