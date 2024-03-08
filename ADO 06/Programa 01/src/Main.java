import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        String TipoIngresso = JOptionPane.showInputDialog("Qual o tipo de ingresso? \n MEIA: \n INTEIRA:");
        int QuantIngressos = Integer.parseInt(JOptionPane.showInputDialog(" Quantos ingressos?"));

        double Total = CalcularIngressos(TipoIngresso, QuantIngressos);

        JOptionPane.showMessageDialog(null, "O total dos ingressos ficou em "+Total);


    }

    public static double CalcularIngressos(String Ingresso, int Quant ) {

        double Total = 0.0;
        Ingresso = Ingresso.toLowerCase();

        if(Ingresso.equals("meia")) {
           Total = (28.50/2) * Quant;
        } else {
           Total = 28.50 * Quant;
        }
        return Total;
    }
}