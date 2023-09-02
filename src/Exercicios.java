import java.util.Scanner;
public class Exercicios{

    public static void main(String[]args){

    Scanner input=new Scanner(System.in);
    int item1,item2,item3,item4,id,quantidade;
    double preço1,preço2,preço3,preço4,preço5,valorTotal;
    String nome;
    
    System.out.println("      PRODUTOS      |iD|     PREÇO    ");
    System.out.println("   Cachorro-Quente  |01|    R$4.00    ");
      item1=01;
      preço1=4.00;
    System.out.println("      X-Salada      |02|    R$4.50    ");
      item2=02;
      preço2=4.50;
    System.out.println("      X-Bacon       |03|    R$5.00    ");
      item3=03;
      preço3=5.00;
    System.out.println("   Torrada Simples  |04|    R$2.00    ");
      item4=04;
      preço4=2.00;
    System.out.println("    Refrigerante    |05|    R$1.50    ");
      preço5=1.50;


    System.out.println();
    

    System.out.print("Digite o id do produto: ");
      id=input.nextInt();
      if (id!=01&&id!=02&&id!=03&&id!=04&&id!=05){
        System.out.println("Item não existente!");
      }
    System.out.print("Digite a quantidade de itens: ");
      quantidade=input.nextInt();
    input.close();

    if (id==item1){
      valorTotal=quantidade*preço1;
      nome="Cachorro Quente";
    }
    else if (id==item2){
      valorTotal=quantidade*preço2;
      nome="X-Salada";
    }
    else if(id==item3){
      valorTotal=quantidade*preço3;
      nome="X-Bacon";
    }
    else if(id==item4){
      valorTotal=quantidade*preço4;
      nome="Torrada Simples";
    }
    else {
      valorTotal=quantidade*preço5;
      nome="Refrigerante";
    }
    
    System.out.println("");
    System.out.println("--------RESUMO DA COMPRA--------");
    System.out.println("Nome do produto: "+nome);
    System.out.println("Quantidade do produto: "+quantidade);
    System.out.println("Valor Total: R$"+valorTotal);
 } 
}