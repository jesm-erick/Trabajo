/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.ws01.test;

import pe.edu.upeu.ws01.config.Conexion;

/**
 *
 * @author jhone
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(Conexion.getConex()!=null){
            System.out.println("Conectado");
            
        }else{
            System.out.println("No conecntado");
        }
    }
    
}
