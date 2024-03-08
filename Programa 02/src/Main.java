import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        String Semaforo = JOptionPane.showInputDialog("Qual a cor do semaforo?");

        String Atravessar = CorSemaforo(Semaforo);

        JOptionPane.showMessageDialog(null, Atravessar);

    }

    public static String CorSemaforo(String Semaforo) {

        String Atravessar = " ";
        Semaforo = Semaforo.toLowerCase();

        if(Semaforo.equals("verde")) {
            Atravessar = "PODE ATRAVESSAR!";
        }else if(Semaforo.equals("amarelo")) {
            Atravessar = "ESPERE!";
        }else if(Semaforo.equals("vermelho")) {
            Atravessar = "NÃO PODE ATRAVESSAR!";
        }else {
            Atravessar = "FAROL INOPERANTE!";
        }

        return Atravessar;
    }
}