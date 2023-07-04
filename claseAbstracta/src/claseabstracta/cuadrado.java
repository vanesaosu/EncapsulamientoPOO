
package claseabstracta;


public class cuadrado implements figura, Dibujable {

    
    private double lado;

    public cuadrado() {
    }

    public cuadrado(double lado) {
        this.lado = lado;
    }

   
    
    
    
    @Override
    public double calculararea() {
        double resultado = lado * lado;
        return resultado;
        
    }

    @Override
    public void dibujar() {
       System.out.println("Estoy dibujando un cuadrado :) ");
    }
    
}
