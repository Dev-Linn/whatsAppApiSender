package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Entity
@Table(name = "tb_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Id private long id;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerTelephone")
    private String customerTelephone;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
