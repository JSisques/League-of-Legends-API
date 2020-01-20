package data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class PeticionWeb {
	
	private static final String API_KEY = "RGAPI-634b1d9a-6da7-4be1-aced-abe6487bc0a4";
	
	private static String idInvocador;
	
	public static String realizarPeticionCampeones(String nombreInvocador) {
		String json = realizarPeticionIdInvocador(nombreInvocador);
		BufferedReader in = null;
		URL urlEnvio;
		
		try {

			urlEnvio = new URL("https://euw1.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/"+ idInvocador + "?api_key=" + API_KEY );

			URLConnection con = urlEnvio.openConnection();

			in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		json = in.lines().collect(Collectors.joining());

		return json;
	}
	
	public static String realizarPeticionIdInvocador(String nombreInvocador) {
		String url = "https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+ nombreInvocador + "?api_key=" + API_KEY;
		String json;
		BufferedReader in = null;
		URL urlEnvio;
		try {

			urlEnvio = new URL(url);

			URLConnection con = urlEnvio.openConnection();

			in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		json = in.lines().collect(Collectors.joining());
		
		idInvocador = ParseoJSON.parsearIdInvocador(json);

		return json;
	}

}
