package Ternario_Simples;

public class exemplo3 {

	public static void main(String[] args) {

		int valor = 5;

		String resultado = (valor > 100) ? "O valor é maior que 100"
				: (valor < 100) ? "O valor é menor que 100" : " O valor é igual a 100";
		
		
		System.out.println(valor + resultado);

	}

}
