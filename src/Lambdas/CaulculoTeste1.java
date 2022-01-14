package Lambdas;

public class CaulculoTeste1 {

    public static void main(String[] args){

        Calculo calc = new Somar();

        System.out.println(calc.executar(2,7));

        calc = new Multiplicar();

        System.out.println(calc.executar(2,7));

        Calculo lambdaCalc = (x, y ) -> x / y;
        System.out.println(lambdaCalc.executar(10,2));

    }

}
