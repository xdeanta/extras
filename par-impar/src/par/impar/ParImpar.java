/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par.impar;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int sum=0, prod=1,num;
        System.out.println("Introduzca 10 numeros");
        for(int i=0;i<10;i++){
            num=sc.nextInt();
            if(num%2==0){
                sum=sum+num;
            }else{
                prod=prod*num;
            }
        }
        System.out.println("Suma: " + sum);
        System.out.println("Producto: " +prod);
    }
    
}
