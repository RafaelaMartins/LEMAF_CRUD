/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.model;
import dao.conection.mysql.Conexao;

/**
 *
 * @author athena
 */
public class CreateTableCargos {
    private String createTable;
        
    public CreateTableCargos(){
        
        createTable ="CREATE TABLE cargosUsers.cargos ("
                        + "CID INT NOT NULL AUTO_INCREMENT,"
                        + "NAME VARCHAR(45) NOT NULL,"
                        + "PRIMARY KEY (CID))";
        Conexao create = new Conexao();
        Conexao.CreateTable(createTable);
        
    }            
}
