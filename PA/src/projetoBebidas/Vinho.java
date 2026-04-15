package projetoBebidas;

public class Vinho extends Bebida {
	private int safra;
	private String tipo;
	
	public Vinho() {
	}
		
	public Vinho(String v_nome, String v_tipo, double v_preco, int v_safra){
		super(v_nome, v_preco);
		this.tipo = v_tipo;
		this.safra = v_safra;
	}
	
	public int getSafra() {
		return safra;
	}
	public void setSafra(int safra) {
		this.safra = safra;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean verificarPreco(double preco) {
		if(preco<25) {
			return true;
		}else {
			return false;
		}
	}
	public String mostrarBebida() {
		
		return	("VINHO: "+getNome()+"\nTIPO: "+getTipo()+"\nPREÇO: R$ "+getPreco()+"\nSAFRA: "+getSafra());
	}
}
