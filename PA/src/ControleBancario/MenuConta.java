package ControleBancario;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class MenuConta extends Menu{
	
	private ContaCorrente contaCC = new ContaCorrente(500,1000);
	private ContaPoupanca contaCP = new ContaPoupanca(5000, 0.01);
	
	
	public MenuConta() {
		this(0, "");
	}
	public MenuConta(int v_opcao, String v_mensagemMenu) {
		super(v_opcao, v_mensagemMenu);
		
	}
	protected void executarMenu() {
		super.executar();
		avaliarOpcaoEscolhida();
		setOpcao(0);
		
	}
	protected void avaliarOpcaoEscolhida() {
		
			switch(super.getOpcao()) {
			case -1:
				break;
			case 0:
				break;
			case 1:
				operarContaCC();
				break;
		
			case 2:
				operarContaCP();
				break;
		
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida","Contas Bancarias",JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		
	}
	private void operarContaCC() {
		do{super.executarMenu();
		if(super.getOpcao() == 0 ) {
			super.executar();
			setOpcao(-1);
		}
        if(super.getOpcao() == 1) {
        	JOptionPane.showMessageDialog(null, contaCC.toString(),"CONTA CORRENTE", JOptionPane.INFORMATION_MESSAGE);
        }
		if(super.getOpcao() == 2) {
			
			try {
				contaCC.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "insira o valor do deposito", "CONTA CORRENTE", JOptionPane.INFORMATION_MESSAGE)));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "NUMERO INVÁLIDO", "CONTA CORRENTE", JOptionPane.INFORMATION_MESSAGE);
			
			} catch (HeadlessException e) {
				JOptionPane.showMessageDialog(null, "INSIRA UM NUMERO", "CONTA CORRENTE", JOptionPane.INFORMATION_MESSAGE);
			
			} catch (Exception e) {
			
			
			}
			
			
			
		}
		if(super.getOpcao() == 3) {
			try {
			contaCC.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "insira o valor do saque", "CONTA CORRENTE", JOptionPane.INFORMATION_MESSAGE)));
			
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "NUMERO INVÁLIDO", "CONTA CORRENTE", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (HeadlessException e) {
				JOptionPane.showMessageDialog(null, "INSIRA UM NUMERO", "CONTA CORRENTE", JOptionPane.INFORMATION_MESSAGE);
			
			} catch (Exception e) {
				
			
			}
		}
		if(super.getOpcao()== 4) {
			contaCC.atualizarSaldo();
			
		}
		
		}while(getOpcao() !=-1);
       
		
			
		
		
		
		
	}
	private void operarContaCP() {
		do {super.executarMenu();
		if(super.getOpcao() == 0 ) {
				super.executar();
				setOpcao(-1);
		}
        if(super.getOpcao() == 1) {
        	JOptionPane.showMessageDialog(null, contaCP.toString(),"CONTA POUPANÇA", JOptionPane.INFORMATION_MESSAGE);
        }
		if(super.getOpcao()== 2) {
			try {
			contaCP.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "insira o valor do deposito", "CONTA POUPANÃ‡A", JOptionPane.INFORMATION_MESSAGE)));
			
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "NUMERO INVÁLIDO", "CONTA POUPANÇA", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (HeadlessException e) {
				JOptionPane.showMessageDialog(null, "INSIRA UM NUMERO", "CONTA POUPANÇA", JOptionPane.INFORMATION_MESSAGE);
			
			} catch (Exception e) {
				
			
			}
		}
		if(super.getOpcao() == 3) {
			try {
			contaCP.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do saque", "CONTA POUPANÇA", JOptionPane.INFORMATION_MESSAGE)));
			
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "NUMERO INVÁLIDO", "CONTA POUPANÇA", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (HeadlessException e) {
				JOptionPane.showMessageDialog(null, "INSIRA UM NUMERO", "CONTA POUPANÇA", JOptionPane.INFORMATION_MESSAGE);
			
			} catch (Exception e) {
				
			
			
			}
		}
		if(super.getOpcao() == 4) {
			try {
			contaCP.atualizarSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "INSIRA UM VALOR PARA O REAJUSTE","CONTA POUPANÃ‡A",JOptionPane.INFORMATION_MESSAGE)));
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "NUMERO INVÃ�LIDO", "CONTA POUPANÃ‡A", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (HeadlessException e) {
				JOptionPane.showMessageDialog(null, "INSIRA UM NUMERO", "CONTA POUPANÃ‡A", JOptionPane.INFORMATION_MESSAGE);
			
			} catch (Exception e) {
				
			
			}
			
			}
		
       }while(super.getOpcao() !=-1);
		
	}
	
	
}
