package Generiks;

public class CaixaTestes {

    public static void main(String[] args){

        CaixaObjeto cx1 = new CaixaObjeto();
        cx1.guardar("Obj1");

        String obj1 = (String) cx1.pegar();

        CaixaObjetoGenerics<String> cx2 = new CaixaObjetoGenerics<>();

        cx2.guardar("Obj2");

        String obj2 = cx2.pegar();
    }
}
