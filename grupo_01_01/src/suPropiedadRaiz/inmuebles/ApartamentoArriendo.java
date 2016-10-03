package suPropiedadRaiz.inmuebles;
import suPropiedadRaiz.contratos.*;
import suPropiedadRaiz.usuarios.*;

public class ApartamentoArriendo extends Apartamento{
	
	private Arriendo contrato;
	
	public ApartamentoArriendo(long codigo, float area, Unidad unidad, Torre torre, Arriendo contrato){
		super(codigo, area, unidad, torre);
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
