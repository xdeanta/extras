/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;


import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        double radio, area;
        sc=new Scanner(System.in);
        System.out.println("Introduzca el radio del circulo:");
        radio=sc.nextFloat();
        area=Math.PI*Math.pow(radio,2d);
        System.out.println("El area del circulo es: " +area);
    }
    
}
