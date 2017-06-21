package nl.hu.fnt.gsos.wsproducer;

import nl.hu.fnt.gsos.domain.House;
import nl.hu.fnt.gsos.wsinterface.CreateHouseRequest;
import nl.hu.fnt.gsos.wsinterface.CreateHouseResponse;
import nl.hu.fnt.gsos.wsinterface.DeleteHouseRequest;
import nl.hu.fnt.gsos.wsinterface.DeleteHouseResponse;
import nl.hu.fnt.gsos.wsinterface.ICreateHouseService;
import nl.hu.fnt.gsos.wsinterface.ReadHouseRequest;
import nl.hu.fnt.gsos.wsinterface.ReadHouseResponse;
import nl.hu.fnt.gsos.wsinterface.UpdateHouseRequest;
import nl.hu.fnt.gsos.wsinterface.UpdateHouseResponse;

public class HouseServiceImpl implements ICreateHouseService {

	@Override
	public CreateHouseResponse createHouse(CreateHouseRequest createHouseRequest) {
		CreateHouseResponse response = new CreateHouseResponse();
		
		for (House h : House.houses) {
			if(h.getStraatnaam().equals(createHouseRequest.getStraatnaam())
					&& h.getHuisnummer() == createHouseRequest.getHuisnummer()
					&& h.getHuisnummertoevoeging().equals(createHouseRequest.getHuisnummertoevoeging())
					&& h.getPostcode().equals(createHouseRequest.getPostcode())) {
		
		
			h.setStraatnaam(createHouseRequest.getStraatnaam());
			h.setHuisnummer(createHouseRequest.getHuisnummer());
			h.setHuisnummertoevoeging(createHouseRequest.getHuisnummertoevoeging());
			h.setPostcode(createHouseRequest.getPostcode());
			h.setStad(createHouseRequest.getStad());
			h.setAantalkamers(createHouseRequest.getAantalkamers());
			h.setAchternaameigenaar(createHouseRequest.getAchternaameigenaar());
	
			response.setStraatnaam(h.getStraatnaam());
			response.setHuisnummer(h.getHuisnummer());
			response.setHuisnummertoevoeging(h.getHuisnummertoevoeging());
			response.setPostcode(h.getPostcode());
			response.setStad(h.getStad());
			response.setAantalkamers(h.getAantalkamers());
			response.setAchternaameigenaar(h.getAchternaameigenaar());
			}
		}
		
		return response;
	}

	@Override
	public UpdateHouseResponse updateHouse(UpdateHouseRequest updateHouseRequest) {
		UpdateHouseResponse response = new UpdateHouseResponse();
		for (House h : House.houses) {
			if(h.getStraatnaam().equals(updateHouseRequest.getStraatnaam())
					&& h.getHuisnummer() == updateHouseRequest.getHuisnummer()
					&& h.getHuisnummertoevoeging().equals(updateHouseRequest.getHuisnummertoevoeging())
					&& h.getPostcode().equals(updateHouseRequest.getPostcode())) {
				h.setStraatnaam(updateHouseRequest.getStraatnaam());
				h.setHuisnummer(updateHouseRequest.getHuisnummer());
				h.setHuisnummertoevoeging(updateHouseRequest.getHuisnummertoevoeging());
				h.setPostcode(updateHouseRequest.getPostcode());
				h.setStad(updateHouseRequest.getStad());
				h.setAantalkamers(updateHouseRequest.getAantalkamers());
				h.setAchternaameigenaar(updateHouseRequest.getAchternaameigenaar());
				
				response.setStraatnaam(h.getStraatnaam());
				response.setHuisnummer(h.getHuisnummer());
				response.setHuisnummertoevoeging(h.getHuisnummertoevoeging());
				response.setPostcode(h.getPostcode());
				response.setStad(h.getStad());
				response.setAantalkamers(h.getAantalkamers());
				response.setAchternaameigenaar(h.getAchternaameigenaar());
			}
		}
		
		
		return response;
	}

	@Override
	public ReadHouseResponse readHouse(ReadHouseRequest readHouseRequest) {
		
		ReadHouseResponse response = new ReadHouseResponse();
		for (House h : House.houses) {
			if(h.getStraatnaam().equals(readHouseRequest.getStraatnaam())
					&& h.getHuisnummer() == readHouseRequest.getHuisnummer()
					&& h.getHuisnummertoevoeging().equals(readHouseRequest.getHuisnummertoevoeging())
					&& h.getPostcode().equals(readHouseRequest.getPostcode())) {
				
				response.setStraatnaam(h.getStraatnaam());
				response.setHuisnummer(h.getHuisnummer());
				response.setHuisnummertoevoeging(h.getHuisnummertoevoeging());
				response.setPostcode(h.getPostcode());
				response.setStad(h.getStad());
				response.setAantalkamers(h.getAantalkamers());
				response.setAchternaameigenaar(h.getAchternaameigenaar());
				}
		}
		
		if(response.getPostcode() == null || response.getPostcode().equals(""))
		{
			response.setStraatnaam("DUBBEL!");
		}
		return response;
	}

	@Override
	public DeleteHouseResponse deleteHouse(DeleteHouseRequest deleteHouseRequest) {
		DeleteHouseResponse response = new DeleteHouseResponse();
		for (House h : House.houses) {
			if(h.getStraatnaam().equals(deleteHouseRequest.getStraatnaam())
					&& h.getHuisnummer() == deleteHouseRequest.getHuisnummer()
					&& h.getHuisnummertoevoeging().equals(deleteHouseRequest.getHuisnummertoevoeging())
					&& h.getPostcode().equals(deleteHouseRequest.getPostcode())) {
				
				response.setResponse("Het op de " + h.getStraatnaam() + " " 
						+ h.getHuisnummer() + h.getHuisnummertoevoeging() + "gevestigde huis met postcode "
						+ h.getPostcode() + " is ontploft en zodoende uit het systeem verwijderd.");
				House.houses.remove(h);
			}
		
		
		
		}
		return response;
	}
	
}