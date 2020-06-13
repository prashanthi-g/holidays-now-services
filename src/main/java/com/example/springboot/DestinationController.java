package com.example.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

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
	
	@RequestMapping("/destinations")
	public List<Destination> getAll() {
		return Arrays.asList(
				new Destination("Parks", "Frisco"," Little Elm Recreational Center"),
				new Destination("Movies", "Irving"," Maze Runner"),
				new Destination("Events", "Dallas"," Escape Room")
				)	;
	}
	
}
