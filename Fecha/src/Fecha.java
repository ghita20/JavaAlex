import java.util.*;
public class Fecha {

	private int dia,mes,año,diasMes;
	private String nombreMes;
	Calendar fecha=new GregorianCalendar();
	public Fecha(int dia, int mes, int año){
		if(esCorrecta(dia,mes,año)){
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		}
	}
	public boolean esBisiesto(int año){
		if(año%4==0)
			return true;
		return false;
	}
	public boolean esCorrecta(int dia, int mes, int año){
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
			if(año%4==0){
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
			if(año%4==0)
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
		return dia+"-"+mes+"-"+año;
	}
	public String getCadenaFecha2(){
		return dia+" de "+ nombreMes +" de "+año;
	}
	public boolean fechaActual(int dia, int mes, int año){
		if(fecha.YEAR==año)
			if(fecha.MONTH==mes)
				if(fecha.DATE==dia)
					return true;
		return false;
			
	}
	public int edad;
	public int getEdad(int año){
		if(año>=fecha.YEAR)
		edad=fecha.YEAR-año;
		return edad;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
