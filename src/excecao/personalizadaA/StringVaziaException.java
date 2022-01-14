package excecao.personalizadaA;

public class StringVaziaException extends RuntimeException{

    String nomeAtributo;

    StringVaziaException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    @Override
    public String getMessage() {
        return "Atributo esta vazio: " + this.nomeAtributo;
    }
}
