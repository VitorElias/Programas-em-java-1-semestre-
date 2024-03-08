import javax.swing.*;


class Main {
    public static void main(String[] args) {

        double Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double Nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        double Media = CalcularMedia(Nota1,Nota2,Nota3);

        JOptionPane.showMessageDialog(null,"A media das notas é "+Media);


    }
    public static double CalcularMedia(double N1, double N2, double N3 ) {

        double Media = (N1+N2+N3)/3;
        return Media;
    }
}