package Generiks;

public class CaixaObjetoGenerics<T> {

    private T coisa;

    public void guardar(T coisa){
        this.coisa = coisa;
    }

    public T pegar(){
        return coisa;
    }


}
