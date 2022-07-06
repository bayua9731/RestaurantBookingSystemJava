/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ubaya.projectdistprog;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Menu;
import model.Restaurant;

/**
 *
 * @author asus
 */
@WebService(serviceName = "MenuWS")
public class MenuWS {

    /**
     * This is a sample web service operation
     */
    Menu men;
    ArrayList<String> listOfMenu;
    Restaurant r;
    public MenuWS(){
        men=new Menu();
        listOfMenu=men.DisplayMenuSemua();
        r=new Restaurant();
    }
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayMenuRestoran")
    public ArrayList<String> DisplayMenuRestoran(@WebParam(name = "kodeRestoran") String kodeRestoran) {
        //TODO write your implementation code here:
        listOfMenu=men.DisplayMenuRestaurant(kodeRestoran);
        return listOfMenu;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "TambahMenu")
    public String TambahMenu(@WebParam(name = "kode") String kode, @WebParam(name = "nama") String nama, @WebParam(name = "harga") double harga) {
        //TODO write your implementation code here:
        String cek="Benar";
        listOfMenu=men.DisplayMenuRestaurant(kode);
        Restaurant y=r.AmbilData(kode);
        for (int i=0;i<listOfMenu.size();i++){
            String[] data=listOfMenu.get(i).split("-");
            if (data[1].equals(nama)){
                cek="Salah";
                break;
            }
        }
        if (cek.equals("Benar")){
            Menu x=new Menu(nama, y, harga);
            x.insertData();
        }
        return cek;
    }
    
    
}
