import java.util.Scanner;
import java.util.Locale;

public class CalculadoraAreas{
  
  public static void main(String[]args){
  Scanner input=new Scanner(System.in);

  double A,B,C,areaCirculo,areaQuadrado,areaRetangulo,areaTriangulo,areaTrapezio,pi;
    pi=3.1416;
  String unidadeMedida;
    unidadeMedida="cm^2";
  

  //Area Triângulo
  System.out.println("CALCULA AREA DE UM TRIÂNGULO");
    System.out.println("Digite o valor da base b e da altura h do triângulo");
      System.out.print("b= ");
        A=input.nextDouble();
      System.out.print("h= ");
        B=input.nextDouble();
    areaTriangulo=A*B/2;
    System.out.printf("Area do triângulo= %.2f %s\n",areaTriangulo,unidadeMedida);
  System.out.println();

  //Area Circulo
  System.out.println("CALCULA AREA DE UM CÍRCULO");
    System.out.println("Digite o valor do raio r do círculo");
      System.out.print("r= ");
        A=input.nextDouble();
    areaCirculo=pi*Math.pow(A,2.0);
    System.out.printf("Area do Circulo= %.2f %s\n",areaCirculo,unidadeMedida);
  System.out.println();

  //Area Quadrado
  System.out.println("CALCULA AREA DE UM QUADRADO");
    System.out.println("Digite o valor do raio l do quadrado");
      System.out.print("l= ");
        A=input.nextDouble();
    areaQuadrado=Math.pow(A,2.0);
    System.out.printf("Area do Quadrado= %.2f %s\n",areaQuadrado,unidadeMedida);
  System.out.println();
  
  //Area do Retângulo
    System.out.println("CALCULA AREA DE UM RETÂNGULO");
    System.out.println("Digite o valor da base b e da altura h do retângulo");
      System.out.print("b= ");
        A=input.nextDouble();
      System.out.print("h= ");
        B=input.nextDouble();
    areaRetangulo=A*B;
    System.out.printf("Area do retângulo= %.2f %s\n",areaRetangulo,unidadeMedida);
    System.out.println();

  //Area do Trapézio
    System.out.println("CALCULA AREA DE UM TRAPÉZIO");
    System.out.println("Digite o valor da base maior B, base menor b e da altura h do trapézio");
      System.out.print("B= ");
        A=input.nextDouble();
      System.out.print("b= ");
        B=input.nextDouble();
      System.out.print("h= ");
        C=input.nextDouble();
    areaTrapezio=(A+B)*C/2;
    System.out.printf("Area do Trapézio= %.2f %s\n",areaTrapezio,unidadeMedida);
    System.out.println();

input.close();

  System.out.println("----------RESUMO----------");
    Locale.setDefault(Locale.US);
    System.out.printf("Area do Triângulo= %.2f %s\n",areaTriangulo,unidadeMedida);
    System.out.printf("Area do Círculo= %.2f %s\n",areaCirculo,unidadeMedida);
    System.out.printf("Area do Quadrado= %.2f %s\n",areaQuadrado,unidadeMedida);
    System.out.printf("Area do Retângulo= %.2f %s\n",areaRetangulo,unidadeMedida);
    System.out.printf("Area do Trapézio= %.2f %s\n",areaTrapezio,unidadeMedida);
  System.out.println("----------RESUMO----------");
  }
}