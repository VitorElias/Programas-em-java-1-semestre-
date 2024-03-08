import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double SalarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario Base: "));
        int PorcentagemBonus = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu bonus(EM PORCENTAGEM): "));
        double Desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu desconto( EM REAIS): "));

        double SalarioLiquido = CalcularSalario(SalarioBase, PorcentagemBonus , Desconto);

        JOptionPane.showMessageDialog(null, "O seu salario liquido é de "+SalarioLiquido);


    }
    public static double CalcularSalario(double SB , int PB , double D) {

        double Bonus = CalcularPorcentagem(PB, SB);

        double SalarioLiquido = (SB+Bonus)-D;
        return SalarioLiquido;

    }

    public static double CalcularPorcentagem(int PB, double SB) {
        double Bonus = (SB*PB)/100;
        return Bonus;
    }

}