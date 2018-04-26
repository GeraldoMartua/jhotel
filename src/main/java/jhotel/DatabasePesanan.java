package jhotel;
import java.util.ArrayList;

/**
 * Class Database Pesanan here.
 *
 * @author Geraldo Martua S
 * @version 1 March 2018
 */

// Kelas ini digunakan untuk memasukkan input Database Pesanan

public class DatabasePesanan {
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>();
    private static int LAST_PESANAN_ID = 0;
    public static ArrayList<Pesanan> getPesananDatabase(){
    return PESANAN_DATABASE;
    }
    public static int getLastPesananId(){
        return LAST_PESANAN_ID;
    }
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException{
        if(PESANAN_DATABASE.contains(baru))
        {
            if(baru.getStatusAktif())
            {
                throw new PesananSudahAdaException(baru);
            }
            else
            {
                PESANAN_DATABASE.add(baru);
                return true;
            }
        }
        else
        {
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }
    public static Pesanan getPesanan(int ID){
        for(int i=0; i < PESANAN_DATABASE.size();i++){
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getId()==ID){
                return tes;
            }
        }
        return null;
    }
    public static Pesanan getPesanan(Room kamar){
        for(int i=0; i < PESANAN_DATABASE.size();i++){
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getRoom()==kamar){
                return tes;
            }
        }
        return null;
    }
    public static Pesanan getPesananAktif(Customer pelanggan){
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getPelanggan().equals(pelanggan))
            {
                if(pesanan.getStatusAktif())
                {
                    return pesanan;
                }
            }
        }
        return null;
    }
    public static boolean removePesanan(Customer pesan) throws PesananTidakDitemukanException
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getPelanggan().equals(pesan)){
                if(tes.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(tes);
                }
                else
                {
                    if(tes.getStatusAktif())
                    {
                        tes.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        throw new PesananTidakDitemukanException(pesan);
    }
    public static Pesanan getPesanan(Customer cust){
        return null;
    }
    public static void pesananDibatalkan(Pesanan pesan){
    }
}
