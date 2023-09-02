import java.util.Scanner;
public class Calculadora{
  
  public static void main(String[]args){
  
  Scanner input=new Scanner(System.in);
  int x,y,soma;

    System.out.println("********(SOMA INTEIROS POR ENQUANTO)********");
    System.out.println();

    System.out.print("Digite o primeiro número:");
      x=input.nextInt();

    System.out.println();

    System.out.print("Digite o segundo número:");
      y=input.nextInt();
     
    System.out.println();
    input.close();

    soma=x+y;

    System.out.println("RESULTADO="+soma);
  }
}