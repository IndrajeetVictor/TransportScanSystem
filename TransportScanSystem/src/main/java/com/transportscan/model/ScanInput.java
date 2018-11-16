package com.transportscan.model;

import java.util.Map;

public class ScanInput {
	
	private String status;
	
	private String statusTime;
	
	private Map<String,Double> position;
	
	private String orderId;
	
	private String trackingNumber;
	
	private String webHookId;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusTime() {
		return statusTime;
	}

	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}

	public Map<String, Double> getPosition() {
		return position;
	}

	public void setPosition(Map<String, Double> position) {
		this.position = position;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getWebHookId() {
		return webHookId;
	}

	public void setWebHookId(String webHookId) {
		this.webHookId = webHookId;
	}

}
