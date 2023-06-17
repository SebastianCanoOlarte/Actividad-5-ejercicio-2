/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;


public class Cilindro extends FigurasGeometricas{
    private double Radio;
    private double Altura;
    
    public Cilindro(double Radio,double Altura){
        this.Radio = Radio;
        this.Altura = Altura;
        this.setVolumen(CalcularVolumen());
        this.setSuperficie(CalcularSuperficie());
    }
    public double CalcularVolumen(){
        double Volumen = Math.PI*Altura*Math.pow(Radio,2.0);
        return Volumen;
    }
    public double CalcularSuperficie(){
        double AreaLadoA = 2.0*Math.PI*Radio*Altura;
        double AreaLadoB = 2.0*Math.PI*Math.pow(Radio,2.0);
        return AreaLadoA + AreaLadoB;
    }
}
