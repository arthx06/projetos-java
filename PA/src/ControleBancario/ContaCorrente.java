package ControleBancario;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta{
	private double limiteEspecial;
	public ContaCorrente() {
		this(0.0, 0.0);
	}
	public ContaCorrente( double v_saldo, double v_limiteEspecial) {
		super(v_saldo);
		this.limiteEspecial = v_limiteEspecial;
	}
	
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public void sacar(double valor) throws Exception {
		  if(valor <= 0 ) {
			  JOptionPane.showMessageDialog(null, "SAQUE INVÁLIDO","CONTA CORRENTE",JOptionPane.INFORMATION_MESSAGE);
			  throw new Exception("ERRO VALOR DE SAQUE INVÁLIDO!");
		  }
		  if (getSaldo() - valor < -limiteEspecial) {
			  	JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE","CONTA CORRENTE",JOptionPane.INFORMATION_MESSAGE);
		        throw new Exception("SALDO INSUFICIENTE");
		    }

		
		    setSaldo(getSaldo() - valor);
	}
	public String toString() {
		return "SALDO: " +getSaldo()+"\n LIMITE ESPECIAL: " +limiteEspecial;
	}
}

