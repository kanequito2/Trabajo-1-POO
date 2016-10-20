package suPropiedadRaiz.inmuebles;

public class Ba�o extends Cuarto{
	
	private boolean ba�era;
	private boolean ducha;
	private boolean enchapado;
	private boolean puertaDucha;
	
	public Ba�o(long codigo, float area){
		super(codigo, area);
		super.setUso("Ba�o");
	}
	
	public Ba�o(long codigo, float area, boolean ba�era, boolean ducha, boolean enchapado, boolean puerta){
		this(codigo, area);
		this.ba�era = ba�era;
		this.ducha = ducha;
		this.enchapado = enchapado;
		this.puertaDucha = puerta;
		super.setUso("Ba�o");
	}

	public boolean isBa�era() {
		return ba�era;
	}

	public void setBa�era(boolean ba�era) {
		this.ba�era = ba�era;
	}

	public boolean isDucha() {
		return ducha;
	}

	public void setDucha(boolean ducha) {
		this.ducha = ducha;
	}

	public boolean isEnchapado() {
		return enchapado;
	}

	public void setEnchapado(boolean enchapado) {
		this.enchapado = enchapado;
	}

	public boolean isPuertaDucha() {
		return puertaDucha;
	}

	public void setPuertaDucha(boolean puertaDucha) {
		this.puertaDucha = puertaDucha;
	}
	
	

}
