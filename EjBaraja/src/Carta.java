
public class Carta {
	private char naipe;
	private String ocep;
	private final static char[] VALORES_NAIPE={'1','2','3','4','5','6','7','A','B','C'};
	private final static String[] VALORES_OCEP={"oros","copas","espadas","bastos"};
	
	
	
	public Carta(char naipe, String ocep){
		if(comprobarNaipe(naipe))
		this.naipe=naipe;
		if(comprobarOcep(ocep))
		this.ocep=ocep;
	}
	private boolean comprobarNaipe(char naipe){
		
		for(int i=0;i<VALORES_NAIPE.length;i++){
			if(naipe==VALORES_NAIPE[i])
				return true;
		}//comprobar naipe
		return false;
	}
	private boolean comprobarOcep(String ocep){
		for(int i=0;i<VALORES_OCEP.length;i++){
			if(ocep.toLowerCase().equals(VALORES_OCEP[i]))
				return true;
		}
		return false;
	}
	public char getNaipe(){
		return naipe;
	}
	public String getOcep(){
		return ocep;
	}
	
	
	
	
	
	
	
	
	
	
}
