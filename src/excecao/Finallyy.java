package excecao;

import java.util.Scanner;

public class Finallyy {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println( 7 / scan.nextInt());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
            scan.close();
        }


    }
}
