package com.franklin.HotelBooking.hotel;

import java.util.List;


public interface HotelService {
	
	List<HotelModel> findAll();
	void createHotel(HotelModel hotel);
	void updateHotel(HotelModel hotel);
	HotelModel findHotelById(Long id);
	void deleteHotel(Long id);
	public Long count(String city);


}
