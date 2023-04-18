package gui.form;


import components.businessPartnerService.BusinessPartner;
import components.businessPartnerService.BusinessPartnerService;
import gui.card.ModelCard;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import components.businessPartnerService.Contract;
import components.businessPartnerService.BusinessPartnerService;
import components.mall.Employee;
import components.mall.Mall;
import components.mall.Store;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Form_Contracts extends javax.swing.JPanel {

    public Form_Contracts() {
        initComponents();
        init();
      
    }

    private void init() {
        table.fixTable(jScrollPane1);
         for(int i = 0; i< Mall.getContracts().size(); i++){
            table.addRow(new Object[]{i+1, Mall.getContracts().get(i).getStore(), 
            Mall.getContracts().get(i).getCompany(), Mall.getContracts().get(i).getStartDate(), 
            Mall.getContracts().get(i).getEndDate(),   Mall.getContracts().get(i).getMonthlyPrice()
            });

        }
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new gui.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new gui.swing.table.Table();
        addContract = new javax.swing.JButton();
        updateContract = new javax.swing.JButton();
        deleteContract = new javax.swing.JButton();
        companyName = new javax.swing.JTextField();
        endDate = new javax.swing.JTextField();
        monthlyPrice = new javax.swing.JTextField();
        storeName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Store Name", "Company Name", "Start Date", "End Date", "Montly Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        addContract.setText("Add Contract");
        addContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addContractActionPerformed(evt);
            }
        });

        updateContract.setText("Update Contract");
        updateContract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateContractMouseClicked(evt);
            }
        });
        updateContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateContractActionPerformed(evt);
            }
        });

        deleteContract.setText("Delete Contract");
        deleteContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContractActionPerformed(evt);
            }
        });

        companyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameActionPerformed(evt);
            }
        });

        endDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateActionPerformed(evt);
            }
        });

        monthlyPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyPriceActionPerformed(evt);
            }
        });

        storeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Store");

        jLabel2.setText("Company");

        jLabel3.setText("Monthly Price");

        jLabel4.setText("End Date");

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel5.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addContract, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateContract)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteContract, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(monthlyPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(endDate))
                        .addGap(182, 182, 182))))
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(monthlyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addContract)
                    .addComponent(updateContract)
                    .addComponent(deleteContract))
                .addGap(18, 18, 18)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablePropertyChange

    }//GEN-LAST:event_tablePropertyChange

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
 DefaultTableModel m = (DefaultTableModel) table.getModel();
         if(table.getSelectedRowCount() == 1){
             String name = String.valueOf(m.getValueAt(table.getSelectedRow(),1));
             storeName.setText(name);
             String surname = String.valueOf(m.getValueAt(table.getSelectedRow(),2));
             companyName.setText(surname);
             String price = String.valueOf(m.getValueAt(table.getSelectedRow(),5));
             monthlyPrice.setText(price);
             String end = String.valueOf(m.getValueAt(table.getSelectedRow(),4));
             endDate.setText(end);
         }
    }//GEN-LAST:event_tableMouseClicked

     public void searchSmt(String str){
      model = (DefaultTableModel) table.getModel();
      TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
      table.setRowSorter(trs);
      trs.setRowFilter(RowFilter.regexFilter(str));
    }
     
    private void clearTextBoxes(){
             storeName.setText("");
             companyName.setText("");
             endDate.setText("");
             monthlyPrice.setText("");
    }
    private void addContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addContractActionPerformed
        
        if (storeName.getText().equals("") || companyName.getText().equals("")||
                        endDate.getText().equals("")|| monthlyPrice.getText().equals(""))
                    return;
        DefaultTableModel m = (DefaultTableModel) table.getModel();
        Object[] row = new Object[6];
               
            Calendar cal = Calendar.getInstance();
             String DATE_FORMAT_NOW = "MM-dd-yyyy";
             SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
            String today =  sdf.format(cal.getTime());
                Contract newC = new Contract(
                        storeName.getText(),companyName.getText(),Integer.parseInt(monthlyPrice.getText()),today,endDate.getText());
                
                Contract c = Mall.getBp().addContract(newC);
   
                if (c == null) return;
                 row[0] = 0;
                row[1] = storeName.getText();
                row[2] = companyName.getText();
                row[4] = endDate.getText();
                row[5] = monthlyPrice.getText();
                // add row to the model
                m.insertRow(0, row);
                
            
            Mall.getMall().fileReadingContract();
            clearTextBoxes();
                 
                        

         
    }//GEN-LAST:event_addContractActionPerformed
 
    private void companyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyNameActionPerformed

    private void endDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateActionPerformed

    private void monthlyPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlyPriceActionPerformed

    private void deleteContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteContractActionPerformed
        int i = table.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) table.getModel();

        Contract deleted = Mall.getBp().contractSearch(String.valueOf(m.getValueAt(i, 1)));
        if(deleted == null) return;
        
        if(i >= 0) {
            m.removeRow(i);
        }
        
        Mall.getBp().deleteContract(deleted);
        Mall.getMall().fileReadingContract();
        clearTextBoxes();
    }//GEN-LAST:event_deleteContractActionPerformed

    private void updateContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateContractActionPerformed
          int i = table.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) table.getModel();
         if (storeName.getText().equals("") || companyName.getText().equals("")||
                        endDate.getText().equals("")|| monthlyPrice.getText().equals(""))
                    return;
         int oldPrice = Integer.parseInt(String.valueOf(m.getValueAt(i, 5)));
        if(i >= 0){
            m.setValueAt(storeName.getText(),i,1);
            m.setValueAt(companyName.getText(),i,2);
            m.setValueAt(endDate.getText(),i,4);
            m.setValueAt(monthlyPrice.getText(),i,5);
        }
         else return;
        
         Contract updated = Mall.getBp().contractSearch(String.valueOf(m.getValueAt(i, 1)));
        
        updated.setEndDate(endDate.getText());
        if (oldPrice != Integer.parseInt(monthlyPrice.getText())){
            updated.setMonthlyPrice(Integer.parseInt(monthlyPrice.getText())); 
             Store st =  Mall.getBp().storeSearch(updated.getStore());
            st.setRentPrice(Integer.parseInt(monthlyPrice.getText()));
            Mall.getMall().fileReadingStore();
        }
          Mall.getMall().fileReadingContract();
        clearTextBoxes();
        
        
    }//GEN-LAST:event_updateContractActionPerformed

    private void updateContractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateContractMouseClicked
        int i = table.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) table.getModel();
        storeName.setText(m.getValueAt(i, 1).toString());
        companyName.setText(m.getValueAt(i, 2).toString());
        endDate.setText(m.getValueAt(i, 4).toString());
        monthlyPrice.setText(m.getValueAt(i, 5).toString());
    }//GEN-LAST:event_updateContractMouseClicked

    private void storeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeNameActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String searched = search.getText();
        searchSmt(searched);
    }//GEN-LAST:event_searchActionPerformed

   
    
    DefaultTableModel model;
    private javax.swing.JPanel body;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addContract;
    private javax.swing.JTextField companyName;
    private javax.swing.JButton deleteContract;
    private javax.swing.JTextField endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthlyPrice;
    private gui.swing.RoundPanel roundPanel1;
    private javax.swing.JTextField search;
    private javax.swing.JTextField storeName;
    private gui.swing.table.Table table;
    private javax.swing.JButton updateContract;
    // End of variables declaration//GEN-END:variables

 
}
