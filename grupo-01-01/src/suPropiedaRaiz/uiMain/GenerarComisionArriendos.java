/*
 * Autor: Mirai
 * Opcion para el Funcionario. Genera su comision por arriendos-
 */
package suPropiedadRaiz.uiMain;
import java.util.Scanner;

import suPropiedadRaiz.empresa.ListaFuncionarios;

public class GenerarComisionArriendos extends OpcionDeMenu {
	
	public GenerarComisionArriendos(){
		super.setNombre("Generar comisiones por arriendos");
	}
	
	public void ejecutar(){
		System.out.println("Ingrese su c�dula");
		Scanner in = new Scanner(System.in);
		long cedula = in.nextLong();
		System.out.println("Ingrese el a�o");
		int a�o = in.nextInt();
		System.out.println("Ingrese el mes");
		int mes = in.nextInt();
		double comision =ListaFuncionarios.getFuncionario(cedula).generarValorDeComisionPorConceptoDeArriendos(mes, a�o);
		System.out.println("El valor de la comisi�n por arriendos es: " + comision + ".");
		System.out.println("Pulse cualquier tecla para continuar");
		in.next();
	}

}
