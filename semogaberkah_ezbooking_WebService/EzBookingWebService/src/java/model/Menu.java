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
import java.util.ArrayList;
import java.util.List;
import static model.Customer.conn;

/**
 *
 * @author asus
 */
public class Menu {
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
    
    int id;
    String nama;
    Restaurant restaurant;
    double harga;

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Menu(int id, String nama, Restaurant restaurant,double harga) {
        this.id = id;
        this.nama = nama;
        this.restaurant = restaurant;
        this.harga=harga;
        getConnection();
    }

    public Menu(String nama, Restaurant restaurant,double harga) {
        this.nama = nama;
        this.restaurant = restaurant;
        this.harga=harga;
        getConnection();
    }

    public Menu() {
        getConnection();
    }

    
    
    
    public void insertData() {
        try {
            System.out.println(conn);
            if (!conn.isClosed()) {
                statement = (Statement) conn.createStatement();
                PreparedStatement sql = (PreparedStatement) conn.prepareStatement("INSERT INTO "
                        + "menu (nama_masakan,harga,partner_restorans_id) "
                        + "VALUE (?,?,?)");
                sql.setString(1,this.nama);
                sql.setDouble(2, this.harga);
                sql.setInt(3, this.restaurant.id);
                sql.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Error Insert Data " + e.getMessage());
        }
    }
    
    public ArrayList<String> DisplayMenuRestaurant(String kode) {
        ArrayList<String> array = new ArrayList<>();
        Restaurant rest = new Restaurant();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from menu where partner_restorans_id="+kode);
            while (res.next()) {
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(4)));
                Menu m=new Menu(res.getInt(1), 
                        res.getString(2),
                        r,res.getDouble("harga"));
                array.add(m.id+"-"+m.nama+"-"+m.harga+"-"+m.restaurant.nama_restoran);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }
    
    public ArrayList<Menu> DisplayMenu(String kode) {
        ArrayList<Menu> array = new ArrayList<>();
        Restaurant rest = new Restaurant();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from menu where id="+kode);
            while (res.next()) {
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(3)));
                Menu m=new Menu(res.getInt(1), 
                        res.getString(2),r,res.getDouble("harga"));
                array.add(m);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }
    
    public ArrayList<String> DisplayMenuSemua() {
        ArrayList<String> array = new ArrayList<>();
        Restaurant rest = new Restaurant();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from menu");
            while (res.next()) {
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(3)));
                Menu m=new Menu(res.getInt(1), 
                        res.getString(2),r,res.getDouble("harga"));
                array.add(m.id+"-"+m.nama+"-"+m.harga+"-"+m.restaurant.nama_restoran);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }
    
    
    
}
