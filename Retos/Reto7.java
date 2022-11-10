package Retos;

import java.util.Scanner;

public class Reto7 
{
    public static void main(String[] args) 
    {
        int cantidad;
        double agregar=0, resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("BIENVENIDO AL PROGRAMA");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("¿Cuantas notas desea evaluar?");
        cantidad=leer.nextInt();
        int nota[]=new int[cantidad];
        System.out.println("--------------------------------------------------------------------------");
        for(int i=0; i<cantidad; i++)
        {
            System.out.println("Ingresar la nota numero: "+i+"");
            nota[i] = leer.nextInt();
            agregar += nota[i];
        }
        resultado = agregar/cantidad;
        System.out.println("El resultado es: "+resultado+"");
        if(resultado<3)
        {
            System.out.println("Reprobo la materia.");
        }
        else if(resultado>3&&resultado<4)
        {
            System.out.println("Ha pasado la materia con calificaciones regulares(Raspando).");
        }
        else if(resultado>4)
        {
            System.out.println("Ha pasado la materia con calificaciones excelentes sigue asi.");
        }
        System.out.println("GRACIAS POR USAR EL PROGRAMA");
        leer.close();
    }
}
