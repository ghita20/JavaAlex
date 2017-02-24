package EjerciciosB;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre,nombreCurso,dondeMatricula,nombreDepartamento;
		int edad,materias,nrPluses;
	
		Profesor profe;
		Estudiante estudiante;
	    profe = new Profesor("Paco",20,"MiDep",3);
	    estudiante = new Estudiante("Juan",20,"Curso","Colegio",3);
	    
	    profe.verPluses();
	    System.out.println(profe.devolverMasAlto(profe.getValorPluses()));
		
	    estudiante.verNotas();
	    System.out.println(estudiante.devolverMasAlto(estudiante.getNotas()));
	    
	    
	}

}

abstract class Persona{
	private String nombre;
	private int edad;
	Random rnd=new Random();
	
	public Persona(String nombre,int edad){
		this.nombre=nombre;
		if(edad>0)
			this.edad=edad;
	}

	final public String getNombre() {
		return nombre;
	}

	final public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	final public int getEdad() {
		return edad;
	}

	final public void setEdad(int edad) {
		this.edad = edad;
	}
	
	abstract <T extends Comparable> T devolverMasAlto(T[] array);
	abstract <T> void visualListaValores(T[] array);
	
	
}

final class Profesor extends Persona{
	private String nombreDepartamento;
	private int nrPluses;
	private Float[] valorPluses;
	
	
	public Profesor(String nombre,int edad,String nombreDepartamento,int nrPluses){
		super(nombre,edad);
		this.nombreDepartamento=nombreDepartamento;
		this.nrPluses=nrPluses;
		valorPluses=new Float[nrPluses];
		rellenarPlus();
	}
	
	public <T extends Comparable> T devolverMasAlto(T[] array){
		if ( array==null || array.length==0)
			return null;
		
		T masAlto=array[0];
		
		for(int i=1;i<array.length;i++)
			if(array[i].compareTo(masAlto)==1)
				masAlto=array[i];
		return masAlto;	
		
	}
	
	public <T> void visualListaValores(T[] array){
		if ( array==null || array.length==0)
			System.out.println("No hay valores para imprimir");
		else
			for(int i=0;i<array.length;i++)
				System.out.print(array[i].toString() + " | ");
		
		
	}
	public void rellenarPlus(){
		for(int i=0;i<valorPluses.length;i++){
			valorPluses[i]=rnd.nextFloat()*10;
		}
	}
	
	public void verPluses(){
		for(Float e:valorPluses)
			System.out.print(e+" | " );
		System.out.println();
	}
	
	public Float[] getValorPluses(){
		return valorPluses;
	}
}

final class Estudiante extends Persona{
	private String nombreCurso,dondeMatricula;
	private int materias;
	private Integer[] notas;
	
	public Estudiante(String nombre,int edad,String nombreCurso,String dondeMatricula,int materias){
		super(nombre,edad);
		this.nombreCurso=nombreCurso;
		this.dondeMatricula=dondeMatricula;
		this.materias=materias;
		notas=new Integer[materias];
		rellenarNotas();
	}
	
	public <T extends Comparable> T devolverMasAlto(T[] array){
		if ( array==null || array.length==0)
			return null;
		
		T masAlto=array[0];
		
		for(int i=1;i<array.length;i++)
			if(array[i].compareTo(masAlto)==1)
				masAlto=array[i];
		return masAlto;	
		
	}
	
	public <T> void visualListaValores(T[] array){
		if ( array==null || array.length==0)
			System.out.println("No hay valores para imprimir");
		else
			for(int i=0;i<array.length;i++)
				System.out.print(array[i].toString() + " | ");
		
		
	}
	public void rellenarNotas(){
		for(int i=0;i<notas.length;i++){
			notas[i]=rnd.nextInt(10);
		}
	}
	
	public void verNotas(){
		System.out.println();
		for(Integer e:notas)
			System.out.print(e +" | ");
		System.out.println();
	}
	
	public Integer[] getNotas(){
		return notas;
	}
	
	
}




