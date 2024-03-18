import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random Rand = new Random();

        System.out.println("Digite a quantidade de alunos: ");
        int N = input.nextInt();

        int[] Alunos = Criar(N, Rand);

        int[] Grupo1 = new int[N / 2];
        int[] Grupo2 = new int[N / 2];


        int C = 0;
        while (C < N / 2) {
            int aluno = Rand.nextInt(N) + 1;
            if (!contemAluno(Grupo1, aluno)) {
                Grupo1[C] = aluno;
                C++;
            }
        }

        C = 0;
        while (C < N / 2) {
            int aluno = Rand.nextInt(N) + 1;
            if (!contemAluno(Grupo1, aluno) && !contemAluno(Grupo2, aluno)) {
                Grupo2[C] = aluno;
                C++;
            }
        }

        System.out.println("=====================");
        System.out.println("GRUPO 1 :");
        MostrarTela(Grupo1);

        System.out.println("\n====================");
        System.out.println("GRUPO 2 :");
        MostrarTela(Grupo2);
    }

    public static int[] Criar(int N, Random Rand) {
        int[] Alunos = new int[N];
        for (int C = 0; C < Alunos.length; C++) {
            Alunos[C] = C + 1;
        }
        embaralharAlunos(Alunos, Rand);
        return Alunos;
    }

    public static void embaralharAlunos(int[] alunos, Random random) {
        for (int i = alunos.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = alunos[index];
            alunos[index] = alunos[i];
            alunos[i] = temp;
        }
    }

    public static boolean contemAluno(int[] grupo, int aluno) {
        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i] == aluno) {
                return true;
            }
        }
        return false;
    }

    public static void MostrarTela(int[] Grupo) {
        for (int C = 0; C < Grupo.length; C++) {
            if (C == Grupo.length - 1) {
                System.out.print(Grupo[C]);
            } else {
                System.out.print(Grupo[C] + "-");
            }
        }
    }
}