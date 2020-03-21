/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.model;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author athena
 */
public class ModelCargos {
    private Map <String,String> all = new HashMap<String,String>();
    public ModelCargos(){
        
    
    }
    
    public void insert(String name){
        
        try{
      // create a mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
      
      Statement st = conn.createStatement();

      // note that i'm leaving "date_created" out of this insert statement
      st.executeUpdate("INSERT INTO cargosUsers.cargos (NAME) "
          +"VALUES ('"+name+"')");

      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
        JOptionPane.showMessageDialog (null, "Registro inserido com sucesso");

  }
    public ArrayList selectAll(){
    ArrayList name = new ArrayList();  
    try{
      // create a mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
      Statement st = conn.createStatement();
      // note that i'm leaving "date_created" out of this insert statement
      String sql = "SELECT * FROM cargosUsers.cargos";
      ResultSet rs = st.executeQuery(sql);
    
      while(rs.next()){
         //Retrieve by column name
         this.all.put(rs.getString("CID"), rs.getString("NAME"));
         name.add(rs.getString("NAME"));
         
      }
      rs.close();

      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
    return name;
  }
    
    public String selectCode(String name){
        String code = new String();
        try{
                    // create a mysql database connection
                String myDriver = "com.mysql.jdbc.Driver";
                String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
                Class.forName(myDriver);
                Connection conn = DriverManager.getConnection(myUrl, "root", "root");
                Statement st = conn.createStatement();
                // note that i'm leaving "date_created" out of this insert statement
                String sql = "SELECT CID FROM cargosUsers.cargos WHERE cargosUsers.cargos.NAME='"+name+"';";
                ResultSet rs = st.executeQuery(sql);

                while(rs.next()){
                //Retrieve by column name
                       code = rs.getString("CID");
                }
                rs.close();
                conn.close();
            }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        System.out.println(code);
        return code;
       
    }
    
    public Map<String, String> getAll(){
        return this.all;
    }
    
    public void delete(String id){
        try{
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");
            Statement st = conn.createStatement();
            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("DELETE FROM cargos WHERE CID='"+id+"'");
            conn.close();
        }
        catch (Exception e)
        {
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
    JOptionPane.showMessageDialog (null, "Registro deletado com sucesso!");
    }
    
    public void update(String name, String id){
     try{
        
      // create a mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/cargosUsers";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
      
      Statement st = conn.createStatement();

      // note that i'm leaving "date_created" out of this insert statement
      st.executeUpdate("UPDATE cargosUsers.cargos SET cargos.NAME = '"+name+"' WHERE cargos.CID='"+id+"'");
      conn.close();
      JOptionPane.showMessageDialog (null, "Registro atualizado com sucesso!");
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
    
    }
    
 }
   
