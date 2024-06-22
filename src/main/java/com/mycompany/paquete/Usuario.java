/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paquete;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class Usuario {
    Integer id;
    String username;
    String password;
    List<Integer> socketTokens= new ArrayList<>();

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getSocketTokens() {
        return socketTokens;
    }

    public void setSocketTokens(List<Integer> socketTokens) {
        this.socketTokens = socketTokens;
    }
    
    public void addSocketToken(Integer token){
        socketTokens.add(token);
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", password=" + password + ", socketTokens=" + socketTokens + '}';
    }
    
}
