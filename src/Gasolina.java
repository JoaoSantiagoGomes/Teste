import java.util.Scanner;
import java.util.Locale;
public class Gasolina {
  public static void main(String[]args){

    Scanner input=new Scanner(System.in);
    int x,id;
      id=1;
    double quantidadeAlcool,quantidadeGasolina,quantidadeDiesel,litros;
      quantidadeAlcool=0;
      quantidadeDiesel=0;
      quantidadeGasolina=0;

      while (id!=0){

      System.out.println("GASOLINA=1");
      System.out.println("ALCOOL=2");
      System.out.println("DIESEL=3");
      System.out.println("CANCELAR=4");
      System.out.print("Digite a opção: ");
        x=input.nextInt();
      
      while (x<1||x>4){
        System.out.print("Código inválido, digite o código novamente: ");
          x=input.nextInt();
      }


      if(x!=4){ 
        System.out.print("Digite a quantidade de combustivel: ");
        switch (x){
          case 1:
            litros=input.nextDouble();
            quantidadeGasolina+=litros;
            break;
          case 2:
            litros=input.nextDouble();
            quantidadeAlcool+=litros;
            break;
          case 3:
            litros=input.nextDouble();
            quantidadeDiesel+=litros; 
            break; 
        }

        System.out.println("Deseja escolher mais algum produto?");
        System.out.println("SIM=1");
        System.out.println("NÃO=0");
        id=input.nextInt();
      }
      else {
        id=0;
      }
    }
    
    Locale.setDefault(Locale.US);
    
    if (id==0){
      System.out.println("RESUMO");
        System.out.printf("Quantidade de gasolina: %.2f\n",quantidadeGasolina);
        System.out.printf("Quantidade de alcool: %.2f\n",quantidadeAlcool);
        System.out.printf("Quantidade de diesel: %.2f\n",quantidadeDiesel);
    }
      
  input.close();
 }
}
