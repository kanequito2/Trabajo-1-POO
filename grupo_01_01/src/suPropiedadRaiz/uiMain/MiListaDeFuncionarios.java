package suPropiedadRaiz.uiMain;
import java.util.Scanner;
import suPropiedadRaiz.usuarios.*;
import suPropiedadRaiz.empresa.*;

public class MiListaDeFuncionarios extends OpcionDeMenu{
	
	public MiListaDeFuncionarios(){
		super.setNombre("Obtener la lista de todos mis funcionarios");
	}
	
	public void ejecutar(){
		System.out.println("Ingrese su c�dula.");
		Scanner input = new Scanner(System.in);
		long cedula = input.nextLong();
		FuncionarioJefe funcionarioj = ListaFuncionariosJefe.getFuncionarioJefe(cedula);
		System.out.println("Ingrese el mes y el a�o");
		System.out.println("Mes:");
		int mes = input.nextInt();
		System.out.println("A�o:");
		int a�o = input.nextInt();
		System.out.println("Los funcionarios a mi cargo:");
		System.out.println(funcionarioj.getFuncionariosAMiCargo(mes, a�o));
		System.out.println("Pulse cualquier tecla para continuar");
		input.next();
	}

}
