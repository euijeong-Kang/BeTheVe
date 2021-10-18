package com.betheve.BeTheVe.restaurant;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id @GeneratedValue
    private Long id;

    private String name;

    private String restaurantCode;

    private String phoneNum;

    private String location;

    private String address;

    private String image;



}
