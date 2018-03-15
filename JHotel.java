public class JHotel
{
    // instance variables - replace the example below with your own

    public JHotel(){
    }
    public static void main(String[] args){
        Lokasi lokasi1 = new Lokasi(10,10,"Wakanda");
        Hotel hotel1 = new Hotel("Melati",lokasi1,5);
        Customer saya = new Customer(1506673605,"Geraldo Martua Sigalingging");
        Room kamar1 = new SingleRoom(hotel1, "14045", true, StatusKamar.Vacant);
        kamar1.setDailyTariff(1500000);
        Pesanan pesanan1 = new Pesanan(7, saya, kamar1);
           
        lokasi1.printData();
        saya.printData();
        hotel1.printData();
        
        Administrasi.pesananDitugaskan(pesanan1, kamar1);
        kamar1.printData();
        pesanan1.printData();
        
        if(kamar1 instanceof DoubleRoom){
            System.out.print("Benar Double Room");
        }
        else{
            System.out.print("Salah, Bukan Double Room");
        }
        
        Room kamar2 = new DoubleRoom(hotel1, "24046", true, StatusKamar.Vacant);
        kamar2.setDailyTariff(2500000);
        Pesanan pesanan2 = new Pesanan(5, saya, kamar2);
        
        Administrasi.pesananDitugaskan(pesanan2, kamar2);
        kamar2.printData();
        pesanan2.printData();
        
        if(kamar2 instanceof DoubleRoom){
            System.out.print("Benar Double Room");
        }
        else{
            System.out.print("Salah, Bukan Double Room");
        }
    }
}
