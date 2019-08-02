package com.comcast.interviews.data.jpa.service;

import com.comcast.interviews.data.jpa.domain.Hotel;

public interface HotelService {

	Hotel getHotel(String city, String name);
}
