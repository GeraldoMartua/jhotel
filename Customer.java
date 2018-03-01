/**
 * Class Customer here.
 *
 * @author Geraldo Martua S
 * @version 1 March 2018
 */

// Kelas ini digunakan untuk memasukkan input Customer

public class Customer
{
    // Input Instance Variable 
    // Untuk mendeklarasikan variable 
    protected int id;
    protected String nama;
    
    public void Customer(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    public int getID(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public void SetID(int id){
        this.id = id;
    }
    public void SetNama(String nama){
        this.nama = nama;
    }
    public void printData (){
    }
}
