package utfpr.ct.dainf.if62c.pratica;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author a1656856
 */
public class Elipse{
    public static double r;
    public static double s;
    
    
    public Elipse(double r, double s){
        this.r = r;
        this.s = s;
    }
    
    /**
     *
     * @param r
     * @param s
     * @return
     */
    public double getArea(double r ,double s){
        double Area;
        Area = Math.PI*r*s;
        return (Area);
    }
       
    public double getPerimetro(double r , double s){
        double Perimetro;
        Perimetro = Math.PI*(3*(r+s)-Math.sqrt((3*r+s)*(r+3*s)));
        return (Perimetro);
    }    

   
        
        
    
   
    
    

    
 
    
}
