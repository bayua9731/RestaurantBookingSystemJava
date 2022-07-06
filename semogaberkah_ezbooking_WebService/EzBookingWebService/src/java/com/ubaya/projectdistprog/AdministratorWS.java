/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ubaya.projectdistprog;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Administrator;
import model.Booking;
import model.Customer;
import model.Restaurant;

/**
 *
 * @author asus
 */
@WebService(serviceName = "AdministratorWS")
public class AdministratorWS {

    /**
     * This is a sample web service operation
     */
    Administrator admin;
    Customer c;
    Restaurant r;
    Booking b;
    ArrayList<String> listCustomer, listRestaurant, listBooking;
    
    public AdministratorWS(){
        admin = new Administrator();
        c = new Customer();
        r = new Restaurant();
        b = new Booking();
        
        listCustomer = c.DisplaytoString();
        listRestaurant = r.DisplaytoString();
        listBooking = b.DisplaytoString();
    }
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    
    @WebMethod(operationName = "CheckLoginAdministrator")
    public String CheckLoginAdministrator(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        String cek = "Salah";
        admin = new Administrator(username, password);
        if (admin.CheckLogin()){
            cek = "Benar";
        }
        return cek;
    }
    
        /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayCustomer")
    public ArrayList<String> DisplayCustomer() {
        //TODO write your implementation code here:
        listCustomer=c.DisplaytoString();
        return listCustomer;
    }
}
