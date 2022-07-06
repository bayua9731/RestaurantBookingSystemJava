/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static model.Booking.conn;

/**
 *
 * @author asus
 */
public class PreOrder {
    Menu menu;
    int jumlah;
    String keterangan;
    
    protected static Connection conn;
    protected Statement statement;
    protected ResultSet res;

    private Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:mysql://localhost/semogaberkah_ezbooking", "root", "");
            } catch (Exception e) {
                System.out.println("Gagal Koneksi");
            }
        }
        return conn;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public PreOrder(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
        this.keterangan="belumcetak";
        getConnection();
    }

    public PreOrder() {
        getConnection();
    }
    
    //Update 
    public void UpdateKeterangan(String ket,String kode){
        try {
            System.out.println(conn);
            String next="";
            if (!conn.isClosed()) {
                statement = (Statement) conn.createStatement();
                if(ket.equals("belumcetak")){
                    next="cetak";
                }
                PreparedStatement sql = (PreparedStatement) conn.prepareStatement("update pre_orders set keterangan='"+next+"' where bookings_id=?");
                sql.setString(1, kode);
                sql.executeUpdate();
                sql.close();
            }
        } catch (Exception e) {
            System.out.println("Error update " + e.getMessage());
        }
    }
    
    
}
