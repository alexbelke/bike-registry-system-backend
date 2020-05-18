package com.lexelpro.bike.controller;

import com.lexelpro.bike.model.Bike;
import com.lexelpro.bike.repository.BikeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

	private final BikeRepository repository;

	public BikesController(BikeRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public List<Bike> list() {
		return repository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		repository.save(bike);
	}

	@GetMapping("/{id")
	public Bike get(@PathVariable("id") long id) {
		return repository.getOne(id);

	}
}
