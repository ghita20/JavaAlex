
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Indicador miIndicador=new Indicador();
		miIndicador.setVelocidad(120);
		System.out.println(miIndicador.imprimirValor());
		miIndicador.disminuirVelocidad();
		System.out.println(miIndicador.imprimirValor());
	}

}
