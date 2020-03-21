/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.controller;

import dao.model.ModelCargos;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author athena
 */
public class ControllerCargos {
    private String name;

    public ControllerCargos() {
        
        
    }
    
    public String selectCode(String name){
        ModelCargos cargos = new ModelCargos();
        return cargos.selectCode(name);
    }
    
    public ArrayList selectAll(){
        
        ModelCargos cargos = new ModelCargos();
        return cargos.selectAll();
    }
    
    public void insert(String name){
        this.name = name;
        ModelCargos cargo = new ModelCargos();
        cargo.insert(name);
    }
    
    
    public Map<String, String> getAll(){
        ModelCargos cargo = new ModelCargos();
        return cargo.getAll();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void update(String name,String id){
        ModelCargos cargos = new ModelCargos();
        cargos.update(name, id);
    }
    public void delete(String id){
        ModelCargos cargos = new ModelCargos();
        cargos.delete(id);
    }
    
}
