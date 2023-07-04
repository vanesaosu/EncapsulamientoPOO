/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author USER
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(5, "vane", "ozuna");
        
        System.out.println("id: "+ alu2.getId());
        System.out.println("nombre: "+ alu2.getNombre());
        System.out.println("apellido: "+ alu2.getApellido());
        
        //Practica de modificadores(public,private,protected//
    }
    
}
