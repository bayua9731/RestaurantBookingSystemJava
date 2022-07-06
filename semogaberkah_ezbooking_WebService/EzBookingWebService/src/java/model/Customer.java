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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author billf
 */
public class Customer {

    int id;
    String name;
    String nomor_telepon;
    String alamat;
    String username;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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

    public Customer(int id, String name, String nomor_telepon, String alamat, String username, String password) {
        this.id = id;
        this.name = name;
        this.nomor_telepon = nomor_telepon;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
        getConnection();
    }

    public Customer() {
        getConnection();
    }

    public Customer(int id, String name, String nomor_telepon, String alamat, String username) {
        this.id = id;
        this.name = name;
        this.nomor_telepon = nomor_telepon;
        this.alamat = alamat;
        this.username = username;
        getConnection();
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        getConnection();
    }

    public Customer(String name, String nomor_telepon, String alamat, String username, String password) {
        this.name = name;
        this.nomor_telepon = nomor_telepon;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
        getConnection();
    }

    protected static Connection conn;
    protected Statement statement;
    protected ResultSet res;

    private Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:mysql://localhost/semogaberkah_ezbooking", "root", "");
            } catch (Exception e) {
                System.out.println("Gagal Koneksi C");
            }
        }
        return conn;
    }

    public void insertData() {
        try {
            System.out.println(conn);
            if (!conn.isClosed()) {
                statement = (Statement) conn.createStatement();
                PreparedStatement sql = (PreparedStatement) conn.prepareStatement("INSERT INTO "
                        + "customers (nama_customer,nomor_telepon,alamat, username, password) "
                        + "VALUE (?,?,?,?,?)");
                sql.setString(1, this.name);
                sql.setString(2, this.nomor_telepon);
                sql.setString(3, this.alamat);
                sql.setString(4, this.username);
                sql.setString(5, this.password);
                sql.executeUpdate();
                sql.close();
            }
        } catch (Exception e) {
            System.out.println("Error Insert Data " + e.getMessage());
        }
    }

    //read
    public ArrayList<Object> bacaData() {
        ArrayList<Object> collections = new ArrayList<>();
        try {
            this.statement = (Statement) conn.createStatement();
            res = this.statement.executeQuery("SELECT * FROM customers'");
            while (res.next()) {
                Customer r = new Customer(
                        res.getInt("id"),
                        res.getString("nama_customer"),
                        res.getString("nomor_telepon"),
                        res.getString("alamat"),
                        res.getString("username")
                );
                collections.add(r);
            }
        } catch (Exception e) {
            System.out.println("Error Baca Data " + e.getMessage());
        }
        return collections;
    }

    //delete
    public void deleteData() {
        try {
            if (!conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) conn.prepareStatement("DELETE FROM "
                        + "customers WHERE id = '" + this.id + "'");
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
            res = this.statement.executeQuery("SELECT * FROM customers where username = '" + this.username + "' and password = '" + this.password + "'");
            while (res.next()) {
                Customer r = new Customer(
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

    public boolean CheckRegister() {
        try {
            this.statement = (Statement) conn.createStatement();
            res = this.statement.executeQuery("SELECT * FROM customers where username = '" + this.username + "'");
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
            res = statement.executeQuery("select * from customers");
            while (res.next()) {
                Customer c = new Customer(res.getInt("id"),
                        res.getString("nama_customer"),
                        res.getString("nomor_telepon"),
                        res.getString("alamat"),
                        res.getString("username"),
                        res.getString("password")
                );
                array.add(c.id + "-" + c.name + "-" + c.nomor_telepon + "-" + c.alamat + "-" + c.username + "-" + c.password);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    //Ambil Data by Kode
    public ArrayList<String> AmbilDatabyId(String kode) {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from customers where username='" + kode + "'");
            if (res.next()) {
                Customer c = new Customer(res.getInt("id"),
                        res.getString("nama_customer"),
                        res.getString("nomor_telepon"),
                        res.getString("alamat"),
                        res.getString("username"),
                        res.getString("password")
                );
                array.add(c.id + "-" + c.name + "-" + c.nomor_telepon + "-" + c.alamat + "-" + c.username + "-" + c.password);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public Customer AmbilData(String kode) {
        Customer c = null;
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from customers where id=" + kode);
            if (res.next()) {
                c = new Customer(res.getInt("id"),
                        res.getString("nama_customer"),
                        res.getString("nomor_telepon"),
                        res.getString("alamat"),
                        res.getString("username"),
                        res.getString("password")
                );
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

    public ArrayList<String> DisplaytoStringCari(String kriteria, String value) {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            if (kriteria.equals("tidak")) {
                res = statement.executeQuery("select * from customers");
            } else {

                res = statement.executeQuery("select * from customers where " + kriteria + " like '%" + value + "%'");
            }
            while (res.next()) {
                Customer c = new Customer(res.getInt("id"),
                        res.getString("nama_customer"),
                        res.getString("nomor_telepon"),
                        res.getString("alamat"),
                        res.getString("username"),
                        res.getString("password")
                );
                array.add(c.id + "-" + c.name + "-" + c.nomor_telepon + "-" + c.alamat + "-" + c.username + "-" + c.password);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }
}
