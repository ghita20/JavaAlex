import java.util.*;
public class Fecha {

	private int dia,mes,a�o,diasMes;
	private String nombreMes;
	Calendar fecha=new GregorianCalendar();
	public Fecha(int dia, int mes, int a�o){
		if(esCorrecta(dia,mes,a�o)){
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;
		}
	}
	public boolean esBisiesto(int a�o){
		if(a�o%4==0)
			return true;
		return false;
	}
	public boolean esCorrecta(int dia, int mes, int a�o){
		switch(mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(dia<=31 && dia<=0)
				return true;break;
		case 2:
			if(a�o%4==0){
				if(dia<=29 && dia>=0)
					return true;
			}else
				if(dia<=28 && dia>=0)
					return true;break;
		default:
			if(dia<=30 && dia>=0)
				return true;break;
			
		}//fin switch
		return false;
		}//fin esCorrecta
	public String getCadenaMes(){
		switch(mes){
		case 1:
			nombreMes="Enero";
		case 2:
			nombreMes="Febrero";
		case 3:
			nombreMes="Marzo";
		case 4:
			nombreMes="Abril";
		case 5:
			nombreMes="Mayo";
		case 6:
			nombreMes="Junio";
		case 7:
			nombreMes="Julio";
		case 8:
			nombreMes="Agosto";
		case 9:
			nombreMes="Septiembre";
		case 10:
			nombreMes="Octubre";
		case 11:
			nombreMes="Noviembre";
		case 12:
			nombreMes="Diciembre";
	
		
		
		}
		return nombreMes;
	}//fin getMes
	public int getDiaMes(){
		switch(mes){
		case 2:
			if(a�o%4==0)
				diasMes=29;
			else
				diasMes=28;
				
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes=30;
		default:
			diasMes=31;
		}
		return diasMes;
	}//fin DiasMes
	public String getCadenaFecha(){
		return dia+"-"+mes+"-"+a�o;
	}
	public String getCadenaFecha2(){
		return dia+" de "+ nombreMes +" de "+a�o;
	}
	public boolean fechaActual(int dia, int mes, int a�o){
		if(fecha.YEAR==a�o)
			if(fecha.MONTH==mes)
				if(fecha.DATE==dia)
					return true;
		return false;
			
	}
	public int edad;
	public int getEdad(int a�o){
		if(a�o>=fecha.YEAR)
		edad=fecha.YEAR-a�o;
		return edad;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
