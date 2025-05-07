package Secao1_Fundamentos;

public class TipoString {
    public static void main(String[] args) {

        // Mostra o caractere na posição 2 da string "Olá pessoal"
        System.out.println("Olá pessoal".charAt(2));  // Resultado: 'á'

        // Criação de uma string chamada 's'
        String s = "Boa tarde";

        // Concatena "!!!!" ao final da string 's'
        System.out.println(s.concat("!!!!"));

        // Outra forma de concatenar usando o operador '+'
        System.out.println(s + "!!!!");

        // Verifica se a string começa com "Boa"
        System.out.println(s.startsWith("Boa")); // true

        // Converte a string para minúsculas e verifica se começa com "boa"
        System.out.println(s.toLowerCase().startsWith("boa")); // true

        // Converte a string para maiúsculas e verifica se termina com "TARDE"
        System.out.println(s.toUpperCase().endsWith("TARDE")); // true

        // Mostra o comprimento (número de caracteres) da string
        System.out.println(s.length()); // 9

        // Converte a string para minúsculas e compara com "boa tarde"
        System.out.println(s.toLowerCase().equals("boa tarde")); // true

        // Compara ignorando maiúsculas/minúsculas
        System.out.println(s.equalsIgnoreCase("boa tarde")); // true

        // Declaração de variáveis usando 'var' (o compilador detecta o tipo automaticamente)
        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        // Imprime os valores com quebra de linha usando concatenação
        System.out.println(
                "Nome: " + nome +
                        "\nSobrenome: " + sobrenome +
                        "\nIdade: " + idade +
                        "\nSalario: " + salario + "\n\n"
        );

        // Usa printf para imprimir o texto formatado:
        // %s para strings, %d para inteiros e %.2f para número decimal com 2 casas decimais
        System.out.printf(
                "O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario
        );
    }
}
