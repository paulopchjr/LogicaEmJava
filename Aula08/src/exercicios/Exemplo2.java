package exercicios;

import javax.swing.JOptionPane;

public class Exemplo2 {

	public static void main(String[] args) {

		String ano = JOptionPane.showInputDialog(" Em que ano você nasceu? ");

		String anoatual = JOptionPane.showInputDialog(" Qual é o ano atual ? ");

		int x = Integer.parseInt(anoatual);
		int z = Integer.parseInt(ano);

		if (z > x) {
			System.out.println("Erro: O ano atual não pode ser menor que a data do seu nascimento.");
		} else {
			for (int y = 0; y <= x; y++) {

				if (y == z) {

					System.out.println("A sua idade é = " + (x - z) + ", você nasceu em  = " + z);

					break;
				}

			}
		}

	}
}
