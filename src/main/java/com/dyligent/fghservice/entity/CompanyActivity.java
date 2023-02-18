package com.dyligent.fghservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "company_activity")
public class CompanyActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_activity_id")
    private int companyActiviyId;

    @Column(name = "order_number")
    private int orderNumber;

    @Column(name = "activity")
    private String activity;

    @Column(name = "activity_eng")
    private String activityEng;

    @Column(name = "enabled")
    private boolean enabled;
}
