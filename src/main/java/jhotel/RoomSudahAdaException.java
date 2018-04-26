package jhotel;
public class RoomSudahAdaException extends Exception {
    private Room room_error;
    /**
     * Constructor dari kelas exception PelangganSudahAda, menginisialisasikan nilai dari input.
     * @param room_input nilai pesanan yang dicek.
     */

    public RoomSudahAdaException(Room room_input)
    {
        super("Kamar dengan nomor ruang : ");
        room_error = room_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */

    public String getPesan()
    {
        return "\n" + super.getMessage() + room_error.getNomorKamar()+ " pada Hotel " + room_error.getHotel().getNama() + "- Sudah terdaftar.";
    }
}
