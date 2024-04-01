package br.com.entities;

public class PrivatePerson {
	private String cpf;
	private String checker = "";
	
	public PrivatePerson(String cpf){
		this.cpf = cpf;
		String s1,s2,s3,s4,s5,s6,s7,s8,s9;
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, tester1, tester2;
		
		s1 = this.cpf.substring(0, 1); n1 = Integer.parseInt(s1);
		s2 = this.cpf.substring(1, 2); n2 = Integer.parseInt(s2);		
		s3 = this.cpf.substring(2, 3); n3 = Integer.parseInt(s3);
		s4 = this.cpf.substring(4, 5); n4 = Integer.parseInt(s4);		
		s5 = this.cpf.substring(5, 6); n5 = Integer.parseInt(s5);
		s6 = this.cpf.substring(6, 7); n6 = Integer.parseInt(s6);		
		s7 = this.cpf.substring(8, 9); n7 = Integer.parseInt(s7);
		s8 = this.cpf.substring(9, 10); n8 = Integer.parseInt(s8);		
		s9 = this.cpf.substring(10, 11); n9 = Integer.parseInt(s9);
		
		tester1 = (n1 * 10 + n2 * 9 +  n3 * 8 +  n4 * 7 +  n5 * 6 +  n6 * 5 +  n7 * 4 +  n8 * 3 +  n9 * 2);
		
		if ((tester1 % 11) < 2) {
			tester1 = 0;
		} else {
			tester1 = 11 - (tester1 % 11);
		}
		
		tester2 = (n1 * 11 + n2 * 10 +  n3 * 9 +  n4 * 8 +  n5 * 7 +  n6 * 6 +  n7 * 5 +  n8 * 4 +  n9 * 3 + tester1 * 2);
		
		if ((tester2 % 11) < 2) {
			tester2 = 0;
		} else {
			tester2 = 11 - (tester2 % 11);
		}
		
		this.checker = (s1 + s2 + s3 + "." + s4 + s5 + s6  + "." + s7 + s8 + s9 + "-" + tester1 + "" + tester2);
	}
	
	public String validateCPF() {
		if (checker.equals(cpf)) {
			return "CPF válido";
		} else {
			return "CPF inválido";
		}
	}
}
