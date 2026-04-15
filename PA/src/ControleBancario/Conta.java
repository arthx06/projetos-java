package ControleBancario;

import javax.swing.JOptionPane;

public class Conta {
		private double saldo;
		public Conta() {
			this(0.0);
		}
		public Conta(double v_saldo) {
			this.saldo = v_saldo;
		}
		
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public void depositar(double valor) throws Exception {
			
			if(valor <=0) {
				JOptionPane.showMessageDialog(null, "ERRO VALOR DE DEPOSITO INVÁLIDO","CONTA",JOptionPane.INFORMATION_MESSAGE);
				throw new Exception("DEPOSITO INCORRETO!");
			}
				
			
			setSaldo(getSaldo() + valor);
		}
		public void sacar(double valor) throws Exception {
			
				if(valor <=0) {
					
					JOptionPane.showMessageDialog(null, "ERRO VALOR DE SAQUE INVÁLIDO","CONTA",JOptionPane.INFORMATION_MESSAGE);
					throw new Exception("ERRO VALOR DE SAQUE INVÁLIDO!");
				}
				if(saldo < valor) {
					JOptionPane.showMessageDialog(null, "ERRO SALDO INSUFICIENTE","CONTA",JOptionPane.INFORMATION_MESSAGE);
					throw new Exception("SALDO INSUFICIENTE!");
				}
				
				saldo -= valor;
		}
		public void atualizarSaldo() {
			if(saldo < 0) {
				double valorExcedente = -saldo;
				double multa = (valorExcedente*0.08);
				saldo -= multa;
			
			}
		}
		
}
