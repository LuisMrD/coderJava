package Colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args){

        ArrayList<Usuario> lista = new ArrayList<>();
        ArrayList<Usuario> lista2 = new ArrayList<>();

        Usuario u1 = new Usuario("Luis");
        Usuario u2 = new Usuario("Carol");
        Usuario u3 = new Usuario("Heitor");

        lista.add(u1);
        lista.add(u2);
        lista.add(u3);

        lista2.add(u1);
        lista2.add(u1);
        lista2.add(u2);

        System.out.println(lista.get(2).nome);

        lista2.clear();

        lista2.retainAll(lista);


        for(Usuario user: lista2){
            System.out.println(user.nome);
        }

        System.out.println(lista2.contains(u1));
    }
}
