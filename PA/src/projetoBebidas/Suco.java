package projetoBebidas;

public class Suco extends Bebida {
	
	private String sabor;
	public Suco() {
		
	}
	public Suco(String v_nome,String v_sabor, Double v_preco) {
		super(v_nome, v_preco);
		this.sabor = v_sabor;
	}

	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	} 
	public boolean verificarPreco(double preco) {
		if(preco<2.5) {
			return true;
		}else {
			return false;
		}
	}
	public String mostrarBebida() {
		
		return	("SUCO: "+getNome()+"\nPREÇO: R$ "+getPreco()+"\nSABOR: "+getSabor());
	}
}
