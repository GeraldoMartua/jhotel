package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String nama,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="password") String password){
        Customer customer = new Customer (nama, 10, 10, 1990, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch(Exception ex) {
            ex.getMessage();
            return null;
        };
        return customer;
    }

    @RequestMapping(value = "/customerlogin", method = RequestMethod.POST)
    public Customer custLogin (@RequestParam(value="email") String email,
                               @RequestParam(value="password") String password){
        Customer customer = DatabaseCustomer.getCustomerLogin(email,password);
        return customer;
    }

    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }

}