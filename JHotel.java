public class JHotel
{
    // instance variables - replace the example below with your own

    public JHotel(){
    }
    public static void main(String[] args){
        Customer cust1 = new Customer(1,"Aldo");
        Lokasi loka1 = new Lokasi(50,50,"Wakanda");
        Hotel hotel = new Hotel("Hotel A",loka1,5);
        Pesanan order = new Pesanan(1000000,cust1);
        
        order.printData();
        hotel.printData();
        cust1.SetNama("ABC");
        cust1.printData();
    }
}
