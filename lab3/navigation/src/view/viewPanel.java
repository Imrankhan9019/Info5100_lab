/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Paitent;

/**
 *
 * @author ACER
 */
public class viewPanel extends javax.swing.JPanel {

    ImageIcon ProfilePicture;
    Paitent p1;
    /**
     * Creates new form viewPanel
     */
    public viewPanel() {
        initComponents();
    }
    
    public viewPanel(Paitent p1){
        this.p1=p1;
        initComponents();
        populateData();
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
        jLabelemail = new javax.swing.JLabel();
        jTextFieldmail = new javax.swing.JTextField();
        jimgLabel = new javax.swing.JLabel();
        jimgButton = new javax.swing.JButton();
        imgJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonsubmit = new javax.swing.JButton();
        jpatientType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 102, 255));

        jLabelFname.setText("FIRST NAME:");

        jLabellname.setText("LAST NAME :");

        jTextFieldlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldlnameActionPerformed(evt);
            }
        });

        jLabelGender.setText("GENDER :");

        jRadioButtonmale.setText("MALE");
        jRadioButtonmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonmaleActionPerformed(evt);
            }
        });

        jRadioButtonfemale.setText("FEMALE");
        jRadioButtonfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonfemaleActionPerformed(evt);
            }
        });

        jRadioButtonother.setText("OTHER");

        jLabelage.setText("AGE:");

        jTextFieldage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldageActionPerformed(evt);
            }
        });

        jLabelemail.setText("Email:");

        jimgLabel.setText("Image");

        jimgButton.setText("Upload Image");
        jimgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jimgButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient Type");

        jButtonsubmit.setText("SUBMIT");
        jButtonsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsubmitActionPerformed(evt);
            }
        });

        jpatientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk-in" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonsubmit)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(19, 19, 19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jimgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jpatientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jimgButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabellname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldfname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelemail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonmale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonother, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldage, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFname)
                    .addComponent(jTextFieldfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabellname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jRadioButtonmale)
                    .addComponent(jRadioButtonfemale)
                    .addComponent(jRadioButtonother))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelage)
                    .addComponent(jTextFieldage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelemail)
                    .addComponent(jTextFieldmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jimgButton)
                            .addComponent(jimgLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jpatientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButtonsubmit)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldlnameActionPerformed

    private void jRadioButtonmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonmaleActionPerformed

    private void jRadioButtonfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonfemaleActionPerformed

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
                    this.ProfilePicture = new ImageIcon(edited_image);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jimgButtonActionPerformed

    private void jButtonsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsubmitActionPerformed
        
        try{
            String name=this.jTextFieldfname.getText();
            String gender=this.buttonGroupGender.getSelection().getActionCommand();
            String patientType= this.jpatientType.getSelectedItem().toString();            
            int age= Integer.parseInt(jTextFieldage.getText());
            String first_name= this.jTextFieldfname.getText();
            String last_name= this.jTextFieldlname.getText();
            //String msgtxt= this.jTextFieldTextMessage.getText();
            String email= this.jTextFieldmail.getText();
            String displayMessage="first name: "+first_name+" last name: "+last_name+" Email: "+email+" age: "+age;
            System.out.println(this.jTextFieldfname.getText());
            System.out.println(this.jTextFieldlname.getText());
            System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
            System.out.println(this.jTextFieldmail.getText());
            System.out.println(this.jTextFieldage.getText());
            if(name.equals("")|| patientType.equals("")){
                displayMessage= "Maybe you forgot to enter your name or patient Type ";
            }else {
                displayMessage="Name is: "+first_name+ "Last Name: "+last_name+" Gender is: "+gender+" Patient Type: "+patientType+"Age: "+age;
            }

            //JOptionPane.showMessageDialog(this, displayMessage,"Success", Height, this.ProfilePicture);
            JOptionPane.showMessageDialog(this, displayMessage,"Success", HEIGHT, this.ProfilePicture);
        }
        catch (NullPointerException ne)
        {
            String errorMessage="You must enter things in  name and Gender";
            JOptionPane.showMessageDialog(this, errorMessage);
        }
        catch (Exception e )
        { System.out.println("xxEroorrrrrxx");
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonsubmitActionPerformed

    private void jTextFieldageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldageActionPerformed

    public void populateData(){
        this.jTextFieldfname.setText(p1.getFname());
        this.jTextFieldlname.setText(p1.getLname());
        this.jTextFieldmail.setText(p1.getEmail());
        String gender = p1.getGender();
        if(gender.equals("MALE")){
            this.buttonGroupGender.setSelected(this.jRadioButtonmale.getModel(),true);
        }else if (gender.equals("FEMALE")){
            this.buttonGroupGender.setSelected(this.jRadioButtonfemale.getModel(),true);
        }else{
            this.buttonGroupGender.setSelected(this.jRadioButtonother.getModel(),true);
        }
        this.jpatientType.setSelectedItem(p1.getPatientType());
        this.imgJLabel.setIcon((Icon) p1.getProfilePicture());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel imgJLabel;
    private javax.swing.JButton jButtonsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFname;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelage;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabellname;
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
  
