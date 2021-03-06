/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hendy
 */
public class HistoryPemesananCustomer extends javax.swing.JFrame {

    /**
     * Creates new form HistoryPemesananCustomer
     */
    public String c;
    
    public HistoryPemesananCustomer() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbCari = new javax.swing.JComboBox<>();
        txtCari = new javax.swing.JTextField();
        btnHistory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBooking = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCari1 = new javax.swing.JComboBox<>();
        txtCari1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHistory = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Booking Restaurant");

        jLabel2.setText("Cari berdasarkan :");

        cbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Restoran", "Alamat" }));

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnHistory.setText("History Transaksi");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        tableBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nama Restoran", "Alamat", "Jumlah Meja yang Tersedia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBooking);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("History Pemesanan ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 11, 170, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Cari berdasarkan :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, -1));

        cbCari1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbCari1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Restoran", "Tanggal" }));
        getContentPane().add(cbCari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 50, 120, -1));

        txtCari1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCari1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCari1KeyReleased(evt);
            }
        });
        getContentPane().add(txtCari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 50, 370, -1));

        tableHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama Restoran", "Tanggal", "Jumlah Meja yang Dipesan", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHistoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableHistory);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 76, 616, 300));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/table.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
//        // TODO add your handling code here:
//        try {
//            String selected = "";
//            switch (cbCari.getSelectedItem().toString()) {
//                case "Nama Restoran":
//                selected = "nama_restoran";
//                break;
//                case "Alamat":
//                selected = "alamat";
//                break;
//            }
//
//            System.out.println(selected);
//            com.ubaya.projectdistprog.RestaurantWS_Service service = new com.ubaya.projectdistprog.RestaurantWS_Service();
//            com.ubaya.projectdistprog.RestaurantWS port = service.getRestaurantWSPort();
//            DefaultTableModel model = (DefaultTableModel) tableBooking.getModel();
//            model.setRowCount(0);
//            Object[] rowData = new Object[4];
//
//            ArrayList<String> listModel = (ArrayList<String>) port.displayResCari(selected, txtCari.getText());
//            for (int i = 0; i < listModel.size(); i++) {
//                String[] data = listModel.get(i).split("-");
//                rowData[0] = data[0];
//                rowData[1] = data[2];
//                rowData[2] = data[3];
//                rowData[3] = data[6];
//                model.addRow(rowData);
//            }
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage());
//        }
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void tableBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBookingMouseClicked
//        // TODO add your handling code here:
//        try {
//            int baris = tableBooking.getSelectedRow();
//            TableModel model = tableBooking.getModel();
//            String id = (model.getValueAt(baris, 0).toString());
//            System.out.println(id);
//            com.ubaya.projectdistprog.RestaurantWS_Service service = new com.ubaya.projectdistprog.RestaurantWS_Service();
//            com.ubaya.projectdistprog.RestaurantWS port = service.getRestaurantWSPort();
//            ArrayList<String> cek=(ArrayList<String>) port.ambilData(id);
//            String[] data = port.ambilData(id).get(0).split("-");
//            int dialog = JOptionPane.showConfirmDialog(null,
//                "Apakah Anda Ingin Melakukan Pesanan Pada Restoran " + data[2] + " ?",
//                "Pesan Informasi",
//                JOptionPane.YES_NO_OPTION);
//
//            if (dialog == JOptionPane.YES_OPTION) {
//                FormBooking book= new FormBooking();
//                book.customer=kustomer;
//                book.restaurant=cek;
//                book.setVisible(true);
//            }
//        } catch (Exception Ex) {
//            JOptionPane.showMessageDialog(this, Ex.getMessage());
//        }
    }//GEN-LAST:event_tableBookingMouseClicked

    private void txtCari1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCari1KeyReleased
        try {
            String selected = "";
            switch (cbCari1.getSelectedItem().toString()) {
                case "Nama Restoran":
                    selected = "nama_restoran";
                    break;
                case "Tanggal":
                    selected = "tanggal_pemesanan";
                    break;
                default:
                    selected = "tidak";
                    break;
            }

            System.out.println(selected);
            com.ubaya.projectdistprog.BookingWS_Service service = new com.ubaya.projectdistprog.BookingWS_Service();
            com.ubaya.projectdistprog.BookingWS port = service.getBookingWSPort();
            DefaultTableModel model = (DefaultTableModel) tableHistory.getModel();
            model.setRowCount(0);
            Object[] rowData = new Object[5];

            ArrayList<String> listModel = (ArrayList<String>) port.displayBookingCari(selected, txtCari1.getText());
            System.out.println(listModel);
            for (int i = 0; i < listModel.size(); i++) {
                String[] data = listModel.get(i).split(";");
                rowData[0] = data[0];
                rowData[1] = data[7];
                rowData[2] = data[2];
                rowData[3] = data[1];
                rowData[4] = data[3];
                model.addRow(rowData);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_txtCari1KeyReleased

    private void tableHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHistoryMouseClicked
//        // TODO add your handling code here:
//        try {
//            int baris = tableBooking.getSelectedRow();
//            TableModel model = tableBooking.getModel();
//            String id = (model.getValueAt(baris, 0).toString());
//            System.out.println(id);
//            com.ubaya.projectdistprog.RestaurantWS_Service service = new com.ubaya.projectdistprog.RestaurantWS_Service();
//            com.ubaya.projectdistprog.RestaurantWS port = service.getRestaurantWSPort();
//            ArrayList<String> cek=(ArrayList<String>) port.ambilData(id);
//            String[] data = port.ambilData(id).get(0).split("-");
//            int dialog = JOptionPane.showConfirmDialog(null,
//                "Apakah Anda Ingin Melakukan Pesanan Pada Restoran " + data[2] + " ?",
//                "Pesan Informasi",
//                JOptionPane.YES_NO_OPTION);
//
//            if (dialog == JOptionPane.YES_OPTION) {
//                FormBooking book= new FormBooking();
//                book.customer=kustomer;
//                book.restaurant=cek;
//                book.setVisible(true);
//            }
//        } catch (Exception Ex) {
//            JOptionPane.showMessageDialog(this, Ex.getMessage());
//        }
    }//GEN-LAST:event_tableHistoryMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
        System.out.println(c);
        com.ubaya.projectdistprog.BookingWS_Service service = new com.ubaya.projectdistprog.BookingWS_Service();
        com.ubaya.projectdistprog.BookingWS port = service.getBookingWSPort();
        DefaultTableModel model = (DefaultTableModel) tableHistory.getModel();
        model.setRowCount(0);
        Object[] rowData = new Object[5];

        ArrayList<String> listModel = (ArrayList<String>) port.displayBook(c.split("-")[0]);
        System.out.println(listModel);
        for (int i = 0; i < listModel.size(); i++) {
            String[] data = listModel.get(i).split(";");
            rowData[0] = data[0];
            rowData[1] = data[7];
            rowData[2] = data[2];
            rowData[3] = data[1];
            rowData[4] = data[3];
            model.addRow(rowData);
        }
        } catch (Exception e) {
            System.out.println("Salah di History Open");
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HistoryPemesananCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryPemesananCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryPemesananCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryPemesananCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryPemesananCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistory;
    private javax.swing.JComboBox<String> cbCari;
    private javax.swing.JComboBox<String> cbCari1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableBooking;
    private javax.swing.JTable tableHistory;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCari1;
    // End of variables declaration//GEN-END:variables
}
