/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Employee;
import controller.ControllerEmployee;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import library.ConvertDate;
import validate.CheckMail;

/**
 *
 * @author DELL
 */
public class AddEmployee extends javax.swing.JFrame {
    private ControllerEmployee controllerEmployee;
    private ConvertDate convertDate;
    private String filePath;
    private String fileName;
    private File file;

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
        this.setLocationRelativeTo(null);
        controllerEmployee = new ControllerEmployee(null);
        convertDate = new ConvertDate();
        jRadioButtonMale.setActionCommand("Male");
        jRadioButtonFemale.setActionCommand("Female");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonSubmit = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonUpload = new javax.swing.JButton();
        jTextFieldFullName = new javax.swing.JTextField();
        datePickerBirthday = new com.github.lgooddatepicker.components.DatePicker();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jTextFieldIdCard = new javax.swing.JTextField();
        jTextFieldReligion = new javax.swing.JTextField();
        jTextFieldEthnicMinority = new javax.swing.JTextField();
        jTextFieldDepartment = new javax.swing.JTextField();
        jTextFieldPosition = new javax.swing.JTextField();
        jTextFieldSalary = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPermission = new javax.swing.JTextField();
        lbPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Create employee");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabel12);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jButtonSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.gif"))); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSubmit);

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancel);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Full name*:");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setText("Birthday*:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setText("Gender*:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setText("Id Card*:");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setText("Religion*:");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setText("EthnicMinority*:");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setText("Department*:");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setText("Position*:");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setText("Salary*:");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel10.setText("Phone*:");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel11.setText("Avatar:");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButtonUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload.png"))); // NOI18N
        jButtonUpload.setText("Update");
        jButtonUpload.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        buttonGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel13.setText("Email*:");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel14.setText("Address*:");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel15.setText("Permission:");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPicture.setText("Your image here");
        lbPicture.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFullName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datePickerBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldIdCard, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonMale)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButtonFemale))
                                        .addComponent(jTextFieldEthnicMinority, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                                    .addComponent(jTextFieldPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldDepartment, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(jTextFieldReligion)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(jTextFieldPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTextFieldAddress))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButtonUpload)
                        .addGap(26, 26, 26)))
                .addGap(60, 60, 60))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(datePickerBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonMale)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jRadioButtonFemale))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUpload)))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldEthnicMinority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser("D:\\Picture");
        int result = chooser.showDialog(null, "Upload picture");
        if(result==JFileChooser.APPROVE_OPTION){
            file = chooser.getSelectedFile();
            filePath = file.getAbsolutePath();
            ImageIcon icon = new ImageIcon(new ImageIcon(filePath).getImage().getScaledInstance(120, 80, Image.SCALE_SMOOTH));
            lbPicture.setIcon(icon);
            JOptionPane.showConfirmDialog(null, "Upload successfully!");
        }
    }//GEN-LAST:event_jButtonUploadActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        String fullName = jTextFieldFullName.getText();
        if(file != null){
            upLoadFile(file);
        }else{
            fileName = "Imagehere.jpg";
        }
        if(datePickerBirthday.getDateStringOrEmptyString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter Birthday ");
            return;
        }
        java.sql.Date birthday = new java.sql.Date(convertDate.getDateTime(datePickerBirthday.getDateStringOrEmptyString()).getTime());
         if(buttonGroupGender.getSelection()==null){
            JOptionPane.showMessageDialog(null, "Please enter Gender ");
            return;
        }
        String gender = buttonGroupGender.getSelection().getActionCommand();
        String idCard = jTextFieldIdCard.getText();
        String religion = jTextFieldReligion.getText();
        String ethnicMinority = jTextFieldEthnicMinority.getText();
        String department = jTextFieldDepartment.getText();
        float salary =0;
        if(jTextFieldSalary.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter Salary ");
            return;
        }
        try{
         salary = Float.parseFloat(jTextFieldSalary.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter Salary type number ");
            return;
        }
        String position = jTextFieldPosition.getText();
        String phone = jTextFieldPhone.getText();
        String email = jTextFieldEmail.getText();
        String address = jTextFieldAddress.getText();
        String permission = jTextFieldPermission.getText();
        Employee objEmployee = new Employee(0, fullName, fileName, birthday, gender, idCard, religion, ethnicMinority, department, position, salary, email, address, phone, permission);
        
         if (!isValid( objEmployee)) {
            return;

        }
        int result = controllerEmployee.addEmployee(objEmployee);
        if(result > 0){
            JOptionPane.showMessageDialog(null, "Create successfully!");
            AddEmployee.this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Error. Please try again!");
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        AddEmployee.this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed
    
    public void upLoadFile(File file){
        fileName = System.nanoTime() + "_" + file.getName();
//        System.out.println("view.AddEmployee.upLoadFile(): " + fileName);
        filePath = file.getAbsolutePath();
        Path source = Paths.get(filePath);
        Path target = Paths.get("files/"+fileName);
        file = target.toFile();
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error when Upload file");
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        file = null;
    }
    private boolean isValid(Employee objItem) {
         CheckMail checkMail = new CheckMail();
        if (objItem.getFullName().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter  fullname");
            return false;
        }
        
        if (objItem.getIdCard().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter ID card");
            return false;
        }
        if (!objItem.getIdCard().matches("[0-9]+")) {
             JOptionPane.showMessageDialog(this, "Please enter a valid ID card format");
            return false;
        }
        if (objItem.getEthicMinority().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter EthicMinority");
            return false;
        }
        if (objItem.getPosition().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Position");
            return false;
        }
        if (objItem.getPhone().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Phone");
            return false;
        }
        if (!objItem.getPhone().matches("[0-9]+")) {
             JOptionPane.showMessageDialog(this, "Please enter a valid Phone format");
            return false;
        }
         if (objItem.getEmail().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Email");
            return false;
        }
         
         if(checkMail.isValidEmailAddress(objItem.getEmail())== false){
             JOptionPane.showMessageDialog(this, "Please enter a valid email format");
            return false;
         }
       
        if (objItem.getAddress().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Address");
            return false;
        }
        if (objItem.getReligion().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Religion");
            return false;
        }
        if (objItem.getDepartment().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Department");
            return false;
        }
       
        if (objItem.getPermission().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Permission");
            return false;
        }
       return  true;

    }
    
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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGender;
    private com.github.lgooddatepicker.components.DatePicker datePickerBirthday;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldDepartment;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEthnicMinority;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldIdCard;
    private javax.swing.JTextField jTextFieldPermission;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldPosition;
    private javax.swing.JTextField jTextFieldReligion;
    private javax.swing.JTextField jTextFieldSalary;
    private javax.swing.JLabel lbPicture;
    // End of variables declaration//GEN-END:variables
}
