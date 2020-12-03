package com.telus.mediation.usage.internal.model;


public class RawUsageDetailResponseVO extends ValueObject {
	private DataServiceEventVO rawUsageDetail;

	public DataServiceEventVO getRawUsageDetail() {
		return rawUsageDetail;
	}

	public void setRawUsageDetail(DataServiceEventVO rawUsageDetail) {
		this.rawUsageDetail = rawUsageDetail;
	}
}
