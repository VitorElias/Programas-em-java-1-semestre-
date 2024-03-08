import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double Febre = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua temperatura: "));

        String VerFebre = VerificarFebre(Febre);

        JOptionPane.showMessageDialog(null, "Você está com "+VerFebre);



    }
    public static String VerificarFebre(double Febre) {

        if(Febre >= 41.0 ) {
            return  "Hipertermia";
        }else if(Febre >= 39.6 && Febre <= 41.0 ) {
            return  "Febre Alta";
        }else if(Febre >= 37.6 && Febre <= 39.6) {
            return  "Febre";
        }else if(Febre >= 36.0 && Febre <= 37.6) {
            return  "Normal";
        }else if(Febre <= 36.0) {
            return  "Hipotermia";
        }else {
            return "ERRO DADOS INVALIDOS!";
        }

    }
}