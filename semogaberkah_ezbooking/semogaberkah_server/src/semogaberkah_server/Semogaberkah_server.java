/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semogaberkah_server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author hendy
 */
public class Semogaberkah_server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            com.ubaya.projectdistprog.CustomerWS_Service serviceCustomer = new com.ubaya.projectdistprog.CustomerWS_Service();
            com.ubaya.projectdistprog.CustomerWS portCustomer= serviceCustomer.getCustomerWSPort();
            
            com.ubaya.projectdistprog.AdministratorWS_Service serviceAdmin = new com.ubaya.projectdistprog.AdministratorWS_Service();
            com.ubaya.projectdistprog.AdministratorWS portAdmin= serviceAdmin.getAdministratorWSPort();
            
            com.ubaya.projectdistprog.RestaurantWS_Service serviceRestaurant = new com.ubaya.projectdistprog.RestaurantWS_Service();
            com.ubaya.projectdistprog.RestaurantWS portRestaurant= serviceRestaurant.getRestaurantWSPort();
            
            ServerSocket ss = new ServerSocket(65432);
            
            while(true){
                Socket s = ss.accept();

                BufferedReader msgFromClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
                DataOutputStream msgToClient = new DataOutputStream(s.getOutputStream());

                String message = "";
                message = msgFromClient.readLine();

                String[] messages = null;
                messages = message.split(";");

                String command = "";
                command = messages[0];
                System.out.println(command);
                if(command.equals("LOGINCUSTOMER")){
                    String hasil = portCustomer.checkLoginCustomer(messages[1], messages[2]);
                    msgToClient.writeBytes(hasil+"\n");
                }else if(command.equals("LOGINADMIN")){
                    String hasil = portAdmin.checkLoginAdministrator(messages[1], messages[2]);
                    msgToClient.writeBytes(hasil+"\n");
                }else if(command.equals("LOGINRESTAURANT")){
                    String hasil = portRestaurant.checkLogin(messages[1], messages[2]);
                    msgToClient.writeBytes(hasil+"\n");
                }else if(command.equals("REGISTERCUSTOMER")){
                    String hasil = portCustomer.checkRegisterCustomer(messages[1], messages[2], messages[3], messages[4], messages[5]);
                    msgToClient.writeBytes(hasil+"\n");
                }else if(command.equals("REGISTERRESTAURANT")){
                    String hasil = portRestaurant.checkRegister(messages[1], messages[2], messages[3], messages[4], messages[5], messages[6], Integer.parseInt(messages[7]), messages[8], messages[9]);
                    msgToClient.writeBytes(hasil+"\n");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal!");
        }
    }
    
}
