package jhotel.controller;
import jhotel.DatabaseHotel;
import jhotel.DatabaseRoom;
import jhotel.Hotel;
import jhotel.Room;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RoomController {
    @RequestMapping("/roomVacant")
    public ArrayList<Room> vacantRooms(){
        ArrayList<Room> rooms = DatabaseRoom.getRoomDatabase();
        return rooms;
    }

    @RequestMapping("/getroom/{id}/{nomor_kamar}")
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String nomor_kamar) {
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),nomor_kamar);
        return room;
    }
}
