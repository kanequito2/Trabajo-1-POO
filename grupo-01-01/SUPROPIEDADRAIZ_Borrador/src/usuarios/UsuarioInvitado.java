package usuarios;

public class UsuarioInvitado extends Persona{
	
	public UsuarioInvitado(long cedula, String nombre){
		super(cedula, nombre);
	}
	
	public String solicitarCita (String motivoDeLaCita){
		String funcionario;
		if ( Cliente.yaHaSidoCliente( super.getCedula() ) ) /*Ya hab�a sido cliente*/
		{
			funcionario = "Anterior";
																			
		}else  /*Nunca hab�a sido cliente*/
		{ 
			funcionario = "Aleatorio";
		}
		String r = Funcionario.pedirCita(this,motivoDeLaCita,funcionario);
		return r;
	}
	
}
