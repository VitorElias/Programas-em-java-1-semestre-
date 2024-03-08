import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double Nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        boolean Passou = AlunoPassou(Nota1, Nota2, Nota3);

        double Media = CalcularMedia(Nota1, Nota2, Nota3);

        JOptionPane.showMessageDialog(null , "A media do aluno : "+Media);

        if(Passou) {
            JOptionPane.showMessageDialog(null,"O aluno Passou! ");
        }else {
            JOptionPane.showMessageDialog(null,"O aluno reprovou! ");
        }
    }

    public static boolean AlunoPassou(double N1, double N2, double N3) {

        double Media = CalcularMedia(N1,N2,N3);
        boolean Passou = Media >= 6.0;
        return Passou;
    }
    public static double CalcularMedia(double N1 , double N2 , double N3) {

        double Media = (N1+N2+N3)/3;
        return Media;
    }
}