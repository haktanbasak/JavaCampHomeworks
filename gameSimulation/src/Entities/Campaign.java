package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
	private int campaignId;
	private String campaignName;
	private double discount;
	private boolean isThereCampaign;
	
	public Campaign() {}

	public Campaign(int campaignId, String campaignName, double discount,boolean isThereCampaign) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discount = discount;
		this.isThereCampaign = isThereCampaign;
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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public boolean isThereCampaign() {
		return isThereCampaign;
	}

	public void setThereCampaign(boolean isThereCampaign) {
		this.isThereCampaign = isThereCampaign;
	}
	
}
