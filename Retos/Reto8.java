package Retos;

import java.util.Scanner;

public class Reto8 
{
    public static void main(String[] args) 
    {
        int cantidad;
        Scanner leer = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("BIENVENIDO AL PROGRAMA");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("El nadador con el menor tiempo recorrido ganara.");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("¿Cuantos competidores participaran?");
        cantidad=leer.nextInt();
        String competidores[]= new String[cantidad];
        double tiempo[]=new double[cantidad];
        System.out.println("--------------------------------------------------------------------------");
        for(int i=0; i<cantidad; i++)
        {
            System.out.println("Ingresar el nombre del competidor numero: "+i+"");
            competidores[i] = leer.next();
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Ingresar el tiempo del competidor numero: "+i+"");
            tiempo[i]=leer.nextDouble();
            System.out.println("--------------------------------------------------------------------------");
        }
        for(int i=0; i<competidores.length; i++)
        {
            System.out.println("El competidor: " +competidores[i]+", tuvo un tiempo de : "+ tiempo[i] +" minutos");   
        }
        System.out.println("--------------------------------------------------------------------------");
        for(int i=0; i<tiempo.length; i++)
        {
            if(tiempo[i]<tiempo.length)
            {
                System.out.println("El competidor "+competidores[i]+" ha ganado felicidades");   
            } 
            else if(tiempo[i]>tiempo.length)
            {
                System.out.println("El competidor "+competidores[i]+" ha perdido sigue intentandolo");   
            }
        }
        leer.close();
    }
    
}
