/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koureio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static koureio.Table_Creation.DdriverClassName;

/**
 *
 * @author john
 */
public class Koureio extends javax.swing.JFrame {

    
    public Koureio() throws Exception{
        initComponents();
        setSize(1250,890);
        setResizable(false);
        Admin_Log.setVisible(false);
        Register.setVisible(false);
        MyConnection();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Register = new javax.swing.JPanel();
        rusername = new javax.swing.JTextField();
        rpassword = new javax.swing.JPasswordField();
        rpassword2 = new javax.swing.JPasswordField();
        rname = new javax.swing.JTextField();
        rsurname = new javax.swing.JTextField();
        rnumber = new javax.swing.JTextField();
        raddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RegisterBack = new javax.swing.JButton();
        RegisterConfirm = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Admin_Log = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LogAdminName = new javax.swing.JTextField();
        LogAdminPass = new javax.swing.JPasswordField();
        AdminLogIn = new javax.swing.JButton();
        AdminBack = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        User_Log = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LogUserPass = new javax.swing.JPasswordField();
        RegisterGo = new javax.swing.JButton();
        AdminGo = new javax.swing.JButton();
        UserLogIn = new javax.swing.JButton();
        LogUserName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Register.add(rusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 200, 50));

        rpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Register.add(rpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 200, 50));

        rpassword2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rpassword2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Register.add(rpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 200, 50));

        rname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Register.add(rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 210, 50));

        rsurname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rsurname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Register.add(rsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 200, 50));

        rnumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rnumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Register.add(rnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 200, 50));

        raddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        raddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Register.add(raddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 210, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("USERNAME");
        Register.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("PASSWORD");
        Register.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("CONFIRM PASSWORD");
        Register.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("NAME");
        Register.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("SURNAME");
        Register.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("PHONE NUMBER");
        Register.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("ADDRESS");
        Register.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        RegisterBack.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        RegisterBack.setForeground(new java.awt.Color(153, 0, 0));
        RegisterBack.setText("CANCEL");
        RegisterBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBackActionPerformed(evt);
            }
        });
        Register.add(RegisterBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 220, 80));

        RegisterConfirm.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        RegisterConfirm.setForeground(new java.awt.Color(153, 0, 0));
        RegisterConfirm.setText("REGISTER");
        RegisterConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterConfirmActionPerformed(evt);
            }
        });
        Register.add(RegisterConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 210, 80));
        Register.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 99, -1, 205));

        jLabel12.setFont(new java.awt.Font("Bernard MT Condensed", 1, 100)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(161, 51, 53));
        jLabel12.setText("REGISTRATION");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(161, 51, 53), 3));
        jLabel12.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        Register.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 660, 130));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koureio/images/JAS6276.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        Register.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 890));

        Admin_Log.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koureio/images/login.PNG"))); // NOI18N
        Admin_Log.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 70, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koureio/images/password.PNG"))); // NOI18N
        Admin_Log.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        LogAdminName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogAdminName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LogAdminName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogAdminNameActionPerformed(evt);
            }
        });
        Admin_Log.add(LogAdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 280, 50));

        LogAdminPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogAdminPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Admin_Log.add(LogAdminPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 280, 50));

        AdminLogIn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        AdminLogIn.setForeground(new java.awt.Color(153, 0, 0));
        AdminLogIn.setText("LOG IN");
        AdminLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogInActionPerformed(evt);
            }
        });
        Admin_Log.add(AdminLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 190, 70));

        AdminBack.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        AdminBack.setForeground(new java.awt.Color(153, 0, 0));
        AdminBack.setText("BACK");
        AdminBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBackActionPerformed(evt);
            }
        });
        Admin_Log.add(AdminBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 200, 70));

        jLabel17.setFont(new java.awt.Font("Bernard MT Condensed", 1, 120)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(161, 51, 53));
        jLabel17.setText("ADMINISTRATOR");
        Admin_Log.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 860, 140));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koureio/images/IMG_8389.jpg"))); // NOI18N
        Admin_Log.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 930));

        User_Log.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koureio/images/login.PNG"))); // NOI18N
        User_Log.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 60, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koureio/images/password.PNG"))); // NOI18N
        User_Log.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 60, 70));

        LogUserPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogUserPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        User_Log.add(LogUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 280, 50));

        RegisterGo.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        RegisterGo.setForeground(new java.awt.Color(153, 0, 0));
        RegisterGo.setText("REGISTER");
        RegisterGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterGoActionPerformed(evt);
            }
        });
        User_Log.add(RegisterGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 160, 70));

        AdminGo.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        AdminGo.setForeground(new java.awt.Color(153, 0, 0));
        AdminGo.setText("ADMINISTRATOR");
        AdminGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminGoActionPerformed(evt);
            }
        });
        User_Log.add(AdminGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 180, 70));

        UserLogIn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        UserLogIn.setForeground(new java.awt.Color(153, 0, 0));
        UserLogIn.setText("LOG IN");
        UserLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLogInActionPerformed(evt);
            }
        });
        User_Log.add(UserLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 170, 70));

        LogUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LogUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogUserNameActionPerformed(evt);
            }
        });
        User_Log.add(LogUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 280, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koureio/images/Logo Barbershop.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        User_Log.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -220, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koureio/images/barbershop.jpg"))); // NOI18N
        User_Log.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 890));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(User_Log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Admin_Log, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(User_Log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Admin_Log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminGoActionPerformed
        ClearLogUser();
        User_Log.setVisible(false);
        Admin_Log.setVisible(true);
        Register.setVisible(false);
    }//GEN-LAST:event_AdminGoActionPerformed

    private void AdminBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBackActionPerformed
        User_Log.setVisible(true);
        Admin_Log.setVisible(false);
        Register.setVisible(false);
        ClearLogUser();
    }//GEN-LAST:event_AdminBackActionPerformed

    private void RegisterBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBackActionPerformed
        User_Log.setVisible(true);
        Admin_Log.setVisible(false);
        Register.setVisible(false);
        ClearRegister();
        ClearLogUser();
    }//GEN-LAST:event_RegisterBackActionPerformed

    private void RegisterGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterGoActionPerformed
        ClearLogUser();
        User_Log.setVisible(false);
        Admin_Log.setVisible(false);
        Register.setVisible(true);    }//GEN-LAST:event_RegisterGoActionPerformed

    private void RegisterConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterConfirmActionPerformed
        String UpdateString ="insert INTO USERS (username,password,name,surname,phone,address,type) VALUES (?,?,?,?,?,?,?)";
        try {
            boolean s1 = false,s2 = false;
          
              if(rpassword.getText().equals(rpassword2.getText())){
                  s1=true;
              }
              else{
                  Rfail1();
              }
              if(rusername.getText().equals("") || rpassword.getText().equals("") || rname.getText().equals("") || 
                      rsurname.getText().equals("") || rnumber.getText().equals("") || raddress.getText().equals("")){
                  Rfail2();
              }
              else{
                  s2=true;
              }
          if(s2==true && s1==true){
            
            DPstatement = DdbConnection.prepareStatement(UpdateString);
            DPstatement.setString(1,rusername.getText());
            if(rpassword.getText().equals(rpassword2.getText())){
                DPstatement.setString(2,rpassword.getText());
            }
            DPstatement.setString(3,rname.getText());
            DPstatement.setString(4,rsurname.getText());
            DPstatement.setString(5,rnumber.getText());
            DPstatement.setString(6,raddress.getText());
            DPstatement.setString(7,"Customer");
            int n= DPstatement.executeUpdate();
            Rsuccess();
            ClearRegister();
            User_Log.setVisible(true);
            Admin_Log.setVisible(false);
            Register.setVisible(false); 
          }  
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
	  while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		System.out.println("SQLState: " + ex.getSQLState());
		System.out.println("ErrorCode: " + ex.getErrorCode());
		ex = ex.getNextException();
		System.out.println("");
                Rfail3();
          }
        }finally{
            try {
                DPstatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Koureio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_RegisterConfirmActionPerformed

    private void UserLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLogInActionPerformed
        String UpdateString ="Select username from USERS where username='"+LogUserName.getText() +"'";
        try {
            Dstatement    = DdbConnection.createStatement(); 
            String user="";
            String pass="";
            String type="";
            boolean s1 = false;
              if(LogUserPass.getText().equals("")|| LogUserName.getText().equals("")){
                  UserLogfail1();
              }
              else{
                  s1=true;
              }
          if(s1==true){   
            rs= Dstatement.executeQuery(UpdateString);
            while(rs.next()){
                    user= rs.getString("username");     
                }
            if(user.equals(LogUserName.getText())){
                UpdateString ="Select password,type from USERS where username='"+LogUserName.getText()+"'";
                rs= Dstatement.executeQuery(UpdateString);
                while(rs.next()){
                    pass= rs.getString("password");
                    type=rs.getString("type");
                }
                if(pass.equals(LogUserPass.getText())){
                    if(type.equals("Customer")){
                    userlogin=LogUserName.getText();
                    UserLogSuccess();
                    User_Log ul=null;
                        try {
                            ul = new User_Log();
                        } catch (Exception ex) {
                            Logger.getLogger(Koureio.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    ul.setVisible(true);
                    DdbConnection.close();
                    dispose();
                    }
                    else{
                         UserLogfail4();
                    }
                }
                else{
                    UserLogfail2();
                }
            }
            else{
                UserLogfail3();
            }
          } 
          
        }catch(SQLException ex){
       
        }finally{
            try {
                ClearLogUser();
                Dstatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Koureio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_UserLogInActionPerformed

    private void LogUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogUserNameActionPerformed

    private void LogAdminNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogAdminNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogAdminNameActionPerformed

    private void AdminLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogInActionPerformed
        String UpdateString ="Select username from USERS where username='"+LogAdminName.getText() +"'";
        try {
            Dstatement    = DdbConnection.createStatement();
            String user="";
            String pass="";
            String type="";
            boolean s1 = false;
            if(LogAdminPass.getText().equals("")|| LogAdminName.getText().equals("")){
                UserLogfail1();
            }
            else{
                s1=true;
            }
            if(s1==true){
                rs= Dstatement.executeQuery(UpdateString);
                while(rs.next()){
                    user= rs.getString("username");
                }
                if(user.equals(LogAdminName.getText())){
                    UpdateString ="Select password,type from USERS where username='"+LogAdminName.getText()+"'";
                    rs= Dstatement.executeQuery(UpdateString);
                    while(rs.next()){
                        pass= rs.getString("password");
                        type=rs.getString("type");
                    }
                    if(pass.equals(LogAdminPass.getText())){
                        if(type.equals("Administrator")){
                            UserLogSuccess();
                            Admin_Log al =new Admin_Log();
                            al.setVisible(true);
                            al.setSize(600,600);
                            DdbConnection.close();
                            dispose();
                        }
                        else{
                            UserLogfail5();
                        }
                    }
                    else{
                        UserLogfail2();
                    }
                }
                else{
                    UserLogfail3();
                }
            }

        }catch(SQLException ex){

        } catch (Exception ex) {
            Logger.getLogger(Koureio.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ClearLogUser();
                Dstatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Koureio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_AdminLogInActionPerformed

       static String     DdriverClassName = "org.apache.derby.jdbc.ClientDriver" ;
       static String     Durl = "jdbc:derby://localhost:1527/Koureio" ;
       static Connection DdbConnection = null;
       static String     Dusername = "tejohny";
       static String     Dpasswd = "margoleta16";
       static Statement  Dstatement       = null;
       static PreparedStatement DPstatement =null; 
       static ResultSet rs=null;
       static String userlogin="";
    public static void main(String args[]) throws Exception {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Koureio().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Koureio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    //Connection Section

    public String getUserLogIn(){
        return userlogin;
    }

    void MyConnection() throws Exception{
       try{ 
        Class.forName (DdriverClassName); 
       }catch(ClassNotFoundException ex){
       }
        System.out.println(Dusername + " "+ Dpasswd+" "+ Durl);
        DdbConnection = DriverManager.getConnection (Durl, Dusername, Dpasswd);
    }
    //
    
    
    //Register Section
    void ClearRegister(){
        rusername.setText("");
        rpassword.setText("");
        rpassword2.setText("");
        rname.setText(""); 
        rsurname.setText("");
        rnumber.setText("");
        raddress.setText("");
    }
    public void Rsuccess(){
    JOptionPane.showMessageDialog(null,"Registration was Successful","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
    }
    public void Rfail1(){
    JOptionPane.showMessageDialog(null,"Passwords dont Match","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    public void Rfail2(){
    JOptionPane.showMessageDialog(null,"All of the fields must be filled","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    public void Rfail3(){
    JOptionPane.showMessageDialog(null,"That Username already exists ","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    //
    
    
    //User Log In Section
        
    public void UserLogSuccess(){
    JOptionPane.showMessageDialog(null,"Log In was successful","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
    }
    public void UserLogfail1(){
    JOptionPane.showMessageDialog(null,"All fields must be filled","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    public void UserLogfail2(){
    JOptionPane.showMessageDialog(null,"Password was incorect","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    public void UserLogfail3(){
    JOptionPane.showMessageDialog(null,"Username does not exist","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    public void UserLogfail4(){
    JOptionPane.showMessageDialog(null,"This is not a USER","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    public void UserLogfail5(){
    JOptionPane.showMessageDialog(null,"This is not an ADMINISTRATOR","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    void ClearLogUser(){
        LogUserName.setText("");
        LogUserPass.setText("");
        LogAdminName.setText("");
        LogAdminPass.setText("");
    }
      
    // 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBack;
    private javax.swing.JButton AdminGo;
    private javax.swing.JButton AdminLogIn;
    private javax.swing.JPanel Admin_Log;
    private javax.swing.JTextField LogAdminName;
    private javax.swing.JPasswordField LogAdminPass;
    private javax.swing.JTextField LogUserName;
    private javax.swing.JPasswordField LogUserPass;
    private javax.swing.JPanel Register;
    private javax.swing.JButton RegisterBack;
    private javax.swing.JButton RegisterConfirm;
    private javax.swing.JButton RegisterGo;
    private javax.swing.JButton UserLogIn;
    private javax.swing.JPanel User_Log;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField raddress;
    private javax.swing.JTextField rname;
    private javax.swing.JTextField rnumber;
    private javax.swing.JPasswordField rpassword;
    private javax.swing.JPasswordField rpassword2;
    private javax.swing.JTextField rsurname;
    private javax.swing.JTextField rusername;
    // End of variables declaration//GEN-END:variables
}
