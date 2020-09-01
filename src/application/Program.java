package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> person = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int payers = sc.nextInt();

		for (int i = 1; i <= payers; i++) {
			System.out.println("Tax payer #" + i + " date:");
			System.out.print("Individual or company: ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			Double annualIncome = sc.nextDouble();

			if (type == 'i') {
				System.out.print("Amount of health care spending: ");
				Double healthCareSpending = sc.nextDouble();
				person.add(new NaturalPerson(name, annualIncome, healthCareSpending));
			} else {
				System.out.print("Number of employees: ");
				Integer employeeNumber = sc.nextInt();
				person.add(new LegalPerson(name, annualIncome, employeeNumber));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID");

		for (Person p : person) {
			System.out.println(p.getName()+ String.format(": $ %.2f", p.incomeTax()));
		}

		Double totalTaxes = 0.0d;
		for (Person p : person) {
			totalTaxes += p.incomeTax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f" , totalTaxes));

		sc.close();
	}
}
