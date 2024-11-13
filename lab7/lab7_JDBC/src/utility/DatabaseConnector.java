package utility;
import static com.mysql.cj.conf.PropertyKey.USER;
import java.sql.*;
import java.util.ArrayList;
import model.Paitent;
/**
*
* @author admin
*/
public class DatabaseConnector {
   private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=true";
   private static final String USER = "root";
   private static final String PASS = "my-secret-pw";
   //CRUD Operations on database
//c= CREATE  inserting data into database
public static void addPaitent(Paitent p1){
    String query = "INSERT INTO patient(name, gender,last_name,age,email,patient_type) VALUES (?,?,?,?,?,?)";
    try{
        System.out.println("ENETER addPaitent in DatabseConnector");
        Connection conn= DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, p1.getFname());
        stmt.setString(2, p1.getGender());
        stmt.setString(3, p1.getLname());
        stmt.setInt(4,p1.getAge());
        stmt.setString(5, p1.getEmail());
        stmt.setString(6, p1.getPatientType());
        int rows = stmt.executeUpdate();
        System.out.println("Rows Inserted: "+ rows);
        // "INSERT INTO patient(name, gender,last_name,age,email,patient_type) VALUES ('Rit','Male',24,'naram','ritz@gmail.com','new_patient')";
        conn.close();
    }catch(SQLException sqle){
        System.out.println("SQL Exception Occured");
        System.out.println(sqle);
    }catch(Exception ex){
        System.out.println(ex);
    }
 
}
//R= READ getting all values from database
public static ArrayList<Paitent> getPaitents(){
    ArrayList <Paitent> paitents = new ArrayList();
    String query= "SELECT * FROM patient";
    try{
        Connection conn= DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs= stmt.executeQuery(query);
        while(rs.next()){
            Paitent p1 = new Paitent();
            p1.setFname(rs.getString("name"));
            p1.setLname(rs.getString("last_name"));
            p1.setGender(rs.getString("gender"));
            p1.setAge(rs.getInt("age"));
            p1.setId(rs.getInt("id"));
            p1.setEmail(rs.getString("email"));
            p1.setPatientType(rs.getString("paitent_type"));
            paitents.add(p1);

        }
        rs.close();
        conn.close();

    }catch(SQLException sqle){
        System.out.println("SQL Exception Occured");
        System.out.println(sqle);
    }
    catch(Exception ex){
        System.out.println(ex);
    }
    return paitents;
}
//U= UPDATE changing the values in a database
public static void updatePaitent(Paitent oldPaitent, Paitent updatedPaitent){
    String query= "UPDATE paitent SET name= ?, gender=?, last_name=?, email=?, age=?, paitent_type=? WHERE id=?";
    try{
        Connection conn= DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, updatedPaitent.getFname());
        stmt.setString(2, updatedPaitent.getLname());
        stmt.setString(3, updatedPaitent.getEmail());
        stmt.setString(4, updatedPaitent.getPatientType());
        stmt.setString(5, updatedPaitent.getGender());
        stmt.setInt(6, updatedPaitent.getAge());
        int rows = stmt.executeUpdate();
        System.out.println("Rows Updated: "+rows);

        conn.close();
    }catch(SQLException sqle){
        System.out.println("SQL Exception Occured");
        System.out.println(sqle);
    }catch(Exception ex){
        System.out.println("SQL Exception Occured");
        System.out.println(ex);
    }

 
}
//D= DELETE
public static void deletePaitent(Paitent p1){
    String query= "DELETE FROM patient WHERE id= ?";
    try{
        Connection conn= DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1,p1.getId());
        int rows = stmt.executeUpdate();
        System.out.println("Rows Deleted: "+rows);
        conn.close();
    }catch(SQLException sqle){
        System.out.println("SQL Exception Occured");
        System.out.println(sqle);
    }

 
}
}