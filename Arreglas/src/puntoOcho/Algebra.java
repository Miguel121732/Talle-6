package puntoOcho;
import  java.util.Scanner;

public class Algebra {
	
	public void Calculadora() {
		Scanner in = new Scanner(System.in);
		
		int[][] A = new int[2][2];
		int[][] B = new int[2][2];
		int elegir;
		
		do{
			menu();
			elegir = in.nextInt();
			
			switch(elegir){
	  case 1:
		    enterMatrix(A);
		    break;
	  case 2:
		    enterMatrix(B);
	    break;
      case 3:
    	    suma(A,B);
            break;
      case 4:
    	    resta(A,B);
    	    break;
      case 5:
    	    multiplicar(A,B);
    	    break;
      case 6:
    	    break;
    	
		}
		
	}
		while(elegir != 6);
		
	}
		public static void menu() {
			System.out.println("\n1. Ingrese Matrix A");
			System.out.println("2. Ingrese Matrix B");
			System.out.println("3. Mostrar A + B");
			System.out.println("4. Mostrar A - B");
			System.out.println("5. Mostrar A * B");
			System.out.println("6. Salir");
			
		}
		   public void enterMatrix(int[][] a){
			Scanner in = new Scanner(System.in);
			System.out.print("Ingrese el elemento en la primera fila y primera columna: ");
			a[0][0] = in.nextInt();
			System.out.print("Ingrese el elemento en la primera fila y segunda columna: ");
			a[0][1] = in.nextInt();
			System.out.print("Ingrese el elemento en la segunda fila y primera columna: ");
			a[1][0] = in.nextInt();
			System.out.print("Ingrese el elemento en la segunda fila y segunda columna: ");
			a[1][1] = in.nextInt();
			}
		public void suma(int[][] a,int[][] b){
			System.out.println("A + B es ");
			System.out.println((a[0][0]+b[0][0]) + "\t" + (a[0][1]+b[0][1]));
			System.out.println((a[1][0]+b[1][0]) + "\t" + (a[1][1]+b[1][1]));
			}
		public void resta(int[][] a,int[][] b){
			System.out.println("A - B es");
			System.out.println((a[0][0]-b[0][0]) + "\t" + (a[0][1]-b[0][1]));
			System.out.println((a[1][0]-b[1][0]) + "\t" + (a[1][1]-b[1][1]));
			}
		public void multiplicar(int[][] a,int[][] b){
			System.out.println("A * B es");
			System.out.println((a[0][0]*b[0][0] + a[0][1]*b[1][0]) + "\t" + (a[0][0]*b[0][1] + a[0][1]*b[1][1]));
			System.out.println((a[1][0]*b[0][0] + a[1][1]*b[1][0]) + "\t" + (a[1][0]*b[0][1] + a[1][1]*b[1][1]));
		}
		
		}
		

	


