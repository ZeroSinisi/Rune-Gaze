package zero.sinisi.rune.gaze.riotassests;

import java.util.List;


public class CurrentGameInfo {

	private List<BannedChampion> bannedChampions;
	private long gameId;
	private long gameLength;
	private String gameMode;
	private long gameQueueConfigId;
	private long gameStartTime;
	private String gameType;
	private long mapId;
	private Observer observer;
	private List<Participant> participants;
	private String platformId;	
	
	public String toString() {
		return String.valueOf(gameId);
	}

	public List<BannedChampion> getBannedChampions() {
		return bannedChampions;
	}

	public long getGameId() {
		return gameId;
	}

	public long getGameLength() {
		return gameLength;
	}

	public String getGameMode() {
		return gameMode;
	}

	public long getGameQueueConfigId() {
		return gameQueueConfigId;
	}

	public long getGameStartTime() {
		return gameStartTime;
	}

	public String getGameType() {
		return gameType;
	}

	public long getMapId() {
		return mapId;
	}

	public Observer getObserver() {
		return observer;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public String getPlatformId() {
		return platformId;
	}
}
