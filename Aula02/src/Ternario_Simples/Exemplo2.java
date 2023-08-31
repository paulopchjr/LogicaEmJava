package Ternario_Simples;

public class Exemplo2 {

	public static void main(String[] args) {

		for (int numero = 1; numero <= 10; numero++) {

			
			
			String resultado = (numero %2 ==0) ? "O "+ numero+ " é par" :   "O "+numero+" é impar"; 
			
			System.out.println(resultado);
			
		}
	}
}
