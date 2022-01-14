public class TesteIgualdade {


    public static void main(String[] args){
        ObjetoParaTeste objTesteX = new ObjetoParaTeste(10);

        ObjetoParaTeste objTesteY = objTesteX;

        if(objTesteX == objTesteY){
            System.out.println("Iguais");
        }

        ObjetoParaTeste objTesteZ = new ObjetoParaTeste(10);

        if(objTesteX == objTesteZ){
            System.out.println("Iguais");
        }else{
            System.out.println("! Iguais");
        }

    }

}
