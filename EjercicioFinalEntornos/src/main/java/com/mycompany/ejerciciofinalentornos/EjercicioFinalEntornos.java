/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciofinalentornos;

import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class EjercicioFinalEntornos {
    
    public static void main(String[] args) {     
        System.out.println(generaGanador("piedra", 1));
    }
    
    public static String generaGanador(String jugada, int nivel){
        String ganador="";
        ArrayList<String> resultados = generaResultados(nivel);
        
        if(("piedra".equalsIgnoreCase(jugada)==false)&&("papel".equalsIgnoreCase(jugada)==false)&&("tijeras".equalsIgnoreCase(jugada)==false)){
            ganador="Tomatelo en serio";
        }else if("piedra".equalsIgnoreCase(jugada) && resultados.contains("papel")){
            ganador="Has perdido";
        }else if("piedra".equalsIgnoreCase(jugada) && resultados.contains("tijeras")){
            ganador="Has ganado";
        }else if("papel".equalsIgnoreCase(jugada) && resultados.contains("tijeras")){
            ganador="Has perdido";
        }else if("papel".equalsIgnoreCase(jugada) && resultados.contains("piedra")){
            ganador="Has ganado";
        }else if("tijeras".equalsIgnoreCase(jugada) && resultados.contains("piedra")){
            ganador="Has perdido";
        }else if("tijeras".equalsIgnoreCase(jugada) && resultados.contains("papel")){
            ganador="Has ganado";
        }else{
            ganador="Empate";
        }
        
        return ganador;
    }
    
    public static ArrayList<String> generaResultados(int nivel){
        ArrayList<String> resultados = new ArrayList();
        if(nivel>3)nivel=3;
        for(int i=0; i<=nivel; i++){
            resultados.add(generaTiradas());
        }
        System.out.println(resultados);
        return resultados;
    }
    
    public static String generaTiradas(){
        String tirada="";
        double valor = Math.random();
        
        do{
            if(valor<0.33){
                tirada="piedra";
            }else if(valor<0.66 && valor>=0.33){
                tirada="papel";
            }else if(valor<=0.99 && valor>0.66){
                tirada="tijeras";
            }
        }while(valor==1);
        System.out.println(tirada);
        
        return tirada;
    }
}
