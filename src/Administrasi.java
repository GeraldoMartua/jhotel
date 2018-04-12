
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi
{
        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void pesananDibatalkan(Room kamar){
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setStatusAktif(false);
        kamar.getPesanan().setRoom(null);
    }
    public static void pesananSelesai(Room kamar){
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setStatusAktif(false);
        kamar.getPesanan().setRoom(null);
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