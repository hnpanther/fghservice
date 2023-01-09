package com.dyligent.fghservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private int questionId;

    @Column(name = "question_content", nullable = false, length = 2000)
    private String questionContent;

    @Column(name = "answer", nullable = false, length = 2000)
    private String answer;

    @Column(name = "order_number")
    private int orderNumber;

    @Column(name = "enabled")
    private boolean enabled;
}
