package Entities;

public class Game {
	private int gameId;
	private String gameName;
	private double gamePrice;
	private String systemRequirement;
	private int stockAmount;
	
	public Game(int gameId, String gameName, double gamePrice, String systemRequirement, int stockAmount) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.systemRequirement = systemRequirement;
		this.stockAmount = stockAmount;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public String getSystemRequirement() {
		return systemRequirement;
	}

	public void setSystemRequirement(String systemRequirement) {
		this.systemRequirement = systemRequirement;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

}
