package main;

import gui.form.Form_Profile;
import gui.form.Form_Customer_Service;
import gui.form.Form_Stores;
import gui.form.Form_Business_Partner_Service_Display;
import gui.form.Form_Business_Partner_Service;
import gui.form.Form_Events_Create;
import gui.form.Form_Events_Display;
import gui.form.Form_Employee_Display;
import gui.form.Form_Contracts;
import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import gui.form.Form_Customer;
import gui.form.Form_Dashboard;
import gui.form.Form_Login;
import gui.menu.EventMenuSelected;
import gui.form.Form_Business_Partner;
import components.mall.Mall;
import components.mall.Event;

public class Main extends javax.swing.JFrame {
    private static Main main;
    public static int  mode = -1;
    public static boolean isLogged = false;
    public static int userId;
    public Main() {
        
            Mall.getMall();
            initComponents();
            init();
    }
    private void init() {
       
        main = this;
        titleBar.initJFram(this);
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if(mode == -1){
                    Form_Login tempLogin = new Form_Login();
                    showForm(tempLogin);
                }
                else{
                    if (index == 0 && indexSubMenu == 0)  showForm(new Form_Dashboard());
                    else if(index==1)showForm(new Form_Profile());
                    
                    if(mode == 1) {
                        if(index==2)
                            showForm(new Form_Customer_Service());
                        else if(index==3)
                            showForm(new Form_Business_Partner_Service());
                        else if(index==4) showForm(new Form_Events_Create());
                        else if(index==5) showForm(new Form_Stores()); 
                        else if(index==6)
                            showForm(new Form_Contracts());
                        else if(index==7)
                            showForm(new Form_Customer());
                         else if(index==8)
                            showForm(new Form_Business_Partner());
                        
                    
                    }
                    if(mode == 2) {
                        if(index==2)
                            showForm(new Form_Employee_Display());
                        else if(index==5)
                            showForm(new Form_Customer()); 
                         else if(index==6)
                            showForm(new Form_Business_Partner_Service_Display());  
                        else if(index == 3) showForm(new Form_Events_Display());
                        else if(index==4) showForm(new Form_Stores()); 
                    }
                    if(mode == 3) {
                        if(index==2)
                            showForm(new Form_Employee_Display());
                         else if(index==5)
                            showForm(new Form_Contracts());
                          else if(index==4) showForm(new Form_Stores()); // daha yapılmamış
                        else if(index==6)
                            showForm(new Form_Business_Partner());
                        else if(index == 3) showForm(new Form_Events_Display());
                    }   
                }
            }
        });
        menu.setSelectedIndex(0, 0);
    }
        public void showForm (Component com){
            body.removeAll();
            body.add(com);
            body.repaint();
            body.revalidate();
        }
    public static Main getMain() {
            return main;



    }
    
	
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        menu = new gui.menu.Menu();
        titleBar = new gui.swing.titlebar.TitleBar();
        jButton1 = new javax.swing.JButton();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(245, 245, 245));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(0, 0, 0))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            Main.getMain().dispose();
            Form_Login tempLogin = new Form_Login();
                    tempLogin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) throws FileNotFoundException, ParseException, IOException {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run(){
                    Form_Login tempLogin = new Form_Login();
                    tempLogin.setVisible(true);
                    if(mode != -1){
                        Main.getMain();
                    }
                    
                }


            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel body;
    private javax.swing.JButton jButton1;
    private gui.menu.Menu menu;
    private javax.swing.JPanel panelMenu;
    private gui.swing.titlebar.TitleBar titleBar;
    // End of variables declaration//GEN-END:variables
}
