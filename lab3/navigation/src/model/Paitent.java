/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author ACER
 */
public class Paitent {
    private String fname;
    private String Gender;
    private String patientType;
    private ImageIcon ProfilePicture;
    private int age;
    private String lname;
    private String email;
    


    public String getFname() {
        return fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname(){
        return lname; 
        
    }
    public void setLname(String Lname){
        this.lname = Lname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPatientType() {
        return patientType;
    }
    
    public ImageIcon getProfilePicture(){
        return ProfilePicture;
    }
    public void setProfilePicture(ImageIcon ProfilePicture) {
        this.ProfilePicture = ProfilePicture;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }
    
    
}
