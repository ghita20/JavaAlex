import java.util.*;
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		float[][] matriz=new float[10][10];
		Random rnd=new Random();
		
		
		//Damos valor a la matriz
		for(int i=0;i<matriz.length;i++){ 
			
			for(int k=0;k<matriz[i].length;k++){
				matriz[i][k]=(float)Math.round( ( -5+rnd.nextFloat()*10) *100 ) /100;
				
				
			}
			System.out.println("Fila "+i+" de la matriz.");
			System.out.println(Arrays.toString(matriz[i]));
			System.out.println("-------------------------------");

		}
		System.out.println();
		//Sumamos cada fila y columna de ella
		int fila=0,columna=0;
		for(int i=0;i<matriz.length;i++){
			fila=0;
			for(int k=0;k<matriz[i].length;k++){
				fila+=matriz[i][k];
			}
			System.out.println("****************** Fila "+(i+1)+" : "+fila);
			
		}
		System.out.println();
		for(int i=0;i<matriz[0].length;i++){
			columna=0;
			for(int k=0;k<matriz.length;k++){
				columna+=matriz[k][i];
			}
			System.out.println("*  *  *  *  *  *   Columna "+(i+1)+" : "+columna);
		}
		
	}

}
