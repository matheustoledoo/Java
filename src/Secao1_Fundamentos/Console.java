package Secao1_Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'teclado' para ler entradas do usuário via teclado
        Scanner teclado = new Scanner(System.in);

        // Exibe a mensagem no console pedindo para o usuário digitar o nome
        System.out.println("Digite seu nome: ");

        // Lê uma linha completa digitada pelo usuário e armazena na variável 'nome'
        String nome = teclado.nextLine();

        // Pergunta a idade
        System.out.println("Qual a sua idade?");

        // Lê um número inteiro digitado pelo usuário e armazena na variável 'idade'
        int idade = teclado.nextInt();

        // Consome o caractere de nova linha ('\n') que sobrou no buffer após o nextInt()
        teclado.nextLine();
        // Isso é necessário porque o nextInt() lê somente o número e deixa o '\n' na fila.
        // Se não fizermos isso, o próximo nextLine() seria pulado.

        // Pede novamente o nome (para mostrar o uso do nextLine depois do nextInt)
        System.out.println("Qual o seu nome?");
        String nome2 = teclado.nextLine();  // Lê a linha inteira novamente e armazena em 'nome2'

        // Pede o sobrenome
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine(); // Lê o sobrenome completo

        // Fecha o Scanner para liberar os recursos do sistema
        teclado.close();
    }
}
