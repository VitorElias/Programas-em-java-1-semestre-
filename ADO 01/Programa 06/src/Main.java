import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tamanho do tanque:");
        int T = input.nextInt();

        System.out.println("Quanto o carro anda por litro?");
        int C = input.nextInt();

        System.out.println("Digite a distância da viagem:");
        int KM = input.nextInt();

        int Paradas = CalcularParadas(T,C,KM);

        System.out.println("Voce vai precisar fazer mais "+Paradas+" paradas");
    }
    public static int CalcularParadas(int T , int C, int KM) {
        int CARRO = T*C;
        int Paradas = 0;

        if(CARRO/KM >= 1) {
            Paradas = 1;
        }else  {
          Paradas = KM/CARRO;
          if(CARRO % KM != 0) {
            Paradas +=1;
          }
        }

        return Paradas;
    }
}