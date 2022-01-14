package Colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {


    public static void main(String[] args){

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double (Wrapper)
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho eh: " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho eh: " + conjunto.size());



    }
}
