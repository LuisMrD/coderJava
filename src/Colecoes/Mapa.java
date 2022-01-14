package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args){

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Luis");
        mapa.put(3, "Carol");
        mapa.put(10, "Heitor");

        System.out.println(mapa.isEmpty());
        System.out.println(mapa.size());

        System.out.println(mapa.keySet());
        System.out.println(mapa.values());

        System.out.println(mapa.entrySet());

        System.out.println(mapa.containsKey(1));
        System.out.println(mapa.containsKey(11));

        System.out.println(mapa.containsValue("Luis"));
        System.out.println(mapa.containsValue("Luiz"));

        System.out.println(mapa.get(3));

        for(Integer chave : mapa.keySet() ){
            System.out.println(chave);
        }

        for(String valor : mapa.values() ){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro : mapa.entrySet() ){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

        System.out.println(mapa.remove(1));
        System.out.println(mapa.remove(10, "Guto"));
        System.out.println(mapa.size());
        mapa.clear();
        System.out.println(mapa.size());




    }

}
