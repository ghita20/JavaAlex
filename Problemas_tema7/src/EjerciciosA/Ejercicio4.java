package EjerciciosA;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int numero,edad,opcion;
		float porcentaje;
		String nombre,departamento;
		double nuevoSueldoEmple,plusJefe;
		
		
		
	System.out.println("Introduce el numero de empleados");
	numero=teclado.nextInt();
	teclado.nextLine();
	Empleado[] miemple=new Empleado[numero];
	for(int i=0;i<miemple.length;i++){
		System.out.println("Introduce el nombre del empleado");
		nombre=teclado.nextLine();
		System.out.println("Introduce la edad");
		edad=teclado.nextInt();
		System.out.println("Introduce el porcentaje");
		porcentaje=teclado.nextFloat();
		miemple[i]=new Empleado(nombre,edad,porcentaje);
	}
	
	
	System.out.println("Introduce el numero de jefes");
	numero=teclado.nextInt();
	teclado.nextLine();
	Jefe[] mijefe=new Jefe[numero];
	for(int i=0;i<mijefe.length;i++){
		System.out.println("Introduce el nombre del empleado");
		nombre=teclado.nextLine();
		System.out.println("Introduce la edad");
		edad=teclado.nextInt();
		System.out.println("Introduce el porcentaje");
		porcentaje=teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Introduce el departamento");
		departamento=teclado.nextLine();
		mijefe[i]=new Jefe(nombre,edad,porcentaje,departamento);
	}
	for(Empleado e:miemple){
		System.out.println("El nombre del empleado es "+e.getNombre()+" con "+e.getEdad()+"años"+"\n"
				+" porcentaje "+(e.getPorcentaje()*100)+"% sueldo final "+e.getSueldo()+"€");
	}
	
	for(Jefe e:mijefe){
		System.out.println("El nombre del empleado es "+e.getNombre()+" con departamento "+e.getDepartamento()+" con "+e.getEdad()+"años"+"\n"
				+" porcentaje "+(e.getPorcentaje()*100)+"% sueldo final "+e.getSueldo()+"€");
	}
	
	do{
		System.out.println("1. Modificar el sueldo base de todos los empleados.\n"+
				"2. Modificar el plus de todos los jefes.\n"+
				"3. Visualizar los datos de todos los empleados.\n"+
				"4. Salir.");
		opcion=teclado.nextInt();
		switch(opcion){
		case 1:
			System.out.println("Introduce el nuevo sueldo :");
			nuevoSueldoEmple=teclado.nextDouble();
			Empleado.setSueldoBase(nuevoSueldoEmple);break;
		case 2:
			System.out.println("Introduce el nuevo plus :");
			plusJefe=teclado.nextDouble();
			Jefe.setPlus(plusJefe);break;
		case 3:
			for(Empleado e:miemple){
				System.out.println("El nombre del empleado es "+e.getNombre()+" con "+e.getEdad()+"años"+"\n"
						+" porcentaje "+(e.getPorcentaje()*100)+"% sueldo final "+e.getSueldo()+"€");
			}
			
			for(Jefe e:mijefe){
				System.out.println("El nombre del empleado es "+e.getNombre()+" con departamento "+e.getDepartamento()+" con "+e.getEdad()+"años"+"\n"
						+" porcentaje "+(e.getPorcentaje()*100)+"% sueldo final "+e.getSueldo()+"€");
			}break;
		default: 
			opcion=4;
		
		}
			
		
		
	}while(opcion!=4);
	
	
	
	
	
	}

}
class Empleado{
	private final String NOMBRE_EMPRESA="Eléctrica,SA";
	private static double sueldoBase;
	private double sueldo;
	private String nombre;
	private int edad;
	private float porcentaje;
	
	public String getNOMBRE_EMPRESA() {
		return NOMBRE_EMPRESA;
	}
	public float getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public Empleado(String nombre,int edad,float porcentaje){
		sueldoBase=1000;
		this.nombre=nombre;
		this.edad=edad;
		this.porcentaje=porcentaje/100;
		
	}
	public double getSueldo(){
		sueldo=sueldoBase+(sueldoBase*porcentaje);
		return Math.round(sueldo);
	}
	public static void setSueldoBase(double sueldo){
		sueldoBase=sueldo;
	}
	
	
}




class Jefe extends Empleado{
	
	private static double plusJefe;
	private String departamento;
	
	public Jefe(String nombre,int edad,float porcentaje,String departamento){
		super(nombre,edad,porcentaje);
		plusJefe=250;
		this.departamento=departamento;
		
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSueldo(){
		return super.getSueldo()+plusJefe;
	}
	public static void setPlus(double plus){
		plusJefe=plus;
	}
}
