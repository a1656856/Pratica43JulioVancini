/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/**
 *
 * @author a1656856
 */
public class Pratica41 {
     
      
     
      private static final Circulo c = new Circulo(2);
      private static final Elipse e = new Elipse(2,3);
      
      
      
      public static void main(String[] args){
          System.out.println("Area da Elipse: " + e.getArea(2,3));
          System.out.println("Perimetro da Elipse: " + e.getPerimetro(2,3));
          System.out.println("Area do Circulo: "+ c.getArea(2));
          System.out.println("Perimetro do Cirulo: " + c.getPerimetro(2));
          
      }
    
   

    
   
}
