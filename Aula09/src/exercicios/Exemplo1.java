package exercicios;

public class Exemplo1 {

	public static void main(String[] args) {

		/* Estrutura de repetição e o Continue */

		for (int p = 0; p <= 100; p++) {

			if (p == 10 || p == 73 || p == 99) {
				System.out.println("Encontrei o número 10 " + p + " || COR:AZUL ");
				continue;

			}
			System.out.println("O número atual é = " + p);

		}

	}

}
