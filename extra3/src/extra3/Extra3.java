/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        int numero;
        sc=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        numero=sc.nextInt();
        if(numero <= 999){
            if(numero>=100){
                System.out.println("tercer numero:" +(numero/100) + " Segundo numero:" +((numero%100)/10) + " primer numero:" +(numero%10));
            }else{
                if(numero>=10){
                    System.out.println("Segundo numero:" +(numero/10) + " primer numero:" +(numero%10));
                }else{
                    System.out.println("primer numero: " +numero);
                }
            }
        }
    }
    
}
