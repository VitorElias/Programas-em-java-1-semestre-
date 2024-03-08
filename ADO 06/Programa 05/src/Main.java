import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        int M = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 12:"));

        String Mes = VerificarMes(M);

        JOptionPane.showMessageDialog(null, Mes);


    }

    public static String VerificarMes(int M ) {

        switch (M) {
            case 1 :
                return "Janeiro";
            case 2 :
                return "Fevereiro";
            case 3 :
                return "Março";
            case 4 :
                return "Abril";
            case 5 :
                return "Maio";
            case 6 :
                return "Junho";
            case 7 :
                return "Julho";
            case 8 :
                return "Agosto";
            case 9 :
                return "Setembro";
            case 10 :
                return "Outubro";
            case 11 :
                return "Novembro";
            case 12 :
                return "Dezembro";
            default :
                return "DADOS INVALIDOS";
         }
    }
}