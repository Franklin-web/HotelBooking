package com.franklin.HotelBooking.hotel;


import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
public class HotelResource {
	
	@Autowired
	private HotelService service;
	
	private static final Logger log = LoggerFactory.getLogger(HotelService.class);
	
	@GetMapping("/hotels")
	public List<HotelModel> findAll() {
		log.info("Inside findALl() method of HotelController");
		return service.findAll();
	}
	
	@PostMapping("/hotel/add")
	public void createHotel(@RequestBody HotelModel hotel) {
		log.info("Inside createHotel() method of HotelController");
		service.createHotel(hotel);
	}
	
	@PutMapping("hotel/update")
	public void updateHotel(@RequestBody HotelModel hotel) {
		log.info("Inside updateHotel() method of HotelController");
		service.updateHotel(hotel);
	}
	
	@GetMapping("/find/{id}")
	public HotelModel findHotelById(@PathVariable("id") Long id) {
		return service.findHotelById(id);
	}
	
	@DeleteMapping("hotel/delete/{id}")
	public void deleteHotel(@PathVariable Long id) {
		log.info("Inside deleteHotel() method of HotelController");
		service.deleteHotel(id);
	}
	
	@GetMapping("/propertylistcount/{city}")		
	public long countMethod(@PathVariable String city) {
		return service.count(city);
	}	


}
