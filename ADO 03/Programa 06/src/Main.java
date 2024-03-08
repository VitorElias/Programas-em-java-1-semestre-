import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digtite a cor do semaforo:");
        String Cor = input.nextLine();

        boolean Semaforo = VerificarCor(Cor);

        System.out.println("Pode Passar? "+Semaforo);


    }

    public static boolean VerificarCor(String Cor) {
        Cor = Cor.toLowerCase();

        boolean PodePassar = Cor.equals("verde");
        return PodePassar;
    }

}