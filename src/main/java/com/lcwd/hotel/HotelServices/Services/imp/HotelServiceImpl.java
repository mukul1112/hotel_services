package com.lcwd.hotel.HotelServices.Services.imp;

import com.lcwd.hotel.HotelServices.Services.HotelService;

import com.lcwd.hotel.HotelServices.entities.Hotel;
import com.lcwd.hotel.HotelServices.exception.ResourceNotFoundException;
import com.lcwd.hotel.HotelServices.reportities.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
     @Autowired
    private HotelRepo Hotelrepositories;

    @Override
    public Hotel Create(Hotel hotel) {

        String hotelid = UUID.randomUUID().toString();
        hotel.setId(hotelid);
        return Hotelrepositories.save(hotel);
    }

    @Override
    public List<Hotel> GetAll() {
        return Hotelrepositories.findAll();
    }

    @Override
    public Hotel GetHotelByID(String Id) {
        return Hotelrepositories.findById(Id).orElseThrow(()->
                new ResourceNotFoundException("Hotel with given id not found"));
    }

    @Override
    public void Deltebyid(String Id) {

        Hotelrepositories.deleteById(Id);
    }

    @Override
    public Hotel updateHotel(String Id,Hotel newHotel) {

        Hotel prevHotel= Hotelrepositories.findById(Id).orElseThrow(()->new ResourceNotFoundException("Hotel not found for update"));
        prevHotel.setFirstname(newHotel.getFirstname());
        prevHotel.setLastname(newHotel.getLastname());
        prevHotel.setDob(newHotel.getDob());
        prevHotel.setGender(newHotel.getGender());
        prevHotel.setEducation(newHotel.getEducation());
        prevHotel.setCompany(newHotel.getCompany());
        prevHotel.setExperience(newHotel.getExperience());
        prevHotel.setCtc(newHotel.getCtc());
        prevHotel.setHotelname(newHotel.getHotelname());
        prevHotel.setLocation(newHotel.getLocation());
        prevHotel.setAbout(newHotel.getAbout());
        prevHotel.setImageLink(newHotel.getImageLink());
        prevHotel.setEmail(newHotel.getEmail());


       return Hotelrepositories.save(prevHotel);


    }


}
