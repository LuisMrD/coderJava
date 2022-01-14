package excecao.personalizadaA;

public class NumeroNegativoException extends RuntimeException{

    String nomeAtributo;

    NumeroNegativoException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    @Override
    public String getMessage() {
        return "Atributo esta negativo: " + this.nomeAtributo;
    }
}
