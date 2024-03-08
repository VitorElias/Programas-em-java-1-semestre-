import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        String Senha = JOptionPane.showInputDialog("Digite a senha: \n OBS: A senha deve conter um caracter especial \n ter no minimo 6 caracteres \n e possuir numeros: ");

        boolean SenhaForte = VerificarSenhaForte(Senha);

        if(SenhaForte) {
            JOptionPane.showMessageDialog(null, "A SENHA É FORTE! ");
        }else {
            JOptionPane.showMessageDialog(null, "A SENHA NÃO É FORTE!");
        }

    }

    public static boolean VerificarSenhaForte(String Senha) {

        boolean CaracEspecial = CaractereEspecial(Senha);
        boolean PNumero = PossuiNumero(Senha);
        boolean Comprimento = VerificarComprimento(Senha);

        boolean SenhaForte = CaracEspecial || PNumero || Comprimento;
        return SenhaForte;

    }

    public static boolean CaractereEspecial(String Senha) {

        boolean CaracEspecial = Senha.equals("!") &&
                                Senha.equals("@") &&
                                Senha.equals("#") &&
                                Senha.equals("$") &&
                                Senha.equals("%") &&
                                Senha.equals("&") &&
                                Senha.equals("*") &&
                                Senha.equals("^") &&
                                Senha.equals("(") &&
                                Senha.equals(")") &&
                                Senha.equals("_");
        return CaracEspecial;

    }

    public static boolean PossuiNumero(String Senha) {

        boolean PossuiNum = Senha.equals("0") &&
                            Senha.equals("1") &&
                            Senha.equals("2") &&
                            Senha.equals("3") &&
                            Senha.equals("4") &&
                            Senha.equals("5") &&
                            Senha.equals("6") &&
                            Senha.equals("7") &&
                            Senha.equals("8") &&
                            Senha.equals("9");
        return PossuiNum;

    }

    public static boolean VerificarComprimento(String Senha) {

        boolean Comprimento = Senha.length() > 5;
        return Comprimento;
    }
}