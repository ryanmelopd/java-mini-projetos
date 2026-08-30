package basicos.Calculadora;

import java.util.Scanner;
import java.util.InputMismatchException;

// Calculadora usando tratamento de exceções
public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Primeiro número: ");
            double a = input.nextDouble();

            System.out.print("Segundo número: ");
            double b = input.nextDouble();

            System.out.println("1: Soma");
            System.out.println("2: Subtração");
            System.out.println("3: Multiplicação");
            System.out.println("4: Divisão");

            System.out.print("Insira sua operação: ");
            int opcao = input.nextInt();

            double resultado = 0;
            switch (opcao) {
                case 1:
                    resultado = calcularSoma(a,b);
                    break;
                case 2:
                    resultado = calcularSubtracao(a,b);
                    break;
                case 3:
                    resultado = calcularMultiplicacao(a,b);
                    break;
                case 4:
                    resultado = calcularDivisao(a,b);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            System.out.printf("Resultado: %.2f%n" , resultado);

        }
        catch (InputMismatchException e) {
            System.out.println("Digite apenas números.");
        }
        catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            System.out.println("Programa encerrado.");
            input.close();
        }

    }

    public static double calcularSoma(double a,double b) {
        return a + b;
    }

    public static double calcularSubtracao(double a,double b) {
        return a - b;
    }

    public static double calcularMultiplicacao(double a,double b) {
        return a * b;
    }

    public static double calcularDivisao(double a,double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return a / b;
    }

}
