/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author SALA H
 */
public class LeerDatos {
    
    public static String leer(){
        
        String mensaje = "";

        try ( BufferedReader  lector = new BufferedReader(new FileReader("C:\\Users\\SALA A\\Desktop\\clase05-2bim-ALISrj\\EjemplosSOLID\\ejemplos\\EjemploSolid\\EjemplosSOLID\\datos\\usuarios.txt"))) {

            String i;
            while ((i = lector.readLine()) != null) {
                mensaje = String.format("%s%s\n",mensaje, i);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    
        return mensaje;
    }
    
}
