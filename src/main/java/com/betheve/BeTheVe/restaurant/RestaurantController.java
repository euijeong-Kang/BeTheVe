package com.betheve.BeTheVe.restaurant;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/Restaurant")
    public String searchRestaurant() {
        return "restaurantA";
    }

    @ApiOperation(value = "Restaurant 등록", notes = "Restaurant 등록")
    @PostMapping("/Restaurant")
    public Restaurant postRestaurant(@RequestBody Request request) {
        Restaurant restaurant = restaurantService.saveRestaurant(request);
        return restaurant;
    }

    @GetMapping("/restaurant")
    public List<Restaurant> getListByWord(String searchWord) {
        return restaurantService.getListBySearch(searchWord);
    }
}
