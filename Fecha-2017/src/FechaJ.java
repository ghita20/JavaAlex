import java.util.*;

public class FechaJ {
	
	//Campos
	private float diaJuliano;
		
	
	//Constructor
	
	public FechaJ(float d){
		diaJuliano=d;
	}
	
	
	//Getters
	public float mostrarDiaJuliano(){
		return diaJuliano;
	}
	
	
	//Calcula DiaJuliano
	public void calcularDiaJuliano(int dia, int mes, int año){
		
		float x,b;
				
		if(mes<2){
			año-=1;
			mes+=12;
		}
				
		x=año/100;
		b=2-x+(x/4);
				
		diaJuliano= (int)( 365.25*(año+4716) +(int)( 30.6001*(mes+1) )+dia+b-1524.5 );			
	}
	
	//Calcular de DiaJuliano a Fecha
	public String mostrarFecha(){
		
		return mostrarFecha(diaJuliano);
	}
	
	//con parámetros
	public String mostrarFecha(float diaJuliano){
		int a,b,z,c,d,g,i,m;
		
		a= z = (int)(diaJuliano+0.5);
		
		if(z>=2299161){
			b = (int)((z-1867216.25)/36524.25);
			a = z + 1 + b - (int)(b/4);
		}
		
		c = a + 1524;
		d = (int)(c - 122.1/365.25);
		g = (int)(365.25 - d);
		i = (int)((c - g)/30.6001);
		
		d = c - g - (int)(30.6001 - i);
		m = i < 14 ? i - 1 : i - 13;
		a = m > 2  ? d - 4716 : d - 4715;
		
		System.out.println(d);
		
		return d+"/"+m+"/"+a;
	}
			
			
}
