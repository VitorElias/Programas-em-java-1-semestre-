import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        int N1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog(null , "Digite outro numero: "));

        int Dobro1 = CalcularDobro(N1);
        int Dobro2 = CalcularDobro(N2);

        JOptionPane.showMessageDialog(null, "O dobro de "+N1+" é "+Dobro1);
        JOptionPane.showMessageDialog(null, "O dobro de "+N2+" é "+Dobro2);
    }

    public static int CalcularDobro(int N) {

        int Dobro = N*2;
        return Dobro;
    }
}