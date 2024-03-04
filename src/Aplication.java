
import entities.TaxPayer;

import services.TaxPayerServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.println("");

        System.out.print("Quantos contribuintes você vai digitar? ");
        int quantidade = sc.nextInt();


        for (int i = 0; i < quantidade; i++) {
            System.out.println();

            int n = 1 + i;
            System.out.println("Digite os dados do " + n + "º contribuinte");

            if (n > 1) {
                sc.nextLine();
            }

            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();

            System.out.print("Renda anual com prestação de serviço: ");
            double servicesIncome = sc.nextDouble();

            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();

            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();

            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();


            TaxPayer taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            taxPayerList.add(taxPayer);

        }

        TaxPayerServices taxPayerServices = new TaxPayerServices(taxPayerList);
        taxPayerServices.calculate();

        sc.close();

    }
}