package error;

import java.util.concurrent.ExecutionException;

public class errosBasicos {
    public static void main(String[] args) {
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }
        try {
            erro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            erro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("MUITO PICAAAAAAAAAAAAAAAAAAAAAA");
        }

        throw new ErroPicaException("Erro muito pica");

    }

    static void erro1() { // não checkada
        throw new RuntimeException("Erro pica parte");
    }
    static void erro2() throws Exception { // checkada
        throw new Exception("Erro pica parte 2");
    }

}
