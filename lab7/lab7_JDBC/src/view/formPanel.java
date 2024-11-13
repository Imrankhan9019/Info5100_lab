/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Paitent;
import utility.DatabaseConnector;

/**
 *
 * @author ACER
 */
public class formPanel extends javax.swing.JPanel {

    ImageIcon profilePicture;
    JPanel jbottomPanel;

    /**
     * Creates new form formPanel
     */
    public formPanel(JPanel jbottomPanel) {
        this.jbottomPanel = jbottomPanel;
        initComponents();
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
        jLabelFname = new javax.swing.JLabel();
        jTextFieldfname = new javax.swing.JTextField();
        jLabellname = new javax.swing.JLabel();
        jTextFieldlname = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jRadioButtonmale = new javax.swing.JRadioButton();
        jRadioButtonfemale = new javax.swing.JRadioButton();
        jRadioButtonother = new javax.swing.JRadioButton();
        jLabelage = new javax.swing.JLabel();
        jTextFieldage = new javax.swing.JTextField();
        jTextFieldmail = new javax.swing.JTextField();
        jLabelemail = new javax.swing.JLabel();
        jimgLabel = new javax.swing.JLabel();
        jimgButton = new javax.swing.JButton();
        jButtonsubmit = new javax.swing.JButton();
        jLabelpatient = new javax.swing.JLabel();
        imgJLabel = new javax.swing.JLabel();
        jpatientType = new javax.swing.JComboBox<>();

        jLabelFname.setText("FIRST NAME:");

        jLabellname.setText("LAST NAME :");

        jTextFieldlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldlnameActionPerformed(evt);
            }
        });

        jLabelGender.setText("GENDER :");

        buttonGroupGender.add(jRadioButtonmale);
        jRadioButtonmale.setText("MALE");

        buttonGroupGender.add(jRadioButtonfemale);
        jRadioButtonfemale.setText("FEMALE");

        buttonGroupGender.add(jRadioButtonother);
        jRadioButtonother.setText("OTHER");

        jLabelage.setText("AGE:");

        jLabelemail.setText("Email:");

        jimgLabel.setText("Image");

        jimgButton.setText("Upload Image");
        jimgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jimgButtonActionPerformed(evt);
            }
        });

        jButtonsubmit.setText("SUBMIT");
        jButtonsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsubmitActionPerformed(evt);
            }
        });

        jLabelpatient.setText("Paitent Type");

        jpatientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk In" }));
        jpatientType.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldfname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabellname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonmale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonother, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jimgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelpatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jimgButton)
                            .addComponent(jpatientType, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jTextFieldage, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelemail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jTextFieldmail, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jButtonsubmit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFname)
                    .addComponent(jTextFieldfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabellname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jRadioButtonmale)
                    .addComponent(jRadioButtonfemale)
                    .addComponent(jRadioButtonother))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelage)
                    .addComponent(jTextFieldage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelemail)
                    .addComponent(jTextFieldmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jimgButton)
                            .addComponent(jimgLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelpatient)
                            .addComponent(jpatientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButtonsubmit)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldlnameActionPerformed

    private void jimgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jimgButtonActionPerformed
        // TODO add your handling code here:

        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80,
                        Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    this.imgJLabel.setIcon(new ImageIcon(edited_image));
                    this.profilePicture = new ImageIcon(edited_image);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jimgButtonActionPerformed

    private void jButtonsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsubmitActionPerformed

        try {

            String gender = this.buttonGroupGender.getSelection().getActionCommand();
            String patientType = this.jpatientType.getSelectedItem().toString();
            int age = Integer.parseInt(jTextFieldage.getText());
            String first_name = this.jTextFieldfname.getText();
            String last_name = this.jTextFieldlname.getText();
            //String msgtxt= this.jTextFieldTextMessage.getText();
            String email = this.jTextFieldmail.getText();
            String displayMessage = "first name: " + first_name + " last name: " + last_name + " Email: " + email + " age: " + age;
            //System.out.println(this.jTextFieldfname.getText());
            //System.out.println(this.jTextFieldlname.getText());
            //System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
            //System.out.println(this.jTextFieldmail.getText());
            //System.out.println(this.jTextFieldage.getText());
            if (first_name.equals("") || patientType.equals("")) {
                displayMessage = "Maybe you forgot to enter your name or patient Type ";
                JOptionPane.showMessageDialog(this, displayMessage, "Success", HEIGHT, this.profilePicture);
            } else {
                displayMessage = "Name is: " + first_name + "Last Name: " + last_name + " Gender is: " + gender + " Patient Type: " + patientType + "Age: " + age;
            }

            JOptionPane.showMessageDialog(this, displayMessage, "Success", HEIGHT, this.profilePicture);
            Paitent p1 = new Paitent();
            p1.setFname(first_name);
            p1.setGender(gender);
            p1.setPatientType(patientType);
            p1.setAge(age);
            p1.setEmail(email);
            p1.setLname(last_name);
            p1.setProfilePicture(profilePicture);

            viewPanel newViewJPanel = new viewPanel(p1);
            this.jbottomPanel.add(newViewJPanel);
            CardLayout layout = (CardLayout) this.jbottomPanel.getLayout();
            layout.next(jbottomPanel);
            System.out.println("ENTErING ");

            DatabaseConnector.addPaitent(p1);
            System.out.println("your data is been added  ");

            //JOptionPane.showMessageDialog(this, errorMessage);
        } // catch(NullPointerException ne)
        //{
        // String errorMessage="You must enter values in Name and Gender";
        //JOptionPane.showMessageDialog(this, errorMessage);
        //}
        catch (Exception e) {
            System.out.println("xxEroorrrrrxx" + e);
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonsubmitActionPerformed
    private void jTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel imgJLabel;
    private javax.swing.JButton jButtonsubmit;
    private javax.swing.JLabel jLabelFname;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelage;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabellname;
    private javax.swing.JLabel jLabelpatient;
    private javax.swing.JRadioButton jRadioButtonfemale;
    private javax.swing.JRadioButton jRadioButtonmale;
    private javax.swing.JRadioButton jRadioButtonother;
    private javax.swing.JTextField jTextFieldage;
    private javax.swing.JTextField jTextFieldfname;
    private javax.swing.JTextField jTextFieldlname;
    private javax.swing.JTextField jTextFieldmail;
    private javax.swing.JButton jimgButton;
    private javax.swing.JLabel jimgLabel;
    private javax.swing.JComboBox<String> jpatientType;
    // End of variables declaration//GEN-END:variables
}
