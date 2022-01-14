package LambdaX;

@FunctionalInterface
public interface Calculo {

    double executar(double a , double b);

    //metodos default e static podem coexistir com a unica funcao de uma functional interface

    default String helloWorld(){
        return "Hello World";
    }

    static String helloWorld2(){
        return "Hello World2";
    }

}
