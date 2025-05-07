package Secao1_Fundamentos;

public class Conversao {
    public static void main(String[] args) {

        int num = 1;
        int numero = (int) Math.pow(num, 10); // o (int) garante que vai ser um int

        // Convertendo o número inteiro para String
        String texto = Integer.toString(numero);

        System.out.println(texto); // Saída: "10"

        // OU TAMBÉM

        double valor = 3.14;

        // Outra forma:
        String texto2 = String.valueOf(valor);

        System.out.println(texto2); // Saída: "3.14"


        String texto1 = "42";

        // Converte o texto para um número inteiro
        int numero1 = Integer.parseInt(texto1);

        System.out.println(numero1); // Saída: 42

    }
}
