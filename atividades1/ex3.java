import java.util.Scanner;
public class ex3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite o ano em que você nasceu: ");
		int ano_nasc = sc.nextInt();
		System.out.print("Digite um ano futuro para saber qual será a sua idade: ");
		int ano_ft = sc.nextInt();
		if (ano_nasc>ano_ft)
			System.out.print("O ano digitado é anterior à sua data de nascimento.");
		else
			System.out.print("Em "+ano_ft+", você terá "+(ano_ft-ano_nasc)+" anos de idade, "+nome+".");
	}
}
