package Secao4_ArraysECollections;

import java.util.Arrays;

public class Aula1_Array {
    public static void main(String[] args) {

        // 1. Declaração e criação:
        int[] inteiros = new int[5];          // array de 5 inteiros, inicializados com 0
        String nome1 = "Matheus";
        String[] nomes = { "Ana", nome1, "Bruno", "Clara" };  // inicialização direta

        // 2. Atribuição de valores:
        inteiros[0] = 10;    // posição 0 recebe 10
        inteiros[1] = 20;    // posição 1 recebe 20
        // inteiros[5] = 50;  // ERRO em tempo de execução: índice fora de limites

        // 3. Impressão usando for clássico:
        System.out.println("=== inteiros (for clássico) ===");
        for (int i = 0; i < inteiros.length; i++) {
            System.out.printf("inteiros[%d] = %d%n", i, inteiros[i]);
        }

        // 4. Impressão usando for-each:
        System.out.println("\n=== nomes (for-each) ===");
        for (String nome : nomes) {
            System.out.println("nome = " + nome);
        }

        // 5. Uso de Arrays utilitários:
        System.out.println("\n=== ordenando inteiros ===");
        Arrays.sort(inteiros);  // ordena
        System.out.println(Arrays.toString(inteiros));

        // 6. Copiando e preenchendo:
        int[] copia = Arrays.copyOf(inteiros, 3); // [0,0,10]
        System.out.println("\nCópia parcial: " + Arrays.toString(copia));

        int[] preenchido = new int[4];
        Arrays.fill(preenchido, 7);               // [7,7,7,7]
        System.out.println("Preenchido: " + Arrays.toString(preenchido));

        // 7. Array multidimensional:
        System.out.println("\n=== matriz 2×3 ===");
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };
        // percorrendo cada linha
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }

        // 8. Dicas de segurança:
        // - Sempre use array.length no laço, nunca valor “hardcoded”.
        // - Valide índices negativos ou >= length antes de acessar.
    }
}
