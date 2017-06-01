import java.util.Scanner;
public class ex7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a cor do semáforo, considerando [1-Verde | 2-Amarelo | 3-Vermelho]: ");
	    int cor = sc.nextInt();
		switch (cor) {
			case 1:
				System.out.print("Siga em frente.");
				break;
			case 2:
				System.out.print("Tenha cuidado.");
				break;
			case 3:
				System.out.print("Pare.");
				break;
			default:
				System.out.print("A cor digitada é inválida.");
		}
	}
}
