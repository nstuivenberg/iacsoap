package nl.hu.fnt.gsos.domain;

import java.util.ArrayList;

public class House {

	private String straatnaam;
	private int huisnummer;
	private String huisnummertoevoeging;
	private String postcode;
	private String stad;
	private int aantalkamers;
	private String achternaameigenaar;
	public static ArrayList<House> houses = new ArrayList<>();
	
	public House(){}
	
	

	public House(String straatnaam, int huisnummer, String huisnummertoevoeging, String postcode, String stad,
			int aantalkamers, String achternaameigenaar) {
		super();
		this.straatnaam = straatnaam;
		this.huisnummer = huisnummer;
		this.huisnummertoevoeging = huisnummertoevoeging;
		this.postcode = postcode;
		this.stad = stad;
		this.aantalkamers = aantalkamers;
		this.achternaameigenaar = achternaameigenaar;
	}



	public String getAchternaameigenaar() {
		return achternaameigenaar;
	}



	public void setAchternaameigenaar(String achternaameigenaar) {
		this.achternaameigenaar = achternaameigenaar;
	}



	public String getStraatnaam() {
		return straatnaam;
	}
	public void setStraatnaam(String straatnaam) {
		this.straatnaam = straatnaam;
	}
	public int getHuisnummer() {
		return huisnummer;
	}
	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}
	public String getHuisnummertoevoeging() {
		return huisnummertoevoeging;
	}
	public void setHuisnummertoevoeging(String huisnummertoevoeging) {
		this.huisnummertoevoeging = huisnummertoevoeging;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getStad() {
		return stad;
	}
	public void setStad(String stad) {
		this.stad = stad;
	}
	public int getAantalkamers() {
		return aantalkamers;
	}
	public void setAantalkamers(int aantalkamers) {
		this.aantalkamers = aantalkamers;
	}
	
}
