package com.lcwd.hotel.HotelServices.reportities;

import com.lcwd.hotel.HotelServices.entities.Hotel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepo extends MongoRepository<Hotel,String> {



}
