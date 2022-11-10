package Retos;
import java.util.Scanner;

public class Reto9 
{
    public static void main(String[] args) 
    {
        String[][] producto = new String[4][4];
        String[][] precio = new String[4][4];
        Scanner leer = new Scanner(System.in);
        for(int f=0; f<4; f++)
        {
            for(int c=0; c<4; c++)
            {
                System.out.println("Ingrese el nombre del producto:");
                producto[f][c]=leer.next();
                System.out.println("Ingrese el precio del producto:");
                precio[f][c]=leer.next();
            }
        }
        for(int f=0; f<4; f++)
        {
            for(int c=0; c<4; c++)
            {
                System.out.print("La posicion es: "+f+","+c+""+""+" El nombre del producto es: "+producto[f][c]+"" + ": "+"El precio es: "+precio[f][c]+""+"|");
            }
        }
        leer.close();
    }    
}


 
