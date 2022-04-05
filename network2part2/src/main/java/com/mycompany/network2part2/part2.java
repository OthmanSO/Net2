/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.network2part2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
/**
 *
 * @author Ammr6
 */
public class part2 extends javax.swing.JFrame  {

    /**
     * Creates new form part2
     */
    public part2() {
        initComponents();
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        note = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        page = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        contactTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 1000));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 1000));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("System info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("TCP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        page.setColumns(20);
        page.setRows(5);
        jScrollPane1.setViewportView(page);

        jRadioButton1.setText("Send GET");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Send POST");

        jButton3.setText("change contact");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            String data = sendData_GET("data=systeminfo");//http://127.0.0.1:90/Net2/Net2/dataGet.php?data=systeminfo
            System.err.println(data+"741255885555");
            String [] system_arr  =  data.split("\\|&\\|");
            String [] Field = {"Device Name","Description","Time","OID","Contact"};
            page.setText("");
            for(int i = 0 ; i < system_arr.length ; i++){
                page.append(Field[i] + " : " + system_arr[i] + '\n');
            }
        }if(jRadioButton2.isSelected()){
            String data = sendData_POST("http://127.0.0.1:90/Net2/Net2/dataGet.php","data","systeminfo");
            String [] system_arr  =  data.split("\\|&\\|");
            String [] Field = {"Device Name","Description","Time","OID","Contact"};
            page.setText("");
            for(int i = 0 ; i < system_arr.length ; i++){
                page.append(Field[i] + " : " + system_arr[i] + '\n');
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            String data = sendData_GET("data=TCP");//http://127.0.0.1:90/Net2/Net2/dataGet.php?data=TCP
            String [] system_arr  =  data.split("\\|&&&\\|");
            page.setText("tcpConnLocalAddress     tcpConnLocalPort                tcpConnRemAddress                tcpConnRemPort \n");
            for(int i = 0 ; i < system_arr.length ; i++){
                String [] row = system_arr[i].split(",");
                page.append(row[0] + "                                          " + row[1] + "                                          " + 
                        row[2] + "                                          " + row[3] + "                                          " +'\n');
            }
        }if(jRadioButton2.isSelected()){
            String data = sendData_POST("http://127.0.0.1:90/Net2/Net2/dataGet.php","data","TCP");
            System.out.println("hellooooooooooooooo"+data);
            String [] system_arr  =  data.split("\\|&&&\\|");
            page.setText("tcpConnLocalAddress     tcpConnLocalPort                tcpConnRemAddress                tcpConnRemPort \n");
            for(int i = 0 ; i < system_arr.length ; i++){
                String [] row = system_arr[i].split(",");
                page.append(row[0] + "                                          " + row[1] + "                                          " + 
                        row[2] + "                                          " + row[3] + "                                          " +'\n');
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(!contactTextField.getText().isEmpty()){
            if(jRadioButton1.isSelected()){
                String contactValue = contactTextField.getText();
                String data = sendData_GET("contact="+contactValue);//http://127.0.0.1:90/Net2/Net2/dataGet.php?data=TCP
                page.setText(data);
            }
            if(jRadioButton2.isSelected()){
                String contactValue = contactTextField.getText();
                String data = sendData_POST("http://127.0.0.1:90/Net2/Net2/dataGet.php","contact",contactValue);
                page.setText(data);
            }
        }else{
            JOptionPane.showMessageDialog(this,"the text feild is empty" );
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    //next code for send data with post 
    String contentStr = "application/x-www-form-urlencoded";
    String sendData_POST(String str,String var,String dataStr) {
 
        InputStream is;
        String urlStr = str;
        try {
            

            URL myURL = new URL(urlStr);
            URLConnection myConn = myURL.openConnection();
            myConn.setDoOutput(true);
            myConn.setDoInput(true);
            myConn.setRequestProperty("Content-Type", contentStr);
            myConn.setUseCaches(false);
            this.note.setText("POST: sending to " + str +" data:"+dataStr);
            BufferedOutputStream out = new BufferedOutputStream(myConn.getOutputStream());
            out.write((var+"="+dataStr).getBytes());//"ACTION=add&NUMPTS=2&DATA=L0001\nL0002");
            out.close();

            //out.close();
            String SS = "";
            int b = -1;

            String t = "";
            is = myConn.getInputStream();
            while ((b = is.read()) != -1) {
                    SS = SS + (char) b;
            }
            // this.jTextField1.setText(SS);
            return SS;
        } catch (Exception e) {
            System.out.println(e.toString());
            this.note.setText("Faild: exception");
            return null;
        }
    }
    
    //next code for send data with get
    String sendData_GET(String str) {
        DataInputStream dis;
        
        String urlString = "http://127.0.0.1:90/Net2/Net2/dataGet.php?"+str;
        System.err.println(urlString);
        try {
            URL u = new URL(urlString);
            this.note.setText("GET: sending to " + urlString);

            dis = new DataInputStream(u.openConnection().getInputStream());
            int b;
            String SS = "";
            URLConnection myConn = u.openConnection();
            InputStream is = myConn.getInputStream();
            while ((b = is.read()) != -1) {
                    SS = SS + (char) b;
            }
            return SS;
        } catch (Exception e) {
            //System.out.println(e.toString());
            this.note.setText("Faild: exception");
        }
return null;
    }
    
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
            java.util.logging.Logger.getLogger(part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new part2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField note;
    private javax.swing.JTextArea page;
    // End of variables declaration//GEN-END:variables

    private HttpRequest.BodyPublisher ofFormData(Map<Object, Object> data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
