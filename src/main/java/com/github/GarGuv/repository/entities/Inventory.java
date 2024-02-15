package com.github.GarGuv.repository.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private Integer quantity;

    @OneToOne
    private Item item;


}
