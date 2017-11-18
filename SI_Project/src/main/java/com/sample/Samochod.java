package com.sample;

public class Samochod {
	private boolean czy_fotelik,czy_baga¿nik;
	private Kategoria kategoria;
	public Samochod(boolean czy_fotelik, boolean czy_baga¿nik, Kategoria kategoria) {
		super();
		this.czy_fotelik = czy_fotelik;
		this.czy_baga¿nik = czy_baga¿nik;
		this.kategoria = kategoria;
		
	}

	public boolean isCzy_fotelik() {
		return czy_fotelik;
	}

	public void setCzy_fotelik(boolean czy_fotelik) {
		this.czy_fotelik = czy_fotelik;
	}

	public boolean isCzy_baga¿nik() {
		return czy_baga¿nik;
	}

	public void setCzy_baga¿nik(boolean czy_baga¿nik) {
		this.czy_baga¿nik = czy_baga¿nik;
	}



	public Kategoria getKategoria() {
		return kategoria;
	}

	public void setKategoria(Kategoria kategoria) {
		this.kategoria = kategoria;
	}
	
	
	
}
