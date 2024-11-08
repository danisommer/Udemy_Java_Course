package generics;

import java.util.List;

public class ListaUtil {
    public static <T> T getUltimo(List<T> list) {
        return list.get(list.size() - 1);
    }

}
