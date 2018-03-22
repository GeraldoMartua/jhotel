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
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    /**
     * Method Pesanan
     * 
     * @param biaya         data biaya
     * @param pelanggan     data pelanggan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, int tanggal, int bulan, int tahun){
        this.jumlahHari = jumlahHari;
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        biaya = kamar.getDailyTariff() * jumlahHari;
        tanggalPesan = new Date(tahun, bulan, tanggal);
    }
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar,Date tanggalPesan){
        this.jumlahHari = jumlahHari;
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        biaya = kamar.getDailyTariff() * jumlahHari;
        this.tanggalPesan = tanggalPesan;
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
    public Customer getPelanggan(){
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
    public Date gettanggalPesan(){
        return tanggalPesan;
    }
    /**
     * Method Biaya
     * 
     * @param biaya nilai yang didapat dari biaya
     */
    public void setBiaya(){
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    
    public void setJumlahHari(double jumlahHari){
        this.jumlahHari = jumlahHari;
    }
    /**
     * Method Pelanggan
     * 
     * @param pelanggan untuk memasukkan pelanggan baru
     */
    public void setPelanggan(Customer pelanggan){
        this.pelanggan = pelanggan;
    }
    
    /**
     * Method Biaya
     * 
     * @param diproses untuk memproses status
     */
    public void setStatusDiproses(boolean diproses){
        isDiproses = diproses;
    }
    
    /**
     * Method Biaya
     * 
     * @param biaya nilai yang didapat dari biaya
     */
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
    public void settanggalPesan(Date tanggalPesan){
        this.tanggalPesan = tanggalPesan;
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
        
        return "Dibuat oleh " + pelanggan.getNama() +
               ". Proses booking untuk " + kamar.getHotel() +
               " kamar nomor " + kamar.getNomorKamar() +
               " dengan tipe kamar yang diinginkan " + kamar.getTipeKamar() +
               ". Status : " + final_status + ".";
    }
}
