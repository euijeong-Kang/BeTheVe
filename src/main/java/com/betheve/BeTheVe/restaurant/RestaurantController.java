package com.betheve.BeTheVe.restaurant;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3030"})
public class RestaurantController {

    private final RestaurantService restaurantService;

    @ApiOperation(value = "Restaurant 등록", notes = "Restaurant 등록")
    @PostMapping("/Restaurant")
    public Restaurant postRestaurant(@RequestBody Request request) {
        Restaurant restaurant = restaurantService.saveRestaurant(request);
        return restaurant;
    }

    @GetMapping("/restaurants/{keyword}")
    public List<Restaurant> getListByKeyword(@PathVariable("keyword") String keyWord, Model model) {
        List<Restaurant> restaurantList = restaurantService.getListBySearch(keyWord);
        model.addAttribute("restaurantList", restaurantList);
        return restaurantList;
    }

}
