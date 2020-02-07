
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        //*Agregar las variables
        int N, Sig=0;
        int N1=1;
        int N2;
        //*Agregar un objeto de lectura
        Scanner lee=new Scanner(System.in);
        //*Solicitar al usuario los datos
        System.out.print("Cuantos numeros de la serie desea: ");
        N=lee.nextInt();
        
        for (int Cont = 1; Cont<=N; Cont++){
            N2=Sig;
            Sig=N1+Sig;
            N1=N2;
            System.out.println(N1);
            
    }
                
        
        
    }
    
}
