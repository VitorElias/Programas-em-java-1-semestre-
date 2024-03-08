import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        String Nome = JOptionPane.showInputDialog(null , "Digite seu nome");

        String NomeFinal = PrimeiroNome(Nome);

        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo(a) "+NomeFinal);


    }

    public static String PrimeiroNome(String Nome) {

        String NomeFinal = Nome.substring(0, Nome.indexOf(" "));
        return NomeFinal;
    }

}