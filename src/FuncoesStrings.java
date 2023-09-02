public class FuncoesStrings {

    public static void main(String[]args){
    String palavras="batata arroz japones sushi carne coca-cola computador video-game carro onibus metro";
    String[] vetor=palavras.split(" ");
      String string1=vetor[0];
      String string2=vetor[1];
      String string3=vetor[2];
      String string5=vetor[6];

    String original="ABC abc DEF     def    GHI ghi    abc def ABC DEF      ";
      String originalMinuscula=original.toLowerCase();
      String originalMaiuscula=original.toUpperCase();
      String semEspaçoExtremidades=original.trim();
      String originalRecortado1=original.substring(5);
      String originalRecortado2=original.substring(3, 14);
      String originalSubstituido1=original.replace('a','4');
      String originalSubstituido2=original.replace("abc","xyz");
      int primeiraPosicao=original.indexOf("def");
      int ultimaPosicao=original.lastIndexOf("def");




    System.out.println("ORIGINAL: -"+original+"-");
    System.out.println("toLowerCase: -"+originalMinuscula+"-");
    System.out.println("toUpperCase: -"+originalMaiuscula+"-");
    System.out.println("trim: -"+semEspaçoExtremidades+"-");
    System.out.println("substring de uma posição em diante: -"+originalRecortado1+"-");
    System.out.println("substring de uma posição até outra: -"+originalRecortado2+"-");
    System.out.println("replace uma letra por outra: -"+originalSubstituido1+"-");
    System.out.println("replace uma string por outra: -"+originalSubstituido2+"-");
    System.out.println("indexOf: -"+primeiraPosicao+"-");
    System.out.println("lastIndexOf: -"+ultimaPosicao+"-");

    System.out.println();
    System.out.println("OPERAÇÃO SPLIT");
    System.out.println("split 1: -"+string1+"-");
    System.out.println("split 2: -"+string2+"-");
    System.out.println("split 3: -"+string3+"-");
    System.out.println("split 5: -"+string5+"-");
    
 }
}
