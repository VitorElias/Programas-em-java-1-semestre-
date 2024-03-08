import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        String Frase = JOptionPane.showInputDialog(null, "Digite uma frase");

        String FraseFinal = CodificarFrase(Frase);

        JOptionPane.showMessageDialog(null, FraseFinal);


    }
    public static String CodificarFrase(String Frase) {

        Frase = Frase.toLowerCase();
        String FraseFinal = Frase.replaceAll("[aeiou]",  "i");
        return FraseFinal;
    }
}