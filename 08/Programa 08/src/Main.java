import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        String Cor = JOptionPane.showInputDialog(null,"Digite uma cor primaria: ");

        boolean CorPrimaria = VerCorPrimaria(Cor);

        if(CorPrimaria) {
             JOptionPane.showMessageDialog(null, "È uma cor Primaria:");
        }else {
             JOptionPane.showMessageDialog(null, "Não é uma cor Primaria:");
        }

    }
    public static boolean VerCorPrimaria(String Cor ) {

        boolean CorPrimaria = Cor.equals("amarelo") || Cor.equals("vermelho") || Cor.equals("azul");
        return CorPrimaria;
    }
}