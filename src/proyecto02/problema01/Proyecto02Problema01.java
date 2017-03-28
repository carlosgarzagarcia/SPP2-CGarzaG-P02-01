/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02.problema01;
import java.util.Scanner;
/**
 *
 * @author carlos
 */
public class Proyecto02Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        int opciones=0;
        boolean ciclo = true;
        do{
        System.out.println("CALCULADORA");
        System.out.println("Elige la opción deseada:");
        System.out.println("1. Suma de matrices");
        System.out.println("2. Resta de matrices");
        System.out.println("3. Multiplicación de matrices");
            System.out.println("4. Salir");
            try{
        opciones=teclado.nextInt();}
            catch(Exception e){
                teclado.next();
            }

        switch(opciones){
            case 1:              
                suma();
                System.out.println("");
                break;
            case 2:
                resta();
                System.out.println("");
                break;
            case 3:
                multiplicacion();
                System.out.println("");
                break;
            case 4:
                System.out.println("Fin");
                ciclo=false;
                break;
            default:
                System.out.println("Error");
                System.out.println("");
                break;
        }
        }
        while(ciclo);
    }
    
     public static int solicitanumero(String b){
            Scanner teclado = new Scanner (System.in);
        boolean flag;
        int a=0;
        do{
            try{
        System.out.println("Escribe "+b);
        a=teclado.nextInt();
        flag=false;
        
            }
        catch(Exception e){
                System.out.println("Error");
                teclado.next();
                flag=true;
            }
        }
        while(flag);
        return a;       
    }
     
      public static int[][] arreglo(String a,int tam){
     int [][]arreglo = new int [tam][tam];
            System.out.println("Arreglo "+a);
      
    for (int i=0; i<arreglo.length;i++){
    for (int j=0;j<arreglo[i].length;j++){
    arreglo[i][j]= solicitanumero("un número : ");
        }
        }
    return arreglo;
     }
     
     public static void suma(){
        int tamano= solicitanumero("el tamaño del arreglo: ");
        int a[][]=arreglo("A",tamano);
        int b[][]=arreglo("B",tamano);
         int [][] r= new int [a.length][a.length];
         System.out.println("Suma de matrices:");
         for (int i=0;i<a.length;i++){
             for (int j=0;j<a[i].length;j++){
                 r[i][j]=a[i][j]+b[i][j];
                 System.out.print("["+r[i][j]+"]");
             }
             System.out.println();
             
         } 
         }
      public static void resta(){
        int tamano= solicitanumero("el tamaño del arreglo: ");
        int a[][]=arreglo("A",tamano);
        int b[][]=arreglo("B",tamano);
    int r[][] = new int [a.length][a.length];
         System.out.println("Resta de las matrices::");
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            r[i][j]=a[i][j]-b[i][j];
            System.out.print("["+r[i][j]+"]");
        }
            System.out.println();
        }
        }
       public static void multiplicacion(){
        int tamano= solicitanumero("el tamaño del arreglo: ");
        int a[][]=arreglo("A",tamano);
        int b[][]=arreglo("B",tamano);
    int [][]r= new int [a.length][a.length];
    int[][]r2= new int [a.length][a.length];
           System.out.println("Multiplicación de matrices:");
           for(int i=0;i<a.length;i++){
               for(int j=0;j<a.length;j++){
                   for(int k=0;k<a.length;k++){
                       r[i][j]=a[i][k]*b[k][j];     
                       r2[i][j]=r2[i][j]+r[i][j];
                   }
                   System.out.print("["+r2[i][j]+"]");  
               }
               System.out.println();
           }
}
    
}