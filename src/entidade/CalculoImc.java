package entidade;

import java.util.Locale;

public class CalculoImc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
			System.out.println("*********CÁLCULO IMC***********");
			String nome = "Jean";
			System.out.println(" Nome: " + nome);
	        double peso = 70;
	        System.out.println(" Peso: " + peso);
	        double altura = 1.80;
	        System.out.println(" Altura: " + altura);
	        System.out.println();
	        System.out.println(" RESULTADO:");
	        
	        //Cálculo indice;
	        double imc = peso / (altura * altura);
	        System.out.println(" Indice corporal: " + String.format("%.1f", imc));

	        if (imc <= 18.5) {
	            System.out.println(" Abaixo do peso");
	        } else if (imc >= 18.5 && imc <= 24.9) ;{
	            System.out.println(" Peso Normal");
	        } if (imc >= 25.0 && imc <= 29.9) {
	            System.out.println(" Sobrepeso");
	        } else if (imc >= 30.0 && imc <= 34.9) {
	            System.out.println(" Obesidade Grau 1");
	        } else if (imc >= 35.0 && imc <= 39.9) {
	            System.out.println(" Obesidade Grau 2");
	        } else if (imc >= 40.0){
	            System.out.println(" Obesidade Grau 3");
	        }
	    }
}
