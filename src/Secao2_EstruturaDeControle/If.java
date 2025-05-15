package Secao2_EstruturaDeControle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota:");
        double media = entrada.nextDouble();

        if(media >= 5.0){
            System.out.println("Passou");
        }else{
            System.out.println("Reprovou");
        }

        System.out.println("Digite o dia da semana");
        String dia = entrada.next();

        // quando for fazer a comparação em string sempre utilizar o .equalsIgnoreCase enves do ==
        if(dia.equalsIgnoreCase("Segunda")){
            System.out.println("Hoje é segunda");
        }



        entrada.close();
    }
}
