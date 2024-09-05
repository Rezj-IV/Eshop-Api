package com.api.eshop.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cars {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int price;

    @Column(length = 5000)
    private String IndexImageUrl;

    @Column(length = 1000)
    private String description;
}
