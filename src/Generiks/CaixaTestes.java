package Generiks;

public class CaixaTestes {

    public static void main(String[] args){

        //por trazer o nivel mais generico do Java (Object),
        //eh preciso sempre fazer cast
        CaixaObjeto cx1 = new CaixaObjeto();
        cx1.guardar("Obj1");

        String obj1 = (String) cx1.pegar();

        //classe com Generics teve seu tipo definido no instanciamento do objeto
        //premirtindo receber erros em tempo de compilacao ao inves de tempo de execucao
        CaixaObjetoGenerics<String> cx2 = new CaixaObjetoGenerics<>();

        cx2.guardar("Obj2");

        String obj2 = cx2.pegar();

        //classe herdada de uma classe generica, teve seu tipo definido na declaracao da heranca
        CaixaInt cx3 = new CaixaInt();
        cx3.guardar(123);
    }
}
