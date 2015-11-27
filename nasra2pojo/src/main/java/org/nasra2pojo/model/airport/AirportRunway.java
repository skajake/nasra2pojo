package org.nasra2pojo.model.airport;

import org.apache.commons.lang3.StringUtils;

import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;

@PositionalRecord
public class AirportRunway extends AirportBase {
	
	private String runwayIdentifier;
	private Integer	length;
	private Integer	width;
	private String condition;
	private String edgeLightIntensity;
	private Double baseEndLatitudeSeconds;
	private Character baseEndLatitudeDeclination;
	private Double baseEndLongitudeSeconds;
	private Character baseEndLongitudeDeclination;
	private Double reciprocalEndLatitudeSeconds;
	private Character reciprocalEndLatitudeDeclination;
	private Double reciprocalEndLongitudeSeconds;
	private Character reciprocalEndLongitudeDeclination;

	@PositionalField(initialPosition = 17, finalPosition = 23)
	public String getRunwayIdentifier() {
		return runwayIdentifier;
	}

	public void setRunwayIdentifier(String runwayIdentifier) {
		this.runwayIdentifier = runwayIdentifier;
	}

	@PositionalField(initialPosition = 24, finalPosition = 28, decorator=IntegerDecorator.class)
	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
	
	@PositionalField(initialPosition = 29, finalPosition = 32, decorator=IntegerDecorator.class)
	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	@PositionalField(initialPosition = 33, finalPosition = 44)
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@PositionalField(initialPosition = 61, finalPosition = 65)
	public String getEdgeLightIntensity() {
		return edgeLightIntensity;
	}

	public void setEdgeLightIntensity(String edgeLightIntensity) {
		this.edgeLightIntensity = edgeLightIntensity;
	}

	@PositionalField(initialPosition = 104, finalPosition = 114, decorator=DoubleDecorator.class)
	public Double getBaseEndLatitudeSeconds() {
		return baseEndLatitudeSeconds;
	}

	public void setBaseEndLatitudeSeconds(Double baseEndLatitudeSeconds) {
		this.baseEndLatitudeSeconds = baseEndLatitudeSeconds;
	}

	@PositionalField(initialPosition = 115, finalPosition = 115, decorator=CharacterDecorator.class)
	public Character getBaseEndLatitudeDeclination() {
		return baseEndLatitudeDeclination;
	}

	public void setBaseEndLatitudeDeclination(Character baseEndLatitudeDeclination) {
		this.baseEndLatitudeDeclination = baseEndLatitudeDeclination;
	}

	@PositionalField(initialPosition = 131, finalPosition = 141, decorator=DoubleDecorator.class)
	public Double getBaseEndLongitudeSeconds() {
		return baseEndLongitudeSeconds;
	}

	public void setBaseEndLongitudeSeconds(Double baseEndLongitudeSeconds) {
		this.baseEndLongitudeSeconds = baseEndLongitudeSeconds;
	}

	@PositionalField(initialPosition = 142, finalPosition = 142, decorator=CharacterDecorator.class)
	public Character getBaseEndLongitudeDeclination() {
		return baseEndLongitudeDeclination;
	}

	public void setBaseEndLongitudeDeclination(Character baseEndLongitudeDeclination) {
		this.baseEndLongitudeDeclination = baseEndLongitudeDeclination;
	}

	@PositionalField(initialPosition = 326, finalPosition = 336, decorator=DoubleDecorator.class)
	public Double getReciprocalEndLatitudeSeconds() {
		return reciprocalEndLatitudeSeconds;
	}

	public void setReciprocalEndLatitudeSeconds(Double reciprocalEndLatitudeSeconds) {
		this.reciprocalEndLatitudeSeconds = reciprocalEndLatitudeSeconds;
	}

	@PositionalField(initialPosition = 337, finalPosition = 337, decorator=CharacterDecorator.class)
	public Character getReciprocalEndLatitudeDeclination() {
		return reciprocalEndLatitudeDeclination;
	}

	public void setReciprocalEndLatitudeDeclination(Character reciprocalEndLatitudeDeclination) {
		this.reciprocalEndLatitudeDeclination = reciprocalEndLatitudeDeclination;
	}

