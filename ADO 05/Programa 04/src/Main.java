import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        String Cor1 = JOptionPane.showInputDialog("Digite uma cor:");
        String Cor2 = JOptionPane.showInputDialog("Digite outra cor:");

        boolean EhPrimaria = VerificarCor(Cor1,Cor2);

        if(EhPrimaria) {
            JOptionPane.showMessageDialog(null, "São Primarias!");
        }else {
            JOptionPane.showMessageDialog(null, "Não são primarias!");
        }


    }

    public static boolean VerificarCor(String Cor1, String Cor2) {

        Cor1 = Cor1.toLowerCase();
        Cor2 = Cor2.toLowerCase();


        boolean Primaria1 = CorPrimaria(Cor1);
        boolean Primaria2 = CorPrimaria(Cor2);

        boolean Verificar = Primaria1 == true && Primaria2 == true;
        return  Verificar;
    }
    public static boolean CorPrimaria(String Cor) {

        boolean EhPrimaria = Cor.equals("amarelo") || Cor.equals("vermelho") || Cor.equals("azul");
        return EhPrimaria;
    }
}