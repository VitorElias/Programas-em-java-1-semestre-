import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double Nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        double Media = CalcularMedia(Nota1,Nota2,Nota3);
        String Notas = VerificarMedia(Media);

        JOptionPane.showMessageDialog(null, "Media Do aluno "+Media+" \n Situação do aluno: "+Notas);


    }

    public static double CalcularMedia(double Nota1, double Nota2, double Nota3) {

        double Media = (Nota1+Nota2+Nota3)/3;
        return Media;
    }

    public static String VerificarMedia(double Media) {

        if (Media >= 8.0) {
            return "Aprovado com sucesso!";
        } else if (Media >= 6.0 && Media < 8.0) {
            return "Aprovado";
        } else if (Media >= 3 && Media < 6.0) {
            return "Recuperação";
        } else if (Media < 3) {
            return "Reprovado";
        } else if (Media == 0) {
            return "Desistente";
        }else {
            return "ERRO";
        }
    }
}