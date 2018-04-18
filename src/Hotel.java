/**
 * Class Hotel here.
 *
 * @author Geraldo Martua S
 * @version 1 March 2018
 */

// Kelas ini digunakan untuk memasukkan input Hotel yang dipesan
public class Hotel
{
    // Input Instance Variable 
    // Untuk mendeklarasikan variable
    private int ID;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang){
        this.nama=nama;
        this.lokasi=lokasi;
        this.bintang=bintang;
    }

    public int getID() {
        return ID;
    }
    public int getBintang(){
        return bintang;
    }
    public String getNama(){
        return nama;
    }
    public Lokasi getLokasi(){
        return lokasi;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setBintang(int bintang){
        this.bintang = bintang;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setLokasi(Lokasi lokasi){
        this.lokasi = lokasi;
    }
    public String toString(){
        return "\nNama Hotel    : " + nama +
               "\nLokasi        : " + lokasi.getDeskripsi() +
               "\nBintang       : " + bintang;
    }
}
