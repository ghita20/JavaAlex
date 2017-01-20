
public class Hora {
	//campo
	private int horas,minutos,segundos;
	//costructor
	public Hora(int horas,int minutos,int segundos){
		if(comprobarHora(horas,minutos,segundos)){
			this.horas=horas;
			this.minutos=minutos;
			this.segundos=segundos;
		}
		else{
			this.horas=0;
			this.minutos=0;
			this.segundos=0;
		}
	}
	//metodo
	public boolean comprobarHora(int horas,int minutos,int segudos){
		if(horas>23 || horas<0 || minutos>59 || minutos<0 || segundos>59 || segundos<0)
			return false;
		else
			return true;
		}
	//Getters
	public int getHoras(){
		return horas;
		}
	
	public int getMinutos(){
		return minutos;
		}
	
	public int getSegundos(){
		return segundos;
		}
	
	//Setters
	public void setHora(int horas){
		if(comprobarHora(horas,minutos,segundos))
			this.horas=horas;
		}
	public void setMinutos(int minutos){
		if(comprobarHora(horas,minutos,segundos))
			this.minutos=minutos;
		}
	public void setSegundos(int segundos){
		if(comprobarHora(horas,minutos,segundos))
			this.segundos=segundos;
		}
	public String verHora(){
		return horas+":"+minutos+":"+segundos;
	}
	//sumar Hora total
	public void sumaHora(int horas, int minutos, int segundos){
		sumaHoras(horas);
		sumaMin(minutos);
		sumaSeg(segundos);
		
	}
	//sumar horas
	public void sumaHoras(int horas){
		this.horas+=horas;
		analizarTiempo();
	}
	//sumar minutos
	public void sumaMin(int minutos){
		this.minutos+=minutos;
		analizarTiempo();
	}
	//sumar segundos
	public void sumaSeg(int segundos){
		this.segundos+=segundos;
		analizarTiempo();
	}
	//analizar si los datos estan bien introducidos
	public void analizarTiempo(){
		if(segundos>=60){
			minutos+=segundos/60;
			segundos%=60;
			}
		if(minutos>=60){
			horas+=minutos/60;
			minutos%=60;
		}
		if(horas>=24)
			horas%=24;
	}
	
	//restar horas
	public void restarHoras(int horas){
		if(horas>this.horas)
			this.horas=0;
		else
			this.horas-=horas;
	}
	public void restarMin(int minutos){
		minutos=this.minutos-minutos;
		
		if(minutos<0){
			horas-=(minutos*-1)/60;
			if( (minutos*-1)%60  >0){
				restarHoras(1);;
				minutos= ( ( (minutos*-1)%60) -60 )*-1;
			}else
				minutos=0;
		}
		
		this.minutos=minutos;
	}
	
	public void restarSeg(int segundos){
		if(segundos>this.segundos)
			this.segundos=0;
		}
	
}
