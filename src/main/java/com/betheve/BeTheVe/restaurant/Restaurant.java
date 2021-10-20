package com.betheve.BeTheVe.restaurant;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.time.LocalDateTime;

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
    @Column(length = 10)
    private String phoneNum;
    @Column(length = 10)
    private String location;

    private String address;

    private String image;

    private LocalDateTime createdDateTime;

    private LocalDateTime updatedDateTime;

    private boolean subscriptionAvailable = false;

    private boolean ownerExist = false;

    public void created() {
        this.createdDateTime = LocalDateTime.now();
    }

}
