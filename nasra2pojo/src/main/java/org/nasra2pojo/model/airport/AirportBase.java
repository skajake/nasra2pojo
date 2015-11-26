package org.nasra2pojo.model.airport;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.github.ffpojo.metadata.DefaultFieldDecorator;
import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;
import com.google.common.base.Splitter;

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
        	if(!StringUtils.isEmpty(str)) {
        		return Double.valueOf(str);
        	} else {
        		return null;
        	}
        }
    }
	
	public static class CharacterDecorator extends DefaultFieldDecorator {
        @Override
        public Object fromString(String str) {
        	if(!StringUtils.isEmpty(str)) {
        		return Character.valueOf(str.charAt(0));
        	} else {
        		return null;
        	}
        }
    }
	
	public static class BooleanDecorator extends DefaultFieldDecorator {
        @Override
        public Object fromString(String str) {
        	return Boolean.valueOf(str.equals("Y") ? true : false);
        }
    }
	
	public static class ArrayDecorator extends DefaultFieldDecorator {
        @Override
        public Object fromString(String str) {
        	
        	List<String> result = new ArrayList<String>();
        	for (String substring : Splitter.fixedLength(5).split(str)) {
        	    result.add(StringUtils.trim(substring));
        	}
        	return result;
        }
    }
	
	public static class IntegerDecorator extends DefaultFieldDecorator {
        @Override
        public Object fromString(String str) {
            return Integer.valueOf(str);
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
