package com.sample;

import java.util.Calendar;


public class Rezerwacja {
	private Samochod samochod;
	private Kategoria kategoria_cenowa;
	private Klient klient;
	private Calendar data_pobrania,data_zwrotu;
	private double znizka;
	private double odleglosc;
	
	
	public Calendar getData_pobrania() {
		return data_pobrania;
	}
	public Calendar getData_zwrotu() {
		return data_zwrotu;
	}
	public void setData_pobrania(Calendar data_pobrania) {
		this.data_pobrania = data_pobrania;
	}
	public void setData_zwrotu(Calendar data_zwrotu) {
		this.data_zwrotu = data_zwrotu;
	}
	
	public Samochod getSamochod() {
		return samochod;
	}
	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}
	public Klient getKlient() {
		return klient;
	}
	public void setKlient(Klient klient) {
		this.klient = klient;
	}
	
	
	public double getZnizka() {
		return znizka;
	}
	public void setZnizka(double znizka) {
		this.znizka = znizka;
	}
	public Kategoria getKategoria_cenowa() {
		return kategoria_cenowa;
	}
	public void setKategoria_cenowa(Kategoria kategoria_cenowa) {
		this.kategoria_cenowa = kategoria_cenowa;
	}
	
	
	public double getOdleglosc() {
		return odleglosc;
	}
	public void setOdleglosc(double odleglosc) {
		this.odleglosc = odleglosc;
	}
	
	public Rezerwacja(Samochod samochod, Klient klient, Calendar data_pobrania,
			Calendar data_zwrotu, double znizka, double odleglosc) {
		super();
		this.samochod = samochod;
		this.klient = klient;
		this.data_pobrania = data_pobrania;
		this.data_zwrotu = data_zwrotu;
		this.znizka = znizka;
		this.odleglosc = odleglosc;
		this.setKategoria_cenowa(this.samochod.getKategoria());
	}
	public void upKategoria()
	{
		if(this.samochod.getKategoria()==Kategoria.NULL)
		{
			samochod.setKategoria(Kategoria.A);
			this.setKategoria_cenowa(Kategoria.A);
		}
		else if(this.samochod.getKategoria()==Kategoria.A)
		{
			samochod.setKategoria(Kategoria.B);
		}
		else if(this.samochod.getKategoria()==Kategoria.B)
		{
			samochod.setKategoria(Kategoria.D);
		}
	}
	
}
