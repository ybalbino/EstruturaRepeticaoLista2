import java.util.Scanner;
public class Atividade5 {

    public static void main(String[] args) {
            System.out.println("Digite um número de 1 a 7 para saber qual dia da semana");
            System.out.println("-----------------------------------------------------");

            Scanner entrada = new Scanner(System.in);
            int diaSemana = entrada.nextInt();

            switch (diaSemana) {
                case 1:
                    System.out.println("1 é para domingo!");
                    break;
                case 2:
                    System.out.println("2 é para segunda-feira!");
                    break;
                case 3:
                    System.out.println("3 é para terça-feira!");
                    break;
                case 4:
                    System.out.println("4 é para quarta-feira!");
                    break;
                case 5:
                    System.out.println("5 é para quinta-feira!");
                    break;
                case 6:
                    System.out.println("6 é para sexta-feira!");
                    break;
                case 7:
                    System.out.println("7 é para sábado!");
                    break;
                default:
                    System.out.println("Valor inválido!");
            }
        }
    }