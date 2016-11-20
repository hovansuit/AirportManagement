/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Airplane;
import bean.FlightSchedule;
import bean.Pilot;
import controller.ControllerAirplane;
import controller.ControllerFlightSchedule;
import controller.ControllerPilot;
import controller.ControllerSeatNo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DELL
 */
public class EditFlightSchedule extends javax.swing.JFrame {
    private ControllerAirplane controllerAirplane;
    private ControllerPilot controllerPilot;
    private ControllerFlightSchedule controllerFlightSchedule;
    private ControllerFlightSchedule controllerFlightSchedulePilot;
    private ControllerSeatNo controllerSeatNo;
    private FlightSchedule objFlightSchedule;
    private Airplane objAirplane;
    private Pilot objPilot;
    private int idPilot = 0;
    private int rowPilot;
    private String nameFlight = null;
    private java.sql.Timestamp start;
    private java.sql.Timestamp finish;
    private int statusTablePilot = 0;

    /**
     * Creates new form NewJFrame1
     */
    public EditFlightSchedule(FlightSchedule item) {
        initComponents();
        this.setLocationRelativeTo(null);
        objFlightSchedule = item;
        controllerAirplane = new ControllerAirplane(null);
        controllerPilot = new ControllerPilot(tbPilot);
        controllerSeatNo = new ControllerSeatNo();
        controllerPilot.loadTable();
        controllerAirplane.loadAirplane(jComboBoxAirplane, true, null);
        controllerFlightSchedule = new ControllerFlightSchedule(tbMain);
        controllerFlightSchedulePilot = new ControllerFlightSchedule(tbFindPilot);
        controllerFlightSchedule.loadTable();
        controllerFlightSchedulePilot.loadTable();
        tbFindPilot.setOpaque(false);
        tbFindPilot.setBackground(new Color(0, 0, 0, 0));
        tbPilot.setEnabled(false);
        this.loadActionListener();
        setForm();
        findAirplane(objFlightSchedule.getIdAirplane());
    }
    public void setForm(){
        objAirplane = new Airplane(objFlightSchedule.getIdAirplane(), objFlightSchedule.getNameAirplane());
        controllerAirplane.loadAirplane(jComboBoxAirplane, false, objAirplane);
        jComboBoxAirplane.setEnabled(false);
        jTextFieldNameFlight.setText(objFlightSchedule.getName());
        idPilot = objFlightSchedule.getIdPilot();
        jTextFieldNumberSeatNo.setText(Integer.toString(objFlightSchedule.getNumberSeatNo()));
        dateTimePickerStart.setDateTimePermissive(objFlightSchedule.getStartTime().toLocalDateTime());
        dateTimePickerFinish.setDateTimePermissive(objFlightSchedule.getFinishTime().toLocalDateTime());
        jTextFieldNumberSeatNo.setEditable(false);
    }
    
    private void findAirplane(int id) {
        TableRowSorter sorter = new TableRowSorter(tbMain.getModel());
        tbMain.setRowSorter(sorter);
        RowFilter<AbstractTableModel, Object> filterAirplane = RowFilter.regexFilter("(?i)" + id, 8);
        ArrayList<RowFilter<AbstractTableModel, Object>> arList = new ArrayList<>();
        arList.add(filterAirplane);
        RowFilter<AbstractTableModel, Object> find = RowFilter.andFilter(arList);
        sorter.setRowFilter(find);
    }
    private void findPilot(int[] id) {
        TableRowSorter sorter = new TableRowSorter(tbPilot.getModel());
        tbPilot.setRowSorter(sorter);
        ArrayList<RowFilter<AbstractTableModel, Object>> arList = new ArrayList<>();
        for(int i = 0; i<id.length; i++){
            RowFilter<AbstractTableModel, Object> filterAirplane = RowFilter.notFilter(RowFilter.regexFilter("(?i)" + id[i], 0));
            arList.add(filterAirplane);
        }
        RowFilter<AbstractTableModel, Object> find = RowFilter.andFilter(arList);
        sorter.setRowFilter(find);
    }
    
    public void loadActionListener(){
        ((JLabel)jComboBoxAirplane.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        jComboBoxAirplane.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                Airplane objAirplane = (Airplane)jComboBoxAirplane.getSelectedItem();
                if(objAirplane.getId() != 0){
                    findAirplane(objAirplane.getId());
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabelRoute = new javax.swing.JLabel();
        jComboBoxAirplane = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNameFlight = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateTimePickerStart = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel2 = new javax.swing.JLabel();
        dateTimePickerFinish = new com.github.lgooddatepicker.components.DateTimePicker();
        jbCheckPilot = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFindPilot = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPilot = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNumberSeatNo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btSubmit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));

        jLabelRoute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRoute.setText("Choose air route:");
        jPanel6.add(jLabelRoute);

        jComboBoxAirplane.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAirplane.setEnabled(false);
        jPanel6.add(jComboBoxAirplane);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("REGISTER FLIGHT SCHEDULE");
        jPanel5.add(jLabel4);

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Name flight schedule:");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 150, 40));

        jTextFieldNameFlight.setMinimumSize(new java.awt.Dimension(150, 30));
        jPanel7.add(jTextFieldNameFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 440, 40));

        jPanel1.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Time finish:");
        jPanel4.add(jLabel1);

