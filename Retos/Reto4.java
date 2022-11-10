package Retos;
import java.util.*;;
public class Reto4 
{
    public static void main(String[] args) 
    {
        
        int eleccion;
        int aleatorio = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO AL JUEGO DE OIEDRA PAPEL O TIJERA");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Por favor antes de continuar elija piedra, papel o tijera");
        System.out.println("Elija el numero 1 si desea piedra");
        System.out.println("Elija el numero 2 si desea papel");
        System.out.println("Elija el numero 3 si desea tijera");
        eleccion=leer.nextInt();
        System.out.println("------------------------------------------------------------------");
        switch(eleccion)
        {
            case 1:
            {
                System.out.println("Usted eligio PIEDRA");
                System.out.println("------------------------------------------------------------------");
                System.out.println("La maquina esta eligiendo");
                aleatorio = (int) (Math.random()*3)+1;
                if(aleatorio==1 && aleatorio==eleccion)
                {
                    System.out.println("La maquina escogio piedra");
                    System.out.println("EMPATE");
                }
                else if(aleatorio==2 && aleatorio!=eleccion)
                {
                    System.out.println("La maquina escogio papel");
                    System.out.println("PERDIO");
                }
                else if(aleatorio==3 && aleatorio!=eleccion)
                {
                    System.out.println("La maquina escogio tijera");
                    System.out.println("GANO");
                }
                break;
            }
            case 2:
            {
                System.out.println("Usted eligio PAPEL");
                System.out.println("------------------------------------------------------------------");
                System.out.println("La maquina esta eligiendo");
                aleatorio = (int) (Math.random()*3)+1;
                if(aleatorio==2 && aleatorio==eleccion)
                {
                    System.out.println("La maquina escogio papel");
                    System.out.println("EMPATE");
                }
                else if(aleatorio==3 && aleatorio!=eleccion)
                {
                    System.out.println("La maquina escogio tijera");
                    System.out.println("PERDIO");
                }
                else if(aleatorio==1 && aleatorio!=eleccion)
                {
                    System.out.println("La maquina escogio piedra");
                    System.out.println("GANO");
                }
                break;
            }
            case 3:
                {
                    System.out.println("Usted eligio TIJERA");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("La maquina esta eligiendo");
                    aleatorio = (int) (Math.random()*3)+1;
                    if(aleatorio==3 && aleatorio==eleccion)
                    {
                        System.out.println("La maquina escogio tijera");
                        System.out.println("EMPATE");
                    }
                    else if(aleatorio==2 && aleatorio!=eleccion)
                    {
                        System.out.println("La maquina escogio piedra");
                        System.out.println("PERDIO");
                    }
                    else if(aleatorio==1 && aleatorio!=eleccion)
                    {
                        System.out.println("La maquina escogio papel");
                        System.out.println("GANO");
                    }
                    break;
                }
        }
        leer.close();
    }
    
}
