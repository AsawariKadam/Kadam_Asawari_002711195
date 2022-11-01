/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author asawari
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    PatientDirectory abnormalPatients;
    EncounterHistory abnormalEncounters;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    
    
    public MainJFrame() {
        initComponents();
        personDirectory = new PersonDirectory();
        //personDirectory = getDataFromCSV();
        patientDirectory = new PatientDirectory();
        encounterHistory = new EncounterHistory();
        abnormalPatients = new PatientDirectory();
        abnormalEncounters = new EncounterHistory();
        hospitalDirectory = new HospitalDirectory();
        doctorDirectory = new DoctorDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPanel = new javax.swing.JSplitPane();
        WorkArea = new javax.swing.JPanel();
        ControlArea = new javax.swing.JPanel();
        btnPersonDatabase = new javax.swing.JButton();
        btnPatientDatabase = new javax.swing.JButton();
        btnAbnormalCases = new javax.swing.JButton();
        btnHospitalDirectory = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnDoctorDirectory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WorkArea.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        SplitPanel.setRightComponent(WorkArea);

        ControlArea.setBackground(new java.awt.Color(0, 153, 153));

        btnPersonDatabase.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnPersonDatabase.setText("Person Database");
        btnPersonDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonDatabaseActionPerformed(evt);
            }
        });

        btnPatientDatabase.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnPatientDatabase.setText("Patient Database");
        btnPatientDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDatabaseActionPerformed(evt);
            }
        });

        btnAbnormalCases.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnAbnormalCases.setText("Abnormal Cases");
        btnAbnormalCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalCasesActionPerformed(evt);
            }
        });

        btnHospitalDirectory.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnHospitalDirectory.setText("Hospital Database");
        btnHospitalDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalDirectoryActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnDoctorDirectory.setFont(new java.awt.Font("Didot", 3, 14)); // NOI18N
        btnDoctorDirectory.setText("Doctor Database");
        btnDoctorDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorDirectoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlAreaLayout = new javax.swing.GroupLayout(ControlArea);
        ControlArea.setLayout(ControlAreaLayout);
        ControlAreaLayout.setHorizontalGroup(
            ControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlAreaLayout.createSequentialGroup()
                .addGroup(ControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnHospitalDirectory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnPatientDatabase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnPersonDatabase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbnormalCases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoctorDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ControlAreaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ControlAreaLayout.setVerticalGroup(
            ControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlAreaLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnPersonDatabase)
                .addGap(51, 51, 51)
                .addComponent(btnPatientDatabase)
                .addGap(43, 43, 43)
                .addComponent(btnAbnormalCases)
                .addGap(36, 36, 36)
                .addComponent(btnHospitalDirectory)
                .addGap(44, 44, 44)
                .addComponent(btnDoctorDirectory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(20, 20, 20))
        );

        SplitPanel.setLeftComponent(ControlArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonDatabaseActionPerformed
        // TODO add your handling code here:
        ViewPersonDirectory viewDirectory = new ViewPersonDirectory(personDirectory,patientDirectory,encounterHistory);
        System.out.println("1");
        SplitPanel.setRightComponent(viewDirectory);
        System.out.println("visible");
    }//GEN-LAST:event_btnPersonDatabaseActionPerformed

    private void btnPatientDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDatabaseActionPerformed
        // TODO add your handling code here:
        ViewPatientDirectory viewPatDirectory = new ViewPatientDirectory(patientDirectory, encounterHistory,abnormalPatients,abnormalEncounters);
        SplitPanel.setRightComponent(viewPatDirectory);
        
        
        
        
    }//GEN-LAST:event_btnPatientDatabaseActionPerformed

    private void btnAbnormalCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalCasesActionPerformed
        // TODO add your handling code here:
        viewAbnormalCases abnormalCases = new viewAbnormalCases(abnormalPatients,abnormalEncounters,personDirectory);
        SplitPanel.setRightComponent(abnormalCases);
    }//GEN-LAST:event_btnAbnormalCasesActionPerformed

    private void btnHospitalDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalDirectoryActionPerformed
            // TODO add your handling code here:
        ViewHospitalDirectory hospDirectory = new ViewHospitalDirectory(hospitalDirectory, doctorDirectory);
        SplitPanel.setRightComponent(hospDirectory);
    }//GEN-LAST:event_btnHospitalDirectoryActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnDoctorDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorDirectoryActionPerformed
        // TODO add your handling code here:
        LookforDoctor doctDirectory = new LookforDoctor(doctorDirectory);
        SplitPanel.setRightComponent(doctDirectory);
    }//GEN-LAST:event_btnDoctorDirectoryActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlArea;
    private javax.swing.JSplitPane SplitPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnAbnormalCases;
    private javax.swing.JButton btnDoctorDirectory;
    private javax.swing.JButton btnHospitalDirectory;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPatientDatabase;
    private javax.swing.JButton btnPersonDatabase;
    // End of variables declaration//GEN-END:variables
    private PersonDirectory getDataFromCSV() throws IOException {
       
            
            PersonDirectory csvData = new PersonDirectory();
            Path pathToFile = Paths.get("/Users/asawari/Desktop/PersonData.csv");
            try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
            String line = br.readLine();
            while(line!= null){
            String[] attributes = line.split(",");
            Person person = addPerson(attributes);
            csvData.addNewPerson(person);
            line = br.readLine();
            
            }
            }catch(IOException ioe){
            }
            return csvData;
      
}


    private Person addPerson(String[] attributes) {
        Person person = new Person();
        person.setFirstname(attributes[0]);
        person.setLastname(attributes[1]);
        person.setPersonage(Integer.parseInt(attributes[2]));
        person.setPersoncityname(attributes[3]);
        person.setPersoncommunityname(attributes[4]);
        person.setPersonhouseno(Integer.parseInt(attributes[5]));
        person.setPersonHospitalName(attributes[6]);
        return person;
    }

}
