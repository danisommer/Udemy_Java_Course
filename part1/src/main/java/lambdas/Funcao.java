package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, String> concatRes = valor -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!!";

        String resultado = parOuImpar.andThen(concatRes).andThen(empolgado).apply(23);

        System.out.println(resultado);
    }
}
