package projetoBebidas;

import javax.swing.JOptionPane;




public class Principal {

	public static void main(String[] args) {
		int menu, resp;
		String nome, sabor, tipo ;
		Boolean retornavel ;
		double preco = 0.0;
		int safra;
		
		Vinho v1 = new Vinho();
		Bebida b1 = new Bebida();
		Suco s1 = new Suco();
		Refrigerante r1 = new Refrigerante();
		
		Object[] options = {"CADASTRAR", "VERIFICAR", "MOSTRAR", "SAIR"
	};
		Object[] optionsL = {"A - VINHO", "B - SUCO","C - REFRIGERENTE", "SAIR"
	};
		do {
			menu = JOptionPane.showOptionDialog(null,"SELECIONE UMA OPÇÃO", "BEBIDAS", 
					0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(menu == 0) {
				
				resp = JOptionPane.showOptionDialog(null, "SELECIONE UMA OPÇÃO", "BEBIDAS", 
						0, JOptionPane.QUESTION_MESSAGE, null, optionsL, optionsL[0]);
				 switch (resp) {  
				 case 0:
					 
		        	nome = JOptionPane.showInputDialog(null,"Nome:", "CADASTRO",JOptionPane.QUESTION_MESSAGE);
		        	tipo = JOptionPane.showInputDialog(null,"Tipo:", "CADASTRO",JOptionPane.QUESTION_MESSAGE);
		        	preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Preço:", "CADASTRO",JOptionPane.QUESTION_MESSAGE));
		        	safra = Integer.parseInt(JOptionPane.showInputDialog(null,"Safra:", "CADASTRO",JOptionPane.QUESTION_MESSAGE));
		        	v1 = new Vinho(nome,tipo,preco,safra);
		        	break;
				 
		        
				 case 1:
					nome = JOptionPane.showInputDialog(null,"Digite o nome do Suco",JOptionPane.QUESTION_MESSAGE);
					preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do Suco","CADASTRO",JOptionPane.QUESTION_MESSAGE));
					sabor =JOptionPane.showInputDialog(null,"Digite o sabor do suco","CADASTRO",JOptionPane.QUESTION_MESSAGE);
					s1 = new Suco(nome, sabor, preco);
					break;
				
				 case 2:
					nome = JOptionPane.showInputDialog(null,"Digite o nome do Suco",JOptionPane.QUESTION_MESSAGE);
					preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do Suco","CADASTRO",JOptionPane.QUESTION_MESSAGE));
					retornavel = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"É RETORNÁVEL?","CADASTRO",JOptionPane.QUESTION_MESSAGE));
					r1 = new Refrigerante(nome, preco, retornavel);
					break;
				 case 3:
					 break;
				}
				
			
			}if(menu == 1) {
			resp = JOptionPane.showOptionDialog(null, "SELECIONE UMA OPÇÃO", "BEBIDAS", 
					0, JOptionPane.QUESTION_MESSAGE, null, optionsL, optionsL[0]);
			if(resp == 0) {
				if (v1.verificarPreco(preco)){    
	         		JOptionPane.showMessageDialog(null,"Produto em PROMOÇÃO!","PREÇO DO PRODUTO",JOptionPane.WARNING_MESSAGE);   
	          	}else{    
	          		JOptionPane.showMessageDialog(null,"Produto com preço NORMAL!","PREÇO DO PRODUTO",JOptionPane.INFORMATION_MESSAGE); 
	         	}
			}
			if(resp == 1) {
				if (s1.verificarPreco(preco)){    
	         		JOptionPane.showMessageDialog(null,"Produto em PROMOÇÃO!","PREÇO DO PRODUTO",JOptionPane.WARNING_MESSAGE);   
	          	}else{    
	          		JOptionPane.showMessageDialog(null,"Produto com preço NORMAL!","PREÇO DO PRODUTO",JOptionPane.INFORMATION_MESSAGE); 
	         	}
			}
			
			if(resp == 2) {
				if (r1.verificarPreco(preco)){    
	         		JOptionPane.showMessageDialog(null,"Produto em PROMOÇÃO!","PREÇO DO PRODUTO",JOptionPane.WARNING_MESSAGE);   
	          	}else{    
	          		JOptionPane.showMessageDialog(null,"Produto com preço NORMAL!","PREÇO DO PRODUTO",JOptionPane.INFORMATION_MESSAGE); 
	         	}
				
				
			}
			
		}
			if(menu == 2) {
				resp = JOptionPane.showOptionDialog(null, "SELECIONE UMA OPÇÃO", "BEBIDAS", 
						0, JOptionPane.QUESTION_MESSAGE, null, optionsL, optionsL[0]);
				switch(resp) {
				case 0:
					JOptionPane.showMessageDialog(null, v1.mostrarBebida(),"DADOS DO VINHO",JOptionPane.INFORMATION_MESSAGE);
		    		break; 
				case 1:
			
					JOptionPane.showMessageDialog(null, s1.mostrarBebida(),"DADOS DO SUCO",JOptionPane.INFORMATION_MESSAGE);
		    		break; 
				
				case 2:
					JOptionPane.showMessageDialog(null, r1.mostrarBebida(),"DADOS DO REFRIGERANTE",JOptionPane.INFORMATION_MESSAGE);
		    		break; 
				}
				
			}
		}while(menu !=3);
		
	}
	}
