import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        double Base1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do primeiro retângulo: "));
        double Altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do primeiro retângulo: "));

        double Base2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do segundo retângulo:"));
        double Altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do segundo retângulo: "));

        double Area1 = CalcularArea(Base1, Altura1);
        double Area2 = CalcularArea(Base2, Altura2);

        boolean Igual = AreaIguais(Area1, Area2);

        JOptionPane.showMessageDialog(null, "Area do primeiro retângulo: "+Area1);
        JOptionPane.showMessageDialog(null, "Area do segundo retângulo: "+Area2);

        if(Igual) {
            JOptionPane.showMessageDialog(null, "Os retângulos são iguais!");
        }else {
            JOptionPane.showMessageDialog(null, "Os retângulos não são iguais!");
        }



    }

    public static boolean AreaIguais(double Area1, double Area2) {

        boolean Iguais = Area1 == Area2;
        return Iguais;
    }
    public static double CalcularArea(double B , double A) {

        double Area = B*A;
        return Area;
    }
}