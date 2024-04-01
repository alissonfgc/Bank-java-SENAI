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
	
	public String formatedDatePTBR() {
		String date = String.format("%02d/%02d/%4d", this.day, this.month, this.year);
		return date;
	}

	public String formatedDateUS() {
		String date = String.format("%02d/%02d/%4d", this.month, this.day, this.year);
		return date;
	}
}