package com.lcwd.hotel.HotelServices.Services;

import com.lcwd.hotel.HotelServices.entities.Hotel;

import java.util.List;

public interface HotelService {

    // Getall
     Hotel Create(Hotel hotel);
    List<Hotel> GetAll();

  // single hotel
    Hotel GetHotelByID(String Id);
    //delete hotel by id
    void Deltebyid(String Id);

    Hotel updateHotel (String Id,Hotel hotel);



}
