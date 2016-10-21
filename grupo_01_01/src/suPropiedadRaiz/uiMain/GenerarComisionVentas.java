package suPropiedadRaiz.uiMain;
import java.util.Scanner;

import suPropiedadRaiz.empresa.ListaFuncionarios;

public class GenerarComisionVentas extends OpcionDeMenu {
	
	public GenerarComisionVentas(){
		super.setNombre("Generar comisiones por ventas");
	}
	
	public void ejecutar(){
		Scanner in = new Scanner(System.in);
		System.out.println("Escriba su c�dula");
		long cedula = in.nextLong();
		System.out.println("Ingrese el a�o");
		int a�o = in.nextInt();
		System.out.println("Ingrese el mes");
		int mes = in.nextInt();
		double comision = ListaFuncionarios.getFuncionario(cedula).generarValorDeComisionPorVentaDeViviendas(mes, a�o);
		System.out.println("Su comisi�n por ventantas es de: " + comision + ".");
		System.out.println("Pulse cualquier tecla para conitinuar");
		in.next();
	}

}
