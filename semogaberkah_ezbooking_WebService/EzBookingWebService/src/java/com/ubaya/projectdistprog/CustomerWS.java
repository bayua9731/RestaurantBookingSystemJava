/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ubaya.projectdistprog;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Customer;

/**
 *
 * @author asus
 */
@WebService(serviceName = "CustomerWS")
public class CustomerWS {

    /**
     * This is a sample web service operation
     */
    Customer cus;
    ArrayList<String> listCustomer;
    
    public CustomerWS(){
        cus=new Customer();
        listCustomer=cus.DisplaytoString();
    }
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CheckRegisterCustomer")
    public String CheckRegisterCustomer(@WebParam(name = "name") String name, @WebParam(name = "nomor_telepon") String nomor_telepon,@WebParam(name = "alamat") String alamat,@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        String cek="Benar";
        cus=new Customer(username, password);
        if (cus.CheckRegister()){
            cek="Salah";
        }
        
        if (cek.equals("Benar")){
            cus= new Customer(name, nomor_telepon,alamat,username, password);
            cus.insertData();
        }
        return cek;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CheckLoginCustomer")
    public String CheckLoginCustomer(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        String cek="Salah";
        cus=new Customer(username, password);
        if (cus.CheckLogin().size()==1){
            cek="Benar";
        }
        
        return cek;
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Display")
    public ArrayList<String> Display() {
        //TODO write your implementation code here:
        listCustomer=cus.DisplaytoString();
        return listCustomer;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AmbilDataCustomer")
    public ArrayList<String> AmbilDataCustomer(@WebParam(name = "kode") String kode) {
        //TODO write your implementation code here:
        listCustomer=cus.AmbilDatabyId(kode);
        return listCustomer;
    }
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayCusCari")
    public ArrayList<String> DisplayCusCari(@WebParam(name = "kriteria") String kriteria, @WebParam(name = "value") String value) {
        //TODO write your implementation code here:
        listCustomer=cus.DisplaytoStringCari(kriteria,value);
        return listCustomer;
    }
    
    
    
    
}
