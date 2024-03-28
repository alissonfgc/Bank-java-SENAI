package br.com.entities;

public class Account {
	private int idACC;
	private String holderNameACC;
	private String agencyACC;
	private String openDateACC;
	private double balanceACC;
	private int numberACC;
	private static int totalAccounts;
	
	//Constructor
	public Account(String holderName, String agency, Date openDate, int number)	{
		Account.this.setHolderNameACC(holderName);
		Account.this.setAgencyACC(agency);
		Account.this.setOpenDateACC(openDate);
		Account.this.setNumberACC(number);
		Account.this.setBalanceACC(00.00);
		Account.setTotalAccounts(this.getTotalAccounts() + 1);
		Account.this.setIdACC(this.getTotalAccounts());
	}
	
	//Methods getters and setters
	public int getIdACC() {
		return idACC;
	}
	
	private void setIdACC(int id) {
		this.idACC = id;
	}
	
	public String getHolderNameACC() {
		return holderNameACC;
	}
	
	private void setHolderNameACC(String name) {
		this.holderNameACC = name;
	}
	
	public String getAgencyACC() {
		return agencyACC;
	}
	
	private void setAgencyACC(String agency) {
		this.agencyACC = agency;
	}
	
	public String getOpenDateACC() {
		return openDateACC;
	}
	
	private void setOpenDateACC(Date openDate) {
		this.openDateACC = openDate.formatDatePTBR();
	}
	
	public double getBalanceACC() {
		return balanceACC;
	}
	
	private void setBalanceACC(double balance) {
		this.balanceACC = balance;
	}
	
	public int getNumberACC() {
		return numberACC;
	}
	
	private void setNumberACC(int number) {
		this.numberACC = number;
	}
	
	public int getTotalAccounts() {
		return Account.totalAccounts;
	}
	
	private static void setTotalAccounts(int totalAccounts) {
		Account.totalAccounts = totalAccounts;
	}
	
	//Others methods	
	public boolean withdraw(double amount) {
		if(this.balanceACC < amount) {
			return false;
		} else {
			double newBalance = this.balanceACC - amount;
			this.balanceACC = newBalance;
			return true;
		}
				
	}
	
	public boolean deposit(double amount) {
		if (this.balanceACC < 0) {
			return false;
		} else {
			this.balanceACC += amount;
			return true;
		}
		
	}
	
	public boolean transferTo(Account destiny, double value) {
		boolean withdrew = this.withdraw(value);
		if (withdrew == false) {
			return false;
		} else {
			destiny.deposit(value);
			return true;
		}
	}
	
	public double getIncome() {
		return balanceACC + balanceACC * 0.1;
	}
	
	public String dataPrint() {
		return "Id: " + Account.this.getIdACC() + "\nHolder: " + Account.this.getHolderNameACC() + "\nAgency: " + Account.this.getAgencyACC() + "\nOpen date: " + Account.this.getOpenDateACC().toString() + "\nBalance: " + Account.this.getBalanceACC() + "\nNumber: " + Account.this.getNumberACC() + "\n";
	}
	
}
