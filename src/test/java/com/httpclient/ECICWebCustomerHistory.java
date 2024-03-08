package com.httpclient;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

/**
 *  Description of the Class
 *
 *@author     chank
 *@created    August 21, 2006 2007-02-27 ACR4865 To add last update timestamp to
 *      this object for display
 */
public class ECICWebCustomerHistory implements Comparable {

	String _vin = "";
	String _customerDesc = "";
	String _customerNumber = "";
	String _vinDesc = "";
	String _relType = "";
	String _salesType = "";
	Date _startDate;
	Date _endDate;
	String _endReason = "";
	String _salesTypeDesc = "";
	String _modelYear = "";
	Date _suspendDate;
	String _suspendSource = "";
	String _suspendReason = "";
	String _lstUpdateUserId = "";
	String _address = "";
	String _city = "";
	String _province = "";
	String _postalCode = "";
	String _language = "";
	String _homePhone = "";
	String _busPhone = "";
	Date _processDate;
	Timestamp _lastUpdTimestamp;

	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd HH:mm");


	/**
	 *  Constructor for the ECICWebCustomerHistory object
	 */
	public ECICWebCustomerHistory() {
		super();
	}


	/**
	 *  Constructor for the ECICWebCustomerHistory object
	 *
	 *@param  arg0  Description of the Parameter
	 */
	public ECICWebCustomerHistory(Locale arg0) {
//		super(arg0);
	}


	/**
	 *  Gets the vin attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The vin value
	 */
	public String getVin() {
		return _vin;
	}


	/**
	 *  Sets the vin attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new vin value
	 */
	public void setVin(String s) {
		if (s != null && s.length() > 0) {
			_vin = s.trim();
		}
		else {
			_vin = s;
		}
	}


	/**
	 *  Gets the language attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The language value
	 */
	public String getLanguage() {
		return _language;
	}


	/**
	 *  Sets the language attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new language value
	 */
	public void setLanguage(String s) {
		if (s != null && s.length() > 0) {
			_language = s.trim();
		}
		else {
			_language = s;
		}
	}


	/**
	 *  Gets the languageDesc attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The languageDesc value
	 */
	public String getLanguageDesc() {
		return (getLanguage_desc(_language));
	}


	/**
	 *  Gets the language_desc attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  Description of the Parameter
	 *@return    The language_desc value
	 */
	public String getLanguage_desc(String s) {
		//derekzhang 20180911 preferLanguageCode
//		if (s != null) {
//			if (s.equalsIgnoreCase("E")) {
//				return "English";
//			}
//			else
//				if (s.equalsIgnoreCase("F")) {
//				return "French";
//			}
//			else {
//				return s;
//			}
//		}
//		else {
//			return s;
//		}
		
		if (s != null && s.length() > 0) {
			if (s.equalsIgnoreCase("en-CA")) {
				return "English";
			}
			else
				if (s.equalsIgnoreCase("fr-CA")) {
				return "French";
			}
			else {
				return s;
			}
		}
		else {
			return "English";
		}

	}


	/**
	 *  Gets the vinDesc attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The vinDesc value
	 */
	public String getVinDesc() {
		return _vinDesc;
	}


	/**
	 *  Sets the vinDesc attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new vinDesc value
	 */
	public void setVinDesc(String s) {
		if (s != null && s.length() > 0) {
			_vinDesc = s.trim();
		}
		else {
			_vinDesc = s;
		}
	}


	/**
	 *  Gets the relType attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The relType value
	 */
	public String getRelType() {
		return _relType;
	}


