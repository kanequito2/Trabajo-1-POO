/*
 * Autor: Mirai
 * Opcion de Menu para el Funcionario. Busca una casa en venta de acuerdo a algunos criterios de busqueda.
 */
package suPropiedadRaiz.uiMain;

import java.util.Scanner;

import suPropiedadRaiz.empresa.ListaInmuebles;
import suPropiedadRaiz.inmuebles.CasaVenta;

public class BuscarCasaVenta extends OpcionDeMenu {
	
	public BuscarCasaVenta(){
		super.setNombre("Buscar una casa para venta");
	}
	
	public void ejecutar(){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el menor valor");
		float menor = in.nextFloat();
		System.out.println("Ingrese el mayor valor");
		float mayor = in.nextFloat();
		System.out.println("Ingrese el estrato de interes");
		short estrato = in.nextShort();
		System.out.println("Ingrese area menor");
		float areaMenor = in.nextFloat();
		System.out.println("Ingrese area mayor");
		float areaMayor = in.nextFloat();
		System.out.println("Garaje? (y/n)");
		String command = in.next();
		boolean garaje = true;
		if(command == "n"){
			garaje = false;
		}
		System.out.println("Ingrese numero minimo de ba�os");
		int ba�os = in.nextInt();
		System.out.println("Ingrese numero minimo de piezas");
		int piezas = in.nextInt();
		for(int i = 0; i < ListaInmuebles.getInmueblesRegistrados().size(); i++){
			if(ListaInmuebles.getInmueblesRegistrados().get(i) instanceof CasaVenta){
				boolean compTarifa = ListaInmuebles.getInmueblesRegistrados().get(i).getTarifa() > menor && ListaInmuebles.getInmueblesRegistrados().get(i).getTarifa() < mayor;
				boolean compEstrato = ListaInmuebles.getInmueblesRegistrados().get(i).getEstrato() == estrato;
				boolean compArea = ListaInmuebles.getInmueblesRegistrados().get(i).getAreaTotal() < areaMayor && ListaInmuebles.getInmueblesRegistrados().get(i).getAreaTotal() > areaMenor;
			    boolean compBa�os = ListaInmuebles.getInmueblesRegistrados().get(i).cuantosBa�os() >= ba�os;
			    boolean compPiezas = ListaInmuebles.getInmueblesRegistrados().get(i).cuantasPiezas() >= piezas;
				if(compTarifa & compEstrato && compArea && compBa�os && compPiezas){
			    	System.out.println("Codigo: " + ListaInmuebles.getInmueblesRegistrados().get(i).getCodigo() + ". Direcci�n: " + ListaInmuebles.getInmueblesRegistrados().get(i).getDireccion() + ". Nombre de la unidad: " + ListaInmuebles.getInmueblesRegistrados().get(i).getUnidad().getNombre() + "." + "\n");
			    }
			}
		}
		System.out.println("Se ha realizado la busqueda");
		System.out.println("Pulse cualquier tecla para continuar");
		in.next();
	}

}
