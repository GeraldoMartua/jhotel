
/**
 * Write a description of class Pesanan here.
 *
 * @author Geraldo Martua S
 * @version 22 February 2018
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;

    public Pesanan(){
    }
    public double getBiaya(){
        return 0;
    }
    public Customer getPelanggan(){
        return null;
    }
    public boolean getStatusDipesan(){
        return false;
    }
    public boolean getStatusSelesai(){
        return false;
    }
    public void setBiaya(double biaya){
    }
    public void setPelanggan(Customer baru){
    }
    public void setStatusDiproses(boolean diproses){
    }
    public void setStatusSelesai(boolean diproses){
    }
}
