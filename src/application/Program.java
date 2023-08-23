package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		aqui o objeto foi criado e depois no if foi instanciado
		
		Account account;
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); // para consumir a linha dada antes 
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)");
		char response = sc.next().charAt(0); // o caracter respondido e a localização dele no índice
		if (response == 'y') {
			System.out.print ("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);

		}
		
//		usando a sobrecarga de construtores se a resposta por não inicial só com um construtor
		else {
			
			Account account = new Account(number, holder)
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);  // aqui quando se imprime um objeto ele exibe por default o toString()
		
		System.out.println();		
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		
//		Pede ao usuário para digitar o valor de depósito e acessa o método do objeto
		account.deposit(depositValue);	
		
		sc.close();
	}
}
