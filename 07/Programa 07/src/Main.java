import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double CatetoOposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto oposto: "));
        double CatetoAdjascente = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto adjascente: "));

        double Hip = CalcularHipotenusa(CatetoOposto, CatetoAdjascente);

        JOptionPane.showMessageDialog(null , "A hipotenusa é "+Hip);


    }
    public static double CalcularHipotenusa(double CO , double CA) {

        double Hipotenusa = Math.sqrt(Math.pow(CO , 2)+ Math.pow(CA , 2));
        return Hipotenusa;
    }
}