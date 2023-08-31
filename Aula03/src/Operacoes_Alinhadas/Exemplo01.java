package Operacoes_Alinhadas;

public class Exemplo01 {

	public static void main(String[] args) {
		int n1 = 5, n2 = 5, n3 = 0, n4 =0;
		double media = 0;

		media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 5) {
			if (media >= 7) {

				if (media == 10) {
					System.out.println("Aluno Aprovado com nota máxima");
				} else {
					System.out.println("Aluno Aprovado");

				}
			} else {
				System.out.println("Aluno Recuperação");
			}

		} else {
			System.out.println("Aluno Reprovado");
		}
	}
}
