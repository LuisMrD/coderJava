package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

    public static void main(String[] args){

        Set<String> lista = new HashSet<String>();
        //se quiser manter ordem de entrada eh possivel usar o TreeSet, que eh um SortedSet

        lista.add("Luis");
        lista.add("Carol");
        lista.add("Heitor");

        for(String nome : lista){
            System.out.println(nome);
        }

    }
}
