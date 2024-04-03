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
    private String hotelname;
    private String location;
    private String about;
    private String imageLink;
}
