package com.betheve.BeTheVe.restaurant;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final ModelMapper modelMapper;

    public Restaurant saveRestaurant(@Valid Request request) {
        Restaurant newRestaurant = modelMapper.map(request, Restaurant.class);
        newRestaurant.created();
        return restaurantRepository.save(newRestaurant);
    }

    public List<Restaurant> getListBySearch(String searchWord) {
        return restaurantRepository.getRestaurantsByAddressIsContaining(searchWord);
    }


}
