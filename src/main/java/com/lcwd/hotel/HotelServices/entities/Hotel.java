package com.lcwd.hotel.HotelServices.entities;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotels")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hotel {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String dob;
    private String gender;
    private String education;
    private String company;
    private String experience;
    private String ctc;
    private String hotelname;
    private String location;
    private String About;
    private String imageLink;
    private String email;
}
