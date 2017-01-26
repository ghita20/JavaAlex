import java.util.*;
public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int[][] matrix=new int[5][5];
		Random rnd=new Random();
		for(int i=0;i<matrix.length;i++){
			
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j]=-100+rnd.nextInt(201);
				System.out.print(matrix[i][j]+" | ");
			}
			System.out.println();
				
		}
		int[] posicionMenor=new int[2]; 
		int[] posicionMayor=new int[2];
		int elMenor=0,elMayor=0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
			if(i==0 && j==0){
				elMenor=matrix[i][j];
				posicionMenor[0]=i;
				posicionMenor[1]=j;
			}
				
			if(elMenor>matrix[i][j]){
				elMenor=matrix[i][j];
				posicionMenor[0]=i;
				posicionMenor[1]=j;
			}
			
			if(elMayor<matrix[i][j]){
				elMayor=matrix[i][j];
				posicionMayor[0]=i;
				posicionMayor[1]=j;
			}
				
		}//segundo for
		}//primer for
		System.out.println("El mayor es: "+elMayor+" con posicion "+Arrays.toString(posicionMayor)+" y el menor es: "+elMenor+" con posicion "+Arrays.toString(posicionMenor));
		
		
		
	}

}
