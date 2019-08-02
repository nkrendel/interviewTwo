package com.comcast.interviews.data.jpa.service;

import com.comcast.interviews.data.jpa.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

class HotelServiceImpl implements HotelService {

	private final HotelRepository hotelRepository;

	@Autowired
	public HotelServiceImpl(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public Hotel getHotel(String city, String name) {
		Assert.notNull(city, "City must not be null");
		Assert.hasLength(name, "Name must not be empty");
		return this.hotelRepository.findByCityAndName(city, name);
	}
}
