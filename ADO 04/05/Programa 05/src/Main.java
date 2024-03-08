import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double Febre = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua temperatura:"));

        boolean VerFebre = VerificarFebre(Febre);

        if(VerFebre) {
            JOptionPane.showMessageDialog(null, "ESTA COM FEBRE!!!");
        }else {
            JOptionPane.showMessageDialog(null, "NÂO ESTÀ COM FEBRE!!!");
        }

    }
    public static boolean VerificarFebre(double Febre) {

        boolean VerFebre = Febre >= 37.3;
        return VerFebre;
    }
}