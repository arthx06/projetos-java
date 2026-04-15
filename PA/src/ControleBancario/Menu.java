package ControleBancario;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public abstract class Menu {
	private int opcao;
	private String mensagemMenu;
	
	public Menu() {
		this (0,"");
	}
	public Menu(int v_opcao, String v_mensagemMenu) {
		this.opcao = v_opcao;
		this.mensagemMenu = v_mensagemMenu;
	}
	
	public int getOpcao() {
		return opcao;
	}
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public String getMensagemMenu() {
		return mensagemMenu;
	}
	public void setMensagemMenu(String mensagemMenu) {
		this.mensagemMenu = mensagemMenu;
	}

	public void executar() {
		Object[] options = {"0-SAIR", "1-Conta Corrente", "2- Conta Poupança", 
		};
		
		opcao = JOptionPane.showOptionDialog(null,"SELECIONE UMA OPÇÃO", "CONTAS BANCARIAS", 
				0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		avaliarOpcaoEscolhida();
		
		
	}
	

	protected void executarMenu() {
		
	
	
		Object[] options = {"Voltar","Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo" };
		opcao = JOptionPane.showOptionDialog(null, "Escolha uma operação para sua Conta ","Contas BANCÁRIAS", 
                0,JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
		
   
       
		
			
				 
		
	
	}
	protected abstract void avaliarOpcaoEscolhida();}
	
		
	
		
		
	


