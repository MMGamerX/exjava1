import java.util.Scanner;
public class ex6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c = 0;
		double s = 0,n = 0;
		do {
			System.out.print("Digite um numero: ");
			n = input.nextDouble();
			s += n;
			c++;
		} while (n!=0);
		System.out.println("Soma: "+s);
		System.out.println("Quantidade: "+c);
	}
}