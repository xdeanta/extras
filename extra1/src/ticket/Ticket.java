/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Ticket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String NOMBRELOCAL="Bodegas Juan, S.L.";
        int nUnidad,recibido;
        float pUnidad, totalCompra, devolucion;
        Scanner sc;
        
        sc=new Scanner(System.in);
        //System.out.println(NOMBRELOCAL);
        System.out.println("Introduzca el numero de unidades: ");
        nUnidad=sc.nextInt();
        System.out.println("Introduzca el precio de la unidad:");
        pUnidad=sc.nextFloat();
        totalCompra=nUnidad*pUnidad;
        System.out.println("Ingrese el efectivo:");
        recibido=sc.nextInt();
        System.out.println(NOMBRELOCAL);
        System.out.println("Numero de Unidades: "+nUnidad + "\nPrecio por unidad:" +pUnidad);
        System.out.println("Total: " + totalCompra);
        System.out.println("Recibo:" +recibido);
        if((recibido-totalCompra) > 0){
            System.out.println("Devolucion: " + (recibido-totalCompra));
        }
        System.out.println("Gracias por venir");
    }
    
}
