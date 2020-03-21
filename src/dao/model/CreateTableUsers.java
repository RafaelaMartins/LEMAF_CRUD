/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.model;

import dao.conection.mysql.Conexao;
import java.sql.*;
/**
 *
 * @author athena
 */
public class CreateTableUsers {
    private String createTable;
    private String query;
    
    
    public CreateTableUsers(){
        Statement stmt;
        try{
            createTable ="CREATE TABLE cargosUsers.usuarios("
                            + "UID INT NOT NULL PRIMARY KEY,"
                            + "NAME VARCHAR(45) NOT NULL UNIQUE,"
                            + "CPF VARCHAR(12) NOT NULL UNIQUE,"
                            + "DATEBORN DATETIME,"
                            + "GENDER CHAR(1),"
                            + "CARGO INT,"
                            + "UPDATE_CONTROL DATETIME,"
                            + "FOREIGN KEY(CARGO) REFERENCES cargos(CID) ON DELETE CASCADE)";
            Conexao create = new Conexao();
            Conexao.CreateTable(createTable);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        query = "ALTER TABLE cargosUsers.usuarios MODIFY UID INT NOT NULL AUTO_INCREMENT";
        Conexao create2 = new Conexao();
        Conexao.CreateTable(query);
    }
}
