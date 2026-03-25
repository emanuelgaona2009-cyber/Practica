
package operaciones;

import java.util.Scanner;

public class suma {
    
    public int sumar(int a, int b){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingreas valor a: ");
        a = entrada.nextInt();
        
        System.out.println("Ingreas valor b: ");
        b = entrada.nextInt();
        
        int suma = a+b;
                
        System.out.println("El resultado de la suma es: "+suma);
        
        return suma;
    }
    
}
