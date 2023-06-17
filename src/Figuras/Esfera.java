/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;


public class Esfera extends FigurasGeometricas {
    private double Radio;
    
    public Esfera(double Radio){
        this.Radio = Radio;
        this.setVolumen(CalcularVolumen()); 
        this.setSuperficie(CalcularSuperficie());
    }
    public double CalcularVolumen() {
        double volumen = 1.333 * Math.PI * Math.pow(this.Radio, 3.0);
        return volumen;
    }
    public double CalcularSuperficie(){
        double Superficie = 4.0 * Math.PI * Math.pow(this.Radio, 2.0);
        return Superficie;
    }
}
