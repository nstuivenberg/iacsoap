package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test {
	public static void main(String[] args) throws IOException {
								
		String httpRequestURL = "http://localhost:8080/IACOne/HouseService?wsdl";
		String soapRequestParam = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:cre=\"http://iac.nl.schemas/createHouseRequest\">"
				+ "<soapenv:Header/>"
				+ "<soapenv:Body>"
				+ "<cre:createHouseRequest>"
				+ "<cre:straatnaam>W.A.Laan</cre:straatnaam>"
				+ "<cre:huisnummer>15</cre:huisnummer>"
				+ "<cre:huisnummertoevoeging>a</cre:huisnummertoevoeging>"
				+ "<cre:postcode>3734EC</cre:postcode>"
				+ "<cre:stad>Den Dolder</cre:stad>"
				+ "<cre:aantalkamers>3</cre:aantalkamers>"
				+ "<cre:achternaameigenaar>Mensch</cre:achternaameigenaar>"
				+ "</cre:createHouseRequest>"
				+ "</soapenv:Body>"
				+ "</soapenv:Envelope>";
		
		String responseString = testHouseService(httpRequestURL, soapRequestParam);
		System.out.println("En hij geeft als responsje: " + responseString);
	}
	
	public static String testHouseService(String httpRequestURL, String requestXmlParam) throws IOException {
		URL url = null;
		HttpURLConnection httpURLConnection = null;
		OutputStreamWriter outputStreamWriter = null;
		String responseMessageFromServer = null;
		String responseXML = null;
		
		try {
			url = new URL(httpRequestURL);
			httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setRequestMethod("POST");
			httpURLConnection.setRequestProperty("Content-Type", "text/xml");
			httpURLConnection.setRequestProperty("Accept", "text/xml");

			outputStreamWriter = new OutputStreamWriter(
					httpURLConnection.getOutputStream());
			outputStreamWriter.write(requestXmlParam);
			outputStreamWriter.flush();

			System.out.println("Response code: "
					+ httpURLConnection.getResponseCode());
			if (httpURLConnection.getResponseCode() == 200) {

				responseMessageFromServer = httpURLConnection
						.getResponseMessage();
				System.out.println("ResponseMessageFromServer: "
						+ responseMessageFromServer);
				responseXML = getResponseXML(httpURLConnection);
			}
		} catch (IOException ioex) {
			ioex.printStackTrace();
			throw ioex;
		} finally {
			outputStreamWriter.close();
			httpURLConnection.disconnect();
		}
		// -- Return thank you to the interwebs
		return responseXML;
		
	}
	
	private static String getResponseXML(HttpURLConnection httpURLConnection)
			throws IOException {

		StringBuffer stringBuffer = new StringBuffer();
		BufferedReader bufferedReader = null;
		InputStreamReader inputStreamReader = null;
		String readSingleLine = null;

		try {

			inputStreamReader = new InputStreamReader(
					httpURLConnection.getInputStream());
			bufferedReader = new BufferedReader(inputStreamReader);

			while ((readSingleLine = bufferedReader.readLine()) != null) {
				stringBuffer.append(readSingleLine);
			}
		} catch (IOException ioex) {
			ioex.printStackTrace();
			throw ioex;
		} finally {
			bufferedReader.close();
			httpURLConnection.disconnect();
		}
		// end of borderline
		return stringBuffer.toString();
	}
}
