public class HotelTidakDitemukanException extends Exception {
    private int hotel_error;
    /**
     * Constructor dari kelas exception PelangganSudahAda, menginisialisasikan nilai dari input.
     * @param hotel_input nilai pesanan yang dicek.
     */

    public HotelTidakDitemukanException(int hotel_input)
    {
        super("Hotel dengan ID :");
        hotel_error = hotel_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */

    public String getPesan()
    {
        return super.getMessage() + hotel_error + " sudah terdaftar.";
    }
}
