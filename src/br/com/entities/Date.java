package br.com.entities;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;		
	}
	
	public String formatDatePTBR() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public String formatDateUS() {
		return this.month + "/" + this.day + "/" + this.year;
	}
}