package gui.form;


import components.customerService.Customer;
import components.customerService.CustomerService;
import components.customerService.CustomerService;
import java.util.ArrayList;
import gui.card.ModelCard;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import components.mall.Contact;
import components.mall.Employee;
import components.mall.Mall;

public class Form_Customer extends javax.swing.JPanel {

    public Form_Customer() {
        initComponents();
        init();
      
    }

    private void init() {
        table.fixTable(jScrollPane1);
         for(int i = 0; i< Mall.getCustomers().size(); i++){
            table.addRow(new Object[]{Mall.getCustomers().get(i).getID(), 
                Mall.getCustomers().get(i).getInfo().getName(),Mall.getCustomers().get(i).getInfo().getSurname(),
                Mall.getCustomers().get(i).getInfo().getPhoneNumber(),Mall.getCustomers().get(i).getInfo().getEmail(),
                Mall.getCustomers().get(i).getInfo().getAddress(), Mall.getCustomers().get(i).getGiftToken()
             
            });

        }
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new gui.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new gui.swing.table.Table();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ADD_CUSTOMER = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Name = new javax.swing.JTextField();
        Surname = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        giftToken = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Surname", "Phone Number", "Address", "Email", "Gift Token"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setText("Search");

        ADD_CUSTOMER.setText("Add Customer");
        ADD_CUSTOMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_CUSTOMERActionPerformed(evt);
            }
        });

        Update.setText("Update Customer");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete Customer");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        Surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameActionPerformed(evt);
            }
        });

        PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberActionPerformed(evt);
            }
        });

        giftToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giftTokenActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Surname");

        jLabel4.setText("Email");

        jLabel5.setText("Phone Number");

        jLabel6.setText("Address");

        jLabel7.setText("Gift Token");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ADD_CUSTOMER, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Update)
                                .addGap(29, 29, 29)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(giftToken, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(jLabel1)
                                        .addGap(28, 28, 28)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(giftToken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADD_CUSTOMER)
                    .addComponent(Update)
                    .addComponent(Delete))
                .addGap(18, 18, 18)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       String searched = jTextField1.getText();
       searchSmt(searched);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void tablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablePropertyChange

    }//GEN-LAST:event_tablePropertyChange

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
         DefaultTableModel m = (DefaultTableModel) table.getModel();
         if(table.getSelectedRowCount() == 1){
             String name = String.valueOf(m.getValueAt(table.getSelectedRow(),1));
             Name.setText(name);
             String surname = String.valueOf(m.getValueAt(table.getSelectedRow(),2));
             Surname.setText(surname);
             String phone = String.valueOf(m.getValueAt(table.getSelectedRow(),3));
             PhoneNumber.setText(phone);
             String email = String.valueOf(m.getValueAt(table.getSelectedRow(),4));
             Email.setText(email);
             String adress = String.valueOf(m.getValueAt(table.getSelectedRow(),5));
             Address.setText(adress);
             String gift = String.valueOf(m.getValueAt(table.getSelectedRow(),6));
             giftToken.setText(gift);
            
         }
    }//GEN-LAST:event_tableMouseClicked

    private void clearTextBoxes(){
             Name.setText("");
             Surname.setText("");
             PhoneNumber.setText("");
             Email.setText("");
             Address.setText("");
             giftToken.setText("");
    }
    
    private void ADD_CUSTOMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_CUSTOMERActionPerformed
                
        DefaultTableModel m = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];
        
                if (Name.getText().equals("") || Surname.getText().equals("")||
                        PhoneNumber.getText().equals("")|| Address.getText().equals("") ||
                        Email.getText().equals(""))
                    return;
                
                
        row[0] = Mall.getCs().idGenerator();
                row[1] = Name.getText();
                row[2] = Surname.getText();
                row[3] = PhoneNumber.getText();
                row[5] = Address.getText();
                row[4] = Email.getText();
                row[6] = giftToken.getText();
                
        Customer cu = new Customer(Integer.parseInt(String.valueOf(row[0])), new Contact( Name.getText(),Surname.getText(),
        PhoneNumber.getText(),Email.getText(),Address.getText()),Integer.parseInt(String.valueOf(row[6])));
        if( Mall.getCs().customerSearch(PhoneNumber.getText()) == null){
            Mall.getCs().addCustomer(cu);
                m.insertRow(0, row);          
         Mall.getMall().fileReadingCustomer();
        }

        clearTextBoxes();
         
    }//GEN-LAST:event_ADD_CUSTOMERActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void SurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SurnameActionPerformed

    private void PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int i = table.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) table.getModel();
       
        Customer deleted = Mall.getCs().customerSearch(Integer.parseInt(String.valueOf(m.getValueAt(i, 0))));
        
        if(i >= 0) {
            m.removeRow(i);
        }
        if(deleted == null) return;
        Mall.getCs().deleteCustomer(deleted.getID());
        Mall.getMall().fileReadingCustomer();
        clearTextBoxes();
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        int i = table.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) table.getModel();
       
        if(i >= 0){
        m.setValueAt(Name.getText(),i,1);
        m.setValueAt(Surname.getText(),i,2);
        m.setValueAt(PhoneNumber.getText(),i,3);
        m.setValueAt(Address.getText(),i,5);
        m.setValueAt(Email.getText(),i,4);
        m.setValueAt(giftToken.getText(),i,6);
        }
        else return;
        
        Customer updated = Mall.getCs().customerSearch(Integer.parseInt(String.valueOf(m.getValueAt(i, 0))));
        
        updated.getInfo().setName(Name.getText());
        updated.getInfo().setSurname(Surname.getText());
        updated.getInfo().setAddress(Address.getText());
        updated.getInfo().setEmail(Email.getText());
        updated.setGiftToken(Integer.valueOf(giftToken.getText()));
         Mall.getMall().fileReadingCustomer();
        clearTextBoxes();
    }//GEN-LAST:event_UpdateActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        int i = table.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) table.getModel();
        Name.setText(m.getValueAt(i, 1).toString());
        Surname.setText(m.getValueAt(i, 2).toString());
        PhoneNumber.setText(m.getValueAt(i, 3).toString());
        Address.setText(m.getValueAt(i, 4).toString());
        Email.setText(m.getValueAt(i, 5).toString());
        giftToken.setText(m.getValueAt(i, 6).toString());
    }//GEN-LAST:event_UpdateMouseClicked

    private void giftTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giftTokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giftTokenActionPerformed

    
    public void searchSmt(String str){
      model = (DefaultTableModel) table.getModel();
      TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
      table.setRowSorter(trs);
      trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    DefaultTableModel model;
    private javax.swing.JPanel body;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_CUSTOMER;
    private javax.swing.JTextField Address;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JTextField Surname;
    private javax.swing.JButton Update;
    private javax.swing.JTextField giftToken;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private gui.swing.RoundPanel roundPanel1;
    private gui.swing.table.Table table;
    // End of variables declaration//GEN-END:variables

 
}
