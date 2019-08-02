package com.comcast.interviews.data.jpa.service;

import com.comcast.interviews.data.jpa.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Transactional
@Component
class DummyHotelService implements HotelService {

	@Override
    /**
     * Mock method that just returns a new hotel with the requested parameters.
     */
	public Hotel getHotel(String city, String name) {
        return new Hotel(city, name);
	}
}
