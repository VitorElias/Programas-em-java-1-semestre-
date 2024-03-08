import javax.swing.JOptionPane;


class Main {
    public static void main(String[] args)  {

        int Tanque = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do tanque:"));
        int Combustivel = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de combustivel presente no tanque:"));

        boolean Reabastecer = VerificarReabastecimento(Tanque,Combustivel);

        if(Reabastecer) {

            JOptionPane.showMessageDialog(null , "O carro Precisa ser reabas tecido!!!!!!!!!!");
        }else {
            JOptionPane.showMessageDialog(null, "O carro não precisa ser reabastecido!!!!!!!! ");
        }
    }
    public static boolean VerificarReabastecimento(int Tanque, int Combustivel) {

        boolean Reabastecer = Combustivel <= Tanque/4;
        return Reabastecer;
    }


}