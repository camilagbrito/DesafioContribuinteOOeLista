package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes voê vai digitar? ");
		int n = sc.nextInt();
		
		TaxPayer taxPayer;
		
		for(int i=0; i < n; i++) {
			System.out.println();
			System.out.println("Digite os dados do " + (i+1) + "o contribuinte: ");
			System.out.print("Renda anual com salário: ");
			double salaryInc = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesInc = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalInc = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double healthSpen = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double eduSpen = sc.nextDouble();
			list.add(taxPayer = new TaxPayer(salaryInc, servicesInc, capitalInc, healthSpen, eduSpen));
		}
		
		
		System.out.println();
		for(TaxPayer payer : list) {
			System.out.println("Resumo do " + (list.indexOf(payer) + 1) + "o contribuinte:");
			System.out.println(payer);	
		}
	
		sc.close();

	}

}
