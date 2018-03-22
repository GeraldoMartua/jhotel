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


public class Customer
{
    // Input Instance Variable 
    // Untuk mendeklarasikan variable 
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    private Pattern pattern;
    private Matcher matcher;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", Pattern.CASE_INSENSITIVE);
    
    public Customer(int id, String nama, int tahun, int bulan, int tanggal){
        this.id = id;
        this.nama = nama;
        Date dob = new Date(tanggal, bulan, tahun);
    }
    public Customer(int id, String nama, Date dob){
        this.id = id;
        this.nama = nama;
        this.dob = dob;
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
    public void setDOB(int iYear, int iMonth, int iDay ){
      Calendar cal = Calendar.getInstance();
      cal.set(iYear, iMonth, iDay );
      this.dob = cal.getTime();
    }
    public String toString(){
        if(DatabasePesanan.getPesanan(this) != null){
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nEmail         : " + email +
                   "\nBooking order is in progress";
                }
        else{
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nEmail         : " + email +
                   "\nDate of Birth : " + dob;
                }
    }
    public static boolean validate(String email) {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
    return matcher.find();
    }
    }
