/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.form;

import components.businessPartnerService.BusinessPartner;
import components.businessPartnerService.BusinessPartnerService;
import java.text.DateFormat;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import components.mall.Mall;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import components.mall.AdministrationEmployee;
import components.mall.Event;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author borapapila
 */
public class Form_Events_Create extends javax.swing.JPanel {

    /**
     * Creates new form Form_Events_Create
     */
    public Form_Events_Create() {
        
        initComponents();
        init();
    }
     private void init() {
        table.fixTable(jScrollPane1);
        for(int i = 0;i<Mall.getEvents().size();i++){
            table.addRow(new Object[]{
                Mall.getEvents().get(i).getID(),
                Mall.getEvents().get(i).getName(),
                Mall.getEvents().get(i).getStartDate(),
                Mall.getEvents().get(i).getEndDate(),
                Mall.getEvents().get(i).getPrize()});
            
        }
 
    }
   
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ADD_EVENT = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Name = new javax.swing.JTextField();
        StartDate = new javax.swing.JTextField();
        roundPanel1 = new gui.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new gui.swing.table.Table();
        EndDate = new javax.swing.JTextField();
        Prize = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();

        setOpaque(false);

        ADD_EVENT.setText("Add Event");
        ADD_EVENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_EVENTActionPerformed(evt);
            }
        });

        Update.setText("Update Event");
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

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        StartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateActionPerformed(evt);
            }
        });

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Start Date", "End Date", "Prize"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );

        EndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDateActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel3.setText("Start Date");

        jLabel4.setText("End Date");

        jLabel5.setText("Prize");

        Delete.setText("Delete Event");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

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
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ADD_EVENT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(Update)
                                .addGap(63, 63, 63)
                                .addComponent(Delete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Prize, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Prize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(ADD_EVENT)
                    .addComponent(Delete))
                .addGap(39, 39, 39)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ADD_EVENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_EVENTActionPerformed
if (Name.getText().equals("") ||StartDate.getText().equals("")||
                        EndDate.getText().equals("")|| Prize.getText().equals(""))
                    return;

        DefaultTableModel m = (DefaultTableModel) table.getModel();
        Object[] row = new Object[6];
                row[0] = 1;
                row[1] = Name.getText();
                row[2] = StartDate.getText();
                row[3] = EndDate.getText();
                row[4] = Prize.getText();
                // add row to the model
                m.insertRow(0, row);
                Mall.getAe().makeEvent( Name.getText(),StartDate.getText(),
                        EndDate.getText(),Prize.getText());
                Mall.getMall().fileReadingEvent();
                clearTextBoxes();
        

    }//GEN-LAST:event_ADD_EVENTActionPerformed


      
    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        int i = table.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) table.getModel();
        Name.setText(m.getValueAt(i, 1).toString());
        StartDate.setText(m.getValueAt(i, 2).toString());
        EndDate.setText(m.getValueAt(i, 3).toString());
        Prize.setText(m.getValueAt(i, 4).toString());
    }//GEN-LAST:event_UpdateMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        int i = table.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) table.getModel();

        if(i >= 0){
            m.setValueAt(Name.getText(),i,1);
            m.setValueAt(StartDate.getText(),i,2);
            m.setValueAt(EndDate.getText(),i,3);
            m.setValueAt(Prize.getText(),i,4);
        }
         else return;
        
       Event updated = Mall.getAe().eventSearch(Integer.parseInt((String.valueOf(m.getValueAt(i, 0)))));
        
        updated.setName(Name.getText());
        updated.setStartDate(StartDate.getText());
        updated.setEndDate(EndDate.getText());
        updated.setStartDate(Prize.getText());
          Mall.getMall().fileReadingEvent();
        clearTextBoxes();

    }//GEN-LAST:event_UpdateActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void StartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDateActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel m = (DefaultTableModel) table.getModel();
         if(table.getSelectedRowCount() == 1){
             String name = String.valueOf(m.getValueAt(table.getSelectedRow(),1));
             Name.setText(name);
              String startdate = String.valueOf(m.getValueAt(table.getSelectedRow(),2));
             StartDate.setText(startdate);
             String end = String.valueOf(m.getValueAt(table.getSelectedRow(),3));
             EndDate.setText(end);
             String prize = String.valueOf(m.getValueAt(table.getSelectedRow(),4));
             Prize.setText(prize);
             
         }
    }//GEN-LAST:event_tableMouseClicked

    private void tablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablePropertyChange

    }//GEN-LAST:event_tablePropertyChange

    private void EndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndDateActionPerformed

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int i = table.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) table.getModel();

       Event deleted = Mall.getAe().eventSearch(Integer.parseInt((String.valueOf(m.getValueAt(i, 0)))));
        
        if(i >= 0) {
            m.removeRow(i);
        }
        Mall.getAe().deleteEvent(deleted.getID());
        Mall.getMall().fileReadingEvent();
        clearTextBoxes();
    }//GEN-LAST:event_DeleteActionPerformed

     private void clearTextBoxes(){
             Name.setText("");
             StartDate.setText("");
             EndDate.setText("");
             Prize.setText("");
    }
     
     public void searchSmt(String str){
      model = (DefaultTableModel) table.getModel();
      TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
      table.setRowSorter(trs);
      trs.setRowFilter(RowFilter.regexFilter(str));
    }
     
     
     
DefaultTableModel model;
    private javax.swing.JPanel body;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_EVENT;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField EndDate;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Prize;
    private javax.swing.JTextField StartDate;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private gui.swing.RoundPanel roundPanel1;
    private gui.swing.table.Table table;
    // End of variables declaration//GEN-END:variables
}