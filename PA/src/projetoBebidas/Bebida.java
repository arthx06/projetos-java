package projetoBebidas;

public class Bebida {
	private String nome;
	private Double preco;
	
	public Bebida() {
		this("",0.0);
	}
	public Bebida(String v_nome, Double v_preco) {
		this.nome = v_nome;
		this.preco = v_preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String mostrarBebida() {
		return "CARACTERISTICAS DA BEBIDA";
	}
	public boolean verificarPreco(double preco) {
		if(preco<25) {
			return true;
		}else {
			return false;
		}
	
	}
}
