import java.util.Scanner;
public class ex5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o raio do círculo: ");
		float raio = sc.nextFloat();
		System.out.print("A área do círculo será: "+(2*3.14*raio*raio));
	}
}
