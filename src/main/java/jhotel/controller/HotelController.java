package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class HotelController {
    @RequestMapping("/hotelList")
    public ArrayList<Hotel> hotel(){
        ArrayList<Hotel> hotel = DatabaseHotel.getHotelDatabase();
        return hotel;
    }

    @RequestMapping("/gethotel/{id}")
    public Hotel getHotel(@PathVariable int id) {
        Hotel hotel = DatabaseHotel.getHotel(id);
        return hotel;
    }
}
