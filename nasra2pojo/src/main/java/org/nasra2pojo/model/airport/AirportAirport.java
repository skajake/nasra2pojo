package org.nasra2pojo.model.airport;

import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;

@PositionalRecord
public class AirportAirport extends AirportBase {

	private String identifier;
	private String type;
	private String region;
	private String cityName;
	private String state;
	private String county;
	private String name;
	private String ownership;
	private String use;
	private String statusCode;
	private Double latitudeSeconds;
	private Character latitudeDeclination;
	private Double longitudeSeconds;
	private Character longitudeDeclination;
	
	
	@PositionalField(initialPosition = 28, finalPosition = 31)
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	@PositionalField(initialPosition = 15, finalPosition = 27)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@PositionalField(initialPosition = 42, finalPosition = 44)
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	@PositionalField(initialPosition = 94, finalPosition = 133)
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	@PositionalField(initialPosition = 134, finalPosition = 183)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@PositionalField(initialPosition = 184, finalPosition = 185)
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	
	@PositionalField(initialPosition = 186, finalPosition = 187)
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	
	@PositionalField(initialPosition = 841, finalPosition = 842)
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	@PositionalField(initialPosition = 49, finalPosition = 50)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@PositionalField(initialPosition = 71, finalPosition = 91)
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	
	@PositionalField(initialPosition = 539, finalPosition = 549, decorator=DoubleDecorator.class)
	public Double getLatitudeSeconds() {
		return latitudeSeconds;
	}
	public void setLatitudeSeconds(Double latitudeSeconds) {
		this.latitudeSeconds = latitudeSeconds;
	}
	
	@PositionalField(initialPosition = 550, finalPosition = 550, decorator=CharacterDecorator.class)
	public Character getLatitudeDeclination() {
		return latitudeDeclination;
	}
	public void setLatitudeDeclination(Character latitudeDeclination) {
		this.latitudeDeclination = latitudeDeclination;
	}
	
	@PositionalField(initialPosition = 566, finalPosition = 576, decorator=DoubleDecorator.class)
	public Double getLongitudeSeconds() {
		return longitudeSeconds;
	}
	public void setLongitudeSeconds(Double longitudeSeconds) {
		this.longitudeSeconds = longitudeSeconds;
	}
	
	@PositionalField(initialPosition = 577, finalPosition = 577, decorator=CharacterDecorator.class)
	public Character getLongitudeDeclination() {
		return longitudeDeclination;
	}
	public void setLongitudeDeclination(Character longitudeDeclination) {
		this.longitudeDeclination = longitudeDeclination;
	}
	
	public Double getLatitude() {
		return (getLatitudeSeconds() / 3600.0) * (getLatitudeDeclination().equals('N') ? 1 : -1);
	}
	
	public Double getLongitude() {
		return (getLongitudeSeconds() / 3600.0) * (getLongitudeDeclination().equals('E') ? 1 : -1);
	}
	@Override
	public String toString() {
		return "AirportAirport [identifier=" + identifier + ", type=" + type + ", region=" + region + ", cityName="
				+ cityName + ", state=" + state + ", county=" + county + ", name=" + name + ", ownership=" + ownership
				+ ", use=" + use + ", statusCode=" + statusCode + ", latitudeSeconds=" + latitudeSeconds
				+ ", latitudeDeclination=" + latitudeDeclination + ", longitudeSeconds=" + longitudeSeconds
				+ ", longitudeDeclination=" + longitudeDeclination + ", getLatitude()=" + getLatitude()
				+ ", getLongitude()=" + getLongitude() + "]";
	}

}
