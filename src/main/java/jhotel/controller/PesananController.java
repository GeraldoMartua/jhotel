package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.GregorianCalendar;
@RestController
public class PesananController {

    @RequestMapping("/pesananCust")
    public Pesanan pesananCust(@PathVariable int id_customer){
        Pesanan pesanan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesanan;
    }

    @RequestMapping("/getpesanan/{id}")
    public Pesanan getPesanan(@PathVariable int id_pesanan) {
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);
        return pesanan;
    }

    @RequestMapping(value = "/bookpesanan",method = RequestMethod.POST)
    public Pesanan buatPesanan (@RequestParam(value = "jumlah_hari") int jumlah_hari,
                                @RequestParam(value = "id_customer") int id_customer,
                                @RequestParam(value = "id_hotel") int id_hotel,
                                @RequestParam(value = "nomor_kamar")String nomor_kamar){
        Pesanan pesanan = new Pesanan(jumlah_hari,DatabaseCustomer.getCustomer(id_customer));
        try {
            DatabasePesanan.addPesanan(pesanan);
        } catch (Exception ex){
            ex.getMessage();
            return null;
        }
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)),
                DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),nomor_kamar));
        pesanan.setTanggalPesan(new GregorianCalendar().getTime());
        return pesanan;
    }

    @RequestMapping("/batalkanpesanan")
    public Pesanan batalkanPesanan(@PathVariable int id_pesanan){
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    @RequestMapping("/selesaikanpesanan")
    public Pesanan selesaikanPesanan(@PathVariable int id_pesanan){
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }
}
