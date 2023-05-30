import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Oi zupper! Quer saber quanto você teve de aumento?");
        System.out.println("Digite abaixo o valor do seu salrio que eu te falo?");
        System.out.println("-------------------------------------------------------------");

        double salarioAtual = entrada.nextDouble();
        double aumentoSalario = 0;
        double percentualSalario = 0;
        double salarioNovo = 0;

        if(salarioAtual <= 280){
            percentualSalario = 0.2;
            aumentoSalario = salarioAtual * percentualSalario;
            salarioNovo = salarioAtual + aumentoSalario;
        }else if (salarioAtual > 280 && salarioAtual <= 700){
            percentualSalario = 0.15;
            aumentoSalario = salarioAtual * percentualSalario;
            salarioNovo = salarioAtual + aumentoSalario;
        }else if (salarioAtual > 700 && salarioAtual <= 1500){
            percentualSalario = 0.1;
            aumentoSalario = salarioAtual * percentualSalario;
            salarioNovo = salarioAtual + aumentoSalario;
        }else if (salarioAtual > 1500){
            percentualSalario = 0.05;
            aumentoSalario = salarioAtual * percentualSalario;
            salarioNovo = salarioAtual + aumentoSalario;
        }

        DecimalFormat dinheiro = new DecimalFormat("0.00");
        DecimalFormat porcentagem = new DecimalFormat("0");

        System.out.println("O seu salário sem reajuste é de: R$" + dinheiro.format(salarioAtual));
        System.out.println("-------------------------------------------------------------");
        System.out.println("O seu percentual de reajuste é: " + porcentagem.format((percentualSalario*100)) + "%");
        System.out.println("-------------------------------------------------------------");
        System.out.println("O seu aumento será de: R$" + dinheiro.format(aumentoSalario));
        System.out.println("-------------------------------------------------------------");
        System.out.println("O seu novo salário agora é de: R$" + dinheiro.format(salarioNovo));
    }
}

