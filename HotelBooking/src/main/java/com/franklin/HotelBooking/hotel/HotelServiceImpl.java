package com.franklin.HotelBooking.hotel;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.franklin.HotelBooking.exception.HotelNotFoundException;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor @Transactional 
public class HotelServiceImpl implements HotelService{

	

	@Autowired
	private HotelRepo repos;
	
	
	@Override
	public List<HotelModel> findAll() {
		System.out.println("Inside findAll() method of HotelServiceImpl");
		return repos.findAll();
	}
	
	@Override
	public void createHotel(HotelModel hotel) {
		System.out.println("Inside createHotel() method of HotelServiceImpl");
		repos.save(hotel);
	}

	@Override
	public void updateHotel(HotelModel hotel) {
		System.out.println("Inside updateHotel() method of HotelServiceImpl");
		repos.save(hotel);
		
	}

	@Override
	public HotelModel findHotelById(Long id) {
		return repos.findHotelById(id).orElseThrow(() -> new HotelNotFoundException("Hotel by id " + id + " was not found"));
	}

	@Override
	public void deleteHotel(Long id) {
		System.out.println("Inside deleteHotel() method of HotelServiceImpl");
		repos.deleteHotelById(id);
		
	}

	@Override
	public Long count(String city) {
		return repos.count(city);
	}

	

	
}
