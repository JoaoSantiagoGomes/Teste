import java.util.Scanner;
public class Fatorial {
  
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);   
    int n,i,f;
      f=1;
    double fatorial;

    System.out.println("Digite um número: ");
    fatorial=n=input.nextInt();
    switch (n){
      case 1:
        fatorial=0;
        break;
      default:
        for (i=n-1;i>0;i-=f){
          fatorial=fatorial*i;
        }
        break;
    }

    System.out.println("Fatorial de "+n+"= "+fatorial);
    input.close();     
  }
}
