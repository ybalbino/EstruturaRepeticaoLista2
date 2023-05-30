import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){

        System.out.println("Calcule a media!");
        System.out.println("-----------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota:");
        double primeiraNota = entrada.nextDouble();

        System.out.println("Digite a sua primeira nota:");
        double segundaNota = entrada.nextDouble();

        double primeiraMedia = (primeiraNota + segundaNota) / 2;

        System.out.println("Primeira nota: " + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Sua média parcial é: " + primeiraMedia);

        System.out.println("-----------------------------------");

        if(primeiraMedia >= 7.0){System.out.println("Situação até o momento: Aprovado");}
        else if (primeiraMedia <= 7.0){System.out.println("Situação até o momento: Reprovado");}
        else if (primeiraMedia == 10.0){System.out.println("Situação até o momento: Aprovado com DISTINCAO");}

        System.out.println("-----------------------------------");
    }
}
