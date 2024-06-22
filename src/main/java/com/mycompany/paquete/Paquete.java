/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paquete;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hp
 */
public class Paquete {
    Usuario usuario;
    Sala sala;
    String comando;
    List params = new ArrayList<>();

    public Paquete(Usuario usuario, String comando) {
        this.usuario = usuario;
        this.comando = comando;
    }

    public Paquete(Sala sala, String comando) {
        this.sala = sala;
        this.comando = comando;
    }
    
    public Paquete(String comando, List<Object> params){
        this.comando = comando;
        this.params = params;
                
    }
    
    public Paquete(){}
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public List getParams() {
        return params;
    }

    public void setParams(List params) {
        this.params = params;
    }
    
    public void addParam(Object param){
        this.params.add(param);
    }
    
    public String getStringParams(){
        String s="";
        for (Object param : params) {
            if (param instanceof Number || param instanceof String) {
                s += param.toString() + ";";
            }
        }
        return s;
    }
    
    @Override
    public String toString() {
        return "Paquete{" + "usuario=" + usuario + ", sala=" + sala + ", comando=" + comando + '}';
    }
    
    
}
