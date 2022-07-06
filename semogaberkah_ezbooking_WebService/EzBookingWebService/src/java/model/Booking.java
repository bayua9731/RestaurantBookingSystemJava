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
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author billf
 */
public class Booking {

    int id;
    int jumlah_meja_dipesan;
    Date tanggal_pemesanan;
    Customer customer;
    Restaurant restaurant;
    String keterangan;
    String jam_pemesanan;
    ArrayList<PreOrder> listPreOrder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJumlah_meja_dipesan() {
        return jumlah_meja_dipesan;
    }

    public void setJumlah_meja_dipesan(int jumlah_meja_dipesan) {
        this.jumlah_meja_dipesan = jumlah_meja_dipesan;
    }

    public Date getTanggal_pemesanan() {
        return tanggal_pemesanan;
    }

    public void setTanggal_pemesanan(Date tanggal_pemesanan) {
        this.tanggal_pemesanan = tanggal_pemesanan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getJam_pemesanan() {
        return jam_pemesanan;
    }

    public void setJam_pemesanan(String jam_pemesanan) {
        this.jam_pemesanan = jam_pemesanan;
    }

    public ArrayList<PreOrder> getListPreOrder() {
        return listPreOrder;
    }

    private void setListPreOrder(ArrayList<PreOrder> listPreOrder) {
        this.listPreOrder = listPreOrder;
    }

    public Booking(int id, int jumlah_meja_dipesan, Date tanggal_pemesanan, Customer customer, Restaurant restaurant, String keterangan, String jam_pemesanan) {
        this.id = id;
        this.jumlah_meja_dipesan = jumlah_meja_dipesan;
        this.tanggal_pemesanan = tanggal_pemesanan;
        this.customer = customer;
        this.restaurant = restaurant;
        this.keterangan = keterangan;
        this.jam_pemesanan = jam_pemesanan;
        this.listPreOrder = new ArrayList<>();
        getConnection();
    }

    public Booking(int jumlah_meja_dipesan, Date tanggal_pemesanan, Customer customer, Restaurant restaurant, String keterangan, String jam_pemesanan) {
        this.jumlah_meja_dipesan = jumlah_meja_dipesan;
        this.tanggal_pemesanan = tanggal_pemesanan;
        this.customer = customer;
        this.restaurant = restaurant;
        this.keterangan = keterangan;
        this.jam_pemesanan = jam_pemesanan;
        this.listPreOrder = new ArrayList<>();
        getConnection();
    }

    public Booking() {
        getConnection();
    }

    protected static Connection conn;
    protected Statement statement;
    protected ResultSet res;
    protected Statement statement2;
    protected ResultSet res2;

    private Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:mysql://localhost/semogaberkah_ezbooking", "root", "");
            } catch (Exception e) {
                System.out.println("Gagal Koneksi B");
            }
        }
        return conn;
    }

    //Insert Data
    public void insertData() {
        try {
            System.out.println(conn);
            if (!conn.isClosed()) {
                statement = (Statement) conn.createStatement();
                PreparedStatement sql = (PreparedStatement) conn.prepareStatement("INSERT INTO "
                        + "bookings (id,tanggal_pemesanan,jumlah_meja_dipesan,keterangan,jam_pemesanan,customers_id,partner_restorans_id ) "
                        + "VALUES(?,?,?,?,?,?,?)");
                sql.setInt(1, this.id);
                sql.setDate(2, new java.sql.Date(this.tanggal_pemesanan.getTime()));
                sql.setInt(3, this.jumlah_meja_dipesan);
                sql.setString(4, this.keterangan);
                sql.setString(5, this.jam_pemesanan);
                sql.setInt(6, this.customer.getId());
                sql.setInt(7, this.restaurant.getId());

                sql.executeUpdate();
                for (int i = 0; i < this.listPreOrder.size(); i++) {
                    PreOrder data = this.listPreOrder.get(i);
                    statement2 = (Statement) conn.createStatement();
                    PreparedStatement sql2 = (PreparedStatement) conn.prepareStatement("INSERT INTO "
                            + "pre_orders(bookings_id,menu_id,jumlah,keterangan)"
                            + " VALUES(?,?,?,?)");
                    sql2.setInt(1, this.id);
                    sql2.setInt(2, data.getMenu().getId());
                    sql2.setDouble(3, data.getJumlah());
                    sql2.setString(4, "belumcetak");
                    sql2.executeUpdate();
                }
                sql.close();
            }
        } catch (Exception e) {
            System.out.println("Error Insert Data " + e.getMessage());
        }
    }

    //Insert Data
    public void UpdatetData() {
        try {
            System.out.println(conn);
            String next = "";
            if (!conn.isClosed()) {
                statement = (Statement) conn.createStatement();
                if (this.keterangan.equals("sudahpesan")) {
                    next = "sudahdatang";
                } else if (this.keterangan.equals("sudahdatang")) {
                    next = "selesai";
                }
                PreparedStatement sql = (PreparedStatement) conn.prepareStatement("update bookings set keterangan='" + next + "' where id=?");
                sql.setInt(1, this.id);
                sql.executeUpdate();
                sql.close();
            }
        } catch (Exception e) {
            System.out.println("Error update " + e.getMessage());
        }
    }

    public ArrayList<String> DisplaytoString() {
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Menu> arrayMenu = new ArrayList<>();
        Customer cust = new Customer();
        Restaurant rest = new Restaurant();
        Menu m = new Menu();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from bookings as b inner join partner_restorans as p on p.id=b.partner_restorans_id "
                    + "inner join customers as c on c.id=b.customers_id");
            while (res.next()) {
                Customer c = cust.AmbilData(String.valueOf(res.getInt(6)));
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(7)));

                Booking b = new Booking(res.getInt(1),
                        res.getInt("jumlah_meja_dipesan"),
                        res.getDate("tanggal_pemesanan"),
                        c,
                        r,
                        res.getString("keterangan"),
                        res.getString("jam_pemesanan"));
                statement2 = (Statement) conn.createStatement();

                res2 = statement2.executeQuery("select * from pre_orders where bookings_id=" + b.id);
                String x = "";
                while (res2.next()) {
                    arrayMenu = m.DisplayMenu(res2.getString("menu_id"));
                    b.TambahPreOrder(arrayMenu.get(0), res2.getInt("jumlah"));
                    x += (arrayMenu.get(0).getNama() + ";" + res2.getInt("jumlah") + "$$");
                }
                array.add(b.id + ";" + b.jumlah_meja_dipesan + ";" + b.tanggal_pemesanan.toString()
                        + ";" + b.keterangan + ";" + b.jam_pemesanan
                        + ";" + r.id + ";" + r.nama_pemilik
                        + ";" + r.nama_restoran + ";" + r.alamat
                        + ";" + r.username + ";" + r.password + ";" + r.jumlah_meja
                        + ";" + c.id + ";" + c.name
                        + ";" + c.username + ";" + c.password + "!makan!" + x);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public ArrayList<String> DisplaytoStringMenu(String kode) {
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Menu> arrayMenu = new ArrayList<>();
        Customer cust = new Customer();
        Restaurant rest = new Restaurant();
        Menu m = new Menu();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from bookings as b inner join partner_restorans as p on p.id=b.partner_restorans_id "
                    + "inner join customers as c on c.id=b.customers_id where b.id=" + kode);
            if (res.next()) {
                Customer c = cust.AmbilData(String.valueOf(res.getInt(6)));
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(7)));

                Booking b = new Booking(res.getInt(1),
                        res.getInt("jumlah_meja_dipesan"),
                        res.getDate("tanggal_pemesanan"),
                        c,
                        r,
                        res.getString("keterangan"),
                        res.getString("jam_pemesanan"));

                statement2 = (Statement) conn.createStatement();
                res2 = statement2.executeQuery("select * from pre_orders where bookings_id=" + b.id);
                while (res2.next()) {
                    arrayMenu = m.DisplayMenu(res2.getString("menu_id"));
                    b.TambahPreOrder(arrayMenu.get(0), res2.getInt("jumlah"));
                    array.add(arrayMenu.get(0).getNama() + ";" + res2.getInt("jumlah"));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public ArrayList<String> DisplayPilihan(String kodeRestaurant, String kriteria, String value) {
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Menu> arrayMenu = new ArrayList<>();
        Customer cust = new Customer();
        Restaurant rest = new Restaurant();
        Menu m = new Menu();
        try {
            statement = (Statement) conn.createStatement();

            if (kriteria.equals("tidak")) {
                res = statement.executeQuery("select * from bookings as b inner join partner_restorans as p on p.id=b.partner_restorans_id "
                        + "inner join customers as c on c.id=b.customers_id where b.partner_restorans_id=" + kodeRestaurant + " and b.keterangan<>'selesai'");
            } else {
                res = statement.executeQuery("select * from bookings as b inner join partner_restorans as p on p.id=b.partner_restorans_id "
                        + "inner join customers as c on c.id=b.customers_id where b.partner_restorans_id=" + kodeRestaurant + " and b.keterangan<>'selesai' and " + kriteria + " like '%" + value + "%'");

            }
            while (res.next()) {
                Customer c = cust.AmbilData(String.valueOf(res.getInt(6)));
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(7)));

                Booking b = new Booking(res.getInt(1),
                        res.getInt("jumlah_meja_dipesan"),
                        res.getDate("tanggal_pemesanan"),
                        c,
                        r,
                        res.getString("keterangan"),
                        res.getString("jam_pemesanan"));
                statement2 = (Statement) conn.createStatement();

                res2 = statement2.executeQuery("select * from pre_orders where bookings_id=" + b.id);
                String x = "";
                while (res2.next()) {
                    arrayMenu = m.DisplayMenu(res2.getString("menu_id"));
                    b.TambahPreOrder(arrayMenu.get(0), res2.getInt("jumlah"));
                    x += (arrayMenu.get(0).getNama() + ";" + res2.getInt("jumlah") + "$$");
                }
                array.add(b.id + ";" + b.jumlah_meja_dipesan + ";" + b.tanggal_pemesanan.toString()
                        + ";" + b.keterangan + ";" + b.jam_pemesanan
                        + ";" + r.id + ";" + r.nama_pemilik
                        + ";" + r.nama_restoran + ";" + r.alamat
                        + ";" + r.username + ";" + r.password + ";" + r.jumlah_meja
                        + ";" + c.id + ";" + c.name
                        + ";" + c.username + ";" + c.password + "!makan!" + x);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public ArrayList<String> DisplayPilihanCustomer(String kodecustomer) {
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Menu> arrayMenu = new ArrayList<>();
        Customer cust = new Customer();
        Restaurant rest = new Restaurant();
        Menu m = new Menu();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from bookings as b inner join partner_restorans as p on p.id=b.partner_restorans_id "
                    + "inner join customers as c on c.id=b.customers_id where b.customers_id=" + kodecustomer);
            while (res.next()) {
                Customer c = cust.AmbilData(String.valueOf(res.getInt(6)));
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(7)));

                Booking b = new Booking(res.getInt(1),
                        res.getInt("jumlah_meja_dipesan"),
                        res.getDate("tanggal_pemesanan"),
                        c,
                        r,
                        res.getString("keterangan"),
                        res.getString("jam_pemesanan"));
                statement2 = (Statement) conn.createStatement();

                res2 = statement2.executeQuery("select * from pre_orders where bookings_id=" + b.id);
                String x = "";
                while (res2.next()) {
                    arrayMenu = m.DisplayMenu(res2.getString("menu_id"));
                    b.TambahPreOrder(arrayMenu.get(0), res2.getInt("jumlah"));
                    x += (arrayMenu.get(0).getNama() + ";" + res2.getInt("jumlah") + "$$");
                }
                array.add(b.id + ";" + b.jumlah_meja_dipesan + ";" + b.tanggal_pemesanan.toString()
                        + ";" + b.keterangan + ";" + b.jam_pemesanan
                        + ";" + r.id + ";" + r.nama_pemilik
                        + ";" + r.nama_restoran + ";" + r.alamat
                        + ";" + r.username + ";" + r.password + ";" + r.jumlah_meja
                        + ";" + c.id + ";" + c.name
                        + ";" + c.username + ";" + c.password + "!makan!" + x);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public void TambahPreOrder(Menu m, int jumlah) {
        PreOrder po = new PreOrder(m, jumlah);
        this.listPreOrder.add(po);
    }

    public ArrayList<String> DisplaytoStringCari(String kriteria, String value) {
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Menu> arrayMenu = new ArrayList<>();
        Customer cust = new Customer();
        Restaurant rest = new Restaurant();
        Menu m = new Menu();
        try {
            statement = (Statement) conn.createStatement();
            if (kriteria.equals("tidak")) {
                res = statement.executeQuery("select * from bookings as b inner join partner_restorans as p on p.id=b.partner_restorans_id "
                        + "inner join customers as c on c.id=b.customers_id");
            } else {
                res = statement.executeQuery("select * from bookings as b inner join partner_restorans as p on p.id=b.partner_restorans_id "
                        + "inner join customers as c on c.id=b.customers_id where " + kriteria + " like '%" + value + "%'");
            }

            while (res.next()) {
                Customer c = cust.AmbilData(String.valueOf(res.getInt(6)));
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(7)));

                Booking b = new Booking(res.getInt(1),
                        res.getInt("jumlah_meja_dipesan"),
                        res.getDate("tanggal_pemesanan"),
                        c,
                        r,
                        res.getString("keterangan"),
                        res.getString("jam_pemesanan"));
                statement2 = (Statement) conn.createStatement();

                res2 = statement2.executeQuery("select * from pre_orders where bookings_id=" + b.id);
                String x = "";
                while (res2.next()) {
                    arrayMenu = m.DisplayMenu(res2.getString("menu_id"));
                    b.TambahPreOrder(arrayMenu.get(0), res2.getInt("jumlah"));
                    x += (arrayMenu.get(0).getNama() + ";" + res2.getInt("jumlah") + "$$");
                }
                array.add(b.id + ";" + b.jumlah_meja_dipesan + ";" + b.tanggal_pemesanan.toString()
                        + ";" + b.keterangan + ";" + b.jam_pemesanan
                        + ";" + r.id + ";" + r.nama_pemilik
                        + ";" + r.nama_restoran + ";" + r.alamat
                        + ";" + r.username + ";" + r.password + ";" + r.jumlah_meja
                        + ";" + c.id + ";" + c.name
                        + ";" + c.username + ";" + c.password + "!makan!" + x);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public ArrayList<String> DisplayCountBookingByCustomer() {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select nama_customer, COUNT(nama_customer) from bookings as b "
                    + "inner join partner_restorans as p on p.id=b.partner_restorans_id "
                    + "inner join customers as c on c.id=b.customers_id GROUP BY nama_customer ORDER BY COUNT(nama_customer) DESC;");
            while (res.next()) {
                array.add(res.getString(1) + "-" + res.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public ArrayList<String> DisplayCountBookingByRestoran() {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select nama_restoran, COUNT(nama_restoran) AS count from bookings as b "
                    + "inner join partner_restorans as p on p.id=b.partner_restorans_id inner join customers as c on c.id=b.customers_id "
                    + "GROUP BY nama_restoran ORDER BY count DESC");
            while (res.next()) {
                array.add(res.getString(1) + "-" + res.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public ArrayList<String> DisplayCountYearBooking() {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select year(tanggal_pemesanan) year, COUNT(*) c from bookings GROUP BY year ASC;");
            while (res.next()) {
                array.add(res.getString(1) + "-" + res.getString(2));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public ArrayList<String> DisplayCountMonthBooking() {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select year(tanggal_pemesanan) as year, MONTHNAME(tanggal_pemesanan) as month, COUNT(*) as count from bookings group by year, month ASC;");
            while (res.next()) {
                array.add(res.getString(1) + "-" + res.getString(2) + "-" + res.getString(3));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

    public Booking AmbilData(String kode) {
        Booking b = null;
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Menu> arrayMenu = new ArrayList<>();
        Customer cust = new Customer();
        Restaurant rest = new Restaurant();
        Menu m = new Menu();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from bookings as b inner join partner_restorans as p on p.id=b.partner_restorans_id "
                    + "inner join customers as c on c.id=b.customers_id where b.id=" + kode);
            if (res.next()) {
                Customer c = cust.AmbilData(String.valueOf(res.getInt(6)));
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(7)));

                b = new Booking(res.getInt(1),
                        res.getInt("jumlah_meja_dipesan"),
                        res.getDate("tanggal_pemesanan"),
                        c,
                        r,
                        res.getString("keterangan"),
                        res.getString("jam_pemesanan"));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return b;
    }

    public ArrayList<String> MaxId() {
        ArrayList<String> array = new ArrayList<>();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select count(id),max(id) from bookings");
            if (res.next()) {
                array.add(res.getString(1) + ";" + res.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }
    
    public ArrayList<String> DisplaytoStringSelesai(String kode) {
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Menu> arrayMenu = new ArrayList<>();
        Customer cust = new Customer();
        Restaurant rest = new Restaurant();
        Menu m = new Menu();
        try {
            statement = (Statement) conn.createStatement();
            res = statement.executeQuery("select * from bookings as b inner join partner_restorans as p on p.id=b.partner_restorans_id "
                    + "inner join customers as c on c.id=b.customers_id where b.keterangan='selesai' and b.partner_restorans_id=" + kode);

            while (res.next()) {
                Customer c = cust.AmbilData(String.valueOf(res.getInt(6)));
                Restaurant r = rest.AmbilData(String.valueOf(res.getInt(7)));

                Booking b = new Booking(res.getInt(1),
                        res.getInt("jumlah_meja_dipesan"),
                        res.getDate("tanggal_pemesanan"),
                        c,
                        r,
                        res.getString("keterangan"),
                        res.getString("jam_pemesanan"));
                statement2 = (Statement) conn.createStatement();

                res2 = statement2.executeQuery("select * from pre_orders where bookings_id=" + b.id);
                String x = "";
                while (res2.next()) {
                    arrayMenu = m.DisplayMenu(res2.getString("menu_id"));
                    b.TambahPreOrder(arrayMenu.get(0), res2.getInt("jumlah"));
                    x += (arrayMenu.get(0).getNama() + ";" + res2.getInt("jumlah") + "$$");
                }
                array.add(b.id + ";" + b.jumlah_meja_dipesan + ";" + b.tanggal_pemesanan.toString()
                        + ";" + b.keterangan + ";" + b.jam_pemesanan
                        + ";" + r.id + ";" + r.nama_pemilik
                        + ";" + r.nama_restoran + ";" + r.alamat
                        + ";" + r.username + ";" + r.password + ";" + r.jumlah_meja
                        + ";" + c.id + ";" + c.name
                        + ";" + c.username + ";" + c.password + "!makan!" + x);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return array;
    }

}
