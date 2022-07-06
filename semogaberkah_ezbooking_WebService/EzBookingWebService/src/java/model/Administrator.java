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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author billf
 */
public class Administrator {

    /**
     * @return the id
     */
    private int id;
    private String name;
    private String username;
    private String password;

    Connection connect;
    Statement stat;
    ResultSet result;

    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public Administrator() {
        this.connect = this.getConnection();
    }

    public Administrator(String _username, String _password) {
        username = _username;
        password = _password;
        this.connect = this.getConnection();
    }

    public Administrator(int _id, String _name, String _username, String _password) {
        id = _id;
        name = _name;
        username = _username;
        password = _password;
    }

    public Connection getConnection() {
        if (this.connect == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); //hps cj
                connect=DriverManager.getConnection("jdbc:mysql://localhost/semogaberkah_ezbooking", "root", "");
            } catch (Exception ex) {
                System.out.println("error:" + ex);
            }
        }
        return connect;
    }

    public boolean CheckLogin() {
        //
        try {
            stat = (Statement) connect.createStatement();
            PreparedStatement sql = (PreparedStatement) connect.prepareStatement("select * from administrators where username=? and password=?");
            sql.setString(1, this.username);
            sql.setString(2, this.password);

            result = sql.executeQuery();

            if (result.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("error:" + e);
        }
        return true;
    }
}
