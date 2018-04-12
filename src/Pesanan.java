/**
 * Class Pesanan here.
 *
 * @author Geraldo Martua S
 * @version 1 March 2018
 */

// Kelas ini digunakan untuk memasukkan input Pesanan
import java.util.*;

public class Pesanan
{
    // Input Instance Variable 
    // Untuk mendeklarasikan variable
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.biaya = biaya;
        biaya = kamar.getDailyTariff() * jumlahHari;
        isAktif = true;
        tanggalPesan = new Date();
        id = DatabasePesanan.getLastPesananId() + 1;
    }

    public int getId() {
        return id;
    }
    /**
     * Method Biaya
     * 
     * @return biaya ke nilai biaya
     */
    public double getBiaya(){
        return biaya;
    }
    public double getJumlahHari(){
        return jumlahHari;
    }
    /**
     * Method Pelanggan
     * 
     * @return pelanggan ke nilai pelanggan
     */
    public boolean getStatusAktif() {
        return isAktif;
    }
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    /**
     * Method StatusDipesan
     * 
     * @return Diproses ke nilai Diproses
     */
    public boolean getStatusDiproses(){
        return isDiproses;
    }
    /**
     * Method StatusSelesai
     * 
     * @return Selesai ke nilai Selesai
     */
    public boolean getStatusSelesai(){
        return isSelesai;
    }
    /**
     * Method Room
     * 
     * @return kamar ke nilai Kamar
     */
    public Room getRoom(){
        return kamar;
    }
    public Date getTanggalPesan(){
        return tanggalPesan;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setBiaya(){
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    public void setJumlahHari(double jumlahHari){
        this.jumlahHari = jumlahHari;
    }

    public void setPelanggan(Customer pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void setStatusAktif(boolean aktif) {
        isAktif = aktif;
    }
    /**
     * Method Biaya
     * 
     * @param diproses untuk memproses status
     */
    public void setStatusDiproses(boolean diproses){
        isDiproses = diproses;
    }
    public void setStatusSelesai(boolean diproses){
        isSelesai = diproses;
    }
    /**
     * Method StatusSelesai
     * 
     * @return Selesai ke nilai Selesai
     */
    public void setRoom(Room kamar){
        this.kamar=kamar;
    }
    public Date setTanggalPesan(Date tanggalPesan){
        this.tanggalPesan = tanggalPesan;
        return tanggalPesan;
    }
    /**
     * Method Biaya
     * 
     * untuk menampilkan biaya 
     */
    public String toString(){
        String final_status  = "Kosong";
        if(isDiproses == true && isSelesai == false){
            final_status = "Diproses";
        }
        else if(isDiproses == false && isSelesai == false){
            final_status = "Kosong";
        }
        else if(isDiproses == true && isSelesai == false){
            final_status = "Selesai";
        }

        return ". Proses booking untuk " + kamar.getHotel() +
               " kamar nomor " + kamar.getNomorKamar() +
               " dengan tipe kamar yang diinginkan " + kamar.getTipeKamar() +
               ". Status : " + final_status + ".";
    }
}
