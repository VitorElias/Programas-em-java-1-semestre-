import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        int Dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
        int DS = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana: (0 A 6):"));
        int M = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes (1 A 12):"));
        int Ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));

        String DiaSemana = VerDiaSemana(DS);
        String Mes = VerMes(M);

        String MSGEnviada = MSGEnvio(Dia,Ano,DiaSemana,Mes);

        JOptionPane.showMessageDialog(null, MSGEnviada);


    }

    public static String VerDiaSemana(int DS) {

        String DiaSemana = " ";

        if(DS == 0) {
            DiaSemana = "Domingo";
        }else if(DS == 1) {
            DiaSemana = "Segunda Feira";
        }else if(DS == 2) {
            DiaSemana = "Terça Feira";
        }else if(DS == 3) {
            DiaSemana = "Quarta Feira";
        }else if(DS == 4) {
            DiaSemana = "Quinta Feira";
        }else if(DS == 5) {
            DiaSemana = "Sexta Feira";
        }else if(DS == 6) {
            DiaSemana = "Sabado";
        }
        return DiaSemana;
    }

    public static String VerMes(int M) {

       String Mes = " ";

       if(M == 1) {
           Mes = "Janeiro";
       }else if(M == 2) {
           Mes = "Fevereiro";
       }else if(M == 3) {
           Mes = "Março";
       }else if(M == 4) {
           Mes = "Abril";
       }else if(M == 5) {
           Mes = "Maio";
       }else if(M == 6) {
           Mes = "Junho";
       }else if(M == 7) {
           Mes = "Julho";
       }else if(M == 8) {
           Mes = "Agosto";
       }else if(M == 9) {
           Mes = "Setembro";
       }else if(M == 10) {
           Mes = "Outubro";
       }else if(M == 11) {
           Mes = "Novembro";
       }else if(M == 12) {
           Mes = "Dezembro";
       }
       return Mes;
    }

    public static String MSGEnvio(int Dia,int Ano, String DiaSemana , String Mes) {

        String MSG = "Enviado "+DiaSemana+","+Dia+" de "+Mes+" de "+Ano;
        return MSG;
    }
}