package aplicacion;

import operaciones.Operaciones;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int opcion;
        int j;
        int contador = -1;
        Scanner lector = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();


        do
        {
            System.out.println("");
            System.out.println("¿Que quieres hacer?");
            System.out.println("1) Suma de los n primeros números");
            System.out.println("2) Factorial de un número");
            System.out.println("3) La potencia n-ésima de un número");
            System.out.println("4) Calcular la suma de una lista de numeros");
            System.out.println("5) Calcular la media aritmética de una lista de números");
            System.out.println("7) La suma de los n primeros numeros pares");
            System.out.println("8) La suma de los elementos pares de una lista");
            System.out.println("");
            opcion = lector.nextInt();

            if (opcion==1) 
            {
                System.out.print("Da un valor a n: ");
                int resultado = Operaciones.suma(lector.nextInt());    
                System.out.println("El resultado es: " + resultado);
            }

            if(opcion==2)
            {
                System.out.println("De qué numero quieres hacer el factorial?");
                int resultado = Operaciones.factorial(lector.nextInt());
                System.out.println("El resultado es: " + resultado);
            }

            if(opcion==3)
            {
                System.out.println("¿Qué numero quieres elevar?");
                int numero = lector.nextInt();
                System.out.println("¿A cuanto?");
                int n = lector.nextInt();
                int resultado = Operaciones.potencia(n, numero);
                System.out.println("El resultado es: " + resultado);
            }

            if(opcion == 4)
            {
                System.out.println("Añade los numeros a la lista (Para terminar pulse 0): ");
                do
                {
                    j = lector.nextInt();
                    lista.add(j);
                    contador++;

                } while (j!=0);

                int resultado = Operaciones.media(lista, contador);
                System.out.println("El resultado es: " + resultado);
                contador = 0;
            }

            if(opcion==5)
            {
                System.out.println("Añade los numeros a la lista (Para terminar pulse 0): ");
                do
                {
                    j = lector.nextInt();
                    lista.add(j);
                    contador++;

                } while (j!=0);

                int resultado = Operaciones.media(lista, contador);
                System.out.println("El resultado es: " + resultado/contador);
                contador = 0;
            }

            if(opcion==7)
            {
                System.out.println("Da un valor a n");
                int resultado = Operaciones.pares(lector.nextInt());
                System.out.println("El resultado es: " + resultado);
            }

            if(opcion==8)
            {
                System.out.println("Añade los numeros a la lista (Para terminar pulse 0): ");
                do
                {
                    j = lector.nextInt();
                    lista.add(j);
                    contador++;

                } while (j!=0);

                int resultado = Operaciones.media(lista, contador);
                System.out.println("El resultado es: " + resultado);
                contador = 0;
            }
            
        }while(opcion>0&& opcion<9);
           
        
    }
}