/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CarlosFortesMedina
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger.getLogger(main.class.getName()).info("Iniciando programa");
        File f = new File("fichero.txt");

        if (f.exists()) {
            System.out.println("El fichero existe");
            System.out.println(f.length());
            System.out.println(f.getAbsolutePath());

        } else {
            System.out.println("El fichero aun no existe");
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        File carpetaActual = new File(".");

        File contenido[] = carpetaActual.listFiles();

        for (File file : contenido) {
            if (file.isDirectory()) {
                System.out.println("[D] " + file.getName());
            } else {
                System.out.println(file.getName() + "(" + file.length() + ")");
            }
        }

    }

}
