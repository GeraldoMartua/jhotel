package jhotel;
/**
 * Write a description of class Room here.
 *
 * @author Geraldo Martua S
 * @version 8 March 2018
 */
public abstract class Room{
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;

    //input status kamar tidak diperlukan jika statuskamar awal selalu vacant
    public Room(Hotel hotelIn, String nomor_kamarIn)
    {
        this.hotel = hotelIn;
        this.nomor_kamar = nomor_kamarIn;
        status_kamar = StatusKamar.Vacant;
    }

    /**
     * Method yang digunakan untuk mengambil data hotel.
     * @return Hotel mengembalikan data hotel.
     */

    public Hotel getHotel()
    {
        return hotel;
    }

    /**
     * Method yang digunakan untuk mengambil data nomor kamar.
     * @return String mengembalikan data nomor kamar.
     */

    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    /**
     * Method yang digunakan untuk mengambil data harga kamar.
     * @return double mengembalikan data harga kamar.
     */

    public double getDailyTariff()
    {
        return dailyTariff;
    }

    /**
     * Method yang digunakan untuk mengambil data status kamar.
     * @return StatusKamar mengembalikan data status kamar.
     */

    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }

    //Method abstract
    public abstract TipeKamar getTipeKamar();


    /**
     * Method yang digunakan untuk mengubah data hotel.
     * @param hotelIn input yang dimasukkan untuk mengubah data hotel.
     */

    public void setHotel(Hotel hotelIn)
    {
        hotel = hotelIn;
    }

    /**
     * Method yang digunakan untuk mengubah data nomor kamar.
     * @param nomor_kamarIn input yang dimasukkan untuk mengubah data nomor kamar.
     */

    public void setNomorKamar(String nomor_kamarIn)
    {
        nomor_kamar = nomor_kamarIn;
    }

    /**
     * Method yang digunakan untuk mengubah data harga kamar.
     * @param dailyTariffIn input yang dimasukkan untuk mengubah data harga kamar.
     */

    public void setDailyTariff(double dailyTariffIn)
    {
        dailyTariff = dailyTariffIn;
    }

    /**
     * Method yang digunakan untuk mengubah data status kamar.
     * @param status_kamarIn input yang dimasukkan untuk mengubah data status kamar.
     */

    public void setStatusKamar(StatusKamar status_kamarIn)
    {
        status_kamar = status_kamarIn;
    }

    /**
     * Method yang digunakan untuk mengembalikan data dari kelas Room dalam bentuk String.
     */

    public String toString()
    {
        if(DatabasePesanan.getPesanan(this) == null){
            return "\nNama hotel  : " + hotel.getNama() +
                    "\nTipe kamar  : " + getTipeKamar() +
                    "\nHarga       : " + dailyTariff +
                    "\nStatus kamar: " + status_kamar;
        }
        else{
            return "\nNama hotel  : " + hotel.getNama() +
                    "\nTipe kamar  : " + getTipeKamar().toString() +
                    "\nHarga       : " + dailyTariff +
                    "\nStatus kamar: " + status_kamar +
                    "\nPelanggan   : " + DatabasePesanan.getPesanan(this).getPelanggan().getNama();
        }
    }


}
