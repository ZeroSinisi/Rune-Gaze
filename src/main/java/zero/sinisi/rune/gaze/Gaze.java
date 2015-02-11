package zero.sinisi.rune.gaze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import zero.sinisi.rune.gaze.riotassests.CurrentGameInfo;
import zero.sinisi.rune.gaze.riotassests.Participant;
import zero.sinisi.rune.gaze.riotassests.Rune;
import zero.sinisi.rune.gaze.riotassests.statics.RuneList;
import zero.sinisi.rune.gaze.riotassests.statics.SummonerDto;

import com.google.gson.Gson;

public class Gaze {
	
	HashMap<String, ArrayList<String>> data;

	public Gaze(String summonerName) {
		data = new HashMap<String, ArrayList<String>>();
		Gson gson = new Gson();
		String platformId = "NA1";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://na.api.pvp.net/api/lol/na/v1.4/summoner/by-name/"+ summonerName + "?api_key=5bdbb1c1-5cbc-4a70-8178-3ea29d143842");
		Response r = target.request().get();
		System.out.println(r.getStatus());
		String json;
//		System.out.println(json = r.readEntity(String.class));
		Map<String, SummonerDto> summonerMap;
//		Map<String, SummonerDto> summoners = gson.fromJson(json, summonerMap);
		System.out.println(summonerMap = r.readEntity(new GenericType<Map<String, SummonerDto>>() {}));
		System.out.println(summonerMap.size());
		System.out.println(summonerMap.keySet().toString());
		System.out.println(summonerMap.entrySet().toString());
		SummonerDto summoner = summonerMap.get(summonerName);
		String summonerId = String.valueOf(summoner.getId());
		target = client.target("https://na.api.pvp.net//observer-mode/rest/consumer/getSpectatorGameInfo/" + platformId + "/" + summonerId +"?api_key=5bdbb1c1-5cbc-4a70-8178-3ea29d143842");
		r = target.request().get();
		System.out.println(r.getStatus());
		System.out.println(json = r.readEntity(String.class));
		CurrentGameInfo info = gson.fromJson(json, CurrentGameInfo.class);
//		CurrentGameInfo info = r.readEntity(CurrentGameInfo.class);
		System.out.println(info.getGameId());
		target = client.target("https://global.api.pvp.net/api/lol/static-data/na/v1.2/rune?runeListData=all&api_key=5bdbb1c1-5cbc-4a70-8178-3ea29d143842");
		r = target.request().get();
		json = r.readEntity(String.class);
		RuneList runeList = gson.fromJson(json, RuneList.class);
		for(Participant player: info.getParticipants()) {
			summonerName = player.getSummonerName();
			ArrayList<String> runeArray = new ArrayList<String>();
			for(Rune rune: player.getRunes()) {
				String runeId = String.valueOf(rune.getRuneId());
				zero.sinisi.rune.gaze.riotassests.statics.Rune fullRune = runeList.getData().get(runeId);
				runeArray.add(fullRune.getName() + "x" + rune.getCount() + "  ");
			}
			data.put(summonerName, runeArray);
		}
	}
	
	public HashMap<String, ArrayList<String>> getData() {
		return data;
	}
	
}
