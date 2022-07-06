/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ubaya.projectdistprog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Booking;
import model.Customer;
import model.Menu;
import model.PreOrder;
import model.Restaurant;

/**
 *
 * @author asus
 */
@WebService(serviceName = "BookingWS")
public class BookingWS {

    /**
     * This is a sample web service operation
     */
    Restaurant res;
    Booking b;
    Customer c;
    ArrayList<String> listRestaurant, listBooking, listCustomer, listMenu;
    Menu m;
    PreOrder p;

    public BookingWS() {
        res = new Restaurant();
        b = new Booking();
        c = new Customer();
        m = new Menu();
        p = new PreOrder();
        listRestaurant = res.DisplaytoString();
        listCustomer = c.DisplaytoString();
        listBooking = b.DisplaytoString();
        listMenu = m.DisplayMenuSemua();
    }

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "TambahBooking")
    public String TambahBooking(@WebParam(name = "customer") String customer, @WebParam(name = "restaurant") String restaurant, @WebParam(name = "tanggal") String tanggal, @WebParam(name = "jumlahMeja") int jumlahMeja, @WebParam(name = "time") String time) throws ParseException {
        //TODO write your implementation code here:
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date d = date.parse(tanggal);
        String jam = time.split(":")[0];
        String menit = time.split(":")[1];
        String[] dataRestaurant = restaurant.split("-");
        String[] dataCustomer = customer.split("-");
        Restaurant x = res.AmbilData(dataRestaurant[0].toString());
        Customer y = c.AmbilData(dataCustomer[0].toString());
        System.out.println(x);
        System.out.println(c);
        String cek = "Benar";
        for (int i = 0; i < listBooking.size(); i++) {
            String[] data = listBooking.get(i).split(";");
            String jamData = data[4].split(":")[0];
            String menitData = data[4].split(":")[1];
            if (data[2].equals(tanggal) && data[5].equals(dataRestaurant[0]) && data[12].equals(dataCustomer[0]) && jamData.equals(jam) && menitData.equals(menit)) {
                cek = "Salah";
                break;
            }
        }
        if (cek.equals("Benar")) {
            b = new Booking(jumlahMeja, d, y, x, "sudahpesan", time);
            b.insertData();
        }
        return cek;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Display")
    public ArrayList<String> Display() {
        listBooking = b.DisplaytoString();
        return listBooking;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayBookingRestaurant")
    public ArrayList<String> DisplayBookingRestaurant(@WebParam(name = "kode") String kode, @WebParam(name = "kriteria") String kriteria, @WebParam(name = "value") String value) {
        //TODO write your implementation code here:
        listBooking = b.DisplayPilihan(kode, kriteria, value);
        return listBooking;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayBookingMenu")
    public ArrayList<String> DisplayBookingMenu(@WebParam(name = "kode") String kode) {
        //TODO write your implementation code here:
        listBooking = b.DisplaytoStringMenu(kode);
        return listBooking;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "JumlahMejaBerdasarkanTanggal")
    public Integer JumlahMejaBerdasarkanTanggal(@WebParam(name = "datetime") String datetime, @WebParam(name = "restaurant") String restaurant, @WebParam(name = "time") String time) {
        //TODO write your implementation code here:
        int jumlah = 0;
        listBooking = b.DisplayPilihan(restaurant, "tidak", "");
        String jam = time.split(":")[0];
        String menit = time.split(":")[1];
        if (!listBooking.isEmpty()) {
            for (int i = 0; i < listBooking.size(); i++) {
                String[] data = listBooking.get(i).split(";");
                String jamData = data[4].split(":")[0];
                String menitData = data[4].split(":")[1];
                if (data[2].equals(datetime) && jamData.equals(jam) && menitData.equals(menit) && (!data[3].equals("selesai"))) {
                    jumlah += Integer.parseInt(data[1]);
                }
            }
        }
        return jumlah;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayBook")
    public ArrayList<String> DisplayBook(@WebParam(name = "kodeCustomer") String kodeCustomer) {
        listBooking = b.DisplayPilihanCustomer(kodeCustomer);
        return listBooking;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CheckBook")
    public String CheckBook(@WebParam(name = "restaurant") String restaurant, @WebParam(name = "customer") String customer,
            @WebParam(name = "tanggal") String tanggal,@WebParam(name = "time") String time) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date d = date.parse(tanggal);
        String jam = time.split(":")[0];
        String menit = time.split(":")[1];
        String[] dataRestaurant = restaurant.split("-");
        String[] dataCustomer = customer.split("-");
        Restaurant x = res.AmbilData(dataRestaurant[0].toString());
        Customer y = c.AmbilData(dataCustomer[0].toString());
        System.out.println(x);
        System.out.println(c);
        String cek = "Benar";
        for (int i = 0; i < listBooking.size(); i++) {
            String[] data = listBooking.get(i).split(";");
            String jamData = data[4].split(":")[0];
            String menitData = data[4].split(":")[1];
            if (data[2].equals(tanggal) && data[5].equals(dataRestaurant[0]) && data[12].equals(dataCustomer[0]) && jamData.equals(jam) && menitData.equals(menit)) {
                cek = "Salah";
                break;
            }
        }
        return cek;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "TambahBookingPreOrder")
    public void TambahBookingPreOrder(@WebParam(name = "restaurant") String restaurant, @WebParam(name = "customer") String customer,
            @WebParam(name = "tanggal") String tanggal, @WebParam(name = "jumlahMeja") int jumlahMeja, @WebParam(name = "time") String time,
            @WebParam(name = "menu") ArrayList<String> menu) throws ParseException {
        //TODO write your implementation code here:
        ArrayList<String> check = b.MaxId();
        String[] dataCheck = check.get(0).split(";");
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date d = date.parse(tanggal);
        String jam = time.split(":")[0];
        String menit = time.split(":")[1];
        String[] dataRestaurant = restaurant.split("-");
        String[] dataCustomer = customer.split("-");
        Restaurant x = res.AmbilData(dataRestaurant[0].toString());
        Customer y = c.AmbilData(dataCustomer[0].toString());
        Booking bo = null;
        if (dataCheck[0].equals("0")) {
            bo = new Booking((1), jumlahMeja, d, y, x, "sudahpesan", time);
        } else {
            bo = new Booking((Integer.parseInt(dataCheck[1]) + 1), jumlahMeja, d, y, x, "sudahpesan", time);
        }
        for (String i : menu) {
            String[] data = i.split(";");
            Menu men = new Menu(Integer.parseInt(data[0]), data[1], x, Double.parseDouble(data[3]));
            bo.TambahPreOrder(men, Integer.parseInt(data[2]));
        }
        bo.insertData();

    }

    @WebMethod(operationName = "DisplayBookingCari")
    public ArrayList<String> DisplayBookingCari(@WebParam(name = "kriteria") String kriteria, @WebParam(name = "value") String value) {
        //TODO write your implementation code here:
        listBooking = b.DisplaytoStringCari(kriteria, value);
        return listBooking;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayCountBookingByCustomer")
    public ArrayList<String> DisplayCountBookingByCustomer() {
        //TODO write your implementation code here:
        listBooking = b.DisplayCountBookingByCustomer();
        return listBooking;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayCountBookingByRestoran")
    public ArrayList<String> DisplayCountBookingByRestoran() {
        //TODO write your implementation code here:
        listBooking = b.DisplayCountBookingByRestoran();
        return listBooking;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayCountTanggalBooking")
    public String DisplayCountTanggalBooking() {
        //TODO write your implementation code here:
        ArrayList<String> month = b.DisplayCountMonthBooking();
        ArrayList<String> year = b.DisplayCountYearBooking();
        String str = "";

        for (String i : year) {
            String[] dataY = i.split("-");
            str += "    ◼ Tahun " + dataY[0] + ": (" + dataY[1] + ") \n";
            for (String j : month) {
                String[] dataM = j.split("-");
                if (dataY[0].equals(dataM[0])) {
                    str += "         ◻ " + dataM[1] + " : (" + dataM[2] + ") \n";
                }
            }
        }

        return str;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateKeteranganBooking")
    public void UpdateKeteranganBooking(@WebParam(name = "kode") String kode) {
        //TODO write your implementation code here:
        Booking book = b.AmbilData(kode);
        book.UpdatetData();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateKeteranganPreOrder")
    public void UpdateKeteranganPreOrder(@WebParam(name = "kode") String kode) {
        //TODO write your implementation code here:
        p.UpdateKeterangan("belumcetak",kode);
    }
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplaySelesai")
    public ArrayList<String> DisplaySelesai(@WebParam(name = "kode") String kode) {
        //TODO write your implementation code here:
        listBooking = b.DisplaytoStringSelesai(kode);
        return listBooking;
    }

}
