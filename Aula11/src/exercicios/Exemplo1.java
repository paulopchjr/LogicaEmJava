package exercicios;

import javax.swing.JOptionPane;

public class Exemplo1 {
	
 public static void main(String[] args) {
	
	  String laranjas  = JOptionPane.showInputDialog("Informe a quantidade de laranjas ?");

	  String pessoas = JOptionPane.showInputDialog("Informe a quantidade de crianças ?");
	  
	  
	  double Laranja = Double.parseDouble(laranjas);
	  double pessoa  = Double.parseDouble(pessoas);
	  
	  
	  double resto = Laranja % pessoa;
	  
	  JOptionPane.showMessageDialog(null, "Sobraram "+ resto + " laranjas  para "+ pessoa + " pessoas" );
	  
	  
	  
 }

}
