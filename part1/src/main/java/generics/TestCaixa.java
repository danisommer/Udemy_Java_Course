package generics;

public class TestCaixa {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();

        caixaA.aguardar("Segredo!!!");
        System.out.println(caixaA.abrir());

        CaixaInt caixaB = new CaixaInt();
        caixaB.aguardar(12);
        System.out.println(caixaB.abrir());

        CaixaNum<Integer> caixaC = new CaixaNum<>();
        caixaC.aguardar(123);
        System.out.println(caixaC.abrir());

    }
}
