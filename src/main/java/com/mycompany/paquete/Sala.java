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
public class Sala {
    Integer token;
    String name;
    Usuario creador;
    List<Usuario> jugadores= new ArrayList<>();

    public Sala(Integer token, String name, Usuario creador) {
        this.token = token;
        this.name = name;
        this.creador = creador;
    }

    public Sala(String name, Usuario creador) {
        this.name = name;
        this.creador = creador;
    }
    
    public Sala(Integer token) {
        this.token = token;
    }
    
    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    public List<Usuario> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Usuario> jugadores) {
        this.jugadores = jugadores;
    }

    public void addJugador(Usuario usuario){
        jugadores.add(usuario);
    }
    
    public void deleteJugador(Usuario usuario){ 
        for(int i=0; i<jugadores.size(); i++){
            if(jugadores.get(i).getUsername().equals(usuario.getUsername())){
                jugadores.remove(i);
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        return "{Sala: " + name + ", \nCreador: " + creador.getUsername() + '}';
    }
}
