import  javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double Diametro1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o diametro do primeiro cilindro"));
        double Altura1 =   Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do primeiro cilindro"));

        double Diametro2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o diametro do segundo cilindro: "));
        double Altura2 =   Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do segundo cilindro:"));

        double Volume1 = CalcularVolume(Diametro1, Altura1);
        double Volume2 = CalcularVolume(Diametro2, Altura2);

        boolean Transferir = TransferirCilindro(Volume1, Volume2);

        JOptionPane.showMessageDialog(null, "Volume do primeiro cilindro --> "+Volume1+" \n Volume do segundo cilindro --> "+Volume2);

        if(Transferir) {
            JOptionPane.showMessageDialog(null, " É possivel transferir o volume do primeiro para o segundo cilindro!!!");
        }else {
            JOptionPane.showMessageDialog(null, "Não é possivel transferir o volume do primeiro para o segundo cilindro!!! ");
        }



    }

    public static double CalcularVolume(double D , double A) {

        double V = Math.PI* (Math.pow((D/2) ,2)) *A;
        return V;

    }

    public static boolean TransferirCilindro(double V1, double V2) {

        boolean Transferir = V1 <= V2;
        return Transferir;
    }
}