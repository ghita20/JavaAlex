import java.util.Calendar;
import java.util.GregorianCalendar;

class Fecha {
		//Campos
		private int dia,mes,año,diaJuliano;
		private static Calendar fechaActual=new GregorianCalendar();
		
		//Fecha por defecto
		private static final int DIA_ACTUAL=fechaActual.get(Calendar.DAY_OF_MONTH),MES_ACTUAL=fechaActual.get(Calendar.MONTH)+1,AÑO_ACTUAL=fechaActual.get(Calendar.YEAR);
		
		//Constructores
		public Fecha(){
			dia=DIA_ACTUAL;
			mes=MES_ACTUAL;
			año=AÑO_ACTUAL;
		}
		
		public Fecha(int dia, int mes, int año ){
			
			if(esCorrecta(dia,mes,año)){
				this.dia=dia;
				this.mes=mes;
				this.año=año;
			} else {
				this.dia=DIA_ACTUAL;
				this.mes=MES_ACTUAL;
				this.año=AÑO_ACTUAL;
			}
			
			
		}
		
		//Getters
		public int getDia(){
			return dia;
		}
		
		public int getMes(){
			return mes;
		}
		
		public int getAño(){
			return año;
		}
		
		public String mostrarFecha(){
			return dia+"/"+mes+"/"+año;
		}
		
		public float mostrarDiaJuliano(){
			return diaJuliano;
		}
		
		//Setters
		public void setDia(int dia){
			if(esCorrecta(dia,mes,año))
				this.dia=dia;
		}
		public void setMes(int mes){
			if(esCorrecta(dia,mes,año))
				this.mes=mes;
		}
		public void setAño(int año){
			if(esCorrecta(dia,mes,año))
				this.año=año;
		}
		
		
		//comprobar año bisiesto
		public boolean esBisiesto(int año){
			boolean bisiesto = año%4==0 && (año%100!=0 || año%400==0);
						
			return bisiesto;
		}
		
		//comprobar fecha correcta
		public boolean esCorrecta(int dia, int mes, int año){
			boolean correcto=true;
			//fechas incorrectas
			if( año==1582 && mes==10 && (dia>4 && dia <15) ){
				correcto=false;
			}
			
			//comprobar dias del mes
			if(correcto)
				switch(mes){
					case 1: case 3: case 5: case 7: case 8: case 10: case 12:
						correcto= dia>0 && dia<=31?true:false; 
						break;
						
					case 2: 
						if(esBisiesto(año))
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
		
		//Incrementar años
		public void incrementarAños(int años){
			año+=años;
		}
		
		//Incrementar meses
		public void incrementarMeses(int meses){
			int mes=this.mes,año=this.año;
			
			if (meses > 12) {
				año+=mes/12;
			} 
			
			meses = meses%12;
			
			mes = mes + meses;
			
			if (mes > 12) {
				año+=mes/12;
				mes = mes%12;
			}
			
			if( esCorrecta(dia,mes,año) ){
				this.mes=mes;
				this.año=año;
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
					diasT=esBisiesto(año)?29:28; break;	
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
					año+=mes/12;
					mes = mes%12;
				}
				
			}//fin while;
			
			//Asignar el resto de los dias a dias
			dia=dias_totales;
			
			if( !esCorrecta(dia,mes,año))
				dia+=10;
			
		}
		
		public void incrementarDiaMesAño(int dias,int meses,int años){
			incrementarDias(dias);
			incrementarMeses(meses);
			incrementarAños(años);
			
		}
		
		
		//Calcula DiaJuliano
		
		
		public void calcularDiaJuliano(){
		int dia=this.dia,mes=this.mes,año=this.año;
		float x,b;
		
		if(this.mes<2){
			año-=1;
			mes+=12;
		}
		
		x=año/100;
		b=2-x+(x/4);
		
		diaJuliano= (int)( 365.25*(año+4716) +(int)( 30.6001*(mes+1) )+dia+b-1524.5 );
		
			
		}
		
		
		
		
		
		
		
		
		
		//Método static
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
