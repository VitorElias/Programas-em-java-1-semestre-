import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        int N1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um numero:"));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite outro numero:"));

        int Total = CalcularSoma(N1,N2);

        JOptionPane.showMessageDialog(null, "A soma entre "+N1+" + "+N2+" = "+Total);

    }
    public static int CalcularSoma(int N1 , int N2) {

        int Total = N1+N2;
        return Total;
    }


}
