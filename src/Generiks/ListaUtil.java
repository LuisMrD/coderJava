package Generiks;

import java.util.List;

public class ListaUtil {

    public static <T> T getLastItem(List<T> list){

        return list.get(list.size() - 1);
    }

}
