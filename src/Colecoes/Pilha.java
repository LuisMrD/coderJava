package Colecoes;

import java.util.*;

public class Pilha {

    public static void main(String[] args){

        Deque<String> livros = new ArrayDeque<String>();

        //add n funcionou
        livros.add("O poder do habito");
        livros.push("O poder da acao");
        livros.push("O milagre da manha");

        System.out.println(livros.peek());

        Queue<String> fila = new LinkedList<String>();

        fila.offer("Swamp");
        fila.offer("Mountain");

        System.out.println(fila.peek());

    }
}
