package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    static UnaryOperator<String> maiuscula = String::toUpperCase;
    static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    static UnaryOperator<String> grito = n -> n + "!!! ";
    static Consumer<String> print = System.out::print;

    public static void main(String[] args) {

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        //marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);

        //marcas.stream().filter(a -> a.charAt(0) == 'A').forEach(print);

        System.out.println(marcas.stream().allMatch(a -> a.charAt(0) == 'A'));
        System.out.println(marcas.stream().anyMatch(a -> a.charAt(0) == 'A'));
        System.out.println(marcas.stream().noneMatch(a -> a.charAt(0) == 'A'));

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        Integer total = nums.parallelStream().reduce(soma).get();
        System.out.println(total);

        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(total2);

        //reduce -> acumulador
        nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);

        List<Double> notas = Arrays.asList(2.3, 45.2, 54.0, 54.4, 23.1, 90.0, 100.0);

        Comparator<Double> melhorNota = (nota1, nota2) -> {
            if(nota1 > nota2)
                return 1;
            else if (nota2 > nota1)
                return -1;
            else
                return 0;
        };

        System.out.println(notas.stream().max(melhorNota).get());
        System.out.println(notas.stream().min(melhorNota).get());

        notas.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .takeWhile(a -> a > 4.0)
                .forEach(System.out::println);
    }

}
