
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
    public void pesananDitugaskan(Pesanan pesan,Room kamar){
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan,kamar);
    }
    public void roomAmbilPesanan(Pesanan pesan, Room kamar){
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }
    public void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    public void pesananDibatalkan(Room kamar){
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setRoom(null);
        roomLepasPesanan(kamar);
    }
    public void pesananSelesai(Room kamar){
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setRoom(null);
        roomLepasPesanan(kamar);
    }
    public void pesananDibatalkan(Pesanan pesan){
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    public void pesananSelesai(Pesanan pesan){
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}
