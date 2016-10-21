/*
 * Autor: Mirai
 * Opcion para el Funcionario. Genera s salario neto en un mes especifico.
 */
package suPropiedadRaiz.uiMain;
import java.util.Scanner;

import suPropiedadRaiz.empresa.ListaFuncionarios;

public class GenerarSalario extends OpcionDeMenu{
	
	public GenerarSalario(){
		super.setNombre("Generar salario");
	}
	
	public void ejecutar(){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese su c�dula");
		long cedula = in.nextLong();
		System.out.println("Ingrese el a�o");
		int a�o = in.nextInt();
		System.out.println("Ingrese el mes");
		int mes = in.nextInt();
		double sueldo = ListaFuncionarios.getFuncionario(cedula).generarSueldoNeto(mes, a�o);
		System.out.println("El salario neto para este mes es: " + sueldo + ".");
		System.out.println("Presione cualquier tecla para continuar");
		in.next();
	}

}
