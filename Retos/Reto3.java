package Retos;
import java.util.Scanner;
public class Reto3 
{
    public static void main(String[] args) 
    {
        int moneda;
        int aleatorio = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO AL JUEGO DEL CARISELLAZO");
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
                }
                else
                {
                    System.out.println("Salio sello y el jugador pierde.");

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
                }
                else
                {
                    System.out.println("Salio cara y el jugador pierde.");
                }
                break;
            }
        }
        leer.close();
    }
}
