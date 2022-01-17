package excecao.personalizadaB;

public class StringVaziaException extends Exception{

    String nomeAtributo;

    StringVaziaException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }

    @Override
    public String getMessage() {
        return "Atributo esta vazio: " + this.nomeAtributo;
    }
}
