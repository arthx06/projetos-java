
package ControleBancario;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		MenuConta menu = new MenuConta();
		
		try {
		menu.executar();
		
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO ENTRE EM CONTATO COM O CRIADOR DO PROGRAMA");
		}
	}

}
