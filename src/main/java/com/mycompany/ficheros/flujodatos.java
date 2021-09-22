/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CarlosFortesMedina
 */
public class flujodatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Try con recursos (auto closeable)
         */
        try ( FileInputStream fis = new FileInputStream("pom.xml");
              FileOutputStream fos = new FileOutputStream("pomm.xml")) {
            //Si al outputstream(crear y copiar el otro archivo)
            //le añades true, hace un append al final del contenido que tenia
            int b;
            
            while((b = fis.read()) != -1 ) {
                
                System.out.print((char)b);
                
                fos.write(b);
                
            }
            
            
            System.out.println(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(flujodatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(flujodatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
