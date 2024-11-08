package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class criarStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");

        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print);
        System.out.println("\n");

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin ");

        outrasLangs.stream().forEach(print);
        System.out.println("\n");
        outrasLangs.parallelStream().forEach(print);

        Stream.generate(() -> "a").forEach(print);
        //Stream.iterate()


    }
}