        dateTimePickerStart.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 150));
        jPanel4.add(dateTimePickerStart);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Time start:");
        jPanel4.add(jLabel2);

        dateTimePickerFinish.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel4.add(dateTimePickerFinish);

        jbCheckPilot.setText("Check pilot");
        jbCheckPilot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbCheckPilot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCheckPilotMouseClicked(evt);
            }
        });
        jbCheckPilot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCheckPilotActionPerformed(evt);
            }
        });

        tbFindPilot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbFindPilot);

        tbPilot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPilot.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbPilot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbPilotMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbPilot);

        tbMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbMain);

        jLabel3.setText("Number seatNo:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCheckPilot)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNumberSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCheckPilot)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(jTextFieldNumberSeatNo))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        btSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        btSubmit.setText("Edit");
        btSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        jPanel3.add(btSubmit);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCheckPilotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCheckPilotMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbCheckPilotMouseClicked

    private void jbCheckPilotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCheckPilotActionPerformed
        if(!isVali()){
            return;
        }
        if(idPilot == 0){
            JOptionPane.showMessageDialog(null, "Please choose pilot!");
        }
        tbPilot.setEnabled(true);
        statusTablePilot = 1;
        int rowCount = tbFindPilot.getRowCount();
        int[] a= new int[rowCount];
        for(int j = 0; j < tbFindPilot.getRowCount(); j++){
            if(((start.after((Date) tbFindPilot.getValueAt(j, 2)))&&(start.before((Date) tbFindPilot.getValueAt(j, 3))))||((finish.after((Date) tbFindPilot.getValueAt(j, 2))&& (finish.before((Date) tbFindPilot.getValueAt(j, 3))))) || ((start.before((Date) tbFindPilot.getValueAt(j, 2)))&&(finish.after((Date) tbFindPilot.getValueAt(j, 3))))){
                a[j] = (int) tbFindPilot.getValueAt(j, 9);
            }
        }
        if(a != null){
            findPilot(a);
        }
    }//GEN-LAST:event_jbCheckPilotActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EditFlightSchedule.this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        if(!isVali()){
            return;
        }
        Timestamp timestampStart = Timestamp.valueOf(dateTimePickerStart.getDateTimePermissive());
        Timestamp timestampFinish = Timestamp.valueOf(dateTimePickerFinish.getDateTimePermissive());
        objAirplane = (Airplane)jComboBoxAirplane.getSelectedItem();
        objFlightSchedule = new FlightSchedule(objFlightSchedule.getId(), nameFlight, timestampStart, timestampFinish, objAirplane.getId(), idPilot, objFlightSchedule.getNumberSeatNo());
        if(objFlightSchedule != null){
            int result = controllerFlightSchedule.editFlightSchedule(objFlightSchedule);
            if(result > 0){
                JOptionPane.showMessageDialog(null, "Edit suceessfully!");
                EditFlightSchedule.this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Error. Please try again!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please check infomation again!");
        }
    }//GEN-LAST:event_btSubmitActionPerformed

    public boolean isVali(){
        if(jTextFieldNameFlight.getText().isEmpty()){
            nameFlight = objAirplane.getName();
        }else{
            nameFlight = jTextFieldNameFlight.getText();
        }
        if((dateTimePickerStart.getDateTimePermissive() == null) || (dateTimePickerFinish.getDateTimePermissive() == null) ){
            JOptionPane.showMessageDialog(null, "Please choose time!");
            return false;
        }
        Calendar cal = Calendar.getInstance();
        Timestamp timestampStart = Timestamp.valueOf(dateTimePickerStart.getDateTimePermissive());
        Timestamp timestampFinish = Timestamp.valueOf(dateTimePickerFinish.getDateTimePermissive());
        start = new java.sql.Timestamp(timestampStart.getTime());
        finish = new java.sql.Timestamp(timestampFinish.getTime());
        if(start.before(cal.getTime())){
            JOptionPane.showMessageDialog(null, "You can't create a flight schedule with start time before time now!");
            return false;
        }
        if(start.after(finish)){
            JOptionPane.showMessageDialog(null, "Please check information(date order need before date check out)!");
            return false;
        }
        for(int i = 0; i < tbMain.getRowCount(); i++){
            if(((start.after((Date) tbMain.getValueAt(i, 2)))&&(start.before((Date) tbMain.getValueAt(i, 3))))||((finish.after((Date) tbMain.getValueAt(i, 2))&& (finish.before((Date) tbMain.getValueAt(i, 3))))) || ((start.before((Date) tbMain.getValueAt(i, 2)))&&(finish.after((Date) tbMain.getValueAt(i, 3))))){
                JOptionPane.showMessageDialog(null, "Flight schedule already exist at "+ tbMain.getValueAt(i, 1) + ". Please try again!");
                return false;
            }
        }
        if(jTextFieldNumberSeatNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter number seat No!");
            return false;
        }
        return true;
    }
    
    private void tbPilotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPilotMousePressed
        if(statusTablePilot == 0){
            JOptionPane.showMessageDialog(null, "Please click check pilot!");
        } else {
            rowPilot = tbPilot.getSelectedRow();
            objPilot = controllerPilot.getValueAtRows(rowPilot);
            idPilot = objPilot.getId();
        }
    }//GEN-LAST:event_tbPilotMousePressed

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
            java.util.logging.Logger.getLogger(EditFlightSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFlightSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFlightSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFlightSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFlightSchedule(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSubmit;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePickerFinish;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePickerStart;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxAirplane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelRoute;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldNameFlight;
    private javax.swing.JTextField jTextFieldNumberSeatNo;
    private javax.swing.JButton jbCheckPilot;
    private javax.swing.JTable tbFindPilot;
    private javax.swing.JTable tbMain;
    private javax.swing.JTable tbPilot;
    // End of variables declaration//GEN-END:variables
}
