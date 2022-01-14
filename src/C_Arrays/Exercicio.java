package C_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de notas a registrar: ");

        int numeroNotas = scan.nextInt();

        int notas[] = new int[numeroNotas];

        for(int i = 0; i < numeroNotas; i++){
            System.out.printf("Digite a nota %d \n", i+1);

            notas[i] = scan.nextInt();
        }

        scan.close();

        int notasSomadas = 0;

        for(int nota : notas){
            notasSomadas += nota;
        }

        System.out.printf("Media das notas: %d", notasSomadas / numeroNotas);
    }
}
