package suPropiedadRaiz.usuarios;

import suPropiedadRaiz.contratos.Arriendo;
import suPropiedadRaiz.inmuebles.Inmueble;
import java.util.ArrayList;

public class Arrendador extends Oferente{

	//Constructor
	Arrendador(long cedula, String nombre){
		super(cedula,nombre);
	}
//En los siguientes metodos no se define fecha, porque no estamos seguros de como trabajar con la fecha
	public String getInmueblesPorLosQueMePaganArriendo(){
		String r = "";
		for (int i=0; i<super.getArriendo().size(); i++){
			Arriendo contrato = super.getArriendo().get(i);
			Inmueble inmueble =  contrato.getInmueble();
			long codigo = inmueble.getCodigo();
			String direccion = inmueble.getDireccion();
			double valorArriendo = contrato.getTarifa();
			String esCasaOApto = inmueble.getClass().getName();
			String fechaInicioContrato = null; //Definir este atributo cuando este lista la fecha
			r = r+"Codigo: "+codigo+", Direccion: "+direccion+", Valor de Arriendo: "+valorArriendo+", Es: "+esCasaOApto+", Fecha de inicio de contrato: "+fechaInicioContrato+"\n";
			
		}
		if (r==""){return "No hay inmuebles Arrendados";}
		else{return r;}
	}
	
	public String getInmueblesDisponiblesParaArrendar(){
		String r = "";
		//Se crea un array con los inmuebles ya arrendados
		ArrayList<Inmueble> inmueblesArrendados = new ArrayList<Inmueble>();
		for(int i = 0; i < super.getArriendo().size(); i++){
			inmueblesArrendados.add( super.getArriendo().get(i).getInmueble() );
		}
		//Se recorren los inmuebles poseidos
		for (int i=0; i<super.getInmuebles().size(); i++){
			Inmueble inmueble =  super.getInmuebles().get(i);
			if ( inmueblesArrendados.contains(inmueble) == false ){//Si el inmueble no est� arrendado
				long codigo = inmueble.getCodigo();
				String direccion = inmueble.getDireccion();
				long valorArriendo = 0; //Definir cuando haya un atributo arriendoTentativo en los inmuebles
				String esCasaOApto = inmueble.getClass().getName();
				String fechaInicioContrato = null; //Definir cuando tengamos las fechas definidas
				r = r+"Codigo: "+codigo+", Direccion: "+direccion+", Valor de Arriendo: "+valorArriendo+", Es: "+esCasaOApto+", Fecha de inicio de contrato: "+fechaInicioContrato+"\n";
			}
		} 
		if (r==""){return "No hay inmuebles disponibles para arrendar";}
		else{return r; }
	}
	
}
