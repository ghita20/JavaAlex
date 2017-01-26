import java.util.*;
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int [] vector=new int[20];
		int elMayor=0,elMenor=0, posMayor=0,posMenor=0;
		for(int i=0;i<vector.length;i++){
			vector[i]=(int)(Math.random()*10);
			System.out.print(vector[i]+" | ");
			}
		for(int i=0;i<20;i++){
			if(i==0){
				elMenor=vector[i];
				posMenor=i;
			}
				
			if(elMenor>vector[i]){
				elMenor=vector[i];
				posMenor=i;
			}
			
			if(elMayor<vector[i]){
				elMayor=vector[i];
				posMayor=i;
			}
				
		}
		System.out.println();
		System.out.println("El mayor es: "+elMayor+" con posicion "+posMayor+" y el menor es: "+elMenor+" con posicion "+posMenor);
	}

}
