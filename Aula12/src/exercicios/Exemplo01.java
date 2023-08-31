package exercicios;

import javax.swing.JOptionPane;

public class Exemplo01 {
	
	public static void main(String[] args) {
		
		 int acao = JOptionPane.showConfirmDialog(null, "Deseja Entrar no sistema ?");
		
		 
		 if(acao == 0) {
			 
			 System.out.println("Você entrou no sistema");
			 
		 }else {
			 System.out.println(" Você saiu ");
		 }
		
	}

}
