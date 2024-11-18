package trianguloisosceles;

import java.util.Scanner;

public class TrianguloIsosceles {

    /**
     * Dibujar un triangulo isósceles
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbase, filas, asterix, blancos;
        do{
        System.out.print("Número impar de elementos: ");
        nbase=sc.nextInt();
        if (nbase%2 ==0){
            System.out.println("El número ha de ser impar");
            nbase=0;
            }
        } while ( nbase==0);
        filas=nbase/2+1;
        for(int i=1, j=1; i<=filas;i++, j=j+2){
        blancos = filas -i;
        asterix = j;
            for (int b=1;b<=blancos;b++){
                System.out.print(" ");
            } 
            for (int n=1;n<=asterix;n++){
                System.out.print("*");
            }
        System.out.println();    
        }
    }
    
}
