/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.conection.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

/**
 *
 * @author athena
 */
public class Conexao {
    public Conexao () {    } //Possibilita instancias
    public static Connection con = null;
    public static void Conectar() {
        System.out.println("Conectando ao banco...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/cargosUsers","root","root");
            System.out.println("Conectado.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
 
    }
    public static void CreateTable(String createTable){
        String jdbcUrl = "jdbc:mysql://localhost:3306/cargosUsers";
        String username = "root";
        String password = "root";

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            stmt = conn.createStatement();
            stmt.executeUpdate(createTable);
            System.out.println("Table created");

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
            // Close connection
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    
   }
    
  
    
  
}
