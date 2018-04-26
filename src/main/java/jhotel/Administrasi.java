package jhotel;
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi {

    public static void pesananDibatalkan(Room kamar){
        Pesanan kamarpesan = DatabasePesanan.getPesanan(kamar);
        kamarpesan.setStatusSelesai(false);
        kamarpesan.setStatusDiproses(false);
        kamarpesan.setStatusAktif(false);
        kamarpesan.setRoom(null);
    }
    public static void pesananSelesai(Room kamar){
        Pesanan kamarpesan = DatabasePesanan.getPesanan(kamar);
        kamarpesan.setStatusSelesai(true);
        kamarpesan.setStatusDiproses(false);
        kamarpesan.setStatusAktif(false);
        kamarpesan.setRoom(null);
    }
    public static void pesananDibatalkan(Pesanan pesan){
        pesan.setStatusAktif(false);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    public static void pesananSelesai(Pesanan pesan){
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}