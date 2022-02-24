package com.api.zomatoclone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.zomatoclone.model.Restaurant;
import com.api.zomatoclone.repository.RestaurantRepository;

@RestController
public class RestaurantController {
	
	private final RestaurantRepository repository;

	RestaurantController(RestaurantRepository repository) {
	    this.repository = repository;
	  }
	
	@PostMapping("/restaurants/add")
	Restaurant newRestaurant(@RequestBody Restaurant newRestaurant) {
	    return null;
	  }

}
