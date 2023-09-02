import java.util.Scanner;

public class NumeroPrimo {
  
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);

    int n;

    System.out.print("digite um número inteiro: ");
    n=input.nextInt();
    System.out.println(verificaPrimo(n));   

  input.close();
  }

//Verifica se n é primo
  public static String verificaPrimo(int x){
    int i,contador;
      contador=0;
      i=x;

    do {
      if (x%i==0){
        contador++;
        System.out.printf("O número %d é divisor de %d",i,x);
        System.out.println();
      }
      i--;
    } while (i>=1);
    if (contador==2){
      return "Esse número é primo";
    }
    else {
      return "Esse número não é primo";
    }
  }
}
