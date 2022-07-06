/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author billf
 */
public class Restaurant {

    int id;
    String nama_pemilik;
    String nama_restoran;
    String alamat;
    String nomor_telepon;
    int jumlah_meja;
    String jam_buka;
    String jam_tutup;
    String username;
    String password;

    public String getJam_tutup() {
        return jam_tutup;
    }

    public void setJam_tutup(String jam_tutup) {
        this.jam_tutup = jam_tutup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_pemilik() {
        return nama_pemilik;
    }

    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    public String getNama_restaurant() {
        return nama_restoran;
    }

    public void setNama_restaurant(String nama_restaurant) {
        this.nama_restoran = nama_restaurant;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public int getJumlah_meja() {
        return jumlah_meja;
    }

    public void setJumlah_meja(int jumlah_meja) {
        this.jumlah_meja = jumlah_meja;
    }

    public String getJam_pemesanan() {
        return jam_buka;
    }

    public void setJam_pemesanan(String jam_pemesanan) {
        this.jam_buka = jam_pemesanan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Restaurant(int id, String nama_pemilik, String nama_restaurant, String alamat, String nomor_telepon, int jumlah_meja, String jam_pemesanan, String jam_tutup, String username, String password) {
        this.id = id;
        this.nama_pemilik = nama_pemilik;
        this.nama_restoran = nama_restaurant;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.jumlah_meja = jumlah_meja;
        this.jam_buka = jam_pemesanan;
        this.username = username;
        this.password = password;
        this.jam_tutup = jam_tutup;
        getConnection();
    }

    public Restaurant(String nama_pemilik, String nama_restaurant, String alamat, String nomor_telepon, int jumlah_meja, String jam_pemesanan, String jam_tutup, String username, String password) {
        this.nama_pemilik = nama_pemilik;
        this.nama_restoran = nama_restaurant;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.jumlah_meja = jumlah_meja;
        this.jam_buka = jam_pemesanan;
        this.jam_tutup = jam_tutup;
        this.username = username;
        this.password = password;
        getConnection();
    }

    public Restaurant(int id, String nama_pemilik, String nama_restoran, String alamat, String nomor_telepon, int jumlah_meja, String jam_buka, String jam_tutup) {
        this.id = id;
        this.nama_pemilik = nama_pemilik;
        this.nama_restoran = nama_restoran;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.jumlah_meja = jumlah_meja;
        this.jam_buka = jam_buka;

        this.jam_tutup = jam_tutup;
        getConnection();
    }

    public Restaurant(int id, String nama_pemilik, String nama_restoran, String alamat, String nomor_telepon, int jumlah_meja, String jam_buka, String jam_tutup, String username) {
        this.id = id;
        this.nama_pemilik = nama_pemilik;
        this.nama_restoran = nama_restoran;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.jumlah_meja = jumlah_meja;
        this.jam_buka = jam_buka;
        this.jam_tutup = jam_tutup;
        this.username = username;
        getConnection();
    }

    public Restaurant() {
        getConnection();
    }

    public Restaurant(String username, String password) {
        this.username = username;
        this.password = password;
        getConnection();
    }

    Connection conn;
    Statement statement;
    ResultSet res;

    private Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/semogaberkah_ezbooking", "root", "");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.out.println("Gagal Koneksi R");
        }
        return conn;
    }

    //create
    public void insertData() {
        try {
            statement = (Statement) conn.createStatement();
            try (PreparedStatement sql = (PreparedStatement) conn.prepareStatement("INSERT INTO "
                    + "partner_restorans (nama_pemilik, nama_restoran, alamat,nomor_telepon,"
                    + " jumlah_meja,jam_buka,jam_tutup,username, password)"
                    + "VALUE (?,?,?,?,?,?,?,?,?)")) {
                sql.setString(1, this.nama_pemilik);
                sql.setString(2, this.nama_restoran);
                sql.setString(3, this.alamat);
                sql.setString(4, this.nomor_telepon);
                sql.setInt(5, this.jumlah_meja);
                sql.setString(6, this.jam_buka);
                sql.setString(7, this.jam_tutup);
                sql.setString(8, this.username);
                sql.setString(9, this.password);
                sql.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Error Insert Data " + e.getMessage());
        }
    }

    //read
    /*
    public ArrayList<Object> bacaData() {
        ArrayList<Object> collections = new ArrayList<>();
        try {
            this.statement = (Statement) conn.createStatement();
            res = this.statement.executeQuery("SELECT * FROM partner_restorans'");
            while (res.next()) {
                Restaurant r = new Restaurant(
                        res.getInt("id"),
                        res.getString("nama_pemilik"),
                        res.getString("nama_restoran"),
                        res.getString("alamat"),
                        res.getString("nomor_telepon"),
                        //res.getString("username"),
                        //res.getString("password"),
                        res.getInt("jumlah_meja"),
                        res.getTime("jam_buka")
                );
                collections.add(r);
            }
        } catch (Exception e) {
            System.out.println("Error Baca Data " + e.getMessage());
        }
        return collections;
    }
     */
    //delete
    public void deleteData() {
        try {
            if (!conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) conn.prepareStatement("DELETE FROM "
                        + "partner_restorans WHERE id = '" + this.id + "'");
                sql.executeUpdate();
                sql.close();
            }
        } catch (Exception e) {
            System.out.println("Error Delete Data " + e.getMessage());
        }
    }

    //Check Login
    public ArrayList<Object> CheckLogin() {
        ArrayList<Object> collections = new ArrayList<>();
        try {
            this.statement = (Statement) conn.createStatement();
            res = this.statement.executeQuery("SELECT * FROM partner_restorans where username = '" + this.username + "' and password = '" + this.password + "'");
            while (res.next()) {
                Restaurant r = new Restaurant(
                        res.getString("username"),
                        res.getString("password")
                );
                collections.add(r);
            }
        } catch (Exception e) {
            System.out.println("Error Check Login " + e.getMessage());
        }
        return collections;
    }

    //Check Register
    public boolean CheckRegister() {
        try {
            this.statement = (Statement) conn.createStatement();
            res = this.statement.executeQuery("SELECT * FROM partner_restorans where username = '" + this.username + "'");
            if (res.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error Check Register " + e.getMessage());
        }
        return false;
    }

    //Display String
    public ArrayList<String> DisplaytoString() {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from partner_restorans");
            while (res.next()) {
                Restaurant r = new Restaurant(res.getInt("id"),
                        res.getString("nama_pemilik"),
                        res.getString("nama_restoran"),
                        res.getString("alamat"),
                        res.getString("nomor_telepon"),
                        //res.getString("password"),
                        res.getInt("jumlah_meja"),
                        res.getString("jam_buka"),
                        res.getString("jam_tutup"),
                        res.getString("username"));
                array.add(r.id + "-" + r.nama_pemilik + "-" + r.nama_restoran + "-" + r.alamat + "-" + r.nomor_telepon + "-" + r.username + "-" + r.jam_buka + "-" + r.jam_tutup + "-" + r.jumlah_meja);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public ArrayList<String> DisplaytoStringCari(String kriteria, String value) {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            if (kriteria.equals("tidak")) {
                res = statement.executeQuery("select * from partner_restorans");
            } else {
                res = statement.executeQuery("select * from partner_restorans where " + kriteria + " like '%" + value + "%'");

            }
            while (res.next()) {
                Restaurant r = new Restaurant(res.getInt("id"),
                        res.getString("nama_pemilik"),
                        res.getString("nama_restoran"),
                        res.getString("alamat"),
                        res.getString("nomor_telepon"),
                        //res.getString("password"),
                        res.getInt("jumlah_meja"),
                        res.getString("jam_buka"),
                        res.getString("jam_tutup"),
                        res.getString("username"));
                array.add(r.id + "-" + r.nama_pemilik + "-" + r.nama_restoran + "-" + r.alamat + "-" + r.nomor_telepon + "-" + r.username + "-" + r.jam_buka + "-" + r.jam_tutup + "-" + r.jumlah_meja);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public ArrayList<String> AmbilDatabyId(String kode) {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from partner_restorans where id='" + kode + "'");
            if (res.next()) {
                Restaurant r = new Restaurant(res.getInt("id"),
                        res.getString("nama_pemilik"),
                        res.getString("nama_restoran"),
                        res.getString("alamat"),
                        res.getString("nomor_telepon"),
                        //res.getString("password"),
                        res.getInt("jumlah_meja"),
                        res.getString("jam_buka"),
                        res.getString("jam_tutup"),
                        res.getString("username"));
                array.add(r.id + "-" + r.nama_pemilik + "-" + r.nama_restoran + "-" + r.alamat + "-" + r.nomor_telepon + "-" + r.username + "-" + r.jam_buka + "-" + r.jam_tutup + "-" + r.jumlah_meja);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }
    
    public ArrayList<String> AmbilDatabyUsername(String kode) {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from partner_restorans where username='" + kode + "'");
            if (res.next()) {
                Restaurant r = new Restaurant(res.getInt("id"),
                        res.getString("nama_pemilik"),
                        res.getString("nama_restoran"),
                        res.getString("alamat"),
                        res.getString("nomor_telepon"),
                        //res.getString("password"),
                        res.getInt("jumlah_meja"),
                        res.getString("jam_buka"),
                        res.getString("jam_tutup"),
                        res.getString("username"));
                array.add(r.id + "-" + r.nama_pemilik + "-" + r.nama_restoran + "-" + r.alamat + "-" + r.nomor_telepon + "-" + r.username + "-" + r.jam_buka + "-" + r.jam_tutup + "-" + r.jumlah_meja);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public Restaurant AmbilData(String kode) {
        Restaurant r = null;
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from partner_restorans where id=" + kode);
            if (res.next()) {
                r = new Restaurant(res.getInt("id"),
                        res.getString("nama_pemilik"),
                        res.getString("nama_restoran"),
                        res.getString("alamat"),
                        res.getString("nomor_telepon"),
                        //res.getString("password"),
                        res.getInt("jumlah_meja"),
                        res.getString("jam_buka"),
                        res.getString("jam_tutup"),
                        res.getString("username"));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return r;
    }
}
