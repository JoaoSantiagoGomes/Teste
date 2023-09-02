import java.util.Scanner;

public class Triangulo {
  
  public static void main(String[]args){

    Scanner input=new Scanner(System.in);
    int id;  
    double a,b,c,areaTriangulo1,areaTriangulo2;
    
    do {
      System.out.println("Digite os lados do triângulo X:");
      a=input.nextDouble();
      b=input.nextDouble();
      c=input.nextDouble();
      id=verificaExistenciaTriangulo(a, b, c);
      if (id==0){
        System.out.println("Esses valores não formam um triângulo, por favor informe valores que respeitem a condição de existência de um triângulo");
      }
    } while (id!=1);
    areaTriangulo1=calculaArea(a, b, c);
    System.out.println();
  
    do {
      System.out.println("Digite os lados do triângulo Y:");
      a=input.nextDouble();
      b=input.nextDouble();
      c=input.nextDouble();
      id=verificaExistenciaTriangulo(a, b, c);
      if (id==0){
        System.out.println("Esses valores não formam um triângulo, por favor informe valores que respeitem a condição de existência de um triângulo");
      }
    } while (id!=1);
    areaTriangulo2=calculaArea(a, b, c);
    System.out.println();

    resultado(areaTriangulo1, areaTriangulo2);

    
    input.close();
  }


//Calcula a area do triângulo
  public static double calculaArea(double x,double y,double z){
    double p,areaTriangulo;
      p=(x+y+z)*0.5;
      areaTriangulo=Math.sqrt(p*(p-x)*(p-y)*(p-z));
    return areaTriangulo;
  }

//Compara os triângulos e imprime na tela
  public static void resultado(double areaTriangulo1,double areaTriangulo2){
    System.out.printf("Área triângulo X= %.4f\n",areaTriangulo1);
    System.out.printf("Área triângulo Y= %.4f\n",areaTriangulo2);
    if (areaTriangulo1>areaTriangulo2){
      System.out.println("O triângulo X é maior que o triângulo Y");
    }
    else {
     System.out.println("O triângulo Y é maior que o triângulo X");
    }
  }

//Verifica a condição de existência do triângulo
  public static int verificaExistenciaTriangulo(double x,double y,double z){
    if (x>Math.abs(y-z)&&x<y+z&&y>Math.abs(x-z)&&y<x+z&&z>Math.abs(y-x)&&z<y+x){
      return 1;
    } 
    else {
      return 0;
    }
  }
}