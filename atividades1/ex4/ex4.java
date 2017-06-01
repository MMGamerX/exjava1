import java.util.Scanner;
public class ex4 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Nome: ");
    String nome = input.nextLine();
    System.out.print("Peso: ");
    double peso = input.nextDouble();
    System.out.print("Altura: ");
    double alt = input.nextDouble();
    double imc = peso/(alt*alt);
    System.out.println("Olá "+nome+", seu IMC é "+imc);
    if (imc>=18.6&&imc<=24.9) {
	    System.out.println("Parabéns! Você está no peso ideal!");
	} else {
		double diff = ((imc<18.5) ? (18.6-imc) : (24.9-imc));
		if (imc<18.5) {
	    	System.out.println("Você está abaixo do peso!");
	    } else {
	    	if (imc>=25&&imc<=29.9) {
	    		System.out.println("Você está levemente acima do peso!");
	    	} else {
	    		if (imc>=30&&imc<=34.9) {
	    			System.out.println("Você está com obesidade grau I!");
	    		} else {
	    			if (imc>=35&&imc<=39.9) {
	    				System.out.println("Você está com obesidade grau II (severa)!");
	    			} else {
	    				System.out.println("Você está com obesidade grau III (mórbida)!");
	    			}
	    		}
	    	}
	    }
	    System.out.println("Falta "+diff+"kg para atingir seu peso ideal.");
	}
  }
}
