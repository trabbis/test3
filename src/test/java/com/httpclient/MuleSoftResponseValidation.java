package com.httpclient;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ca.toyota.bizservice.api.cdms.Address;
import ca.toyota.bizservice.api.cdms.BulkOwnershipResponse;
import ca.toyota.bizservice.api.cdms.Customer;
import ca.toyota.bizservice.api.cdms.Vehicle;
import ca.toyota.bizservice.api.cdms.VehicleOwnership;
import ca.toyota.bizservice.api.cdms.VehicleOwnershipDetail;
import ch.qos.logback.classic.pattern.Util;

public class MuleSoftResponseValidation {
	
	
	@Test
    public void test1() throws JsonParseException, JsonMappingException, IOException {
			
		ObjectMapper mapper = new ObjectMapper();
			
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		BulkOwnershipResponse response = mapper.readValue(new ClassPathResource("sample-ownership-response.json").getFile(), BulkOwnershipResponse.class);

		System.out.println("testing");
		
		int recordCount = 0;

		List<VehicleOwnership> voLists = response.getVehicleOwnerships();

		for (VehicleOwnership vo : voLists) {

			Optional<Vehicle> _tmp_vehicle = Optional.ofNullable(vo.getVehicle());

			for (VehicleOwnershipDetail _tmp_vehicleOwnershipDetail : vo.getVehicleOwnershipDetails()) {
				
				if(Optional.ofNullable(_tmp_vehicleOwnershipDetail.getOwnershipTypeCode())
						.isPresent()) {
					
					if("ALT_OWNER".equalsIgnoreCase(_tmp_vehicleOwnershipDetail.getOwnershipTypeCode().getValue())
							|| "ALT_LESSEE".equalsIgnoreCase(_tmp_vehicleOwnershipDetail.getOwnershipTypeCode().getValue())) {
						continue;
					}
					
				}
				
				ECICWebCustomerHistory ch = new ECICWebCustomerHistory();

				if (_tmp_vehicle.isPresent()) {

					Optional.ofNullable(_tmp_vehicle.get().getVehicleID())
							.ifPresent(vehicleID -> ch.setVin(vehicleID));

					Optional.ofNullable(_tmp_vehicle.get().getModelYear())
							.ifPresent(modelYear -> ch.setModelYear(modelYear));
				}

				Customer _tmp_customer = _tmp_vehicleOwnershipDetail.getCustomer();

				Optional.ofNullable(_tmp_customer.getPartyID())
						.ifPresent(partyID -> ch.setCustomerNumber(partyID.toString()));

				Optional.ofNullable(_tmp_vehicleOwnershipDetail.getOwnershipTypeCode())
						.ifPresent(typeCode -> ch.setRelType(typeCode.getValue()));

				Optional.ofNullable(_tmp_vehicleOwnershipDetail.getOwnershipStartDate())
//						.ifPresent(startDate -> ch.setStartDate(java.util.Date.from(startDate.toInstant())));
				        .ifPresent(startDate -> ch.setStartDate(null));

				Optional.ofNullable(_tmp_vehicleOwnershipDetail.getOwnershipEndDate())
//						.ifPresent(endDate -> ch.setEndDate(java.util.Date.from(endDate.toInstant())));
				        .ifPresent(endDate -> ch.setEndDate(null));

				Optional.ofNullable(_tmp_vehicleOwnershipDetail.getOwnershipEndReason())
						.ifPresent(endReason -> ch.setEndReason(endReason.getValue()));

				Optional.ofNullable(_tmp_customer.getLastUpdateUserID())
						.ifPresent(lastUpdateUserId -> ch.setLstUpdateUserId(lastUpdateUserId));

				if (Optional.ofNullable(_tmp_customer.getAddresses()).isPresent()) {

					Iterator<Address> _tmp_address_iterator = _tmp_customer.getAddresses().iterator();

					if (_tmp_address_iterator.hasNext()) {
						Address _tmp_address = _tmp_address_iterator.next();

						Optional.ofNullable(_tmp_address.getLine1()).ifPresent(line1 -> ch.setAddress(line1));

						Optional.ofNullable(_tmp_address.getCity()).ifPresent(city -> ch.setCity(city));

						Optional.ofNullable(_tmp_address.getProvinceCode())
								.ifPresent(province -> ch.setProvince(province));

						Optional.ofNullable(_tmp_address.getPostalCode())
								.ifPresent(postalcode -> ch.setPostalCode(postalcode));

					}

				}

				if (Optional.ofNullable(_tmp_customer.getSuspendMail()).isPresent()) {

					if (Optional.ofNullable(_tmp_customer.getSuspendMail().getSuspendMailDate()).isPresent()) {
						ZonedDateTime zdt = _tmp_customer.getSuspendMail().getSuspendMailDate()
								.atStartOfDay(ZoneId.systemDefault());
						ch.setSuspendDate(java.util.Date.from(zdt.toInstant()));
					}

//					Optional.ofNullable(_tmp_customer.getMarketingOptOut().isOptOutIndicator())
//							.ifPresent(optOutIndicator -> ch.setSuspendReason(optOutIndicator.toString()));
					Optional.ofNullable(_tmp_customer.getSuspendMail())
					        .ifPresent(suspendMail -> ch.setSuspendReason(suspendMail.getSuspendMailReason()));

//					Optional.ofNullable(_tmp_customer.getMarketingOptOut().getOptOutSource())
//							.ifPresent(optOutSource -> ch.setSuspendSource(optOutSource));
					Optional.ofNullable(_tmp_customer.getSuspendMail())
					        .ifPresent(suspendMail -> ch.setSuspendSource(suspendMail.getSuspendMailSource()));

				}

				if (Optional.ofNullable(_tmp_customer.getPerson()).isPresent()) {
					ch.setCustomerDesc(_tmp_customer.getPerson().getFamilyName() + ", "
							+ _tmp_customer.getPerson().getFirstName());
				} else {
					ch.setCustomerDesc(_tmp_customer.getOrganization().getCompanyName());
				}

				Optional.ofNullable(vo.getSaleType()).ifPresent(salesType -> ch.setSalesType(salesType.getValue()));

				//resultV.add(ch);
				recordCount++;
			}

		}

		
		
		
			
	}
		

}
