package suPropiedadRaiz.contratos;
import suPropiedadRaiz.usuarios.*;
import suPropiedadRaiz.inmuebles.*;

public abstract class Contrato {
	
	public static long codigoContratos = 1000;
	private long codigo;
	private float tarifa;
	private Persona funcionario;
	private Inmueble inmueble;
	private int mesDeInicio;
	private int a�oDeInicio;
	private Oferente oferente;
	private Demandador demandador;
	
	public Contrato(long codigo, float tarifa, Inmueble inmueble, Funcionario funcionario, Demandador demandador, Oferente oferente,int a�o, int mes){
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.inmueble = inmueble;
		this.funcionario = funcionario;
		this.demandador = demandador;
		this.oferente = oferente;
	}
	
	public long getCodigo(){
		return this.codigo;
	}
	
	public float getTarifa(){
		return this.tarifa;
	}
	
	public void setTarifa(float tarifa){
		this.tarifa = tarifa;
	}
	
	public Persona getFuncionario(){
		return this.funcionario;
	}
	
	public void setFuncionario(Persona funcionario){
		this.funcionario = funcionario;
	}
	
	public Inmueble getInmueble(){
		return this.inmueble;
	}
	
	public void setInmueble(Inmueble inmueble){
		this.inmueble = inmueble;
	}
	
	public int getA�o(){
		return this.a�oDeInicio;
	}
	
	public int getMes(){
		return this.mesDeInicio;
	}
	
	public Oferente getOferente(){
		return this.oferente;
	}
	
	public Demandador getDemandador(){
		return this.demandador;
	}

	public int mesesTotales(int a�o, int mes){
		int retorno = 0;
		retorno = (a�o - this.getA�o())*12 + (mes - this.getMes());
		return retorno;
	}

	
}
