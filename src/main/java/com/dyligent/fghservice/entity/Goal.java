package com.dyligent.fghservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "goal")
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goal_id")
    private int goalId;

    @Column(name = "order_number")
    private int orderNumber;

    @Column(name = "goal")
    private String goal;

    @Column(name = "goal_eng")
    private String goalEng;

    @Column(name = "enabled")
    private boolean enabled;
}
