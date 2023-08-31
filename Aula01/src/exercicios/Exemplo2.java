package exercicios;

public class Exemplo2 {

	public static void main(String[] args) {

		String pessoa = "Sebastião";

		int idade = 14;

		if (pessoa.equals("Sebastião")) {
			if (idade >= 15) {
				System.out.println(pessoa + ", você pode entrar a sua idade é " + idade + " anos");

			} else {
				System.out.println(pessoa + ", você não pode entrar a sua idade é " + idade + " anos");
			}

		} else {
			System.out.println("Nenhuma Pessoa Encontrada");
		}

	}

}
