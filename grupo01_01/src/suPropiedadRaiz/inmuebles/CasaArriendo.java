package suPropiedadRaiz.inmuebles;
import suPropiedadRaiz.usuarios.*;
import suPropiedadRaiz.contratos.*;

public class CasaArriendo extends Casa{
	
	private Arriendo contrato;
	
	public CasaArriendo(long codigo, float area, Unidad unidad, short pisos, Arriendo contrato){
		super(codigo, area, unidad, pisos);
		this.contrato = contrato;
	}
	
	public Persona getArrendatario(){
		return this.contrato.getArrendatario();
	}
	
	public Persona getDue�o(){
		return this.contrato.getDue�o();
	}
	
	public Arriendo getContrato(){
		return this.contrato;
	}
	
	public void setDue�o(Persona due�o){
		this.contrato.setDue�o(due�o);
	}
	
	public void setArrendatario(Persona arrendatario){
		this.contrato.setArrendatario(arrendatario);
	}
	
	public void setContrato(Arriendo contrato){
		this.contrato = contrato;
	}
	
	public float getTarifa(){
		return this.contrato.getTarifa();
	}
	
	public void setTarifa(float tarifa){
		this.contrato.setTarifa(tarifa);
	}
	
	public Persona getFuncionario(){
		return this.contrato.getFuncionario();
	}
	
	public void setFuncionario(Persona funcionario){
		
	}

	
}
