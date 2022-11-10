package Retos;
import java.util.*;
public class Reto6 
{
    public static void main(String[] args) 
    {
        double apuesta, respuesta1;
        int moneda, contador, i=0, precio=10;
        int aleatorio = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO AL JUEGO DEL CARISELLAZO");
        System.out.println("------------------------------------------------------------------");
        System.out.println("¿Cuantas veces desea repetir el juego?");
        contador=leer.nextInt();
        System.out.println("Seleccione cuanto desea apostar, cada vez que gane ganara 10 y cada vez que pierda perdera 10: ");
        apuesta=leer.nextDouble();
        do
        {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Por favor antes de continuar elija cara o sello de la moneda.");
        System.out.println("Elija el numero 1 si desea cara");
        System.out.println("Elija el numero 2 si desea sello");
        moneda=leer.nextInt();
        System.out.println("------------------------------------------------------------------");
        switch(moneda)
        {
            case 1:
            {
                System.out.println("Usted eligio CARA");
                System.out.println("------------------------------------------------------------------");
                System.out.println("Se esta tirando la moneda.");
                aleatorio = (int) (Math.random()*2)+1;
                if(aleatorio==1 && aleatorio==moneda)
                {
                    System.out.println("Salio cara y el jugador gana."); 
                    respuesta1=(apuesta+precio);
                    System.out.println("El dinero de la apuesta se incrementa a "+respuesta1+"");
                }
                else
                {
                    System.out.println("Salio sello y el jugador pierde.");
                    respuesta1=(apuesta-precio);
                    System.out.println("El dinero de la apuesta se disminuye a "+respuesta1+"");
                }
                break;
            }
            case 2:
            {
                System.out.println("Usted eligio SELLO");
                System.out.println("------------------------------------------------------------------");
                System.out.println("Se esta tirando la moneda.");
                aleatorio = (int) (Math.random()*2)+1;
                if(aleatorio==2 && aleatorio==moneda)
                {
                    System.out.println("Salio sello y el jugador gana.");
                    respuesta1=(apuesta+precio);
                    System.out.println("El dinero de la apuesta se incrementa a "+respuesta1+"");
                }
                else
                {
                    System.out.println("Salio cara y el jugador pierde.");
                    respuesta1=(apuesta-precio);
                    System.out.println("El dinero de la apuesta se disminuye a "+respuesta1+"");
                }
                break;
            }
        }
        i++;
    }while(i<contador);
    System.out.println("Usted jugo "+contador+" veces el juego del CARISELLAZO");
        leer.close();
    }
}
    

