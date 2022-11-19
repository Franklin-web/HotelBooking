package com.franklin.HotelBooking.hotel;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface HotelRepo extends JpaRepository<HotelModel, Long>{
	
	void deleteHotelById(Long id);
	Optional<HotelModel> findHotelById(Long id);
	
	
	@Query(value = "SELECT count(city) FROM hotels where city = :c", nativeQuery = true) 
	public Long count(@Param("c") String city);

}
