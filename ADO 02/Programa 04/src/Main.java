import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Programa Converter Moeda");
      System.out.println("1 --- Real para Dolar");
      System.out.println("2 --- Dolar para real");
      int ent = input.nextInt();

      if(ent == 1) {

          System.out.println("Quantos reais serão convertido para dólar?");
          double R = input.nextDouble();

          double Dolares = ConverterPDolar(R);

          System.out.printf("O total convertido para Dólares será de %.2f",Dolares);



      }else if(ent == 2) {

          System.out.println("Quantos Dólares Serão convertidos para reais?");
          double D = input.nextDouble();

          double Reais = ConverterPReais(D);

          System.out.printf("O total convertido para Reais será de %.2f",Reais);


      }else {
          System.out.println("DIGITO ERRADO, DIGITO ERRADO , SAINDO DO PROGRAMA!!!!! ");
      }

    }
    public static double ConverterPDolar(double R) {

        double Dolar = R/5.16;
        return Dolar;
    }

    public static double ConverterPReais(double D) {

        double Reais = D*5.16;
        return Reais;
    }
}