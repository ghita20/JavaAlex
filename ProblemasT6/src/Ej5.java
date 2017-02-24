import java.util.*;
public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int[] v1=new int[10];
		int[] v2=new int[10];
		Random rnd=new Random();
		for(int i=0;i<v1.length;i++){
			v1[i]=rnd.nextInt(5);
		}
		System.out.println(Arrays.toString(v1));
		for(int i=0;i<v2.length;i++){
			v2[i]=rnd.nextInt(5);
		}
		System.out.println(Arrays.toString(v2));
		for(int i=0;i<v1.length;i++){
			int veces=0;
			for(int k=0;k<v2.length;k++){
				if(v1[i]==v2[k])
					veces++;
			}
			System.out.println("elemento "+(i +1)+":" +veces+" veces");
		}
	}

}
