/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import static java.util.Calendar.DATE;
import javax.swing.JOptionPane;

/**
 *
 * @author athena
 */
public class ModelUsers {

    public ModelUsers() {
    }
    
    public void edit(String id,String name, String cpf, String date, char gender,String cargo, String now){
        try{
      // create a mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
      Statement st = conn.createStatement();
      String mysqlDateNow = now.toString();
      String mysqlDate = date;
      st.executeUpdate("UPDATE cargosUsers.usuarios SET NAME='"+name+"',CPF='"+cpf+"',DATEBORN='"+mysqlDate+"',GENDER='"+gender+"',CARGO='"+cargo+"',UPDATE_CONTROL='"+mysqlDateNow+"'WHERE UID='"+id+"';");
      conn.close();
      JOptionPane.showMessageDialog (null, "Registro atualizado com sucesso!");
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    } 
    }
    
    public void delete(String id){
        System.out.println(id);
         try{
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");
            Statement st = conn.createStatement();
            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("DELETE FROM usuarios WHERE UID='"+id+"'");
            conn.close();
            JOptionPane.showMessageDialog (null, "Registro deletado com sucesso");
        }
        catch (Exception e)
        {
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
    }
    
    public String selectCargo(String id){
        String name = "";
        try{
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM cargosUsers.cargos WHERE cargos.CID='"+id+"';";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                name = rs.getString("NAME");
                
            }
            rs.close();
            conn.close();
            return name;
        }catch (Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        
        return name;
    }
    public ArrayList<Users> selectAll(){
        ArrayList<Users> user = new ArrayList<Users>();
        try{
            // create a mysql database connection
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM cargosUsers.usuarios";
            ResultSet rs = st.executeQuery(sql);
            

            while(rs.next()){
               //Retrieve by column name
               Users aux = new Users();
               aux.setId(rs.getString("UID"));
               aux.setName(rs.getString("NAME"));
               aux.setCpf(rs.getString("CPF"));
               aux.setBorn(rs.getString("DATEBORN"));
               aux.setGender(rs.getString("GENDER"));
               aux.setCargo(rs.getString("CARGO"));
               aux.setDate_origin(rs.getString("UPDATE_CONTROL"));
               user.add(aux);

            }
        rs.close();
        conn.close();
     
        }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
        return user;
   }

    
    public void insert(String name, String cpf, String date, char gender,String cargo, String now){
        
     try{
         
      // create a mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
      Statement st = conn.createStatement();
      Statement code = conn.createStatement();
      String query ="SELECT MAX(UID) AS 'UID' FROM cargosUsers.usuarios;";
      ResultSet id = code.executeQuery(query);
      
      int userID = 1;
      
      while(id.next()){
        String uid = id.getString("UID");
        userID = Integer.parseInt(uid);
        userID = userID+1;
      }
      
      String uID = Integer.toString(userID); 
      String mysqlDateNow = now.toString();
      String mysqlDate = date;
      
      st.executeUpdate("INSERT INTO cargosUsers.usuarios (NAME,CPF,DATEBORN,GENDER,CARGO,UPDATE_CONTROL) "
          +"VALUES ('"+name+"','"+cpf+"','"+mysqlDate+"','"+gender+"','"+cargo+"','"+mysqlDateNow+"');");
      
      conn.close();
      System.out.println(uID+","+name+","+cpf+","+mysqlDate+","+gender+","+cargo+","+mysqlDateNow);
      JOptionPane.showMessageDialog (null, "Registro inserido com sucesso!");
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }

        
    }

    
}
