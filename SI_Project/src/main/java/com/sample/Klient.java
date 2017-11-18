package com.sample;

public class Klient {
	
	private boolean czy_czlonek;

	public boolean isCzy_czlonek() {
		return czy_czlonek;
	}

	public void setCzy_czlonek(boolean czy_czlonek) {
		this.czy_czlonek = czy_czlonek;
	}

	public Klient(boolean czy_czlonek) {
		super();
		this.czy_czlonek = czy_czlonek;
	}
	
}
