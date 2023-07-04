/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

/**
 *
 * @author USER
 */
public class circulo  implements figura, Dibujable, Rotable{

    private double radio;

    public circulo() {
    }

    public circulo(double radio) {
        this.radio = radio;
    }

   

    
    
    
    
    
    
    
    @Override
    public double calculararea() {
        double pi = 3.14;
         double resultado= pi * radio *radio ;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando el circulo");
    }

    

    
    
}
