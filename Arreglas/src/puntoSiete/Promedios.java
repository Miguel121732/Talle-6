package puntoSiete;
import java.util.Scanner;

public class Promedios {
	
	public void CalcularPromedio() {
	 Scanner in = new Scanner(System.in);
	
     int numNotas = 5;
     double[] notas = new double [5];
     double suma=0, promedio;
     
    
     notas = new double[numNotas];

     System.out.println("Ingrese un total de " + numNotas + " notas\n");
     for(int i=0; i<notas.length; i++){
         System.out.print("Nota "+ (i+1) + ": ");
         notas[i] = in.nextDouble();
     }
  
     for (double nota : notas) {
         suma += nota;
     }
     System.out.println("\nSuma total de Notas: " + suma);

    
     promedio = suma / numNotas;
     System.out.println("El promedio es: " + promedio);
	           
     }
    } 
  

