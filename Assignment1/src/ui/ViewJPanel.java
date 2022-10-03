/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeDirectory;

/**
 *
 * @author asawari
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeDirectory directory;
    
    public ViewJPanel(EmployeeDirectory employeeDirectory) {
        initComponents();
        this.directory = employeeDirectory;
        
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        txtPhoto = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblContPhone = new javax.swing.JLabel();
        lblContEmail = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtContPhone = new javax.swing.JTextField();
        txtContEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Employee record");

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "Age", "Gender", "Start Date", "Level", "Team Info", "Title", "Phone", "Email Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblGender.setText("Gender:");

        lblStartDate.setText("Start Date:");

        txtPhoto.setSize(new java.awt.Dimension(42, 17));

        lblLevel.setText("Level:");

        lblTeamInfo.setText("Team Info:");

        lblContPhone.setText("Phone:");

        lblContEmail.setText("Email Id:");

        lblPhoto.setText("Photo:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblTitle.setText("Title:");

        lblName.setText("Name:");

        lblId.setText("ID:");

        lblAge.setText("Age:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblName)
                                                .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(lblStartDate)
                                            .addComponent(lblLevel)
                                            .addComponent(lblTeamInfo)
                                            .addComponent(lblTitle)
                                            .addComponent(lblContPhone)
                                            .addComponent(lblContEmail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContEmail)
                                    .addComponent(txtTitle)
                                    .addComponent(txtTeamInfo)
                                    .addComponent(txtLevel)
                                    .addComponent(txtStartDate)
                                    .addComponent(txtGender)
                                    .addComponent(txtAge)
                                    .addComponent(txtId)
                                    .addComponent(txtName)
                                    .addComponent(txtContPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btnView)
                        .addGap(27, 27, 27)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLevel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeamInfo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPhoto)
                        .addGap(124, 124, 124))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContPhone))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblEmployee.getSelectedRow();

        if(selectedRowIndex<0){

            JOptionPane.showMessageDialog(this,"Please select the row to view");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);

        txtName.setText(selectedEmployee.getName());
        txtId.setText(String.valueOf(selectedEmployee.getId()));
        txtAge.setText(String.valueOf(selectedEmployee.getAge()));
        txtGender.setText(selectedEmployee.getGender());
        txtStartDate.setText(String.valueOf(selectedEmployee.getStartDate()));
        txtLevel.setText(String.valueOf(selectedEmployee.getLevel()));
        txtTeamInfo.setText(selectedEmployee.getTeamInfo());
        txtTitle.setText(selectedEmployee.getTitle());
        txtContPhone.setText(selectedEmployee.getContNum());
        txtContEmail.setText(selectedEmployee.getContEmail());

        txtPhoto.setText(String.valueOf(selectedEmployee.getPhoto()));
        String imgpath = selectedEmployee.getPhoto();

        ImageIcon img = new ImageIcon(imgpath);
        Image image = img.getImage().getScaledInstance(txtPhoto.getWidth(), txtPhoto.getHeight(), Image.SCALE_SMOOTH);

        lblImage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEmployee.getSelectedRow();

        if(selectedRowIndex<0){

            JOptionPane.showMessageDialog(this,"Please select the row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);

        directory.deleteEmployee(selectedEmployee);

        JOptionPane.showMessageDialog(this,"Employee record deleted.");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        if(tblEmployee.getSelectedRowCount() == 1){
          //if Single row is selcted then update
            int rowindex = tblEmployee.getSelectedRow();
        
            String name = txtName.getText();
            String id = txtId.getText();
            String age = txtAge.getText();
            String gender = txtGender.getText();
            String startDate = txtStartDate.getText();
            String level = txtLevel.getText();
            String teamInfo = txtTeamInfo.getText();
            String title = txtTitle.getText();
            String contNum = txtContPhone.getText();
            String contEmail = txtContEmail.getText();


            Employee em = directory.updateEmployee(rowindex);
        

        
            em.setName(name);
            em.setId(id);
            em.setAge(age);
            em.setGender(gender);
            em.setStartDate(startDate);
            em.setLevel(level);
            em.setTeamInfo(teamInfo);
            em.setTitle(title);
            em.setContNum(contNum);
            em.setContEmail(contEmail);

            //set updated value on table row
            model.setValueAt(name, tblEmployee.getSelectedRow(), 0);
            model.setValueAt(id, tblEmployee.getSelectedRow(), 1);
            model.setValueAt(age, tblEmployee.getSelectedRow(), 2);
            model.setValueAt(gender, tblEmployee.getSelectedRow(), 3);
            model.setValueAt(startDate, tblEmployee.getSelectedRow(), 4);
            model.setValueAt(level, tblEmployee.getSelectedRow(), 5);
            model.setValueAt(teamInfo, tblEmployee.getSelectedRow(), 6);
            model.setValueAt(title, tblEmployee.getSelectedRow(), 7);
            model.setValueAt(contNum, tblEmployee.getSelectedRow(), 8);
            model.setValueAt(contEmail, tblEmployee.getSelectedRow(), 9);

            //update message display
        
            JOptionPane.showMessageDialog(this, "Employee record updated successfully!");
        
            }else {
                if(tblEmployee.getSelectedRowCount() == 0) {
                    //if table is empty
                    JOptionPane.showMessageDialog(this, "Employee table is empty!");
                }else{
                    //if row is not selected or multiple row selected for update
                    JOptionPane.showMessageDialog(this, "Please select single row for update.");
                }
            }

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContEmail;
    private javax.swing.JLabel lblContPhone;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContEmail;
    private javax.swing.JTextField txtContPhone;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        
        for(Employee em : directory.getDirectory()){
            
            Object[] row = new Object[11];
            row[0] = em;
            row[1] = em.getId();
            row[2] = em.getAge();
            row[3] = em.getGender();
            row[4] = em.getStartDate();
            row[5] = em.getLevel();
            row[6] = em.getTeamInfo();
            row[7] = em.getTitle();
            row[8] = em.getContNum();
            row[9] = em.getContEmail();
           row[10] = em.getPhoto();
            
            model.addRow(row);
            
        }
    }
}
