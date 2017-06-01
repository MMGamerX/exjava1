import java.util.Scanner;
public class ex2 {
  public static void main(String[] args){
    float m,x,y;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o primeiro numero: ");
    x = input.nextFloat();
    System.out.print("Digite o segundo numero: ");
    y = input.nextFloat();
    m = (x+y)/2;
    System.out.println("Media: "+m);
  }
}
