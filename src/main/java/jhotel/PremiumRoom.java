package jhotel;
/**
 * Write a description of class SingleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private final double DISCOUNT =0.3;
    private final TipeKamar TIPE_KAMAR = TipeKamar.Premium;
    

    /**
     * Constructor for objects of class SingleRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar){
        super(hotel, nomor_kamar);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    public double getDiscount(){
        return DISCOUNT;
    }
    public void setDailyTariff(double dailytariff){
        dailytariff = dailytariff * DISCOUNT;
    }
}
