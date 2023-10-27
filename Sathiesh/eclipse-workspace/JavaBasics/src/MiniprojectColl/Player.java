package MiniprojectColl;

public class Player 
{
	private int playerJersyno;
	private String playerName;
	private String playerNative;
	private int playerTotalruns;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Player(int playerJersyno, String playerName, String playerNative, int playerTotalruns) {
		super();
		this.playerJersyno= playerJersyno;
		this.playerName =playerName;
		this.playerNative = playerNative;
		this.playerTotalruns = playerTotalruns;
	}

	public int getPlayerJersyno() {
		return playerJersyno;
	}

	public void setPlayerJersyno(int playerJersyno) {
		this.playerJersyno = playerJersyno;
	}


	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public String getPlayerNative() {
		return playerNative;
	}



	public void setPlayerNative(String playerNative) {
		this.playerNative = playerNative;
	}


	
	public int getPlayerTotalruns() {
		return playerTotalruns;
	}


	public void setPlayerTotalruns(int playerTotalruns) {
		this.playerTotalruns = playerTotalruns;
	}
}