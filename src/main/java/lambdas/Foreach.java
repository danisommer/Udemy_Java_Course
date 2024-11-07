package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        for(int i = 0; i < aprovados.size(); i++) { // 1
            System.out.println(aprovados.get(i));
        }

        for(String nome: aprovados){ // 2
            System.out.println(nome);
        }

        aprovados.forEach( (nome) -> {System.out.println(nome);} ); // 3

        aprovados.forEach(System.out::println); // 4

        aprovados.forEach(Foreach::imprimir); // 5
    }

    static void imprimir (String nome){
        System.out.println(nome);
    }
}
