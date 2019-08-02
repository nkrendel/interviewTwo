package com.comcast.interviews.data.jpa.service;

import com.comcast.interviews.data.jpa.SampleDataJpaApplication;
import com.comcast.interviews.data.jpa.domain.Hotel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleDataJpaApplication.class)
public class HotelRepositoryIntegrationTests {

	@Autowired
	HotelRepository repository;

	@Autowired
    HotelService hotelService;

	@Test
	public void executesQueryMethodsCorrectly() {
		Hotel hotel = repository.findByCityAndName("Atlanta", "Doubletree");
		assertThat(hotel.getName(), is("Doubletree"));
	}

	@Test
    public void testHotelService() {
	    Hotel hotel = hotelService.getHotel("Atlanta", "Doubletree");
	    assertThat(hotel.getZip(), is("30305"));
    }
}
