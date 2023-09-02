import java.util.Scanner;

public class Autenticação {
  public static void main(String[]args){ 
    Scanner input=new Scanner(System.in);
    int senha,password,tentativas,id;
    senha=2002;
    password=0;
    
    for (tentativas=3;tentativas>0;tentativas--){
      System.out.println("Você tem mais "+tentativas+" tentativa(s)");   
      System.out.println();
      System.out.print("Digite sua senha: ");
      password=input.nextInt();
      if (password==senha){
        tentativas=0;
        id=1;
      }
      else {
        id=0;
      }
    resultadoAutenticacao(id);
    }
  input.close();    
  }
  
  public static void resultadoAutenticacao(int x){
    if (x==1){
      System.out.println("Acesso liberado");
    }
    else {
      System.out.println("Acesso negado");
    }
  }
}
