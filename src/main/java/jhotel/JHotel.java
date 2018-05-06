package jhotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static jhotel.StatusKamar.Vacant;
@SpringBootApplication

public class JHotel {

    public static void main(String args[]){
    Lokasi lok1 = new Lokasi(100,100,"lok1");
    Hotel hotel1 = new Hotel("Mantab",lok1,5);
    try {
        DatabaseHotel.addHotel(hotel1);
    } catch (HotelSudahAdaException e) {
        System.out.println(e.getPesan());
    }
    Room Single1 = new SingleRoom(hotel1, "101", true, Vacant);
        try {
        DatabaseRoom.addRoom(Single1);
    } catch (RoomSudahAdaException test){
        System.out.println(test.getPesan());
    }

    Room Premium1 = new PremiumRoom(hotel1, "404", true, Vacant);
        try {
        DatabaseRoom.addRoom(Premium1);
    } catch (RoomSudahAdaException test){
        System.out.println(test.getPesan());
    }

    Room Double1 = new DoubleRoom(hotel1, "202", true, Vacant);
        try {
        DatabaseRoom.addRoom(Double1);
    } catch(RoomSudahAdaException test){
        System.out.println(test.getPesan());
    }
    SpringApplication.run(JHotel.class, args);
    }
}