	/**
	 *  Gets the relTypeDesc attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The relTypeDesc value
	 */
	public String getRelTypeDesc() {
		
		//derekzhang 20180827 change below ALM app-re-eng 		
//		if (_relType != null) {
//			if (_relType.equals("O")) {
//				return "O - Owner";
//			}
//			else
//				if (_relType.equals("R")) {
//				return "R - Lessor";
//			}
//			else
//				if (_relType.equals("L")) {
//				return "L - Lessee";
//			}
//			else {
//				return "unknown";
//			}
//		}
//		else {
//			return "unknown";
//		}
		
		if (_relType != null) {
			if (_relType.equals("OWNER")) {
				return "O - Owner";
			}
			else
				if (_relType.equals("LESSOR")) {
				return "R - Lessor";
			}
			else
				if (_relType.equals("LESSEE")) {
				return "L - Lessee";
			}
			else {
				return "unknown";
			}
		}
		else {
			return "unknown";
		}
		//derekzhang 20180827 change above ALM app-re-eng 	
	}


	/**
	 *  Sets the relType attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new relType value
	 */
	public void setRelType(String s) {
		if (s != null && s.length() > 0) {
			_relType = s.trim();
		}
		else {
			_relType = s;
		}
	}


	/**
	 *  Gets the salesType attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The salesType value
	 */
	public String getSalesType() {
		return _salesType;
	}


	/**
	 *  Gets the salesTypeDesc attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The salesTypeDesc value
	 */
	public String getSalesTypeDesc() {
		if (_salesType != null && _salesType.length() == 2) {
			return null;
		}
		else {
			return "unknown";
		}
	}


	/**
	 *  Sets the salesType attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new salesType value
	 */
	public void setSalesType(String s) {
		if (s != null && s.length() > 0) {
			_salesType = s.trim();
		}
		else {
			_salesType = s;
		}
	}


	/**
	 *  Gets the lease attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The lease value
	 */
	public boolean isLease() {
		String s = "*";
		if (_salesType != null && _salesType.length() == 2) {
			s = _salesType.substring(1);
		}
		if (s.equalsIgnoreCase("D") || s.equalsIgnoreCase("E") || s.equalsIgnoreCase("F")) {
			return true;
		}
		else {
			return false;
		}
	}


	/**
	 *  Gets the modelYear attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The modelYear value
	 */
	public String getModelYear() {
		return _modelYear;
	}


	/**
	 *  Sets the modelYear attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new modelYear value
	 */
	public void setModelYear(String s) {
		if (s != null && s.length() > 0) {
			_modelYear = s.trim();
		}
		else {
			_modelYear = s;
		}
	}


	/**
	 *  Gets the customerNumber attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The customerNumber value
	 */
	public String getCustomerNumber() {
		return _customerNumber;
	}


	/**
	 *  Sets the customerNumber attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new customerNumber value
	 */
	public void setCustomerNumber(String s) {
		if (s != null && s.length() > 0) {
			_customerNumber = s.trim();
		}
		else {
			_customerNumber = s;
		}
	}


	/**
	 *  Gets the customerDesc attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The customerDesc value
	 */
	public String getCustomerDesc() {
		return _customerDesc;
	}


	/**
	 *  Sets the customerDesc attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new customerDesc value
	 */
	public void setCustomerDesc(String s) {
		if (s != null && s.length() > 0) {
			_customerDesc = s.trim();
		}
		else {
			_customerDesc = s;
		}
	}


	/**
	 *  Gets the address attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The address value
	 */
	public String getAddress() {
		return _address;
	}


	/**
	 *  Sets the address attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new address value
	 */
	public void setAddress(String s) {
		if (s != null && s.length() > 0) {
			_address = s.trim();
		}
		else {
			_address = s;
		}
	}


	/**
	 *  Gets the city attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The city value
	 */
	public String getCity() {
		return _city;
	}


	/**
	 *  Sets the city attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new city value
	 */
	public void setCity(String s) {
		if (s != null && s.length() > 0) {
			_city = s.trim();
		}
		else {
			_city = s;
		}
	}


	/**
	 *  Gets the province attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The province value
	 */
	public String getProvince() {
		return _province;
	}


	/**
	 *  Sets the province attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new province value
	 */
	public void setProvince(String s) {
		if (s != null && s.length() > 0) {
			_province = s.trim();
		}
		else {
			_province = s;
		}
	}


