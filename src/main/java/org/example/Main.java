package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("==== LOCADORA DE VEÍCULOS ====");
        System.out.print("Informe o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe o valor da diária (R$): ");
        double valorDiaria = scanner.nextDouble();

        System.out.print("Informe a quantidade de dias de aluguel: ");
        int dias = scanner.nextInt();

        System.out.print("Informe a quantidade de dias de atraso (caso haja): ");
        int diasAtraso = scanner.nextInt();

        // Instancia o veículo
        Veiculo veiculo = new Veiculo(modelo, valorDiaria);

        // Cálculos
        double custoAluguel = veiculo.calcularCusto(dias);
        double multa = veiculo.calcularMulta(diasAtraso);
        double total = custoAluguel + multa;

        // Saída
        System.out.println("\n==== RESUMO DO ALUGUEL ====");
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Dias de aluguel: " + dias);
        System.out.println("Valor da diária: R$ " + veiculo.getValorDiaria());
        System.out.printf("Custo do aluguel: R$ %.2f%n", custoAluguel);
        System.out.printf("Multa por atraso: R$ %.2f%n", multa);
        System.out.printf("Valor total a pagar: R$ %.2f%n", total);

        scanner.close();
    }
}
