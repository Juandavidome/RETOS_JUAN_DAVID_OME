package Retos;
import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) 
    {
        int i = 1;
        do{
        double peso;
        int meses;
        Scanner dosis = new Scanner(System.in);
        System.out.println("Bienvenido al programa de calculo de dosis de vacunas para un bebe.");
        System.out.println("Por favor ingresar el peso del bebe en kilogramos: " );
        peso = dosis.nextDouble();
        System.out.println("Por favor ingresar los meses del bebe: " );
        meses = dosis.nextInt();
        double dosisvacuna = (peso + 10) / (meses * 10) * 8;
        System.out.println("La dosis adecuada a aplicar al bebe es: " + dosisvacuna );
        System.out.println("Regresando al inicio");
        System.out.println("   ");
        dosis.close();
        }while(i != 0);
    }
}


