package Secao3_ClassesEMetodos;

public class ValorVsReferencia {

    // Classe simples para demonstrar passagem de objeto
    static class Caixa {
        int valor;
        Caixa(int valor) { this.valor = valor; }
        @Override
        public String toString() {
            return "Caixa{valor=" + valor + "}";
        }
    }

    // 1. Tenta “mudar” um primitivo
    public static void mudaPrimitivo(int x) {
        System.out.println("  [dentro de mudaPrimitivo] antes: x = " + x);
        x = 100;
        System.out.println("  [dentro de mudaPrimitivo] depois: x = " + x);
    }

    // 2. Tenta “mudar” um objeto
    public static void mudaObjeto(Caixa c) {
        System.out.println("  [dentro de mudaObjeto] antes: c = " + c);
        c.valor = 200;              // altera o estado do objeto
        System.out.println("  [dentro de mudaObjeto] após c.valor=200: c = " + c);
        c = new Caixa(300);         // muda somente a cópia local da referência
        System.out.println("  [dentro de mudaObjeto] após c=new Caixa(300): c = " + c);
        c.valor = 400;              // altera o novo objeto, não o original
        System.out.println("  [dentro de mudaObjeto] após c.valor=400: c = " + c);
    }

    public static void main(String[] args) {
        System.out.println("=== Atribuição de Primitivos ===");
        int a = 10;
        int b = a;       // cópia de valor
        System.out.println("antes: a = " + a + ", b = " + b);
        b = 20;
        System.out.println("depois: a = " + a + " (imutável), b = " + b);

        System.out.println("\n=== Atribuição de Referências ===");
        Caixa c1 = new Caixa(10);
        Caixa c2 = c1;   // c2 aponta ao mesmo objeto que c1
        System.out.println("antes: c1 = " + c1 + ", c2 = " + c2);
        c2.valor = 30;   // altera o mesmo objeto
        System.out.println("depois: c1 = " + c1 + " (refletiu em c2), c2 = " + c2);

        System.out.println("\n=== Passagem de Parâmetros ===");
        System.out.println("- Primitivo -");
        int x = 50;
        System.out.println("antes de mudaPrimitivo(x): x = " + x);
        mudaPrimitivo(x);
        System.out.println("após mudaPrimitivo(x): x = " + x);

        System.out.println("\n- Objeto -");
        Caixa c3 = new Caixa(500);
        System.out.println("antes de mudaObjeto(c3): c3 = " + c3);
        mudaObjeto(c3);
        System.out.println("após mudaObjeto(c3): c3 = " + c3);
    }
}
