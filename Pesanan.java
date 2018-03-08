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
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;

    /**
     * Method Pesanan
     * 
     * @param biaya         data biaya
     * @param pelanggan     data pelanggan
     */
    public Pesanan(double biaya, Customer pelanggan){
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    }
    
    /**
     * Method Biaya
     * 
     * @return biaya ke nilai biaya
     */
    public double getBiaya(){
        return biaya;
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
    public void setBiaya(double biaya){
        this.biaya = biaya;
    }
    
    /**
     * Method Pelanggan
     * 
     * @param pelanggan untuk memasukkan pelanggan baru
     */
    public void setPelanggan(Customer baru){
        pelanggan = baru;
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
    }
    
    /**
     * Method Biaya
     * 
     * untuk menampilkan biaya 
     */
    public void printData(){
        System.out.println(biaya);
    }
}
