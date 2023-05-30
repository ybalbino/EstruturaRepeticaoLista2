import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        System.out.println("Vamos descobrir qual numero será mairo: ");
        System.out.println("-----------------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNumero = entrada.nextInt();

        if(primeiroNumero > segundoNumero){
            System.out.println("O primeiro numero é maior.");
        }else if(primeiroNumero < segundoNumero) {
            System.out.println("O segundo numero é maior.");
        }
    }

}
