/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaholamundo;

/**
 *
 * @author profesor
 */
public class PruebaHolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo"); 
        Mensaje m = new Mensaje();
        System.out.println("*** Despues de crear la instancia de Mensaje");
        System.out.println("Mensaje: " + m.mensaje);
    }
    
}
