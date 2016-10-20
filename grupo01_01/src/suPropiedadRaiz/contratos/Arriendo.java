package suPropiedadRaiz.contratos;
import suPropiedadRaiz.usuarios.*;
import suPropiedadRaiz.inmuebles.*;

public class Arriendo extends Contrato {
	
	private Persona arrendatario;
	private Persona due�o;
	
	public Arriendo(long codigo, float tarifa, Inmueble inmueble,Persona funcionario, Persona arrendatario, Persona due�o, int a�o, String mes){
		super(codigo, tarifa, inmueble, funcionario,a�o,mes);
		this.arrendatario = arrendatario;
		this.due�o = due�o;
	}
	
	public Persona getArrendatario(){
		return this.arrendatario;
	}
	
	public void setArrendatario(Persona arrendatario){
		this.arrendatario = arrendatario;
	}
	
	public Persona getDue�o(){
		return this.due�o;
	}
	
	public void setDue�o(Persona due�o){
		this.due�o = due�o;
	}
	
	

}
