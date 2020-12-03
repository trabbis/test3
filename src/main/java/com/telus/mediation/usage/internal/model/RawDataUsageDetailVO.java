package com.telus.mediation.usage.internal.model;

public class RawDataUsageDetailVO extends ValueObject {
	
	private MobileInternetDataUsageVO mobileInternetDataUsage;
	private MessagingDataUsageVO messagingDataUsage;
	
	public RawDataUsageDetailVO(){
		mobileInternetDataUsage = new MobileInternetDataUsageVO();
		//messagingDataUsage = new MessagingDataUsageVO();
	}
	
	public MessagingDataUsageVO getMessagingDataUsage() {
		return messagingDataUsage;
	}
	public void setMessagingDataUsage(MessagingDataUsageVO messagingDataUsage) {
		this.messagingDataUsage = messagingDataUsage;
	}
	public MobileInternetDataUsageVO getMobileInternetDataUsage() {
		return mobileInternetDataUsage;
	}
	public void setMobileInternetDataUsage(
			MobileInternetDataUsageVO mobileInternetDataUsage) {
		this.mobileInternetDataUsage = mobileInternetDataUsage;
	}
}
