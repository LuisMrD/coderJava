package excecao;

public class checadaVsNaoChecada {

    public static void main(String[] args){

        try {
            erro1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            erro2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Final =D");

    }

    //excecao n checada ou verificada
    public static void erro1(){
        throw new RuntimeException("Erro 1");
    }

    //excecao checada ou verificada
    //por ser checadam, throws Exception eh obrigatorio
    //se nao for chamado no proprio metodo, pode ser chamadao pelo metodo pai
    public static void erro2() throws Exception{
        throw new Exception("Erro 2");
    }
}
