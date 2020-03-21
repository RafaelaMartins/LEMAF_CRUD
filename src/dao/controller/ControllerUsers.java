/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.controller;

import dao.model.ModelCargos;
import dao.model.ModelUsers;
import dao.model.Users;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author athena
 */
public class ControllerUsers {
    String name;
    String cpf;
    Date date;
    char gender;
    String cargo;

    public ControllerUsers() {
    }
    
    public void delete(String id){
        ModelUsers user = new ModelUsers();
        user.delete(id);
    }
    
    public void Insert(String name, String cpf, String date, char gender,String cargo){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        String now = LocalDateTime.now().format(dtf);  
        ModelCargos cargos = new ModelCargos();
       
        ModelUsers user = new ModelUsers();
        user.insert(name, cpf, date, gender, cargos.selectCode(cargo), now);
        
          
        
    }
    public void edit(String id,String name, String cpf, String date, char gender,String cargo, String now){
        ModelUsers users = new ModelUsers();
        ControllerCargos cargos = new ControllerCargos();
        users.edit(id, name, cpf, date, gender,cargos.selectCode(cargo), now);
    }
    public String selectCargo(String cargo){
        ModelUsers users = new ModelUsers();
        return users.selectCargo(cargo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public ArrayList<Users> selectAll(){
        ModelUsers users = new ModelUsers();
        return users.selectAll();
    }
    
}
