package com.telus.mediation.usage.internal.model;

import java.util.Date;



public class DataServiceEventVO extends ValueObject {
		private String chargingId;
		private String contentDeliveredInd;
		private Double contentDownloadByteQuantity;
		private Double deviceDownloadGBQuantity;
		private Double contentSizeQuantity;
		private Double contentUploadByteQuantity;
		private Double deviceUploadGBQuantity;
		private Long dataServiceEventId;
		private Date dataServiceEventTime;
		private String dataServiceEventTypeCd;
		private Double deviceDownloadByteQuantity;
		private Double deviceUploadByteQuantity;
		private String phoneNumber;////NPA + NXX + Line Number eventInitiatorPhoneNum : TelephoneNumberType
		private String hostDomainName;
		private String imsiNum;
		private String mccMncCd;
		private Long mediationTransactionId;
		private String minNum;
		private String nasIpString;
		private Long networkFileId;
		private Double recordCorrelationId;
		private Double recordDuplicateCheckNum;
		private String recordId;
		private String recordTypeCd;
		private String requestedURLString;
		private String serviceBidId;
		private Double serviceDurationSecQuantity;
		private String serviceTechnolgyCd;
		private String servingNetworkString;
		private String servingSidId;
		private String sessionDomainName;
		private String sGSNAddressString;
		private String sourceNetworkCd;
		private String statusRequestCd;
		private String statusResponseCd;
		private String subSidId;
		private String userLoginText;
		
		
		private String accessPointNameNetworkString;
		private String accountingPlanName;
		private String artistName;	
		private String cellSiteId;
		private String chargingCharacterCd;
		private String chargingGatewayFunctionServiceId;
		private String chargingResultCd;
		private String contentURLString;
		private String createUserId;
		private String furnishChargingCd;
		private String genre;
		private String gGSNAddressString;
		private String imeiNum;
		private String locationAreaCd;
		private String mocnMccMncCd;
		private String multiplexId;
		private String otherPartyPhoneNum;
		private Date recordClosingTime;
		private String recordSequenceNum;
		private String recordStatusCd;
		private String serviceAreaCd;
		private String terminationReasonCd;
		private String titleName;	
		
		private Date createTime;
		
		private String radioAccessTechTypeCd;
		
		private String networkTypeCd;
		
		private java.lang.String servedPacketDataProtocolAddressTxt;
		
//		private RawDataUsageDetailVO rawDataUsageDetail; //flattening structures
		private String ipTechnologyCd;
		private String serverId;
		private String sessionActionCd;
		private String chargingProfileCd;
		private String diagnostics1Cd;
		private String diagnostics2Cd;
		private String diagnostics3Cd;
		private String diagnostics4Cd;
		private String diagnostics5Cd;
		private String chargingTypeCd;
		private String servedPacketDataProtocolTypeOrgCd;
		private String servedPacketDataProtocolTypeValueCd;
		private String servedPacketDataProtocolAddressString;
		private String servedPacketDataProtocolAddressExtString;
		private String mobileStationNetworkCapabilityCd;
		private String recordVersionCd;
		
		private String potentialDuplicateCd;
		private String cdrTotalQuatity;
		private String cdrTotalVolumeQuatity;
		private String validationCd;
		private String napiMsisdnCd;
		private String accessPointNameOperatorString;
		private String routingAreaCd;
		private String sgsnChangeCd;
		private String accessTypeCd;
		private String dynamicAddressFlagCd;
		private String chargingCharacterSelectionModeCd;
		private String chargingTypeSelectionModeCd;
		private String chargingClassCd;
		private Long uplinkHitQuantity;
		private String downlinkHitQuantity;
		private Double openingTimezoneSecondQuantity;
		private String walletId;
		private String walletChargingTypeCd;
		private String closingTimezoneSecondQuantity;
		private Double firstSequenceNum;
		private Double lastSequenceNum;
		private String cdrStoredCd;
		private String qualityOfServiceRequestedString;
		private String qualityOfServiceNegotiatedString;
//		private String recordCorrelationId; //duplicate
		private String sessionId;
		private String nodeId;
		private String systemTypeCd;
		private String sourceDeviceIpString;
		private String packetDataProtocolHlrIndexCd;
//		private String recordId; //duplicate
		private String networkInitPacketDataProtocolContextInd;

		

