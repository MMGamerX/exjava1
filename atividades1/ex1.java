import java.util.Scanner;
public class ex1 {
  public static void main(String args[]){
    int[] numeros;
    numeros = new int[10];
    Scanner sc;
    sc = new Scanner(System.in);
    for (int c=0;c<10;c++) {
      System.out.println("Digite o "+(c+1)+"° número: ");
      numeros[c]=sc.nextInt();
    }
    System.out.println("Os seguintes números são pares:");
    for (int c=0;c<10;c++){
      if (numeros[c]%2==0){
        System.out.print(numeros[c]+" ");
      }
    }
  }
}
