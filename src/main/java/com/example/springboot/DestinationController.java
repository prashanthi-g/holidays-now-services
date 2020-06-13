package com.example.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

	@Autowired
	private DestinationService destinationService;
	
	@RequestMapping("/destinations")
	public List<Destination> getAllDestinations() {
		return 	destinationService.getAllDestinations();
	}
	
	/* Hard coded
	@RequestMapping("/all")
	public String getAll() {
		return "Parks, Frisco, Little Elm Recreational Center";
	}

	@RequestMapping("/name")
	public String getName() {
		return "Parks";
	}
	
	@RequestMapping("/address")
	public String getAddress() {
		return " Frisco";
	}
	@RequestMapping("/attraction")
	public String getAttraction() {
		return " Littlw Elam Recreational Center";
	} */
	
	
	
}
