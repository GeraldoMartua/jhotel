package jhotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static jhotel.StatusKamar.Vacant;
@SpringBootApplication

public class JHotel {

    public static void main(String args[]){
    Lokasi test1 = new Lokasi(12,13,"lok1");
    Lokasi test2 = new Lokasi(69,69,"lok2");
    Hotel hotel1 = new Hotel("Mantab",test1,5);
    try {
        DatabaseHotel.addHotel(hotel1);
    } catch (HotelSudahAdaException e){
        System.out.println(e.getPesan());
    }
    Hotel hotel2 = new Hotel("Sip dah",test2,5);
        try {
        DatabaseHotel.addHotel(hotel2);
    } catch (HotelSudahAdaException e){
        System.out.println(e.getPesan());
    }
    Room A101 = new SingleRoom(hotel1, "A101", true, Vacant);
        try {
        DatabaseRoom.addRoom(A101);
    } catch (RoomSudahAdaException test){
        System.out.println(test.getPesan());
    }

    Room D404 = new PremiumRoom(hotel1, "404", true, Vacant);
        try {
        DatabaseRoom.addRoom(D404);
    } catch (RoomSudahAdaException test){
        System.out.println(test.getPesan());
    }

    Room B202 = new DoubleRoom(hotel2, "202", true, Vacant);
        try {
        DatabaseRoom.addRoom(B202);
    } catch(RoomSudahAdaException test){
        System.out.println(test.getPesan());
    }

        SpringApplication.run(JHotel.class, args);
    }
}