import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double Gramas = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas gramas vai comprar?\n 100g = 3,50 \n (a partir de 1kg diminui 50 centavos)"));

        double Total = CalcularGramas(Gramas);

        JOptionPane.showMessageDialog(null, "O total da compra será de "+Total);

    }

    public static double CalcularGramas(double Gramas) {
        double Total = 0.0;

        if(Gramas < 1000.0) {
          Total = (Gramas/100)*3.50;
        }else {
          Total = (Gramas/100)*3.0;
        }
        return Total;
    }

}