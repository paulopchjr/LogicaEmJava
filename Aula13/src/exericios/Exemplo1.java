package exericios;

import javax.swing.JOptionPane;

public class Exemplo1 {

	public static void main(String[] args) {

		String nome = "";
		String senha = "";
		String login = "";
		String msg = "";
		String tarefa = "";
		String nomeCliente = "";
		String escolha = JOptionPane
				.showInputDialog("Informe qual das duas opçoes você deseja: \n 1-Logar \n 2-Realizar o cadastro");
		
		String produto="";

		int resposta = Integer.parseInt(escolha);

		switch (resposta) {
		case 1:

			nome = JOptionPane.showInputDialog(" Qual é o seu Nome ?");
			login = JOptionPane.showInputDialog(" Informe o seu login ?");
			senha = JOptionPane.showInputDialog(" Informe a senha ?");

			break;

		case 2:

			login = JOptionPane.showInputDialog(" Informe o seu login ?");
			senha = JOptionPane.showInputDialog(" Informe a senha ?");

			break;
		default:
			JOptionPane.showMessageDialog(null, "Não possui essa escolha ");
			throw new IllegalArgumentException("Unexpected value: " + resposta);
		}

		if (login != null && !login.isEmpty() || senha != null && !senha.isEmpty()) {
			
				msg = JOptionPane.showInputDialog(null, "Bem vindo :" + nome + " \n o que deseja fazer?\n 1- Realizar Cadastros"+
				" \n 2 - Consultar ");
				
				int acao = Integer.parseInt(msg);
				if(acao == 1) {
					
					tarefa = JOptionPane.showInputDialog(null, "\n 1-  Cadastros de Cliente"+
							" \n 2 - Cadastro de Produtos");
					
					
					int numero = Integer.parseInt(tarefa);
					
					if(numero == 1) {
						 nomeCliente = JOptionPane.showInputDialog("Informe o nome do Cliente");
					}else if(numero ==2) {
						
						 produto = nome = JOptionPane.showInputDialog("Informe o nome do Produto");
					}
				}
			 
				
				
				JOptionPane.showMessageDialog(null, "Nome do Funcionário é: "+ nome +"\n nome do Cliente: " + nomeCliente + "\n Nome do Produto:" + produto
						);
			

		} else {
			JOptionPane.showMessageDialog(null, " O Login ou a senha estão inválidos");
		}

	}

}
