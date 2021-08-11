package Entities;

import java.time.LocalDate;

public class Campaign {
	private int campaignId;
	private String campaignName;
	private double campaignDiscount;
	private LocalDate campaignStartDate;
	private LocalDate campaignFinishDate;
	
	public Campaign(int campaignId, String campaignName, double campaignDiscount, LocalDate campaignStartDate,
			LocalDate campaignFinishDate) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
		this.campaignStartDate = campaignStartDate;
		this.campaignFinishDate = campaignFinishDate;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

	public LocalDate getCampaignStartDate() {
		return campaignStartDate;
	}

	public void setCampaignStartDate(LocalDate campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public LocalDate getCampaignFinishDate() {
		return campaignFinishDate;
	}

	public void setCampaignFinishDate(LocalDate campaignFinishDate) {
		this.campaignFinishDate = campaignFinishDate;
	}
	

}
