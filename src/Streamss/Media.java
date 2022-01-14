package Streamss;

public class Media {

    private int total;
    private int quantidade;


    public Media adicionar(int valor){
        this.total += valor;
        this.quantidade++;
        return this;
    }

    public int getValorTotal(){
        return this.total;
    }

    public static Media compor(Media m1, Media m2){
        Media m = new Media();
        m.total = m1.total + m2.total;
        m.quantidade = m1.quantidade + m2.quantidade;
        return m;
    }
}
