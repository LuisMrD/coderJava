package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args){

        Queue<String> fila = new LinkedList<>();

        fila.add("Luis");
        fila.add("Carol"); //retorna false qdo limite da fila foi atingido
        fila.offer("Heitor"); // lanca exception qdo o limite da fila foi atingido

        fila.peek(); //pega o proximo da fila, retorna false se n houver
        fila.element(); //pega o proximo da fila, lanca exception se n houver

        fila.poll(); //pega o proximo elemento da fila, e remove, retorna null qdo nao houver mais elementos
        fila.remove(); //pega o proximo elemento da fila, e remove, lanca exception se n houver mais elementos

    }
}
