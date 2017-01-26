import java.util.*;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado=new Scanner(System.in);
	int[] vec1=new int[10];
	int[] vec2=new int[10];
	int[] vec3=new int[10];
	
	for(int i=0;i<vec1.length;i++){
		System.out.println("Introduce el "+(i+1)+" valor del vector 1: ");
		vec1[i]=teclado.nextInt();
	}
	for(int i=0;i<vec2.length;i++){
		System.out.println("Introduce el "+(i+1)+" valor del vector 2: ");
		vec2[i]=teclado.nextInt();
	}
	for(int i=0;i<vec3.length;i++){
		vec3[i]=vec1[i]+vec2[i];
		System.out.print(vec3[i]+ " | ");
	}
	
	System.out.println();
	Arrays.sort(vec3);
	
	System.out.print(Arrays.toString(vec3));
	}

}
