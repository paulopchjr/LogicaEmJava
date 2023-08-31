package SwitchCase;

import javax.swing.JOptionPane;

public class Exemplo1 {

	int valor = 0;

	public static void main(String[] args) {

		String v1 = JOptionPane.showInputDialog("Informe o primeiro número");
		String v2 = JOptionPane.showInputDialog("Informe o segundo  número");
		String escolha = JOptionPane
				.showInputDialog("Informe a Operação: \n 1 - Adição, 2- Subtração, 3- Multiplicação , 4 Divisão");

		int operacao = Integer.parseInt(escolha); // convertendo uma string em inteiro

		int n1 = Integer.parseInt(v1);
		int n2 = Integer.parseInt(v2);

		switch (operacao) {

		case 1:

			System.out.println("A sua escolha foi a Adição: " + v1 + " + " + v2 + " = " + (n1 + n2));

			break;
		case 2:

			System.out.println("A sua escolha foi a Subtração: " + n1 + " - " + n2 + " = " + (n1 - n2));

			break;

		case 3:
			System.out.println("A sua escolha foi a Multiplicação: " + n1 + " * " + n2 + " = " + (n1 * n2));
			break;

		case 4:

			if (n1 < n2) {
				System.out.println("Impossível fazer essa operação porque: " + n1 + " é menor " + n2);
			} else if (n1 == 0 && n2 == 0) {
				System.out.println("Não pode dividir por 0");
			} else {
				System.out.println("A sua escolha foi a Divisão: " + n1 + " + " + n2 + " = " + (n1 / n2));
			}

		}
	}
}
