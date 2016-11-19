/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Employee;
import controller.ControllerEmployee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DELL
 */
public class EmployeeManagement extends javax.swing.JPanel {
    private ControllerEmployee controllerEmployee;
    private int row;

    /**
     * Creates new form Passenger
     */
    public EmployeeManagement() {
        initComponents();
        controllerEmployee = new ControllerEmployee(tbMain);
        controllerEmployee.loadDepartment(jComboBoxDepartment, true, null);
        controllerEmployee.loadTable();
        this.loadActionListener();
    }
    
    private void findEmployee(String nameDepartment) {
        TableRowSorter sorter = new TableRowSorter(tbMain.getModel());
        tbMain.setRowSorter(sorter);
        RowFilter<AbstractTableModel, Object> filterFlightSchedule = RowFilter.regexFilter(nameDepartment, 7);
        ArrayList<RowFilter<AbstractTableModel, Object>> arList = new ArrayList<>();
        arList.add(filterFlightSchedule);
        RowFilter<AbstractTableModel, Object> find = RowFilter.andFilter(arList);
        sorter.setRowFilter(find);
    }
    public void loadActionListener(){
        ((JLabel)jComboBoxDepartment.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        jComboBoxDepartment.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                Employee objDepartment = (Employee)jComboBoxDepartment.getSelectedItem();
                if(objDepartment.getId() != 0){
                    findEmployee(objDepartment.getDepartment());
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
        jPanel3 = new javax.swing.JPanel();
        jButtonCreate = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDetail = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jComboBoxDepartment = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
        jButtonCreate.setText("Add");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCreate);

        jButtonEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEdit);

        jButtonDetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
        jButtonDetail.setText("Detail");
        jButtonDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetailActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDetail);

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.gif"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDelete);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jTextFieldSearch.setText("Enter your id card...");
        jTextFieldSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSearchMouseClicked(evt);
            }
        });

        jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jComboBoxDepartment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----- Choose department -----", "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jComboBoxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSearch)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldSearch)))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

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
        tbMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbMainMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbMain);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        new AddEmployee().setVisible(true);
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void tbMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMainMousePressed
        // TODO add your handling code here:
        row = tbMain.getSelectedRow();
        Employee item = controllerEmployee.getValueAtRows(row);
        tbMain.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) 
            {
                int r = tbMain.rowAtPoint(e.getPoint());
                if (r >= 0 && r < tbMain.getRowCount()) {
                tbMain.setRowSelectionInterval(r, r);
            } else {
                tbMain.clearSelection();
            }
            if (e.isPopupTrigger() && e.getComponent() instanceof JTable ) {
                JPopupMenu popup = createYourPopUp(item,tbMain);
                popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }//GEN-LAST:event_tbMainMousePressed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        row = tbMain.getSelectedRow();
        if(row >= 0){
            Employee item = controllerEmployee.getValueAtRows(row);
            new EditEmployee(item).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Please choose a flight schedule!");

        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        row = tbMain.getSelectedRow();
       
        if(row >= 0){
             Employee item = controllerEmployee.getValueAtRows(row);
            int result = JOptionPane.showConfirmDialog(null, "Are you sure?",null, JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION) {
                int resultDelete = controllerEmployee.deleteEmployee(item.getId(), row);
                if(resultDelete > 0){
                    JOptionPane.showMessageDialog(null, "Delete successfully!");
                }else{
                    JOptionPane.showMessageDialog(null, "Delete error. Please try again!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please choose a flight schedule!");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSearchMouseClicked
        // TODO add your handling code here:
        jTextFieldSearch.setText("");
    }//GEN-LAST:event_jTextFieldSearchMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        TableRowSorter sorter = new TableRowSorter(tbMain.getModel());
        tbMain.setRowSorter(sorter);
        String idCard = jTextFieldSearch.getText();
        RowFilter<AbstractTableModel, Object> filterIdCard = RowFilter.regexFilter("(?i)" + idCard, 4);
        ArrayList<RowFilter<AbstractTableModel, Object>> arList = new ArrayList<>();
        arList.add(filterIdCard);
        RowFilter<AbstractTableModel, Object> find = RowFilter.andFilter(arList);
        sorter.setRowFilter(find);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetailActionPerformed
        // TODO add your handling code here:
        row = tbMain.getSelectedRow();
        Employee item = controllerEmployee.getValueAtRows(row);
        new DetailEmployee(item).setVisible(true);
    }//GEN-LAST:event_jButtonDetailActionPerformed
    
    public JPopupMenu createYourPopUp(Employee item, JTable table)
    {
        JPopupMenu popup=new JPopupMenu();  
        JMenuItem edit = new JMenuItem("Edit");
        JMenuItem detail =new JMenuItem("Detail");
        JMenuItem delete =new JMenuItem("Delete");
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditEmployee(item).setVisible(true);
            }
        });
        detail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new DetailEmployee(item).setVisible(true);
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, 
                    "Are you sure?",null, JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION) {
                    int resultDelete = controllerEmployee.deleteEmployee(item.getId(), row);
                    if(resultDelete > 0){
                        JOptionPane.showMessageDialog(null, "Delete successfully!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Delete error!");
                    }
                }
            }
        });
        popup.add(edit);
        popup.add(detail);
        popup.add(delete);
        return popup;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDetail;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxDepartment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTable tbMain;
    // End of variables declaration//GEN-END:variables
}