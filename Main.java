import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora Simples v1 ===");

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble(); // leitura dos números calculadora

        System.out.println("1 - Somar");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int op = sc.nextInt();

        double resultado = 0;

        switch (op) {
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: divisão por zero");
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}