import java.util.Calendar;
import java.util.GregorianCalendar;

class Fecha {
		//Campos
		private int dia,mes,a�o,diaJuliano;
		private static Calendar fechaActual=new GregorianCalendar();
		
		//Fecha por defecto
		private static final int DIA_ACTUAL=fechaActual.get(Calendar.DAY_OF_MONTH),MES_ACTUAL=fechaActual.get(Calendar.MONTH)+1,A�O_ACTUAL=fechaActual.get(Calendar.YEAR);
		
		//Constructores
		public Fecha(){
			dia=DIA_ACTUAL;
			mes=MES_ACTUAL;
			a�o=A�O_ACTUAL;
		}
		
		public Fecha(int dia, int mes, int a�o ){
			
			if(esCorrecta(dia,mes,a�o)){
				this.dia=dia;
				this.mes=mes;
				this.a�o=a�o;
			} else {
				this.dia=DIA_ACTUAL;
				this.mes=MES_ACTUAL;
				this.a�o=A�O_ACTUAL;
			}
			
			
		}
		
		//Getters
		public int getDia(){
			return dia;
		}
		
		public int getMes(){
			return mes;
		}
		
		public int getA�o(){
			return a�o;
		}
		
		public String mostrarFecha(){
			return dia+"/"+mes+"/"+a�o;
		}
		
		public float mostrarDiaJuliano(){
			return diaJuliano;
		}
		
		//Setters
		public void setDia(int dia){
			if(esCorrecta(dia,mes,a�o))
				this.dia=dia;
		}
		public void setMes(int mes){
			if(esCorrecta(dia,mes,a�o))
				this.mes=mes;
		}
		public void setA�o(int a�o){
			if(esCorrecta(dia,mes,a�o))
				this.a�o=a�o;
		}
		
		
		//comprobar a�o bisiesto
		public boolean esBisiesto(int a�o){
			boolean bisiesto = a�o%4==0 && (a�o%100!=0 || a�o%400==0);
						
			return bisiesto;
		}
		
		//comprobar fecha correcta
		public boolean esCorrecta(int dia, int mes, int a�o){
			boolean correcto=true;
			//fechas incorrectas
			if( a�o==1582 && mes==10 && (dia>4 && dia <15) ){
				correcto=false;
			}
			
			//comprobar dias del mes
			if(correcto)
				switch(mes){
					case 1: case 3: case 5: case 7: case 8: case 10: case 12:
						correcto= dia>0 && dia<=31?true:false; 
						break;
						
					case 2: 
						if(esBisiesto(a�o))
							correcto= dia>0 && dia<=29?true:false; 
						else
							correcto= dia>0 && dia<29?true:false;
						break;
						
					case 4: case 6: case 9: case 11:
						correcto= dia>0 && dia<31?true:false;
						break;
					
					default:
						correcto=false;
				}//fin switch
			
			return correcto;
		}
		
	
		//Incrementar dia
		public void incrementarDia(){
			++dia;
			incrementarDias(1);

		}
		
		//Incrementar a�os
		public void incrementarA�os(int a�os){
			a�o+=a�os;
		}
		
		//Incrementar meses
		public void incrementarMeses(int meses){
			int mes=this.mes,a�o=this.a�o;
			
			if (meses > 12) {
				a�o+=mes/12;
			} 
			
			meses = meses%12;
			
			mes = mes + meses;
			
			if (mes > 12) {
				a�o+=mes/12;
				mes = mes%12;
			}
			
			if( esCorrecta(dia,mes,a�o) ){
				this.mes=mes;
				this.a�o=a�o;
			}
			
		}
		
		//Incrementar x dias
		public void incrementarDias(int dias){
			//dias introducidos 
			int dias_totales=dias+dia,diasT=0;
			boolean correcto=true;

			while(correcto){
				switch(mes){
				case 2: 
					diasT=esBisiesto(a�o)?29:28; break;	
				case 4: case 6: case 9: case 11:
					diasT=30;
					break;

				default:
					diasT=31;
				}//fin switch

				if(dias_totales>diasT){
					dias_totales-=diasT;
					mes++;
					correcto=true;
				} else
					correcto=false;

				if (mes > 12) {
					a�o+=mes/12;
					mes = mes%12;
				}
				
			}//fin while;
			
			//Asignar el resto de los dias a dias
			dia=dias_totales;
			
			if( !esCorrecta(dia,mes,a�o))
				dia+=10;
			
		}
		
		public void incrementarDiaMesA�o(int dias,int meses,int a�os){
			incrementarDias(dias);
			incrementarMeses(meses);
			incrementarA�os(a�os);
			
		}
		
		
		//Calcula DiaJuliano
		
		
		public void calcularDiaJuliano(){
		int dia=this.dia,mes=this.mes,a�o=this.a�o;
		float x,b;
		
		if(this.mes<2){
			a�o-=1;
			mes+=12;
		}
		
		x=a�o/100;
		b=2-x+(x/4);
		
		diaJuliano= (int)( 365.25*(a�o+4716) +(int)( 30.6001*(mes+1) )+dia+b-1524.5 );
		
			
		}
		
		
		
		
		
		
		
		
		
		//M�todo static
		public static String FechaActual(){
			return fechaActual.get(Calendar.DAY_OF_MONTH) +"/" +fechaActual.get(Calendar.MONTH)+1 +"/" +fechaActual.get(Calendar.YEAR);
		}
		
}
public class probandoJuliano {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha[] miFecha={
				new Fecha(5,10,1582),
				new Fecha(12,3,2011),
				new Fecha(24,2,2012)};
		
		miFecha[0].incrementarDias(5);
		System.out.println(miFecha[0].mostrarFecha());
		
		miFecha[0].calcularDiaJuliano();;
		
		System.out.println(miFecha[0].mostrarDiaJuliano());
	}

}
