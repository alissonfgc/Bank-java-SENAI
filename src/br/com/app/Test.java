package br.com.app;

import br.com.entities.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc1 = new Account("Alisson", "12345-1", new Date(05, 12, 2024), 001);
		Account acc2 = new Account("Alef", "12345-2", new Date(07, 30, 2020), 002);
		Account acc3 = new Account("Helio", "12345-3", new Date(11, 02, 2019), 003);
		Account acc4 = new Account("Jão", "12345-4", new Date(12, 06, 2018), 004);
		
		//Print Accounts info
		System.out.println(acc1.dataPrint());
		System.out.println(acc2.dataPrint());
		System.out.println(acc3.dataPrint());
		System.out.println(acc4.dataPrint());
		
		//Method deposit
		System.out.print("Deposito conta 1: ");
		
		if (acc1.deposit(sc.nextDouble()) == true) {
			System.out.println("-Deposito realizado com sucesso!-\n");
		} else {	
			System.out.println("-Deposito falhou-");
		}
		
		//Print Account info
		System.out.println(acc1.dataPrint());
		
		//Method withdraw		
		System.out.print("Saque da conta 1: ");
		if (acc1.withdraw(sc.nextDouble()) == true) {
			System.out.println("-Saque realizado com sucesso!-\n");
		} else {	
			System.out.println("-Saque falhou-");
		}
		
		//Print Account info
		System.out.println(acc1.dataPrint());
		
		System.out.print("Valor a transferir p/ conta 4: ");
		double value = sc.nextDouble();
		
		//Print Accounts info
		System.out.println("Saldos anteriores: ");
		System.out.println(acc1.dataPrint());
		System.out.println(acc4.dataPrint());
		
		//Method transferTo
		if (acc1.transferTo(acc4, value) == true) {
			System.out.println("-Transferência realizada com sucesso!-\n");
			System.out.println("Saldos atualizados: ");
			System.out.println(acc1.dataPrint());
			System.out.println(acc4.dataPrint());
		} else {	
			System.out.println("-Transferência falhou-");
		}
		
		//Value of variable static totalAccounts
		System.out.println("Total de contas: " + acc3.getTotalAccounts());
		
		sc.close();
		
		//Method validateCPF
		PrivatePerson pp = new PrivatePerson("054.134.528-99");
		System.out.println(pp.validateCPF());
		
	}

}
