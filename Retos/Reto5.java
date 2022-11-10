package Retos;
import java.util.*;
public class Reto5 
{
    public static void main(String args[])
	{
        int precio, cantidad, i=1, Total=0;
		Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO A LA TIENDA");
		System.out.println("-------------------------------------------------");
	    System.out.println("¿Cuanta cantidad de productos desea comprar?:");
	    cantidad = leer.nextInt();
		System.out.println("-------------------------------------------------");
	       do
           {
			i++;
            System.out.println("Ingresa el precio del producto: ");
	        precio = leer.nextInt();
			System.out.println("--------------------------------------------------");
	        Total = cantidad * precio;
	        }while(i<=cantidad);
	        System.out.println("El total de la compra es: " + Total);
		leer.close();
	}
}
