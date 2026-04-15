package ControleBancario;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta{
	private double reajusteMensal;

	public ContaPoupanca() {
		this(0.0, 0.0);
	}
	public ContaPoupanca( double v_saldo, double v_reajusteMensal) {
		super(v_saldo);
		this.reajusteMensal = v_reajusteMensal;
	}	
	public double getReajusteMensal() {
		return reajusteMensal;
	}
	public void setReajusteMensal(double reajusteMensal) {
		this.reajusteMensal = reajusteMensal;
	}
	
	public void atualizarSaldo(double reajuste) throws Exception {
	
			if(reajuste<=0) {
			JOptionPane.showMessageDialog(null, "A porcentagem de reajuste deve ser maior que zero.","CONTA POUPANÇA",JOptionPane.INFORMATION_MESSAGE);
			throw new Exception("PERCENTUAL INVÁLIDO!");
		}
			
		
		this.reajusteMensal = reajuste;
		double vReajuste = getSaldo()*reajuste;
		setSaldo(getSaldo() + vReajuste); 
		
	}

	public String toString() {
		return"SALDO: "+ getSaldo()+"\n REAJUSTE: "+reajusteMensal; 
	}
}
