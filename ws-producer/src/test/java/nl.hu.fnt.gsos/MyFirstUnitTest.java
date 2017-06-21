package test;

import junit.framework.TestCase;
import nl.hu.fnt.gsos.domain.House;
import nl.hu.fnt.gsos.wsinterface.CreateHouseResponse;
import nl.hu.fnt.gsos.wsinterface.UpdateHouseResponse;

// -- Junit 3! Niet 4

public class MyFirstUnitTest extends TestCase {
	
	public void testcreateTestHouseNaamEigenaar() {
		CreateHouseResponse response = new CreateHouseResponse();
		response.setStraatnaam("Laan");
		response.setHuisnummer(13);
		response.setHuisnummertoevoeging("c");
		response.setPostcode("3404GV");
		response.setStad("zeist");
		response.setAantalkamers(1);
		response.setAchternaameigenaar("kroes");
		
		House h = new House();
		
		h.setStraatnaam(response.getStraatnaam());
		h.setHuisnummer(response.getHuisnummer());
		h.setHuisnummertoevoeging(response.getHuisnummertoevoeging());
		h.setPostcode(response.getPostcode());
		h.setStad(response.getStad());
		h.setAantalkamers(response.getAantalkamers());
		h.setAchternaameigenaar(response.getAchternaameigenaar());
		
		assertEquals(response.getAchternaameigenaar(), h.getAchternaameigenaar());
	}
	
	public void testUpdateHouseEigenaar() {
		UpdateHouseResponse response = new UpdateHouseResponse();
		
		House h  = new House();
		
		h.setStraatnaam("Laan");
		h.setHuisnummer(13);
		h.setHuisnummertoevoeging("c");
		h.setPostcode("3404GV");
		h.setStad("zeist");
		h.setAantalkamers(1);
		h.setAchternaameigenaar("kroes");
		 // -- stiekem alles veranderen
		response.setStraatnaam("Weg");
		response.setHuisnummer(132);
		response.setHuisnummertoevoeging("cd");
		response.setPostcode("3434GV");
		response.setStad("ueist");
		response.setAantalkamers(2);
		response.setAchternaameigenaar("kloes");
		
		h.setStraatnaam(response.getStraatnaam());
		h.setHuisnummer(response.getHuisnummer());
		h.setHuisnummertoevoeging(response.getHuisnummertoevoeging());
		h.setPostcode(response.getPostcode());
		h.setStad(response.getStad());
		h.setAantalkamers(response.getAantalkamers());
		h.setAchternaameigenaar(response.getAchternaameigenaar());
		
		assertEquals(response.getAchternaameigenaar(), h.getAchternaameigenaar());
	}
	
	
	public void testUpdateHouseUitbreiding() {
		UpdateHouseResponse response = new UpdateHouseResponse();
		
		House h  = new House();
		h.setStraatnaam("Laan");
		h.setHuisnummer(13);
		h.setHuisnummertoevoeging("c");
		h.setPostcode("3404GV");
		h.setStad("zeist");
		h.setAantalkamers(1);
		h.setAchternaameigenaar("kroes");
		
		response.setStraatnaam("Laan");
		response.setHuisnummer(13);
		response.setHuisnummertoevoeging("c");
		response.setPostcode("3404GV");
		response.setStad("zeist");
		response.setAantalkamers(6);
		response.setAchternaameigenaar("kroes");
		
		h.setStraatnaam(response.getStraatnaam());
		h.setHuisnummer(response.getHuisnummer());
		h.setHuisnummertoevoeging(response.getHuisnummertoevoeging());
		h.setPostcode(response.getPostcode());
		h.setStad(response.getStad());
		h.setAantalkamers(response.getAantalkamers());
		h.setAchternaameigenaar(response.getAchternaameigenaar());
		
		assertEquals(response.getAantalkamers(), h.getAantalkamers());
		
	}
	
}
