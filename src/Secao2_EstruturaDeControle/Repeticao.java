package Secao2_EstruturaDeControle;

public class Repeticao {
    public static void main(String[] args) {

        // WHILE - Testa antes de executar
        int i = 0;
        while (i < 3) {
            System.out.println("while i: " + i);
            i++;
        }

        // DO WHILE - Executa ao menos uma vez
        int j = 0;
        do {
            System.out.println("do while j: " + j);
            j++;
        } while (j < 3);

        // FOR - contador conhecido
        for (int k = 0; k < 3; k++) {
            System.out.println("for k: " + k);
        }

        // FOR-EACH - para cada item do array
        String[] frutas = {"Maçã", "Banana", "Uva"};
        for (String fruta : frutas) {
            System.out.println("for-each fruta: " + fruta);
        }

        // SWITCH - múltiplas opções
        int opcao = 1;
        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada");
                break;
            case 2:
                System.out.println("Opção 2 selecionada");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // BREAK - interrompe o loop
        for (int x = 0; x < 10; x++) {
            if (x == 4) {
                System.out.println("Interrompe no 4");
                break;
            }
            System.out.println("x: " + x);
        }

        // CONTINUE - pula para a próxima
        for (int y = 0; y < 5; y++) {
            if (y == 2) {
                System.out.println("Pula o 2");
                continue;
            }
            System.out.println("y: " + y);
        }


    }
}
