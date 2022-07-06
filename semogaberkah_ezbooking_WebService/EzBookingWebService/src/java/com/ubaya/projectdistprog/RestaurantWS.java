/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ubaya.projectdistprog;

import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Restaurant;

/**
 *
 * @author asus
 */
@WebService(serviceName = "RestaurantWS")
public class RestaurantWS {

    /**
     * This is a sample web service operation
     */
    Restaurant res;
    ArrayList<String> listRestaurant;
    
    public RestaurantWS(){
        res=new Restaurant();
        listRestaurant=res.DisplaytoString();
    }
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "CheckRegister")
    public String CheckRegister(@WebParam(name = "nama_pemilik") String nama_pemilik, @WebParam(name = "nama_restoran") String nama_restoran, @WebParam(name = "alamat") String alamat, @WebParam(name = "nomor_telepon") String nomor_telepon,
            @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "jumlah_meja") int jumlah_meja,@WebParam(name = "jam_buka") String jam_buka,@WebParam(name = "jam_tutup") String jam_tutup) {
        //TODO write your implementation code here:
        String cek="Berhasil";
        res=new Restaurant(username, password);
        if(res.CheckRegister()){
            cek="Salah";
        }
        
        if (cek=="Berhasil"){
            res=new Restaurant(nama_pemilik, nama_restoran, alamat, nomor_telepon, jumlah_meja, jam_buka, jam_tutup,username, password);
            res.insertData();
            
        }
        return cek;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CheckLogin")
    public String CheckLogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        String cek="Salah";
            res= new Restaurant(username, password);
            if (res.CheckLogin().size()==1){
                cek="Benar";
        }
        return cek;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayRes")
    public ArrayList<String> DisplayRes() {
        //TODO write your implementation code here:
        return listRestaurant;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayResCari")
    public ArrayList<String> DisplayResCari(@WebParam(name = "kriteria") String kriteria, @WebParam(name = "value") String value) {
        //TODO write your implementation code here:
        listRestaurant=res.DisplaytoStringCari(kriteria, value);
        return listRestaurant;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AmbilDataById")
    public ArrayList<String> AmbilDataById(@WebParam(name = "kode") String kode){
        //TODO write your implementation code here:
        listRestaurant=res.AmbilDatabyId(kode);
        return listRestaurant;
    }
    
    @WebMethod(operationName = "AmbilDataByUsername")
    public ArrayList<String> AmbilDataByUsername(@WebParam(name = "kode") String kode){
        //TODO write your implementation code here:
        listRestaurant=res.AmbilDatabyUsername(kode);
        return listRestaurant;
    }
}
