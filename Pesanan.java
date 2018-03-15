/**
 * Class Pesanan here.
 *
 * @author Geraldo Martua S
 * @version 1 March 2018
 */

// Kelas ini digunakan untuk memasukkan input Pesanan

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

    /**
     * Method Pesanan
     * 
     * @param biaya         data biaya
     * @param pelanggan     data pelanggan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar){
        this.jumlahHari = jumlahHari;
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        biaya = kamar.getDailyTariff() * jumlahHari;
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
    public boolean getStatusDipesan(){
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
    
    /**
     * Method Biaya
     * 
     * untuk menampilkan biaya 
     */
    public void printData(){
        System.out.println("Pesanan");
        System.out.println("Status layanan diproses :"+ isDiproses);
        System.out.println("Status layanan selesai :"+ isSelesai);
        System.out.println("Nama pelanggan :"+ pelanggan.getNama());
        System.out.println("Jumlah Hari :"+ jumlahHari);
        System.out.println("Jumlah Biaya :"+ biaya);
    }
}
