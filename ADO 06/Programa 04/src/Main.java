import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {


        int D = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 0 a 6"));

        String Dia = VerificarDia(D);

        JOptionPane.showMessageDialog(null, Dia);

    }

    public static String VerificarDia(int D) {

        switch(D) {
            case 0:
               return "Domingo";
            case 1:
               return "Segunda Feira";
             case 2:
               return "Terça Feira";
             case 3:
               return "Quarta Feira";
             case 4:
               return "Quinta Feira";
             case 5:
               return "Sexta Feira";
            case 6:
               return "Sabado";
            default :
                return "Informações Invalidas";
            }

    }
}