	@PositionalField(initialPosition = 353, finalPosition = 363, decorator=DoubleDecorator.class)
	public Double getReciprocalEndLongitudeSeconds() {
		return reciprocalEndLongitudeSeconds;
	}

	public void setReciprocalEndLongitudeSeconds(Double reciprocalEndLongitudeSeconds) {
		this.reciprocalEndLongitudeSeconds = reciprocalEndLongitudeSeconds;
	}

	@PositionalField(initialPosition = 364, finalPosition = 365, decorator=CharacterDecorator.class)
	public Character getReciprocalEndLongitudeDeclination() {
		return reciprocalEndLongitudeDeclination;
	}

	public void setReciprocalEndLongitudeDeclination(Character reciprocalEndLongitudeDeclination) {
		this.reciprocalEndLongitudeDeclination = reciprocalEndLongitudeDeclination;
	}
	
	public Double getBaseEndLatitude() {
		if(getBaseEndLatitudeSeconds() != null && getBaseEndLatitudeDeclination() != null) {
			return (getBaseEndLatitudeSeconds() / 3600.0) * (getBaseEndLatitudeDeclination().equals('N') ? 1 : -1);
		} else {
			return null;
		}
	}
	
	public Double getBaseEndLongitude() {
		if(getBaseEndLongitudeSeconds() != null && getBaseEndLongitudeDeclination() != null) {
			return (getBaseEndLongitudeSeconds() / 3600.0) * (getBaseEndLongitudeDeclination().equals('E') ? 1 : -1);
		} else {
			return null;
		}
	}
	
	public Double getReciprocalEndLatitude() {
		if(getReciprocalEndLatitudeSeconds() != null && getReciprocalEndLatitudeDeclination() != null) {
			return (getReciprocalEndLatitudeSeconds() / 3600.0) * (getReciprocalEndLatitudeDeclination().equals('N') ? 1 : -1);
		} else {
			return null;
		}
	}
	
	public Double getReciprocalEndLongitude() {
		if(getReciprocalEndLongitudeSeconds() != null && getReciprocalEndLongitudeDeclination() != null) {
			return (getReciprocalEndLongitudeSeconds() / 3600.0) * (getReciprocalEndLongitudeDeclination().equals('E') ? 1 : -1);
		} else {
			return null;
		}
	}
	
	public boolean isRunwayGeographyValid() {
		return getBaseEndLatitude() != null &&
				getBaseEndLongitude() != null &&
				getReciprocalEndLatitude() != null &&
				getReciprocalEndLongitude() != null;
	}
	
	public boolean isHardSurfaced() {
		return StringUtils.contains(getCondition(), "CONC") || StringUtils.contains(getCondition(), "ASPH");
	}

	@Override
	public String toString() {
		return "AirportRunway [runwayIdentifier=" + runwayIdentifier + ", length=" + length + ", width=" + width
				+ ", condition=" + condition + ", edgeLightIntensity=" + edgeLightIntensity
				+ ", baseEndLatitudeSeconds=" + baseEndLatitudeSeconds + ", baseEndLatitudeDeclination="
				+ baseEndLatitudeDeclination + ", baseEndLongitudeSeconds=" + baseEndLongitudeSeconds
				+ ", baseEndLongitudeDeclination=" + baseEndLongitudeDeclination + ", reciprocalEndLatitudeSeconds="
				+ reciprocalEndLatitudeSeconds + ", reciprocalEndLatitudeDeclination="
				+ reciprocalEndLatitudeDeclination + ", reciprocalEndLongitudeSeconds=" + reciprocalEndLongitudeSeconds
				+ ", reciprocalEndLongitudeDeclination=" + reciprocalEndLongitudeDeclination + ", getBaseEndLatitude()="
				+ getBaseEndLatitude() + ", getBaseEndLongitude()=" + getBaseEndLongitude()
				+ ", getReciprocalEndLatitude()=" + getReciprocalEndLatitude() + ", getReciprocalEndLongitude()="
				+ getReciprocalEndLongitude() + "]";
	}
	
}
