import java.util.*;
public class Ejercicio1 {


	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Random rnd=new Random();

		int[] x=new int[20];

		for(int i=0;i<20;i++)
			x[i]=-10+rnd.nextInt(21);
		
		System.out.println((int)(+Math.random()*10));

		imprimirArray(x);

		int suma=0,media=0,superior=0,inferior=0,igual=0;

		//calcular la suma
		for(int i=0;i<x.length;i++){
			suma+=x[i];
		}
		//calcular la media 
		media=suma/x.length;
		//superiores a la media
		for(int i=0;i<x.length;i++){
			if(x[i]>media)
				superior++;
			else 
				if(x[i]==media)
					igual++;
				else
					inferior++;

		}
		System.out.println("Media: "+media+" Superiores: "+superior+" Inferiores: "+inferior+" Igual: "+igual);

	}

	static void rellenarArray(int[] x){


	}

	static void imprimirArray(int[] x){
		for(int i=0;i<x.length;i++)
			System.out.print(x[i] +" | ");

		System.out.println();
	}

}
