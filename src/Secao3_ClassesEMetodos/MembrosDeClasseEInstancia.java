package Secao3_ClassesEMetodos;
/* Membros de Classe (static):
-São declarados com o modificador static.
-Pertencem à própria classe, não a objetos específicos.
-Compartilhados por todas as instâncias da classe.
-Carregados na memória quando a classe é carregada pela JVM. */

/* Membros de Instância:
-Não usam static.
-Pertencem a cada objeto criado com new.
-Cada instância tem sua própria cópia desses campos.
-São inicializados quando o objeto é construído.*/

class Pessoa {

    // membro de classe: conta quantas pessoas foram criadas
    private static int contador = 0;

    // membros de instância: dados únicos de cada pessoa
    private String nome;
    private int idade;

    // construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;  // atualiza o membro estático
    }

    // método de instância
    public void apresentar() {
        System.out.println("Olá, sou " + nome + ", tenho " + idade + " anos.");
    }

    // método de classe
    public static void mostrarContador() {
        System.out.println("Pessoas criadas: " + contador);
    }
}

public class MembrosDeClasseEInstancia {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 30);
        Pessoa p2 = new Pessoa("Bruno", 25);

        // métodos de instância
        p1.apresentar();   // Olá, sou Ana, tenho 30 anos.
        p2.apresentar();   // Olá, sou Bruno, tenho 25 anos.

        // método de classe
        Pessoa.mostrarContador();  // Pessoas criadas: 2
    }

}
