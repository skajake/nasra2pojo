package org.nasra2pojo.model.airport;

import com.github.ffpojo.metadata.DefaultFieldDecorator;
import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;

@PositionalRecord
public class AirportBase {

	private String recordType;
	private String landingFacilitySiteNumber;

	@PositionalField(initialPosition = 1, finalPosition = 3)
	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	
	@PositionalField(initialPosition = 4, finalPosition = 14)
	public String getLandingFacilitySiteNumber() {
		return landingFacilitySiteNumber;
	}

	public void setLandingFacilitySiteNumber(String landingFacilitySiteNumber) {
		this.landingFacilitySiteNumber = landingFacilitySiteNumber;
	}
	
	public static class DoubleDecorator extends DefaultFieldDecorator {
        @Override
        public Object fromString(String str) {
            return Double.valueOf(str);
        }
    }
	
	public static class CharacterDecorator extends DefaultFieldDecorator {
        @Override
        public Object fromString(String str) {
            return Character.valueOf(str.charAt(0));
        }
    }

	public Class<? extends AirportBase> classType() {
		switch(getRecordType()) {
			case "APT":
				return AirportAirport.class;
			case "ATT":
				return AirportAttendance.class;
			case "RWY":
				return AirportRunway.class;
			case "ARS":
				return AirportArresting.class;
			case "RMK":
				return AirportRemark.class;
			default:
				return null;
		}
	}

	@Override
	public String toString() {
		return "AirportBase [recordType=" + recordType + ", landingFacilitySiteNumber=" + landingFacilitySiteNumber
				+ "]";
	}
}
