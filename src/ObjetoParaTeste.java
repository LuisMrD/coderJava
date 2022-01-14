import java.util.Objects;

public class ObjetoParaTeste {

    private int atributoTeste;

    ObjetoParaTeste(int atr){
        this.atributoTeste = atr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjetoParaTeste)) return false;
        ObjetoParaTeste that = (ObjetoParaTeste) o;
        return atributoTeste == that.atributoTeste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(atributoTeste);
    }
}
