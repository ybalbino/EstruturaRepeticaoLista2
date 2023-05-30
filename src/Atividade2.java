import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args){
        System.out.println("Qual o produto mais em barato?");
        System.out.println("Digite o preço de cada produto que irei te falar qual é o mais barato!");
        System.out.println("-----------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto 1");
        double produto1 = entrada.nextDouble();

        System.out.println("Digite o valor do produto 2");
        double produto2 = entrada.nextDouble();

        System.out.println("Digite o valor do produto 3");
        double produto3 = entrada.nextDouble();

        String produtoEscolhido = "";

        if(produto1 < produto2 && produto1 < produto3){produtoEscolhido = "1";}
        else if(produto2 < produto1 && produto2 < produto3){produtoEscolhido = "2";}
        else if(produto3 < produto1 && produto3 < produto2){produtoEscolhido = "3";}
        else{
            if(produto1 == produto2){produtoEscolhido = "1 e 2";}
            else if(produto1 == produto3){produtoEscolhido = "1 e 3";}
            else if(produto3 == produto2){produtoEscolhido = "2 e 3";}
        }



        System.out.println("Os preços dos produtos são os seguintes:");
        System.out.println("Produto 1: R$ " + produto1);
        System.out.println("Produto 2: R$ " + produto2);
        System.out.println("Produto 3: R$ " + produto3);


        if(produto1 == produto2 || produto1 == produto3 || produto3 == produto2){

            System.out.println("Os produtos mais em conta são os " + produtoEscolhido);
        }else{
            System.out.println("O produto mais em conta é o " + produtoEscolhido);
        }



    }
}

