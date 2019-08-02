package com.comcast.interviews.data.jpa.service;

import com.comcast.interviews.data.jpa.domain.Hotel;
import org.springframework.data.repository.Repository;

interface HotelRepository extends Repository<Hotel, Long> {

	Hotel findByCityAndName(String city, String name);
}
