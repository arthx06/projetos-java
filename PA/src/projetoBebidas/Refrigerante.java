package projetoBebidas;


public class Refrigerante extends Bebida {
	private boolean retornavel;

	public Refrigerante() {
		
	}
	public Refrigerante(String nome, Double preco, boolean retornavel) {
		super(nome, preco);
		this.retornavel = retornavel;
	}
	public boolean isRetornavel() {
		return retornavel;
		
	
	}

	public void setRetornavel(boolean retornavel) {
		this.retornavel = retornavel;
	
	}
	public boolean verificarPreco(double preco) {
		if(preco<5) {
			return true;
		}else {
			return false;
		}
	}
	

	public String mostrarBebida() {
		
		return	("REFRIGERANTE: "+getNome()+"\nPREÇO: R$ "+getPreco()+"\nRETORNÁVEL :"+isRetornavel());
	}


	

	
}
