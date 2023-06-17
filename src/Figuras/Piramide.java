/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;


public class Piramide extends FigurasGeometricas{
    private double Base;
    private double Altura;
    private double Apotema;
    
    public Piramide(double Base,double Altura,double Apotema){
        this.Base = Base;
        this.Altura = Altura;
        this.Apotema = Apotema;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }
    public double CalcularVolumen(){
        double Volumen = (Math.pow(Base, 2.0) * Altura) / 3.0;
        return Volumen;
    }
    public double CalcularSuperficie(){
        double AreaBase = Math.pow(Base, 2.0);
        double AreaLado = 2.0 * Base * Apotema;
        return AreaBase + AreaLado;
    }
    
}
