package com.betheve.BeTheVe.restaurant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> getRestaurantsByAddressIsContaining(String searchWord);
}
