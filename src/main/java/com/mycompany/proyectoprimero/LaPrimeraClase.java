/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprimero;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author CarlosFortesMedina
 */
public class LaPrimeraClase implements Serializable {

    public static void main(String[] args) {

        HashMap<Integer,String> mapa = new HashMap<>();
        
        mapa.put(10, "David");
        mapa.put(17, "Pepe");
        mapa.put(7, "Diego");
        mapa.put(20, "Roberto");
        
        if(mapa.containsKey(7)) {
            System.out.println("Está diego");
        } else {
            System.out.println("No está diego");
        }
        
        if(mapa.containsValue("Pedro")) {
            System.out.println("Está pedro");
        } else {
            System.out.println("No está pedro");
        }
        System.out.println("----------------");
        for(Map.Entry m : mapa.entrySet()) {
            System.out.println(m.getValue());
        }
        System.out.println("----------------");
        for(String valor : mapa.values()) {
            System.out.println(valor);
        }
        System.out.println("----------------");
        for(Integer i : mapa.keySet()){
            System.out.println(mapa.get(i));
        }
        
        System.out.println("----------------");
        Iterator<Integer> ite = mapa.keySet().iterator();
        
        while (ite.hasNext()) {
            System.out.println(mapa.get(ite.next()));
        }
        System.out.println("----------------");
        HashMap<String,Alumno> clase = new HashMap<>();
        
        Alumno marco = new Alumno("Marco",24);
        clase.put("Cabesa", marco);
        
        Alumno david = new Alumno("David",20);
        clase.put("Canario", david);
        
        Alumno carlos = new Alumno("Carlos",25);
        clase.put("Señor Mayor", carlos);
        
        Alumno roberto = new Alumno("Roberto",19);
        clase.put("Rata", roberto);
        
        System.out.println(clase);
    }
    
}
