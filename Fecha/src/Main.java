import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Fecha fecha=null;
		int dia,mes,año;
		boolean correcto=true;
		Calendar date=new GregorianCalendar();
		System.out.println(date.DATE+" "+date.MONTH+" "+date.YEAR);
		do{
			System.out.println("Introduce el dia de hoy: ");
			dia=teclado.nextInt();
			System.out.println("Introduce el mes actual: ");
			mes=teclado.nextInt();
			System.out.println("Introduce el año actual: ");
			año=teclado.nextInt();
			fecha=new Fecha(dia,mes,año);
			if(!fecha.esCorrecta(dia, mes, año)){
				correcto=false;
				System.out.println("Fecha introducida incorrecta");
				
			}else
				if(fecha.fechaActual(dia, mes, año)){		
				correcto=true;
				System.out.println("Fecha de hoy acertada");
			}else{
				correcto=false;
				System.out.println("No es la fecha de hoy");
				}
		}while(!correcto);
		do{
			System.out.println("Introduce el dia de nacimiento: ");
			dia=teclado.nextInt();
			System.out.println("Introduce el mes de nacimiento: ");
			mes=teclado.nextInt();
			System.out.println("Introduce el año de nacimiento: ");
			año=teclado.nextInt();
			
			correcto=año==0?true:false;
			
			fecha=new Fecha(dia,mes,año);
			if(fecha.esCorrecta(dia, mes, año)){
				System.out.println(fecha.getCadenaFecha());
				System.out.println(fecha.getCadenaFecha2());
				System.out.println(fecha.getEdad(año));
			}
			
		
		
		}while(!correcto);
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
