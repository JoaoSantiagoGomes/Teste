import java.util.Locale;
import java.util.Scanner;
public class EX {

  public static void main(String[]args){
  
  Scanner input=new Scanner(System.in);

  double salario,ganhoHora,salarioAnual;
  int diasMes,horasDia;
    diasMes=25;
    horasDia=9;

  String nome,profissao,empresa,temp;
  char genero;
  

    System.out.println("Bem vindo ao calculador de salário!");
  
    System.out.println();

    System.out.print("Nome: ");
      nome=input.nextLine();
    System.out.print("Genero: ");
      genero=input.next().charAt(0);
      temp=input.nextLine();
    System.out.print("Profissão:");
      profissao=input.nextLine();
    System.out.print("Empresa: ");
      empresa=input.nextLine();
    System.out.print("Ganho por hora: R$");
      ganhoHora=input.nextDouble();
    System.out.println();
    
    salario=ganhoHora*horasDia*diasMes;
    salarioAnual=salario*13;


    Locale.setDefault(Locale.US);

    System.out.println("--------------------------------------------");

      System.out.println("EMPRESA: "+empresa);
      System.out.println("NOME DO FUNCIONÁRIO: "+nome);
      System.out.println("GENERO: "+genero);
      System.out.println("PROFISSÃO "+profissao);
      System.out.printf("Salário: %.2f\n",salario);
      System.out.printf("Salário Anual: %.2f\n",salarioAnual);

    System.out.println("--------------------------------------------");
         
 input.close();
 System.out.println(temp);
 }
}