import java.util.*;
public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int[][] matriz=new int[5][5];
		Random rnd=new Random();
		int fila1=0,fila2=0,x=0;
		boolean correcto;
		
		for(int i=0;i<matriz.length;i++){
			
			for(int k=0;k<matriz[i].length;k++){
				matriz[i][k]=-5+rnd.nextInt(11);

				System.out.print(matriz[i][k] +" | ");
			}
			System.out.println();
		}
		
		
		
		do{
			
			
		System.out.println("Introduce la 1ª fila a intercambiar");
		fila1=teclado.nextInt();
		int[] f1=new int[matriz[fila1].length];
		correcto=fila1<5 && fila1>=0?true:false;
		if(correcto)
		f1=matriz[fila1];
		
		
		System.out.println("Introduce la 2ª fila a intercambiar");
		fila2=teclado.nextInt();
		int[] f2=new int[matriz[fila2].length];
		correcto=fila2<5 && fila2>=0?true:false;
		if(correcto)
		f2=matriz[fila2];
		

		for(int i=0;i<matriz.length;i++)
			if(i==fila1)
				matriz[fila1]=f2;
			else
			if(i==fila2)
				matriz[fila2]=f1;
		
		}while(!correcto);
		
		System.out.println();
		
	for(int i=0;i<matriz.length;i++){
		System.out.println();
		for(int k=0;k<matriz[i].length;k++){
			System.out.print(matriz[i][k]+" | ");
		}
	}
		

	
	}

}
