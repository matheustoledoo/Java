package Secao1_Fundamentos;

import java.util.Date;

public class VariaveisAndConstantes {
    public static void main(String[] args) {
        var raio = 3.4;
        final double pi = 3.14; // com o final na frente vira uma constante

        //ou

        String s1 = new String("ola");

        System.out.println(pi * raio * raio);

        String s = "Bom dia X";
        s = s.toUpperCase();
        s = s.replace("X", "O");

        System.out.println(s);

        Date d = new Date(); // Instancia de Date e importação
        System.out.println(d);


    }
}
