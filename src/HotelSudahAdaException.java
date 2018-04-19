public class HotelSudahAdaException extends Exception {
    private Hotel hotel_error;
    /**
     * Constructor dari kelas exception PelangganSudahAda, menginisialisasikan nilai dari input.
     * @param hotel_input nilai pesanan yang dicek.
     */

    public HotelSudahAdaException(Hotel hotel_input)
    {
        super("Hotel dengan nama :");
        hotel_error = hotel_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */

    public String getPesan()
    {
        return "\n" + super.getMessage() + " " + hotel_error.getNama() + " di " + hotel_error.getLokasi().getDeskripsi() + " - Sudah terdaftar.";
    }
}
