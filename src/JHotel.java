public class JHotel {
    // instance variables - replace the example below with your ow
    public static void main(String[] args) {
        try {
            DatabaseCustomer.addCustomer(new Customer("QWER", 1990, 12, 10, "abc@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Geraldo Martua S", 1980, 10, 5, "geraldo.martua@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("ZXCV", 1970, 8, 1, "geraldo.martua@gmail.com"));
        } catch (PelangganSudahAdaException pelanggan) {
            System.out.println(pelanggan.getPesan());
        }

        Hotel hotel1 = new Hotel("Melati", new Lokasi(100, 0, "Kukusan Utara"),5);
        try {
            DatabaseHotel.addHotel(hotel1);
        } catch (HotelSudahAdaException hotel) {
            System.out.println(hotel.getPesan());
        }try {
            DatabaseHotel.addHotel(hotel1);
        } catch (HotelSudahAdaException hotel) {
            System.out.println(hotel.getPesan());
        }

        Room room1 = new PremiumRoom(DatabaseHotel.getHotel(1), "10", true, StatusKamar.Vacant);
        try {
            DatabaseRoom.addRoom(room1);
        } catch (RoomSudahAdaException room){
            System.out.println(room.getPesan());
        }
        try {
            DatabaseRoom.addRoom(room1);
        } catch (RoomSudahAdaException room){
            System.out.println(room.getPesan());
        }

        Pesanan pesanan1 = new Pesanan(10, DatabaseCustomer.getCustomer(2));
        try {
            DatabasePesanan.addPesanan(pesanan1);
        } catch (PesananSudahAdaException Pesanan) {
            System.out.println(Pesanan.getPesan());
        }
        try {
            DatabasePesanan.addPesanan(pesanan1);
        } catch (PesananSudahAdaException Pesanan) {
            System.out.println(Pesanan.getPesan());
        }
    }
}

