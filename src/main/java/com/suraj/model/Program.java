package com.suraj.model;

import jakarta.persistence.*;

@Entity
@Table(name="programs")
public class Program {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String ownerUsername;

    // constructors, getters, setters
}
