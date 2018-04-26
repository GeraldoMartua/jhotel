package jhotel;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();
    /*
     * Deklarasi variable
     */

    /**
     * Metode untuk menambah Room
     *
     * @param baru room baru
     *
     */
    public static boolean addRoom(Room baru) throws RoomSudahAdaException{
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(baru.getHotel())&&tes.getNomorKamar()==baru.getNomorKamar()){
                throw new RoomSudahAdaException(tes);
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    /**
     * Metode untuk menghapus room
     *
     * @param hotel Hotel
     * @param nomor_kamar nomer
     * @return null
     *
     */
    public static Room getRoom(Hotel hotel, String nomor_kamar){
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)&&tes.getNomorKamar()==nomor_kamar){
                return tes;
            }
        }
        return null;
    }

    /**
     * Metode untuk menghapus room
     *
     * @param hotel Hotel
     * @return null
     *
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)){
                REQUEST_ROOM.add(tes);
            }
        }
        return REQUEST_ROOM;
    }

    /**
     * Metode untuk menghapus room
     *
     * @return null
     *
     */
    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getStatusKamar()==StatusKamar.Vacant){
                REQUEST_ROOM.add(tes);
            }
        }
        return REQUEST_ROOM;
    }

    /**
     * Metode untuk menghapus room
     *
     * @param hotel Hotel
     * @param nomor_kamar nomer
     *
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException {
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)&&tes.getNomorKamar()==nomor_kamar){
                if(DatabasePesanan.getPesanan(tes) != null)
                {
                    Administrasi.pesananDibatalkan(tes);
                }

                if(ROOM_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(nomor_kamar, hotel);
    }

    /**
     * Metode untuk mengambil data di database
     *
     */
    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }
}
