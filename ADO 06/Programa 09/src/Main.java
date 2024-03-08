import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));

        double IMC = CalcularImc(Altura,Peso);
        String SituacaoIMC = VerificarIMC(IMC);

        JOptionPane.showMessageDialog(null, "Seu imc é:"+IMC+" \n Sua situação é de "+SituacaoIMC);




    }
    public static double CalcularImc(double A, double P) {

        double IMC1 = P/(A*A);
        return IMC1;

    }

    public static String VerificarIMC(double IMC) {

        String EstadoIMC  = " ";

        if(IMC >= 40.0) {
            EstadoIMC = "OBESIDADE GRAU III";
        }else if(IMC >= 39.9 && IMC >= 35.0) {
            EstadoIMC = "OBESIDADE GRAU II";
        }else if(IMC <= 34.9 && IMC >= 30.0) {
            EstadoIMC = "OBESIDADE GRAU I";
        }else if(IMC <= 29.9 && IMC >= 25.0) {
            EstadoIMC = "SobrePeso";
        }else if(IMC <= 24.9 && IMC >= 18.5) {
            EstadoIMC = "Peso Normal";
        }else if(IMC < 18.5) {
            EstadoIMC = "Abaixo Do peso";
        }
        return EstadoIMC;
    }

}