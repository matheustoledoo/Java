package Secao4_ArraysECollections;
import java.util.*;

// Classe base para demonstrar equals() e hashCode()
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Define quando duas pessoas são consideradas "iguais" ==Equals==
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mesmo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        Pessoa outra = (Pessoa) obj;
        return idade == outra.idade && nome.equals(outra.nome);
    }

    // Gera um número hash para uso em coleções como HashSet e HashMap ==HashCode==
    @Override
    public int hashCode() {
        return Objects.hash(nome, idade); // Usa nome e idade para gerar o hash
    }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}


public class EqualsEHashcode {
    public static void main(String[] args) {

        // --- Equals: verifia se são iguais
        Pessoa p1 = new Pessoa("Ana", 25);
        Pessoa p2 = new Pessoa("Ana", 25);
        Pessoa p3 = new Pessoa("Bruno", 30);

        System.out.println("p1 == p2? " + (p1 == p2)); // false → objetos diferentes na memória
        System.out.println("p1.equals(p2)? " + p1.equals(p2)); // true → conteúdo igual
        System.out.println("p1.equals(p3)? " + p1.equals(p3)); // false

        // --- LIST: Permite elementos duplicados e mantém ordem de inserção ---
        List<String> lista = new ArrayList<>();
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Maçã"); // duplicado permitido
        System.out.println("List: " + lista); // [Maçã, Banana, Maçã]

        // --- SET: Não permite duplicados ---
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Maçã"); // será ignorado
        System.out.println("Set: " + conjunto); // [Maçã, Banana] (ordem aleatória)

        // --- QUEUE: Estrutura FIFO (primeiro a entrar, primeiro a sair) ---
        Queue<String> fila = new LinkedList<>();
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        System.out.println("Queue: " + fila.poll()); // Cliente 1
        System.out.println("Queue restante: " + fila); // Cliente 2

        // --- STACK: Estrutura LIFO (último a entrar, primeiro a sair) ---
        Deque<String> pilha = new ArrayDeque<>();
        pilha.push("Livro 1");
        pilha.push("Livro 2");
        System.out.println("Stack (pop): " + pilha.pop()); // Livro 2
        System.out.println("Stack restante: " + pilha); // Livro 1

        // --- MAP: Associa chave → valor ---
        Map<String, Integer> idades = new HashMap<>();
        idades.put("Ana", 25);
        idades.put("Bruno", 30);
        System.out.println("Idade de Ana: " + idades.get("Ana")); // 25

        // --- Map usando objeto como chave (precisa de equals e hashCode bem definidos) ---
        Map<Pessoa, String> perfis = new HashMap<>();
        perfis.put(p1, "Administrador");

        System.out.println("Perfil de p2 (mesmo conteúdo de p1): " + perfis.get(p2)); // funciona pois p1.equals(p2)

        // --- Collections (classe utilitária) ---
        Collections.sort(lista); // ordena a lista
        System.out.println("Lista ordenada: " + lista);

        Collections.reverse(lista); // inverte a ordem
        System.out.println("Lista invertida: " + lista);

        Collections.shuffle(lista); // embaralha
        System.out.println("Lista embaralhada: " + lista);
    }
}
