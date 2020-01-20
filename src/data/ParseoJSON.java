package data;

import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseoJSON {

	public static String parsearIdInvocador(String json) {
		JSONObject objetoGeneral = new JSONObject(json);
		String id = objetoGeneral.getString("id");
		return id;

	}

	public static ArrayList<Campeon> parsearCampeones(String json) {
		ArrayList<Campeon> listadoCampeones = new ArrayList<Campeon>();

		JSONArray objetoGeneral = new JSONArray(json);

		for (int i = 0; i < objetoGeneral.length(); i++) {
			JSONObject campeonAcceso = objetoGeneral.getJSONObject(i);

			String nombre = Champion.getChampionName((int) campeonAcceso.getLong("championId"));
			String nivel = String.valueOf(campeonAcceso.getInt("championLevel"));
			String puntos = String.valueOf(campeonAcceso.getInt("championPoints"));
			String cofre = campeonAcceso.getBoolean("chestGranted") == true ? "Si" : "No";
			String ultimaVezJugado = String.valueOf(new Date(campeonAcceso.getLong("lastPlayTime")));	

			listadoCampeones.add(new Campeon(nombre, nivel, puntos, cofre, ultimaVezJugado));

		}

		return listadoCampeones;

	}

}
