import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o nome do lider dos autobots?");
        String Resp = input.nextLine();

        boolean Acertou = VerificarResposta(Resp);

        System.out.println("A resposta está correta? "+Acertou);


    }
    public static boolean VerificarResposta(String Resp) {

        Resp = Resp.toLowerCase();
        boolean Acertou =  Resp.equals("optimus prime");
        return Acertou;

    }
}