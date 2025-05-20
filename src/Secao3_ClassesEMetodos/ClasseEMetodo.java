package Secao3_ClassesEMetodos;

// Definição de uma classe
class Carro {

    // atributos (estado)
    String cor = "";
    String modelo = "";
    int ano;
    Double preco;

    // construtor
    public Carro(String cor, String modelo, int ano, Double preco) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    // método
    public void buzinar() {
        String bozina = "BEEP BEEP!"; // essa string é uma variavel local, ou seja, so pode ser usada dentro desse metodo
        System.out.println(bozina);
    }

    double precoComDesconto(Double desconto){
        return preco * (1 - desconto);
    }

}

public class ClasseEMetodo {
    public static void main(String[] args) {
        // Criando dois objetos (instâncias) da classe Carro
        Carro carro1 = new Carro("Vermelho", "Fiat Uno", 2010, 10000.0);
        Carro carro2 = new Carro("Preto", "Toyota Corolla", 2022, 20000.0);

        // Cada objeto tem seu próprio estado
        System.out.println(carro1.modelo + " - " + carro1.cor + " Ano " + carro1.ano); // Fiat Uno - Vermelho
        System.out.println(carro2.modelo + " - " + carro2.cor); // Toyota Corolla - Preto

        // Chamando o método buzinar em cada objeto
        carro1.buzinar(); // BEEP BEEP!
        carro2.buzinar(); // BEEP BEEP!
        System.out.println(carro2.precoComDesconto(0.20));
    }
}
