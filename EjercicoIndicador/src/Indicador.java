
public class Indicador {

	//Campos
	private int velocidad;
	
	//valores por defecto
	private static final int VMAX=120, VMIN=0; 
	
	//constructores
	public Indicador(){
		velocidad=VMIN;
	}
	public Indicador(int velocidad){
		if(comprobarVelocidad(velocidad))
			this.velocidad=velocidad;
		else
			this.velocidad=VMIN;
	}
	//metodos
	public boolean comprobarVelocidad(int velocidad){
		if(velocidad<VMIN || velocidad>VMAX)
			return false;
		else
			return true;
			
	}
		//incrementar valor
	public void incremetarVelocidad(int velocidad ){
		if(comprobarVelocidad(velocidad+this.velocidad))
		this.velocidad+=velocidad;
	}
	public void incremetarVelocidad(){
		if(comprobarVelocidad(velocidad+1))
			this.velocidad+=1;
	}
	
		//disminuir valor
	public void disminuirVelocidad(int velocidad){
		if(comprobarVelocidad(this.velocidad-velocidad))
			this.velocidad=velocidad;
	}
	
	public void disminuirVelocidad(){
		if(comprobarVelocidad(velocidad-1))
			this.velocidad-=1;
	}
	
	//imprimir
	public String imprimirValor(){
		return velocidad+"km/h";
	}
	
	//Getters
	public int getVelocidad(){
		return velocidad;
	}
	
	//Setters
	public void setVelocidad(int velocidad){
		if(comprobarVelocidad(velocidad))
			this.velocidad=velocidad;
			
	}
}
