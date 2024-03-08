import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double Base1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do primeiro retângulo: "));
        double Altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do primeiro retângulo: "));

        double Base2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do segundo retângulo: "));
        double Altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do segundo Retângulo:"));

        double Area1 = CalcularArea(Base1 , Altura1);
        double Area2 = CalcularArea(Base2 , Altura2);

        boolean Iguais = VerificarRetangulos(Area1 , Area2);

        if(Iguais) {
            JOptionPane.showMessageDialog(null, "Os retângulos são iguais");
        }else {
            JOptionPane.showMessageDialog(null, "Os retangulos não são iguais:");
        }


    }

    public static double CalcularArea(double B , double A) {

        double Area = B*A;
        return Area;
    }

    public static boolean VerificarRetangulos(double Area1, double Area2) {

        boolean Igual = Area1 == Area2;
        return Igual;
    }
}