package operaciones;

import java.util.ArrayList;
public class Operaciones {

    //1 
    public static int suma(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            return n + suma(n-1);
        }
    }
    
    //2
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    //3
    public static int potencia(int n, int numero)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return numero * potencia(n - 1, numero);
        }
    }

    //5
    public static int media(ArrayList<Integer> lista, int contador)
    {
        if(contador == 0)
        {
            return 0;
        }
        else
        {
            return lista.get(contador) + media(lista, contador + 1);
        }
    }

    //4
    public static int sumaLista(ArrayList<Integer> lista, int contador)
    {
        if(contador == 0)
        {
            return 0;
        }
        else
        {
            return lista.get(contador) + sumaLista(lista, contador + 1);
        }
    }

    //7
    public static int pares(int n)
    {
        if(n<2)
        {
            return 0;
        }
        else
        {
            return n + pares(n - 2);
        }
    }

    //8
    public static int paresLista(ArrayList<Integer> lista, int contador)
    {
        return 0;
    }


}