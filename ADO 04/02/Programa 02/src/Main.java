import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        int Dobro = CalcularDobro(N);

        JOptionPane.showMessageDialog(null, " O dobro de "+N+" é "+Dobro);

    }
    public static int CalcularDobro(int N ) {

        int Dobro = N*2;
        return Dobro;
    }
}