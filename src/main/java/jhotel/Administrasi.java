package jhotel;
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi {

    public static void pesananDitugaskan(Pesanan kamarpesan, Room kamar){
        if (kamar.getStatusKamar() == StatusKamar.Vacant){
            kamarpesan.setStatusAktif(true);
            kamarpesan.setStatusDiproses(true);
            kamarpesan.setStatusSelesai(false);
            DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.Booked);
        }
        else
            kamarpesan.setStatusAktif(false);
            kamarpesan.setStatusDiproses(false);
            kamarpesan.setStatusSelesai(false);
    }

    public static void pesananDibatalkan(Room kamar){
        Pesanan kamarpesan = DatabasePesanan.getPesananAktif(kamar);
        kamarpesan.setStatusSelesai(false);
        kamarpesan.setStatusDiproses(false);
        kamarpesan.setStatusAktif(false);
    }
    public static void pesananSelesai(Room kamar){
        Pesanan kamarpesan = DatabasePesanan.getPesananAktif(kamar);
        kamarpesan.setStatusSelesai(true);
        kamarpesan.setStatusDiproses(false);
        kamarpesan.setStatusAktif(false);
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