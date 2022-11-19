package com.franklin.HotelBooking.hotel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "hotels")
public class HotelModel {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String hotelName;
	private String type;
	private String city;
	private String address;
	private String distance;
	private String title;
	private int cheapestPrice;
	private int rating;
	private int pincode;
	private String contact;
	private String email;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCheapestPrice() {
		return cheapestPrice;
	}
	public void setCheapestPrice(int cheapestPrice) {
		this.cheapestPrice = cheapestPrice;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public HotelModel(Long id, String hotelName, String type, String city, String address, String distance,
			String title, int cheapestPrice, int rating, int pincode, String contact, String email,
			String description) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.type = type;
		this.city = city;
		this.address = address;
		this.distance = distance;
		this.title = title;
		this.cheapestPrice = cheapestPrice;
		this.rating = rating;
		this.pincode = pincode;
		this.contact = contact;
		this.email = email;
		this.description = description;
	}
	public HotelModel() {
		super();
	}

	
}
