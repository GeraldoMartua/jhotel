package jhotel;
/**
 * Class Lokasi here.
 *
 * @author Geraldo Martua S
 * @version 1 March 2018
 */

// Kelas ini digunakan untuk memasukkan input Lokasi

public class Lokasi
{
    // Input Instance Variable 
    // Untuk mendeklarasikan variable 
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    public Lokasi(float x_coord,float y_coord, String deskripsiLokasi){
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }
    public float getX(){
        return x_coord;
    }
    public float getY(){
        return y_coord;
    }
    public String getDeskripsi(){
        return deskripsiLokasi;
    }
    public void setX(float x_coord){
        this.x_coord = x_coord;
    }
    public void setY(float y_coord){
        this.y_coord = y_coord;
    }
    public void setDeskripsi(String deskripsi){
        deskripsiLokasi = deskripsi;
    }
    public String toString(){
        return "\nKoordinat X       : " + x_coord +
               "\nKoordinat Y       : " + y_coord +
               "\nDeskripsi Lokasi  : " + deskripsiLokasi;
    }
}
