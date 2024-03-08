import javax.swing.JOptionPane;

class Main {
    public static void main (String[] args) {

        double RendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua renda mensal: "));
        double Gastos = Double.parseDouble(JOptionPane.showInputDialog("Digite os seus gastos mensais:"));

        String Orçamento = VerificacaoDeGastos(RendaMensal, Gastos);

        JOptionPane.showMessageDialog(null, Orçamento);



    }
    public static String VerificacaoDeGastos(double RM, double G) {

        if(RM >= G) {
            return "Você está dentro do orçamento Parabens!";
        }else {
            return "Você esta fora do orçamento. NÂO GASTE MAIS!!!!";
        }

    }
}