	/**
	 *  Gets the postalCode attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The postalCode value
	 */
	public String getPostalCode() {
		return _postalCode;
	}


	/**
	 *  Sets the postalCode attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new postalCode value
	 */
	public void setPostalCode(String s) {
		if (s != null && s.length() > 0) {
			_postalCode = s.trim();
		}
		else {
			_postalCode = s;
		}
	}


	/**
	 *  Gets the lstUpdateUserId attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The lstUpdateUserId value
	 */
	public String getLstUpdateUserId() {
		return _lstUpdateUserId;
	}


	/**
	 *  Sets the lstUpdateUserId attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new lstUpdateUserId value
	 */
	public void setLstUpdateUserId(String s) {
		if (s != null && s.length() > 0) {
			_lstUpdateUserId = s.trim();
		}
		else {
			_lstUpdateUserId = s;
		}
	}


	/**
	 *  Gets the startDate attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The startDate value
	 */
	public Date getStartDate() {
		return _startDate;
	}


	/**
	 *  Gets the fmtStartDate attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The fmtStartDate value
	 */
	public String getFmtStartDate() {
		return df.format(_startDate);
	}


	/**
	 *  Sets the startDate attribute of the ECICWebCustomerHistory object
	 *
	 *@param  t  The new startDate value
	 */
	public void setStartDate(Date t) {
		_startDate = t;
	}


	/**
	 *  Gets the endDate attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The endDate value
	 */
	public Date getEndDate() {
		return _endDate;
	}


	/**
	 *  Gets the fmtEndDate attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The fmtEndDate value
	 */
	public String getFmtEndDate() {
		if (_endDate != null) {
			return df.format(_endDate);
		}
		else {
			return "";
		}
	}


	/**
	 *  Sets the endDate attribute of the ECICWebCustomerHistory object
	 *
	 *@param  t  The new endDate value
	 */
	public void setEndDate(Date t) {
		_endDate = t;
	}


	/**
	 *  Gets the suspendDate attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The suspendDate value
	 */
	public Date getSuspendDate() {
		return _suspendDate;
	}


	/**
	 *  Gets the fmtSuspendDate attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The fmtSuspendDate value
	 */
	public String getFmtSuspendDate() {
		if (_suspendDate != null) {
			return df.format(_suspendDate);
		}
		else {
			return "";
		}
	}


	/**
	 *  Sets the suspendDate attribute of the ECICWebCustomerHistory object
	 *
	 *@param  t  The new suspendDate value
	 */
	public void setSuspendDate(Date t) {
		_suspendDate = t;
	}


	/**
	 *  Gets the processDate attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The processDate value
	 */
	public Date getProcessDate() {
		return _processDate;
	}


	/**
	 *  Gets the fmtProcessDate attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The fmtProcessDate value
	 */
	public String getFmtProcessDate() {
		if (_processDate != null) {
			return df.format(_processDate);
		}
		else {
			return "";
		}
	}


	/**
	 *  Sets the processDate attribute of the ECICWebCustomerHistory object
	 *
	 *@param  t  The new processDate value
	 */
	public void setProcessDate(Date t) {
		_processDate = t;
	}


	/**
	 *  Gets the endReason attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The endReason value
	 */
	public String getEndReason() {
		return _endReason;
	}


	/**
	 *  Sets the endReason attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new endReason value
	 */
	public void setEndReason(String s) {
		if (s != null && s.length() > 0) {
			_endReason = s.trim();
		}
		else {
			_endReason = s;
		}
	}


	/**
	 *  Gets the endReasonDesc attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The endReasonDesc value
	 */
	public String getEndReasonDesc() {
		return null;
	}


	/**
	 *  Gets the suspendReasonDesc attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The suspendReasonDesc value
	 */
	public String getSuspendReasonDesc() {
		return null;
	}


	/**
	 *  Sets the supsendReason attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new supsendReason value
	 */
	public void setSuspendReason(String s) {
		if (s != null && s.length() > 0) {
			_suspendReason = s.trim();
		}
		else {
			_suspendReason = s;
		}
	}


