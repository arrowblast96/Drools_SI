package com.sample;

import java.util.Calendar;

public class Zwrot {
	private double oplata;
	private Calendar rzeczywista_data_zwrotu;
	private double kara;
	private Rezerwacja rezerwacja;
	private double odleglosc;
	private long czas;
	
	public double getOplata() {
		return oplata;
	}
	public void setOplata(double oplata) {
		this.oplata = oplata;
	}
	public double getKara() {
		return kara;
	}
	public void setKara(double kara) {
		this.kara = kara;
	}

	
	
	
	public Calendar getRzeczywista_data_zwrotu() {
		return rzeczywista_data_zwrotu;
	}
	public void setRzeczywista_data_zwrotu(Calendar rzeczywista_data_zwrotu) {
		this.rzeczywista_data_zwrotu = rzeczywista_data_zwrotu;
	}
	
	
	
	public Rezerwacja getRezerwacja() {
		return rezerwacja;
	}
	public void setRezerwacja(Rezerwacja rezerwacja) {
		this.rezerwacja = rezerwacja;
	}
	public Zwrot(float oplata, Calendar rzeczywista_data_zwrotu, int czas, float kara,
			Rezerwacja rezerwacja,double odleglosc) {
		super();
		this.oplata = oplata;
		this.rzeczywista_data_zwrotu = rzeczywista_data_zwrotu;
		this.setCzas(czas);
		this.setOdleglosc(odleglosc);
		this.kara = kara;
		this.rezerwacja = rezerwacja;
		
	}
	public long getCzas() {
		return czas;
	}
	public void setCzas(long czas) {
		this.czas = czas;
	}
	public double getOdleglosc() {
		return odleglosc;
	}
	public void setOdleglosc(double odleglosc) {
		this.odleglosc = odleglosc;
	}
	
	
	
	
}
