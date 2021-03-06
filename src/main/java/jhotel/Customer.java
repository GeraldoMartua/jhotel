package jhotel;
/**
 * Class Customer here.
 *
 * @author Geraldo Martua S
 * @version 1 March 2018
 */

// Kelas ini digunakan untuk memasukkan input Customer
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Math.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Customer {

    // Input Instance Variable 
    // Untuk mendeklarasikan variable
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    private Pattern pattern;
    private Matcher matcher;
    private String password;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", Pattern.CASE_INSENSITIVE);
    
    public Customer(String nama, int tanggal, int bulan, int tahun, String email, String password){
        this.id = DatabaseCustomer.getLastCustomerId()+1;
        this.nama = nama;
        this.dob = new GregorianCalendar(tanggal, bulan-1, tahun).getTime();
        this.email = email;
        this.password = password;
    }
    public Customer(String nama, Date dob, String email, String password){
        this.id = DatabaseCustomer.getLastCustomerId()+1;
        this.nama = nama;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }
    public int getID(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Date getDOB(){ 
        DateFormat formatter = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String output = formatter.format(dob);
        System.out.print(output);
        return dob;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setEmail(String email){
        if(validate(email) == true){
            this.email = email;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDOB(int iYear, int iMonth, int iDay ){
      Calendar cal = Calendar.getInstance();
      cal.set(iYear, iMonth, iDay );
      this.dob = cal.getTime();
    }
    public String toString(){
        if(DatabasePesanan.getPesananAktif(this) != null){
            return "\nCustomer ID   : " + getID() +
                   "\nName          : " + getNama() +
                   "\nEmail         : " + getEmail() +
                   "\nBooking order is in progress";
                }
        else{
            return "\nCustomer ID   : " + getID() +
                   "\nName          : " + getNama() +
                   "\nEmail         : " + getEmail() +
                   "\nDate of Birth : " + getDOB();
                }
    }
    public static boolean validate(String email) {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
    return matcher.find();
    }
}
