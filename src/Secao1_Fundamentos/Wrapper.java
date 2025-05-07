package Secao1_Fundamentos;

public class Wrapper {
    public static void main(String[] args) {
        // ----------- TIPOS PRIMITIVOS E WRAPPERS -----------

        // Declara um Byte com valor 100
        Byte b = 100;

        // Declara um Short com valor 1000
        Short s = 1000;

        // Comentado: seria usado para converter uma String em Integer
        // Integer.parseInt(entrada.next());

        // Declara um Integer com valor 10000 (usa a classe Wrapper Integer)
        Integer i = 10000;  // equivalente ao tipo primitivo int

        // Declara um Long com valor 100000 e o sufixo 'L' indicando que é do tipo long
        Long l = 100000L;

        // ----------- EXIBINDO VALORES E CONVERSÕES -----------

        // Mostra o valor do Byte 'b' usando o método byteValue()
        System.out.println(b.byteValue()); // Saída: 100

        // Converte o Short 's' para String e imprime
        System.out.println(s.toString()); // Saída: "1000"

        // Multiplica o Integer 'i' por 3 e imprime o resultado
        System.out.println(i * 3); // Saída: 30000

        // Divide o Long 'l' por 3 e imprime o resultado
        System.out.println(l / 3); // Saída: 33333

        // ----------- FLOAT E DOUBLE -----------

        // Declara um Float com valor 123.10 (sufixo F indica tipo float)
        Float f = 123.10F;

        // Imprime o valor de f
        System.out.println(f); // Saída: 123.1

        // Declara um Double com valor 1234.5678
        Double d = 1234.5678;

        // Imprime o valor de d
        System.out.println(d); // Saída: 1234.5678

        // ----------- BOOLEAN -----------

        // Converte a String "true" em Boolean (valor booleano verdadeiro)
        Boolean bo = Boolean.parseBoolean("true");

        // Imprime o valor do Boolean
        System.out.println(bo); // Saída: true

        // Converte o Boolean em String e transforma em maiúsculas
        System.out.println(bo.toString().toUpperCase()); // Saída: TRUE

        // ----------- CHARACTER -----------

        // Declara um Character com valor '#'
        Character c = '#'; // char

        // Imprime o caractere seguido de "..."
        System.out.println(c + "..."); // Saída: #...

    }
}
