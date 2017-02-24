import java.util.*;
public class Baraja {
Random rnd=new Random();
	private Carta[] carta;
	
	public Baraja(){
		carta=new Carta[40];
		
		int posCar=0;
		for(int i=0;i<4;i++){
			String ocep=" ";
			
			switch(i){
			case 0:
				ocep="OROS"; break;
			case 1:
				ocep="COPAS";break;
			case 2:
				ocep="ESPADAS";break;
			case 3:
				ocep="BASTOS";break;			
			
			}
			
			for(int k=0;k<10;k++){
				char naipe=' ';
				switch(k){
				case 0:
					naipe='1';break;
				case 1:
					naipe='2';break;
				case 2:
					naipe='3';break;
				case 3:
					naipe='4';break;
				case 4:
					naipe='5';break;
				case 5:
					naipe='6';break;
				case 6:
					naipe='7';break;
				case 7:
					naipe='A';break;
				case 8:
					naipe='B';break;
				case 9:
					naipe='C';break;
				
				}	
				carta[posCar++]=new Carta(naipe,ocep);
			}
		
		}
	}
	
	public void extraerCarta(){
		 int posicionCarta=rnd.nextInt(40);
		System.out.println(carta[posicionCarta].getNaipe()+" "+ carta[posicionCarta].getOcep());
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
