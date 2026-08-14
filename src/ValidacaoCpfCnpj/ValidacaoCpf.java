package ValidacaoCpfCnpj;
import java.util.Scanner;

public class ValidacaoCpf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um CPF: ");
        String cpf = input.nextLine();

        cpf = retirarCaracteres(cpf);

        int primeiroDigito = calculoPrimeiroDigito(cpf);
        int segundoDigito = calculoSegundoDigito(cpf);

        if (primeiroDigito == Character.getNumericValue(cpf.charAt(9))
                && segundoDigito == Character.getNumericValue(cpf.charAt(10))) {
            System.out.println("CPF é válido.");
        } else {
            System.out.println("CPF não é válido.");
        }
    }
    public static String retirarCaracteres(String cpf) {
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        return cpf;
    }

    public static int calculoPrimeiroDigito(String cpf) {
        cpf = retirarCaracteres(cpf);
        int soma = 0;
        int[] pesos = {10, 9, 8, 7, 6, 5, 4, 3, 2};

        for (int i = 0; i < 9; i++) {
            int numero = Character.getNumericValue(cpf.charAt(i));
            soma += numero * pesos[i];
        }

        int resto = soma % 11;
        if (resto >= 2) {
            int primeiroDigito = 11 - resto;
            return primeiroDigito;
        } else {
            return 0;
        }
    }

    public static int calculoSegundoDigito(String cpf) {
        cpf = retirarCaracteres(cpf);

        int primeiroDigito = calculoPrimeiroDigito(cpf);

        int soma = 0;
        int[] pesos =  {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        for (int i = 0; i < 10; i++) {
            int numero;
            if (i == 9) {
                numero = primeiroDigito;
            } else {
                numero = Character.getNumericValue(cpf.charAt(i));
            }
            soma += numero * pesos[i];
        }

        int resto = soma % 11;
        if (resto >= 2) {
            int segundoDigito = 11 - resto;
            return segundoDigito;
        } else {
            return 0;
        }
    }
}