		  public java.lang.String getServedPacketDataProtocolAddressTxt() {
		    return this.servedPacketDataProtocolAddressTxt;
		  }

		  public void setServedPacketDataProtocolAddressTxt(java.lang.String servedPacketDataProtocolAddressTxt) {
		    this.servedPacketDataProtocolAddressTxt = servedPacketDataProtocolAddressTxt;
		  }
		  
		public String getRadioAccessTechTypeCd() {
			return radioAccessTechTypeCd;
		}

		public void setRadioAccessTechTypeCd(String radioAccessTechTypeCd) {
			this.radioAccessTechTypeCd = radioAccessTechTypeCd;
		}

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}


		public DataServiceEventVO(){
//			rawDataUsageDetail = new RawDataUsageDetailVO(); 
		}
		
		public Double getDeviceDownloadGBQuantity() {
			return deviceDownloadGBQuantity;
		}

		public void setDeviceDownloadGBQuantity(Double deviceDownloadGBQuantity) {
			this.deviceDownloadGBQuantity = deviceDownloadGBQuantity;
		}

		public Double getDeviceUploadGBQuantity() {
			return deviceUploadGBQuantity;
		}

		public void setDeviceUploadGBQuantity(Double deviceUploadGBQuantity) {
			this.deviceUploadGBQuantity = deviceUploadGBQuantity;
		}
		
		public String getChargingId() {
			return chargingId;
		}

		public void setChargingId(String chargingId) {
			this.chargingId = chargingId;
		}

		public String getContentDeliveredInd() {
			return contentDeliveredInd;
		}

		public void setContentDeliveredInd(String contentDeliveredInd) {
			this.contentDeliveredInd = contentDeliveredInd;
		}

		public Double getContentDownloadByteQuantity() {
			return contentDownloadByteQuantity;
		}

		public void setContentDownloadByteQuantity(Double contentDownloadByteQuantity) {
			this.contentDownloadByteQuantity = contentDownloadByteQuantity;
		}

		public Double getContentSizeQuantity() {
			return contentSizeQuantity;
		}

		public void setContentSizeQuantity(Double contentSizeQuantity) {
			this.contentSizeQuantity = contentSizeQuantity;
		}

		public Double getContentUploadByteQuantity() {
			return contentUploadByteQuantity;
		}

		public void setContentUploadByteQuantity(Double contentUploadByteQuantity) {
			this.contentUploadByteQuantity = contentUploadByteQuantity;
		}

		public Long getDataServiceEventId() {
			return dataServiceEventId;
		}

		public void setDataServiceEventId(Long dataServiceEventId) {
			this.dataServiceEventId = dataServiceEventId;
		}

		public Date getDataServiceEventTime() {
			return dataServiceEventTime;
		}

		public void setDataServiceEventTime(Date dataServiceEventTime) {
			this.dataServiceEventTime = dataServiceEventTime;
		}

		public String getDataServiceEventTypeCd() {
			return dataServiceEventTypeCd;
		}

		public void setDataServiceEventTypeCd(String dataServiceEventTypeCd) {
			this.dataServiceEventTypeCd = dataServiceEventTypeCd;
		}

		public Double getDeviceDownloadByteQuantity() {
			return deviceDownloadByteQuantity;
		}

		public void setDeviceDownloadByteQuantity(Double deviceDownloadByteQuantity) {
			this.deviceDownloadByteQuantity = deviceDownloadByteQuantity;
		}

		public Double getDeviceUploadByteQuantity() {
			return deviceUploadByteQuantity;
		}

		public void setDeviceUploadByteQuantity(Double deviceUploadByteQuantity) {
			this.deviceUploadByteQuantity = deviceUploadByteQuantity;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getHostDomainName() {
			return hostDomainName;
		}

		public void setHostDomainName(String hostDomainName) {
			this.hostDomainName = hostDomainName;
		}

		public String getImsiNum() {
			return imsiNum;
		}

		public void setImsiNum(String imsiNum) {
			this.imsiNum = imsiNum;
		}

		public String getMccMncCd() {
			return mccMncCd;
		}

		public void setMccMncCd(String mccMncCd) {
			this.mccMncCd = mccMncCd;
		}

		public Long getMediationTransactionId() {
			return mediationTransactionId;
		}

		public void setMediationTransactionId(Long mediationTransactionId) {
			this.mediationTransactionId = mediationTransactionId;
		}

		public String getMinNum() {
			return minNum;
		}

		public void setMinNum(String minNum) {
			this.minNum = minNum;
		}

		public String getNasIpString() {
			return nasIpString;
		}

		public void setNasIpString(String nasIpString) {
			this.nasIpString = nasIpString;
		}

		public Long getNetworkFileId() {
			return networkFileId;
		}

		public void setNetworkFileId(Long networkFileId) {
			this.networkFileId = networkFileId;
		}

		public Double getRecordCorrelationId() {
			return recordCorrelationId;
		}

		public void setRecordCorrelationId(Double recordCorrelationId) {
			this.recordCorrelationId = recordCorrelationId;
		}

		public Double getRecordDuplicateCheckNum() {
			return recordDuplicateCheckNum;
		}

		public void setRecordDuplicateCheckNum(Double recordDuplicateCheckNum) {
			this.recordDuplicateCheckNum = recordDuplicateCheckNum;
		}

		public String getRecordId() {
			return recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public String getRecordTypeCd() {
			return recordTypeCd;
		}

		public void setRecordTypeCd(String recordTypeCd) {
			this.recordTypeCd = recordTypeCd;
		}

		public String getRequestedURLString() {
			return requestedURLString;
		}

		public void setRequestedURLString(String requestedURLString) {
			this.requestedURLString = requestedURLString;
		}

		public String getServiceBidId() {
			return serviceBidId;
		}

		public void setServiceBidId(String serviceBidId) {
			this.serviceBidId = serviceBidId;
		}

		public Double getServiceDurationSecQuantity() {
			return serviceDurationSecQuantity;
		}

		public void setServiceDurationSecQuantity(Double serviceDurationSecQuantity) {
			this.serviceDurationSecQuantity = serviceDurationSecQuantity;
		}

		public String getServiceTechnolgyCd() {
			return serviceTechnolgyCd;
		}

		public void setServiceTechnolgyCd(String serviceTechnolgyCd) {
			this.serviceTechnolgyCd = serviceTechnolgyCd;
		}

		public String getServingNetworkString() {
			return servingNetworkString;
		}

		public void setServingNetworkString(String servingNetworkString) {
			this.servingNetworkString = servingNetworkString;
		}

		public String getServingSidId() {
			return servingSidId;
		}

		public void setServingSidId(String servingSidId) {
			this.servingSidId = servingSidId;
		}

		public String getSessionDomainName() {
			return sessionDomainName;
		}

		public void setSessionDomainName(String sessionDomainName) {
			this.sessionDomainName = sessionDomainName;
		}

		public String getSGSNAddressString() {
			return sGSNAddressString;
		}

		public void setSGSNAddressString(String addressString) {
			sGSNAddressString = addressString;
		}

		public String getSourceNetworkCd() {
			return sourceNetworkCd;
		}

		public void setSourceNetworkCd(String sourceNetworkCd) {
			this.sourceNetworkCd = sourceNetworkCd;
		}

		public String getStatusRequestCd() {
			return statusRequestCd;
		}

		public void setStatusRequestCd(String statusRequestCd) {
			this.statusRequestCd = statusRequestCd;
		}

		public String getStatusResponseCd() {
			return statusResponseCd;
		}

		public void setStatusResponseCd(String statusResponseCd) {
			this.statusResponseCd = statusResponseCd;
		}

		public String getSubSidId() {
			return subSidId;
		}

		public void setSubSidId(String subSidId) {
			this.subSidId = subSidId;
		}

		public String getUserLoginText() {
			return userLoginText;
		}

		public void setUserLoginText(String userLoginText) {
			this.userLoginText = userLoginText;
		}

		public String getAccessPointNameNetworkString() {
			return accessPointNameNetworkString;
		}

		public void setAccessPointNameNetworkString(String accessPointNameNetworkString) {
			this.accessPointNameNetworkString = accessPointNameNetworkString;
		}

		public String getAccountingPlanName() {
			return accountingPlanName;
		}

		public void setAccountingPlanName(String accountingPlanName) {
			this.accountingPlanName = accountingPlanName;
		}

		public String getArtistName() {
			return artistName;
		}

		public void setArtistName(String artistName) {
			this.artistName = artistName;
		}

		public String getCellSiteId() {
			return cellSiteId;
		}

		public void setCellSiteId(String cellSiteId) {
			this.cellSiteId = cellSiteId;
		}

		public String getChargingCharacterCd() {
			return chargingCharacterCd;
		}

		public void setChargingCharacterCd(String chargingCharacterCd) {
			this.chargingCharacterCd = chargingCharacterCd;
		}

		public String getChargingGatewayFunctionServiceId() {
			return chargingGatewayFunctionServiceId;
		}

		public void setChargingGatewayFunctionServiceId(
				String chargingGatewayFunctionServiceId) {
			this.chargingGatewayFunctionServiceId = chargingGatewayFunctionServiceId;
		}

		public String getChargingResultCd() {
			return chargingResultCd;
		}

		public void setChargingResultCd(String chargingResultCd) {
			this.chargingResultCd = chargingResultCd;
		}

		public String getContentURLString() {
			return contentURLString;
		}

		public void setContentURLString(String contentURLString) {
			this.contentURLString = contentURLString;
		}

		public String getCreateUserId() {
			return createUserId;
		}

		public void setCreateUserId(String createUserId) {
			this.createUserId = createUserId;
		}

		public String getFurnishChargingCd() {
			return furnishChargingCd;
		}

		public void setFurnishChargingCd(String furnishChargingCd) {
			this.furnishChargingCd = furnishChargingCd;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getGGSNAddressString() {
			return gGSNAddressString;
		}

		public void setGGSNAddressString(String addressString) {
			gGSNAddressString = addressString;
		}

		public String getImeiNum() {
			return imeiNum;
		}

		public void setImeiNum(String imeiNum) {
			this.imeiNum = imeiNum;
		}

		public String getLocationAreaCd() {
			return locationAreaCd;
		}

		public void setLocationAreaCd(String locationAreaCd) {
			this.locationAreaCd = locationAreaCd;
		}

		public String getMocnMccMncCd() {
			return mocnMccMncCd;
		}

		public void setMocnMccMncCd(String mocnMccMncCd) {
			this.mocnMccMncCd = mocnMccMncCd;
		}

		public String getMultiplexId() {
			return multiplexId;
		}

		public void setMultiplexId(String multiplexId) {
			this.multiplexId = multiplexId;
		}

		public String getOtherPartyPhoneNum() {
			return otherPartyPhoneNum;
		}

		public void setOtherPartyPhoneNum(String otherPartyPhoneNum) {
			this.otherPartyPhoneNum = otherPartyPhoneNum;
		}

		public Date getRecordClosingTime() {
			return recordClosingTime;
		}

		public void setRecordClosingTime(Date recordClosingTime) {
			this.recordClosingTime = recordClosingTime;
		}

		public String getRecordSequenceNum() {
			return recordSequenceNum;
		}

		public void setRecordSequenceNum(String recordSequenceNum) {
			this.recordSequenceNum = recordSequenceNum;
		}

		public String getRecordStatusCd() {
			return recordStatusCd;
		}

		public void setRecordStatusCd(String recordStatusCd) {
			this.recordStatusCd = recordStatusCd;
		}

		public String getServiceAreaCd() {
			return serviceAreaCd;
		}

		public void setServiceAreaCd(String serviceAreaCd) {
			this.serviceAreaCd = serviceAreaCd;
		}

		public String getTerminationReasonCd() {
			return terminationReasonCd;
		}

		public void setTerminationReasonCd(String terminationReasonCd) {
			this.terminationReasonCd = terminationReasonCd;
		}

		public String getTitleName() {
			return titleName;
		}

		public void setTitleName(String titleName) {
			this.titleName = titleName;
		}

//		public RawDataUsageDetailVO getRawDataUsageDetail() {
//			return rawDataUsageDetail;
//		}
	//
//		public void setRawDataUsageDetail(RawDataUsageDetailVO rawDataUsageDetail) {
//			this.rawDataUsageDetail = rawDataUsageDetail;
//		}
		
			
		public String getNetworkTypeCd() {
			return networkTypeCd;
		}

		public void setNetworkTypeCd(String networkTypeCd) {
			this.networkTypeCd = networkTypeCd;
		}
		
		
		

		public String getsGSNAddressString() {
			return sGSNAddressString;
		}

		public void setsGSNAddressString(String sGSNAddressString) {
			this.sGSNAddressString = sGSNAddressString;
		}

		public String getgGSNAddressString() {
			return gGSNAddressString;
		}

		public void setgGSNAddressString(String gGSNAddressString) {
			this.gGSNAddressString = gGSNAddressString;
		}

		public String getIpTechnologyCd() {
			return ipTechnologyCd;
		}

		public void setIpTechnologyCd(String ipTechnologyCd) {
			this.ipTechnologyCd = ipTechnologyCd;
		}

		public String getServerId() {
			return serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getSessionActionCd() {
			return sessionActionCd;
		}

		public void setSessionActionCd(String sessionActionCd) {
			this.sessionActionCd = sessionActionCd;
		}

		public String getChargingProfileCd() {
			return chargingProfileCd;
		}

		public void setChargingProfileCd(String chargingProfileCd) {
			this.chargingProfileCd = chargingProfileCd;
		}

		public String getDiagnostics1Cd() {
			return diagnostics1Cd;
		}

		public void setDiagnostics1Cd(String diagnostics1Cd) {
			this.diagnostics1Cd = diagnostics1Cd;
		}

		public String getDiagnostics2Cd() {
			return diagnostics2Cd;
		}

		public void setDiagnostics2Cd(String diagnostics2Cd) {
			this.diagnostics2Cd = diagnostics2Cd;
		}

		public String getDiagnostics3Cd() {
			return diagnostics3Cd;
		}

		public void setDiagnostics3Cd(String diagnostics3Cd) {
			this.diagnostics3Cd = diagnostics3Cd;
		}

		public String getDiagnostics4Cd() {
			return diagnostics4Cd;
		}

		public void setDiagnostics4Cd(String diagnostics4Cd) {
			this.diagnostics4Cd = diagnostics4Cd;
		}

		public String getDiagnostics5Cd() {
			return diagnostics5Cd;
		}

		public void setDiagnostics5Cd(String diagnostics5Cd) {
			this.diagnostics5Cd = diagnostics5Cd;
		}

		public String getChargingTypeCd() {
			return chargingTypeCd;
		}

		public void setChargingTypeCd(String chargingTypeCd) {
			this.chargingTypeCd = chargingTypeCd;
		}

		public String getServedPacketDataProtocolTypeOrgCd() {
			return servedPacketDataProtocolTypeOrgCd;
		}

		public void setServedPacketDataProtocolTypeOrgCd(String servedPacketDataProtocolTypeOrgCd) {
			this.servedPacketDataProtocolTypeOrgCd = servedPacketDataProtocolTypeOrgCd;
		}

		public String getServedPacketDataProtocolTypeValueCd() {
			return servedPacketDataProtocolTypeValueCd;
		}

		public void setServedPacketDataProtocolTypeValueCd(String servedPacketDataProtocolTypeValueCd) {
			this.servedPacketDataProtocolTypeValueCd = servedPacketDataProtocolTypeValueCd;
		}

		public String getServedPacketDataProtocolAddressString() {
			return servedPacketDataProtocolAddressString;
		}

		public void setServedPacketDataProtocolAddressString(String servedPacketDataProtocolAddressString) {
			this.servedPacketDataProtocolAddressString = servedPacketDataProtocolAddressString;
		}

		public String getServedPacketDataProtocolAddressExtString() {
			return servedPacketDataProtocolAddressExtString;
		}

		public void setServedPacketDataProtocolAddressExtString(String servedPacketDataProtocolAddressExtString) {
			this.servedPacketDataProtocolAddressExtString = servedPacketDataProtocolAddressExtString;
		}

		public String getMobileStationNetworkCapabilityCd() {
			return mobileStationNetworkCapabilityCd;
		}

		public void setMobileStationNetworkCapabilityCd(String mobileStationNetworkCapabilityCd) {
			this.mobileStationNetworkCapabilityCd = mobileStationNetworkCapabilityCd;
		}

		public String getRecordVersionCd() {
			return recordVersionCd;
		}

		public void setRecordVersionCd(String recordVersionCd) {
			this.recordVersionCd = recordVersionCd;
		}

		public String getPotentialDuplicateCd() {
			return potentialDuplicateCd;
		}

		public void setPotentialDuplicateCd(String potentialDuplicateCd) {
			this.potentialDuplicateCd = potentialDuplicateCd;
		}

		public String getCdrTotalQuatity() {
			return cdrTotalQuatity;
		}

		public void setCdrTotalQuatity(String cdrTotalQuatity) {
			this.cdrTotalQuatity = cdrTotalQuatity;
		}

		public String getCdrTotalVolumeQuatity() {
			return cdrTotalVolumeQuatity;
		}

		public void setCdrTotalVolumeQuatity(String cdrTotalVolumeQuatity) {
			this.cdrTotalVolumeQuatity = cdrTotalVolumeQuatity;
		}

		public String getValidationCd() {
			return validationCd;
		}

		public void setValidationCd(String validationCd) {
			this.validationCd = validationCd;
		}

		public String getNapiMsisdnCd() {
			return napiMsisdnCd;
		}

		public void setNapiMsisdnCd(String napiMsisdnCd) {
			this.napiMsisdnCd = napiMsisdnCd;
		}

		public String getAccessPointNameOperatorString() {
			return accessPointNameOperatorString;
		}

		public void setAccessPointNameOperatorString(String accessPointNameOperatorString) {
			this.accessPointNameOperatorString = accessPointNameOperatorString;
		}

		public String getRoutingAreaCd() {
			return routingAreaCd;
		}

		public void setRoutingAreaCd(String routingAreaCd) {
			this.routingAreaCd = routingAreaCd;
		}

		public String getSgsnChangeCd() {
			return sgsnChangeCd;
		}

		public void setSgsnChangeCd(String sgsnChangeCd) {
			this.sgsnChangeCd = sgsnChangeCd;
		}

		public String getAccessTypeCd() {
			return accessTypeCd;
		}

		public void setAccessTypeCd(String accessTypeCd) {
			this.accessTypeCd = accessTypeCd;
		}

		public String getDynamicAddressFlagCd() {
			return dynamicAddressFlagCd;
		}

		public void setDynamicAddressFlagCd(String dynamicAddressFlagCd) {
			this.dynamicAddressFlagCd = dynamicAddressFlagCd;
		}

		public String getChargingCharacterSelectionModeCd() {
			return chargingCharacterSelectionModeCd;
		}

		public void setChargingCharacterSelectionModeCd(String chargingCharacterSelectionModeCd) {
			this.chargingCharacterSelectionModeCd = chargingCharacterSelectionModeCd;
		}

		public String getChargingTypeSelectionModeCd() {
			return chargingTypeSelectionModeCd;
		}

		public void setChargingTypeSelectionModeCd(String chargingTypeSelectionModeCd) {
			this.chargingTypeSelectionModeCd = chargingTypeSelectionModeCd;
		}

		public String getChargingClassCd() {
			return chargingClassCd;
		}

		public void setChargingClassCd(String chargingClassCd) {
			this.chargingClassCd = chargingClassCd;
		}

		public Long getUplinkHitQuantity() {
			return uplinkHitQuantity;
		}

		public void setUplinkHitQuantity(Long uplinkHitQuantity) {
			this.uplinkHitQuantity = uplinkHitQuantity;
		}

		public String getDownlinkHitQuantity() {
			return downlinkHitQuantity;
		}

		public void setDownlinkHitQuantity(String downlinkHitQuantity) {
			this.downlinkHitQuantity = downlinkHitQuantity;
		}

		public Double getOpeningTimezoneSecondQuantity() {
			return openingTimezoneSecondQuantity;
		}

		public void setOpeningTimezoneSecondQuantity(Double openingTimezoneSecondQuantity) {
			this.openingTimezoneSecondQuantity = openingTimezoneSecondQuantity;
		}

		public String getWalletId() {
			return walletId;
		}

		public void setWalletId(String walletId) {
			this.walletId = walletId;
		}

		public String getWalletChargingTypeCd() {
			return walletChargingTypeCd;
		}

		public void setWalletChargingTypeCd(String walletChargingTypeCd) {
			this.walletChargingTypeCd = walletChargingTypeCd;
		}

		public String getClosingTimezoneSecondQuantity() {
			return closingTimezoneSecondQuantity;
		}

		public void setClosingTimezoneSecondQuantity(String closingTimezoneSecondQuantity) {
			this.closingTimezoneSecondQuantity = closingTimezoneSecondQuantity;
		}

		public Double getFirstSequenceNum() {
			return firstSequenceNum;
		}

		public void setFirstSequenceNum(Double firstSequenceNum) {
			this.firstSequenceNum = firstSequenceNum;
		}

		public Double getLastSequenceNum() {
			return lastSequenceNum;
		}

		public void setLastSequenceNum(Double lastSequenceNum) {
			this.lastSequenceNum = lastSequenceNum;
		}

		public String getCdrStoredCd() {
			return cdrStoredCd;
		}

		public void setCdrStoredCd(String cdrStoredCd) {
			this.cdrStoredCd = cdrStoredCd;
		}

		public String getQualityOfServiceRequestedString() {
			return qualityOfServiceRequestedString;
		}

		public void setQualityOfServiceRequestedString(String qualityOfServiceRequestedString) {
			this.qualityOfServiceRequestedString = qualityOfServiceRequestedString;
		}

		public String getQualityOfServiceNegotiatedString() {
			return qualityOfServiceNegotiatedString;
		}

		public void setQualityOfServiceNegotiatedString(String qualityOfServiceNegotiatedString) {
			this.qualityOfServiceNegotiatedString = qualityOfServiceNegotiatedString;
		}

		public String getSessionId() {
			return sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public String getNodeId() {
			return nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getSystemTypeCd() {
			return systemTypeCd;
		}

		public void setSystemTypeCd(String systemTypeCd) {
			this.systemTypeCd = systemTypeCd;
		}

		public String getSourceDeviceIpString() {
			return sourceDeviceIpString;
		}

		public void setSourceDeviceIpString(String sourceDeviceIpString) {
			this.sourceDeviceIpString = sourceDeviceIpString;
		}

		public String getPacketDataProtocolHlrIndexCd() {
			return packetDataProtocolHlrIndexCd;
		}

		public void setPacketDataProtocolHlrIndexCd(String packetDataProtocolHlrIndexCd) {
			this.packetDataProtocolHlrIndexCd = packetDataProtocolHlrIndexCd;
		}

		public String getNetworkInitPacketDataProtocolContextInd() {
			return networkInitPacketDataProtocolContextInd;
		}

		public void setNetworkInitPacketDataProtocolContextInd(String networkInitPacketDataProtocolContextInd) {
			this.networkInitPacketDataProtocolContextInd = networkInitPacketDataProtocolContextInd;
		}
	
}
