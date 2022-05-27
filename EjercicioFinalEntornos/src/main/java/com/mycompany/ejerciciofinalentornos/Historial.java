/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciofinalentornos;

import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class Historial {
    public ArrayList<String> historialNormal = new ArrayList();
    public ArrayList<String> historialDificil = new ArrayList();
    public ArrayList<String> historialMuyDificil = new ArrayList();
    
    
    public boolean insertarResultado(String ganador, int nivel){
        String resultado="";
        boolean salida;
        
        switch (ganador) {
            case "Has perdido" -> resultado="Derrota";
            case "Empate" -> resultado="Empate";
            case "Has ganado" -> resultado="Victoria";
            default -> {
            }
        }
        
        switch (nivel) {
            case 1 -> {
                historialNormal.add(resultado);
                salida=true;
            }
            case 2 -> {
                historialDificil.add(resultado);
                salida=true;
            }
            case 3 -> {
                historialMuyDificil.add(resultado);
                salida=true;
            }
            default -> salida=false;
        }
        
        return salida;
    }
    
}
