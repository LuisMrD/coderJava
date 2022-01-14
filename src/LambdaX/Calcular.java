package LambdaX;

public class Calcular {

    public static void main(String[] args){

        Calculo lambdaCalc = (x, y) -> x + y;

        System.out.println(lambdaCalc.executar(10, 10));

        Calculo multi = new Multiplicar();
        double result = multi.executar(2,2);

        System.out.println(result);

    }

}
