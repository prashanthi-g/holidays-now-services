package com.example.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DestinationService {

	List<Destination> destinations = Arrays.asList(
			new Destination("Parks", "Frisco"," Little Elm Recreational Center"),
			new Destination("Movies", "Irving"," Maze Runner"),
			new Destination("Events", "Dallas"," Escape Room")
			);
	
		public List<Destination> getAllDestinations(){
		
			return destinations;
		
	}
	
}