	/**
	 *  Gets the suspendSource attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The suspendSource value
	 */
	public String getSuspendSource() {
		return _suspendSource;
	}


	/**
	 *  Sets the supsendSource attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new supsendSource value
	 */
	public void setSuspendSource(String s) {
		if (s != null && s.length() > 0) {
			_suspendSource = s.trim();
		}
		else {
			_suspendSource = s;
		}
	}


	/**
	 *  Gets the homePhone attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The homePhone value
	 */
	public String getHomePhone() {
		return _homePhone;
	}


	/**
	 *  Gets the displayHomeNumber attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The displayHomeNumber value
	 */
	public String getDisplayHomeNumber() {
		return (getFormattedNumber(_homePhone));
	}


	/**
	 *  Sets the homePhone attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new homePhone value
	 */
	public void setHomePhone(String s) {
		if (s != null && s.length() > 0) {
			_homePhone = s.trim();
		}
		else {
			_homePhone = s;
		}
	}


	/**
	 *  Gets the busPhone attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The busPhone value
	 */
	public String getBusPhone() {
		return _busPhone;
	}


	/**
	 *  Gets the displayBusNumber attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The displayBusNumber value
	 */
	public String getDisplayBusNumber() {
		return (getFormattedNumber(_busPhone));
	}


	/**
	 *  Sets the busPhone attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  The new busPhone value
	 */
	public void setBusPhone(String s) {
		if (s != null && s.length() > 0) {
			_busPhone = s.trim();
		}
		else {
			_busPhone = s;
		}
	}


	/**
	 *  Gets the formattedNumber attribute of the ECICWebCustomerHistory object
	 *
	 *@param  s  Description of the Parameter
	 *@return    The formattedNumber value
	 */
	public String getFormattedNumber(String s) {
		String number = null;
		String tmp1 = null;
		String tmp2 = null;
		String tmp3 = null;
		if (s == null || s.length() < 10) {
			return s;
		}
		tmp1 = s.substring(0, 3);
		tmp2 = s.substring(3, 6);
		tmp3 = s.substring(6);

		number = "(" + tmp1 + ") " + tmp2 + "-" + tmp3;

		return number;
	}


	/**
	 *  Gets the lastUpdTimestampToTimeStamp attribute of the
	 *  ECICWebCustomerHistory object
	 *
	 *@return    The lastUpdTimestampToTimeStamp value
	 */
	public Timestamp getLastUpdTimestampToTimeStamp() {
		return _lastUpdTimestamp;
	}


	/**
	 *  Sets the lastUpdTimestamp attribute of the ECICWebCustomerHistory object
	 *
	 *@param  t  The new lastUpdTimestamp value
	 */
	public void setLastUpdTimestamp(Timestamp t) {
		_lastUpdTimestamp = t;
	}


	/**
	 *  Gets the fmtLastUpdTimestamp attribute of the ECICWebCustomerHistory object
	 *
	 *@return    The fmtLastUpdTimestamp value
	 */
	public String getFmtLastUpdTimestamp() {
		try {
			return (dft.format(_lastUpdTimestamp));
		}
		catch (NullPointerException npe) {
			return ("");
		}
	}


	/**
	 *  Description of the Method
	 *
	 *@param  another  Description of the Parameter
	 *@return          Description of the Return Value
	 */
	public int compareTo(Object another) {
		if (another == null || another.getClass() != this.getClass()) {
			return 1;
		}

		int result = _vin.compareTo(((ECICWebCustomerHistory) another)._vin);

		return ((result == 0) ? (_startDate.compareTo(((ECICWebCustomerHistory) another)._startDate)) * -1 : result);
	}


	/**
	 *  Description of the Method
	 *
	 *@param  o  Description of the Parameter
	 *@return    Description of the Return Value
	 */
	public boolean equals(Object o) {
		boolean result = false;

		if (o == null || o.getClass() != this.getClass()) {
			return false;
		}
		else {
			return (o == this);
		}

	}

}

