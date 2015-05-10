/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Julio
 */
public class TrianguloEquilatero implements FiguraComLados {
    double a;
    double h;
    
    public TrianguloEquilatero(double a){
    
    this.a = a;
    this.h = (a*Math.sqrt(2))/2;
    
}
    @Override
    public double getLadoMenor(){
        return a;
    }
    @Override
    public double getLadoMaior(){
        return h;
    } 
    public double getArea(){
        double Area;
        Area = (getLadoMenor()*getLadoMaior())/2;
         return(Area);       
    }
    public double getPerimetro(){
        double Perimetro;
        Perimetro = 3*getLadoMenor();
        return (Perimetro);
    }
}
